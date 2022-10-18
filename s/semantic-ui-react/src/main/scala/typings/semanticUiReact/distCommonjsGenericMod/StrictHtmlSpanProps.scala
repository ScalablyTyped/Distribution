package typings.semanticUiReact.distCommonjsGenericMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrictHtmlSpanProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
}
object StrictHtmlSpanProps {
  
  inline def apply(): StrictHtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictHtmlSpanProps]
  }
  
  extension [Self <: StrictHtmlSpanProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
