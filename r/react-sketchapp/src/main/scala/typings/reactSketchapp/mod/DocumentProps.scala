package typings.reactSketchapp.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentProps extends StObject {
  
  var children: js.UndefOr[js.Array[ReactElement] | ReactElement] = js.native
}
object DocumentProps {
  
  @scala.inline
  def apply(): DocumentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentProps]
  }
  
  @scala.inline
  implicit class DocumentPropsMutableBuilder[Self <: DocumentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ReactElement] | ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
