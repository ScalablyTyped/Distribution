package typings.reactNavigationStack

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewProps
import typings.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import typings.reactNativeGestureHandler.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerIosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureHandlerRootView")
  @js.native
  val GestureHandlerRootView: ComponentType[ViewProps] = js.native
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState")
  @js.native
  object GestureState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State & Double] = js.native
    
    /* 3 */ val ACTIVE: typings.reactNativeGestureHandler.mod.State.ACTIVE & Double = js.native
    
    /* 1 */ val BEGAN: typings.reactNativeGestureHandler.mod.State.BEGAN & Double = js.native
    
    /* 2 */ val CANCELLED: typings.reactNativeGestureHandler.mod.State.CANCELLED & Double = js.native
    
    /* 4 */ val END: typings.reactNativeGestureHandler.mod.State.END & Double = js.native
    
    /* 0 */ val FAILED: typings.reactNativeGestureHandler.mod.State.FAILED & Double = js.native
    
    /* 0 */ val UNDETERMINED: typings.reactNativeGestureHandler.mod.State.UNDETERMINED & Double = js.native
  }
  
  inline def PanGestureHandler(props: PanGestureHandlerProperties): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PanGestureHandler")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
