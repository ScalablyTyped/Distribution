package typings.reactNavigationDrawer

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.ComponentProps
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.PureComponent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigation.mod.SupportedThemes
import typings.reactNavigationDrawer.anon.DrawerOptionscontentCompo
import typings.reactNavigationDrawer.anon.Lazy
import typings.reactNavigationDrawer.anon.Loaded
import typings.reactNavigationDrawer.anon.ReadonlyPanGestureHandler
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
  class default () extends DrawerView
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", "default.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    @scala.inline
    def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerView", "default.defaultProps")
    @js.native
    def defaultProps: Lazy = js.native
    @scala.inline
    def defaultProps_=(x: Lazy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDerivedStateFromProps(nextProps: Props, prevState: State): Loaded = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Loaded]
  }
  
  trait DrawerOptions extends StObject {
    
    var drawerBackgroundColor: js.UndefOr[String] = js.undefined
    
    var drawerLockMode: js.UndefOr[unlocked | `locked-closed` | `locked-open`] = js.undefined
    
    var drawerPosition: left | right
    
    var drawerType: front | back | slide
    
    var drawerWidth: Double | js.Function0[Double]
    
    var edgeWidth: Double
    
    var gestureHandlerProps: js.UndefOr[
        ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]
      ] = js.undefined
    
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
    
    @scala.inline
    def apply(
      drawerPosition: left | right,
      drawerType: front | back | slide,
      drawerWidth: Double | js.Function0[Double],
      edgeWidth: Double,
      statusBarAnimation: slide | none | fade
    ): DrawerOptions = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerOptions]
    }
    
    @scala.inline
    implicit class DrawerOptionsMutableBuilder[Self <: DrawerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawerBackgroundColor(value: String): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      @scala.inline
      def setDrawerLockMode(value: unlocked | `locked-closed` | `locked-open`): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      @scala.inline
      def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerWidthFunction0(value: () => Double): Self = StObject.set(x, "drawerWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureHandlerProps(value: ComponentProps[Instantiable1[/* props */ ReadonlyPanGestureHandler, PanGestureHandler]]): Self = StObject.set(x, "gestureHandlerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureHandlerPropsUndefined: Self = StObject.set(x, "gestureHandlerProps", js.undefined)
      
      @scala.inline
      def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
      
      @scala.inline
      def setKeyboardDismissMode(value: `on-drag` | none): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      @scala.inline
      def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
      
      @scala.inline
      def setOnDrawerClose(value: () => Unit): Self = StObject.set(x, "onDrawerClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerCloseUndefined: Self = StObject.set(x, "onDrawerClose", js.undefined)
      
      @scala.inline
      def setOnDrawerOpen(value: () => Unit): Self = StObject.set(x, "onDrawerOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnDrawerOpenUndefined: Self = StObject.set(x, "onDrawerOpen", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setSceneContainerStyle(value: ViewStyle): Self = StObject.set(x, "sceneContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSceneContainerStyleUndefined: Self = StObject.set(x, "sceneContainerStyle", js.undefined)
      
      @scala.inline
      def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait DrawerView
    extends PureComponent[Props, State, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MDrawerView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDrawerView(prevProps: Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDrawerView(): Unit = js.native
    
    @JSName("context")
    var context_DrawerView: ContextType[Context[SupportedThemes]] = js.native
    
    var drawerGestureRef: js.Any = js.native
    
    var getDrawerBackgroundColor: js.Any = js.native
    
    var getLockMode: js.Any = js.native
    
    var getOverlayColor: js.Any = js.native
    
    var handleDrawerClose: js.Any = js.native
    
    var handleDrawerOpen: js.Any = js.native
    
    var renderContent: js.Any = js.native
    
    var renderNavigationView: js.Any = js.native
    
    var setDrawerGestureRef: js.Any = js.native
    
    var updateWidth: js.Any = js.native
  }
  
  trait Props extends StObject {
    
    var descriptors: SceneDescriptorMap
    
    var detachInactiveScreens: Boolean
    
    var `lazy`: Boolean
    
    var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
    
    var navigationConfig: DrawerOptionscontentCompo
    
    var screenProps: js.Any
  }
  object Props {
    
    @scala.inline
    def apply(
      descriptors: SceneDescriptorMap,
      detachInactiveScreens: Boolean,
      `lazy`: Boolean,
      navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
      navigationConfig: DrawerOptionscontentCompo,
      screenProps: js.Any
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], detachInactiveScreens = detachInactiveScreens.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptors(value: SceneDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationConfig(value: DrawerOptionscontentCompo): Self = StObject.set(x, "navigationConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var drawerWidth: Double
    
    var loaded: js.Array[Double]
  }
  object State {
    
    @scala.inline
    def apply(drawerWidth: Double, loaded: js.Array[Double]): State = {
      val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: js.Array[Double]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedVarargs(value: Double*): Self = StObject.set(x, "loaded", js.Array(value :_*))
    }
  }
}
