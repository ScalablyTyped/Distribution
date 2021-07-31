package typings.reactScroll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  object Helpers {
    
    @JSImport("react-scroll/modules/mixins/Helpers", "Helpers")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Element(component: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Element")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def Scroll(component: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def Scroll(component: js.Any, customScroller: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("Scroll")(component.asInstanceOf[js.Any], customScroller.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
