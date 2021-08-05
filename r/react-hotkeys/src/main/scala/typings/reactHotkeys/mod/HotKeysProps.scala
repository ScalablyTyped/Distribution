package typings.reactHotkeys.mod

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotKeysProps
  extends StObject
     with HotKeysEnabledProps {
  
  /**
    * The React component that should be used in the DOM to wrap the FocusTrap's
    * children and have the internal key listeners bound to
    */
  var component: js.UndefOr[ReactComponent] = js.undefined
  
  var innerRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}
object HotKeysProps {
  
  inline def apply(): HotKeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysProps]
  }
  
  extension [Self <: HotKeysProps](x: Self) {
    
    inline def setComponent(value: ReactComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setInnerRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
  }
}
