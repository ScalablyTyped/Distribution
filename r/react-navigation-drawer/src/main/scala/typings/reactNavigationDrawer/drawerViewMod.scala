package typings.reactNavigationDrawer

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.PureComponent
import typings.react.mod.RefAttributes
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.panGestureHandlerMod.PanGestureHandlerProps_
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typings.reactNavigationDrawer.anon.Lazy
import typings.reactNavigationDrawer.anon.Loaded
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
import typings.reactNavigationDrawer.typesMod.NavigationDrawerState
import typings.reactNavigationDrawer.typesMod.SceneDescriptorMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerViewMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
  @js.native
  open class default () extends DrawerView
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", "default.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", "default.defaultProps")
    @js.native
    def defaultProps: Lazy = js.native
    inline def defaultProps_=(x: Lazy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Loaded]
  }
  
  trait DrawerOptions extends StObject {
    
    var drawerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
    
    var drawerPosition: left | right
    
    var drawerType: front | back | slide
    
    var drawerWidth: Double | js.Function0[Double]
    
    var edgeWidth: Double
    
    var gestureHandlerProps: js.UndefOr[ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]] = js.undefined
    
    var hideStatusBar: js.UndefOr[Boolean] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[`on-drag` | none] = js.undefined
    
    var minSwipeDistance: js.UndefOr[Double] = js.undefined
    
    var onDrawerClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDrawerOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var overlayColor: js.UndefOr[String] = js.undefined
    
    var sceneContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var statusBarAnimation: slide | none | fade
    
    var style: js.UndefOr[ViewStyle] = js.undefined
  }
  object DrawerOptions {
    
    inline def apply(
      drawerPosition: left | right,
      drawerType: front | back | slide,
      drawerWidth: Double | js.Function0[Double],
      edgeWidth: Double,
      statusBarAnimation: slide | none | fade
    ): DrawerOptions = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerOptions]
    }
    
    extension [Self <: DrawerOptions](x: Self) {
      
      inline def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      inline def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidthFunction0(value: () => Double): Self = StObject.set(x, "drawerWidth", js.Any.fromFunction0(value))
      
      inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
      
      inline def setGestureHandlerProps(value: ComponentProps[ComponentType[PanGestureHandlerProps_ & RefAttributes[Any]]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      inline def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
      
      inline def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      inline def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
      
      inline def setKeyboardDismissMode(value: `on-drag` | none): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      inline def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
      
      inline def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      inline def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      inline def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      inline def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      inline def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      inline def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DrawerView extends PureComponent[Props, State, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawerView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawerView(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawerView(): Unit = js.native
    
    @JSName("context")
    var context_DrawerView: ContextType[Context[SupportedThemes]] = js.native
    
    /* private */ var drawerGestureRef: Any = js.native
    
    /* private */ var getDrawerBackgroundColor: Any = js.native
    
    /* private */ var getLockMode: Any = js.native
    
    /* private */ var getOverlayColor: Any = js.native
    
    /* private */ var handleDrawerClose: Any = js.native
    
    /* private */ var handleDrawerOpen: Any = js.native
    
    /* private */ var renderContent: Any = js.native
    
    /* private */ var renderNavigationView: Any = js.native
    
    /* private */ var setDrawerGestureRef: Any = js.native
    
    /* private */ var updateWidth: Any = js.native
  }
  
  trait Props extends StObject {
    
    var descriptors: SceneDescriptorMap
    
    var detachInactiveScreens: Boolean
    
    var `lazy`: Boolean
    
    var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
    
    var navigationConfig: DrawerOptionscontentCompo
    
    var screenProps: Any
  }
  object Props {
    
    inline def apply(
      descriptors: SceneDescriptorMap,
      detachInactiveScreens: Boolean,
      `lazy`: Boolean,
      navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
      navigationConfig: DrawerOptionscontentCompo,
      screenProps: Any
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], detachInactiveScreens = detachInactiveScreens.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDescriptors(value: SceneDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationConfig(value: DrawerOptionscontentCompo): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var drawerWidth: Double
    
    var loaded: js.Array[Double]
  }
  object State {
    
    inline def apply(drawerWidth: Double, loaded: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: js.Array[Double]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setLoadedVarargs(value: Double*): Self = StObject.set(x, "loaded", js.Array(value*))
    }
  }
}
