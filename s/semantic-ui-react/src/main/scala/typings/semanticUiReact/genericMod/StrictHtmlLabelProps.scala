package typings.semanticUiReact.genericMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrictHtmlLabelProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
}
object StrictHtmlLabelProps {
  
  @scala.inline
  def apply(): StrictHtmlLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlLabelProps]
  }
  
  @scala.inline
  implicit class StrictHtmlLabelPropsMutableBuilder[Self <: StrictHtmlLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
