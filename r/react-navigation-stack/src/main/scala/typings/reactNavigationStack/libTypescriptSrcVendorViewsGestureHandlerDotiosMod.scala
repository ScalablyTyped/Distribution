package typings.reactNavigationStack

import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.libTypescriptGestureHandlerRootViewMod.GestureHandlerRootViewProps
import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerTypesCompatMod.PanGestureHandlerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsGestureHandlerDotiosMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def GestureHandlerRootView(props: GestureHandlerRootViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GestureHandlerRootView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object GestureState {
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.ACTIVE")
    @js.native
    val ACTIVE: 4 = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.BEGAN")
    @js.native
    val BEGAN: 2 = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.CANCELLED")
    @js.native
    val CANCELLED: 3 = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.END")
    @js.native
    val END: 5 = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.FAILED")
    @js.native
    val FAILED: 1 = js.native
    
    @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler.ios", "GestureState.UNDETERMINED")
    @js.native
    val UNDETERMINED: 0 = js.native
  }
  
  inline def PanGestureHandler(props: PanGestureHandlerProperties): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PanGestureHandler")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
