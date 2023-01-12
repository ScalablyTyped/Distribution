package typings.semanticUiReact.distCommonjsGenericMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlLabelProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object StrictHtmlLabelProps {
  
  inline def apply(): StrictHtmlLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlLabelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StrictHtmlLabelProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
