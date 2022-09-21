package typings.reactScroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  object Helpers {
    
    @JSImport("react-scroll/modules/mixins/Helpers", "Helpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Element(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Element")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def Scroll(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def Scroll(component: Any, customScroller: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
