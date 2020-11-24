package typings.reactNavigationStack

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewProps
import typings.reactNativeGestureHandler.mod.PanGestureHandlerProperties
import typings.reactNativeGestureHandler.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", JSImport.Namespace)
@js.native
object gestureHandlerNativeMod extends js.Object {
  
  val GestureHandlerRootView: ComponentType[ViewProps] = js.native
  
  def PanGestureHandler(props: PanGestureHandlerProperties): Element = js.native
  
  @js.native
  object GestureState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[State with Double] = js.native
    
    /* 3 */ val ACTIVE: typings.reactNativeGestureHandler.mod.State.ACTIVE with Double = js.native
    
    /* 1 */ val BEGAN: typings.reactNativeGestureHandler.mod.State.BEGAN with Double = js.native
    
    /* 2 */ val CANCELLED: typings.reactNativeGestureHandler.mod.State.CANCELLED with Double = js.native
    
    /* 4 */ val END: typings.reactNativeGestureHandler.mod.State.END with Double = js.native
    
    /* 0 */ val FAILED: typings.reactNativeGestureHandler.mod.State.FAILED with Double = js.native
    
    /* 0 */ val UNDETERMINED: typings.reactNativeGestureHandler.mod.State.UNDETERMINED with Double = js.native
  }
}
