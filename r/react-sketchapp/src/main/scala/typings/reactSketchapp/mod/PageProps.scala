package typings.reactSketchapp.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object PageProps {
  
  @scala.inline
  def apply(): PageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageProps]
  }
  
  @scala.inline
  implicit class PagePropsMutableBuilder[Self <: PageProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
