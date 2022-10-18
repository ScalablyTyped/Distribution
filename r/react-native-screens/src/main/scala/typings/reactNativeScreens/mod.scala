package typings.reactNativeScreens

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewProps
import typings.reactNativeScreens.anon.Closing
import typings.reactNativeScreens.anon.PropsWithChildrenViewProp
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenContainerProps
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenProps
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenStackHeaderConfigProps
import typings.reactNativeScreens.libTypescriptTypesMod.ScreenStackProps
import typings.reactNativeScreens.libTypescriptTypesMod.SearchBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-screens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-screens", "FullWindowOverlay")
  @js.native
  open class FullWindowOverlay () extends View
  object FullWindowOverlay {
    
    @JSImport("react-native-screens", "FullWindowOverlay")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-native-screens", "FullWindowOverlay.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-screens", "InnerScreen")
  @js.native
  open class InnerScreen () extends View
  object InnerScreen {
    
    @JSImport("react-native-screens", "InnerScreen")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-native-screens", "InnerScreen.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    inline def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-screens", "NativeScreen")
  @js.native
  open class NativeScreen protected ()
    extends Component[ScreenProps, js.Object, Any] {
    def this(props: ScreenProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScreenProps, context: Any) = this()
  }
  
  @JSImport("react-native-screens", "NativeScreenContainer")
  @js.native
  val NativeScreenContainer: ComponentType[ScreenContainerProps] = js.native
  
  @JSImport("react-native-screens", "NativeScreenNavigationContainer")
  @js.native
  val NativeScreenNavigationContainer: ComponentType[ScreenContainerProps] = js.native
  
  @JSImport("react-native-screens", "Screen")
  @js.native
  val Screen: AnimatedComponent[Instantiable0[NativeScreen]] = js.native
  
  @JSImport("react-native-screens", "ScreenContainer")
  @js.native
  val ScreenContainer: ComponentType[ScreenContainerProps] = js.native
  
  @JSImport("react-native-screens", "ScreenContext")
  @js.native
  val ScreenContext: Context[AnimatedComponent[Instantiable0[NativeScreen]]] = js.native
  
  @JSImport("react-native-screens", "ScreenStack")
  @js.native
  val ScreenStack: ComponentType[ScreenStackProps] = js.native
  
  inline def ScreenStackHeaderBackButtonImage(props: ImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScreenStackHeaderBackButtonImage")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScreenStackHeaderCenterView(props: PropsWithChildren[ViewProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScreenStackHeaderCenterView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-screens", "ScreenStackHeaderConfig")
  @js.native
  val ScreenStackHeaderConfig: ComponentType[ScreenStackHeaderConfigProps] = js.native
  
  inline def ScreenStackHeaderLeftView(props: PropsWithChildren[ViewProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScreenStackHeaderLeftView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScreenStackHeaderRightView(props: PropsWithChildren[ViewProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScreenStackHeaderRightView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScreenStackHeaderSearchBarView(props: PropsWithChildren[SearchBarProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScreenStackHeaderSearchBarView")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-native-screens", "ScreenStackHeaderSubview")
  @js.native
  val ScreenStackHeaderSubview: ComponentType[PropsWithChildrenViewProp] = js.native
  
  @JSImport("react-native-screens", "SearchBar")
  @js.native
  val SearchBar: ComponentType[SearchBarProps] = js.native
  
  inline def enableFreeze(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableFreeze")().asInstanceOf[Unit]
  inline def enableFreeze(shouldEnableReactFreeze: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableFreeze")(shouldEnableReactFreeze.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enableScreens(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScreens")().asInstanceOf[Unit]
  inline def enableScreens(shouldEnableScreens: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableScreens")(shouldEnableScreens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def executeNativeBackPress(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("executeNativeBackPress")().asInstanceOf[Boolean]
  
  @JSImport("react-native-screens", "isSearchBarAvailableForCurrentPlatform")
  @js.native
  val isSearchBarAvailableForCurrentPlatform: Boolean = js.native
  
  inline def screensEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("screensEnabled")().asInstanceOf[Boolean]
  
  @JSImport("react-native-screens", "shouldUseActivityState")
  @js.native
  val shouldUseActivityState: /* true */ Boolean = js.native
  
  inline def useTransitionProgress(): Closing = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransitionProgress")().asInstanceOf[Closing]
}
