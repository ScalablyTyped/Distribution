package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.gestureHandlerRootViewMod.GestureHandlerRootViewProps
import typings.reactNativeGestureHandler.gestureHandlerTypesCompatMod.PanGestureHandlerProperties
import typings.reactNavigationStack.reactNavigationStackInts.`0`
import typings.reactNavigationStack.reactNavigationStackInts.`1`
import typings.reactNavigationStack.reactNavigationStackInts.`2`
import typings.reactNavigationStack.reactNavigationStackInts.`3`
import typings.reactNavigationStack.reactNavigationStackInts.`4`
import typings.reactNavigationStack.reactNavigationStackInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureHandlerNativeMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GestureHandlerRootView(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureHandlerRootView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object GestureState {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.ACTIVE")
    @js.native
    val ACTIVE: `4` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.BEGAN")
    @js.native
    val BEGAN: `2` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.CANCELLED")
    @js.native
    val CANCELLED: `3` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.END")
    @js.native
    val END: `5` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.FAILED")
    @js.native
    val FAILED: `1` = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandlerNative", "GestureState.UNDETERMINED")
    @js.native
    val UNDETERMINED: `0` = js.native
  }
  
  inline def PanGestureHandler(props: PanGestureHandlerProperties): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PanGestureHandler")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
