package typings.reactNavigationStack

import typings.react.mod.ComponentType
import typings.reactNative.mod.View
import typings.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureHandlerRootView")
  @js.native
  class GestureHandlerRootView () extends View
  object GestureHandlerRootView {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureHandlerRootView")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureHandlerRootView.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    @scala.inline
    def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  object GestureState {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.ACTIVE")
    @js.native
    def ACTIVE: Double = js.native
    @scala.inline
    def ACTIVE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.BEGAN")
    @js.native
    def BEGAN: Double = js.native
    @scala.inline
    def BEGAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEGAN")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.CANCELLED")
    @js.native
    def CANCELLED: Double = js.native
    @scala.inline
    def CANCELLED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELLED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.END")
    @js.native
    def END: Double = js.native
    @scala.inline
    def END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.FAILED")
    @js.native
    def FAILED: Double = js.native
    @scala.inline
    def FAILED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "GestureState.UNDETERMINED")
    @js.native
    def UNDETERMINED: Double = js.native
    @scala.inline
    def UNDETERMINED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNDETERMINED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "PanGestureHandler")
  @js.native
  val PanGestureHandler: ComponentType[PanGestureHandlerProperties] = js.native
}
