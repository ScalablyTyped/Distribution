package typings.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typings.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TouchableWithoutFeedbackProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativePaper.anon.Bottom
import typings.reactNativePaper.anon.Focused
import typings.reactNativePaper.anon.IconPropscolorstring
import typings.reactNativePaper.anon.JumpTo
import typings.reactNativePaper.anon.PickPropsstylenavigationS
import typings.reactNativePaper.anon.SceneMap
import typings.reactNativePaper.anon.routeRouteTabPressEvent
import typings.reactNativePaper.iconMod.IconSource
import typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/BottomNavigation/BottomNavigation", JSImport.Default)
  @js.native
  val default: ComponentType[PickPropsstylenavigationS] & (NonReactStatics[ComponentType[Props] & SceneMap, js.Object]) = js.native
  
  trait NavigationState extends StObject {
    
    var index: Double
    
    var routes: js.Array[Route]
  }
  object NavigationState {
    
    inline def apply(index: Double, routes: js.Array[Route]): NavigationState = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationState]
    }
    
    extension [Self <: NavigationState](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value*))
    }
  }
  
  trait Props extends StObject {
    
    /**
      * Custom color for icon and label in the active tab.
      */
    var activeColor: js.UndefOr[String] = js.undefined
    
    /**
      * Style for the bottom navigation bar.  You can pass a custom background color here:
      *
      * ```js
      * barStyle={{ backgroundColor: '#694fad' }}
      * ```
      */
    var barStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Get accessibility label for the tab button. This is read by the screen reader when the user taps the tab.
      * Uses `route.accessibilityLabel` by default.
      */
    var getAccessibilityLabel: js.UndefOr[
        js.Function1[/* props */ typings.reactNativePaper.anon.Route, js.UndefOr[String]]
      ] = js.undefined
    
    /**
      * Get badge for the tab, uses `route.badge` by default.
      */
    var getBadge: js.UndefOr[
        js.Function1[
          /* props */ typings.reactNativePaper.anon.Route, 
          js.UndefOr[Boolean | Double | String]
        ]
      ] = js.undefined
    
    /**
      * Get color for the tab, uses `route.color` by default.
      */
    var getColor: js.UndefOr[
        js.Function1[/* props */ typings.reactNativePaper.anon.Route, js.UndefOr[String]]
      ] = js.undefined
    
    /**
      * Get label text for the tab, uses `route.title` by default. Use `renderLabel` to replace label component.
      */
    var getLabelText: js.UndefOr[
        js.Function1[/* props */ typings.reactNativePaper.anon.Route, js.UndefOr[String]]
      ] = js.undefined
    
    /**
      * Get the id to locate this tab button in tests, uses `route.testID` by default.
      */
    var getTestID: js.UndefOr[
        js.Function1[/* props */ typings.reactNativePaper.anon.Route, js.UndefOr[String]]
      ] = js.undefined
    
    /**
      * Custom color for icon and label in the inactive tab.
      */
    var inactiveColor: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the bottom navigation bar is hidden when keyboard is shown.
      * On Android, this works best when [`windowSoftInputMode`](https://developer.android.com/guide/topics/manifest/activity-element#wsoft) is set to `adjustResize`.
      */
    var keyboardHidesNavigationBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the largest possible scale a label font can reach.
      */
    var labelMaxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to show labels in tabs. When `false`, only icons will be displayed.
      */
    var labeled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * State for the bottom navigation. The state should contain the following properties:
      *
      * - `index`: a number representing the index of the active route in the `routes` array
      * - `routes`: an array containing a list of route objects used for rendering the tabs
      *
      * Each route object should contain the following properties:
      *
      * - `key`: a unique key to identify the route (required)
      * - `title`: title of the route to use as the tab label
      * - `icon`: icon to use as the tab icon, can be a string, an image source or a react component
      * - `color`: color to use as background color for shifting bottom navigation
      * - `badge`: badge to show on the tab icon, can be `true` to show a dot, `string` or `number` to show text.
      * - `accessibilityLabel`: accessibility label for the tab button
      * - `testID`: test id for the tab button
      *
      * Example:
      *
      * ```js
      * {
      *   index: 1,
      *   routes: [
      *     { key: 'music', title: 'Music', icon: 'queue-music', color: '#3F51B5' },
      *     { key: 'albums', title: 'Albums', icon: 'album', color: '#009688' },
      *     { key: 'recents', title: 'Recents', icon: 'history', color: '#795548' },
      *     { key: 'purchased', title: 'Purchased', icon: 'shopping-cart', color: '#607D8B' },
      *   ]
      * }
      * ```
      *
      * `BottomNavigation` is a controlled component, which means the `index` needs to be updated via the `onIndexChange` callback.
      */
    var navigationState: NavigationState
    
    /**
      * Callback which is called on tab change, receives the index of the new tab as argument.
      * The navigation state needs to be updated when it's called, otherwise the change is dropped.
      */
    def onIndexChange(index: Double): Unit
    
    /**
      * Function to execute on tab press. It receives the route for the pressed tab, useful for things like scroll to top.
      */
    var onTabPress: js.UndefOr[js.Function1[/* props */ routeRouteTabPressEvent, Unit]] = js.undefined
    
    /**
      * Callback which returns a React Element to be used as tab icon.
      */
    var renderIcon: js.UndefOr[js.Function1[/* props */ Focused, ReactNode]] = js.undefined
    
    /**
      * Callback which React Element to be used as tab label.
      */
    var renderLabel: js.UndefOr[js.Function1[/* props */ Focused, ReactNode]] = js.undefined
    
    /**
      * Callback which returns a react element to render as the page for the tab. Receives an object containing the route as the argument:
      *
      * ```js
      * renderScene = ({ route, jumpTo }) => {
      *   switch (route.key) {
      *     case 'music':
      *       return <MusicRoute jumpTo={jumpTo} />;
      *     case 'albums':
      *       return <AlbumsRoute jumpTo={jumpTo} />;
      *   }
      * }
      * ```
      *
      * Pages are lazily rendered, which means that a page will be rendered the first time you navigate to it.
      * After initial render, all the pages stay rendered to preserve their state.
      *
      * You need to make sure that your individual routes implement a `shouldComponentUpdate` to improve the performance.
      * To make it easier to specify the components, you can use the `SceneMap` helper:
      *
      * ```js
      * renderScene = BottomNavigation.SceneMap({
      *   music: MusicRoute,
      *   albums: AlbumsRoute,
      * });
      * ```
      *
      * Specifying the components this way is easier and takes care of implementing a `shouldComponentUpdate` method.
      * Each component will receive the current route and a `jumpTo` method as it's props.
      * The `jumpTo` method can be used to navigate to other tabs programmatically:
      *
      * ```js
      * this.props.jumpTo('albums')
      * ```
      */
    def renderScene(props: JumpTo): ReactNode | Null
    
    /**
      * Callback which returns a React element to be used as the touchable for the tab item.
      * Renders a `TouchableRipple` on Android and `TouchableWithoutFeedback` with `View` on iOS.
      */
    var renderTouchable: js.UndefOr[js.Function1[/* props */ TouchableProps, ReactNode]] = js.undefined
    
    /**
      * Safe area insets for the tab bar. This can be used to avoid elements like the navigation bar on Android and bottom safe area on iOS.
      * The bottom insets for iOS is added by default. You can override the behavior with this option.
      */
    var safeAreaInsets: js.UndefOr[Bottom] = js.undefined
    
    /**
      * Whether animation is enabled for scenes transitions in `shifting` mode.
      * By default, the scenes cross-fade during tab change when `shifting` is enabled.
      * Specify `sceneAnimationEnabled` as `false` to disable the animation.
      */
    var sceneAnimationEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the shifting style is used, the active tab icon shifts up to show the label and the inactive tabs won't have a label.
      *
      * By default, this is `true` when you have more than 3 tabs.
      * Pass `shifting={false}` to explicitly disable this animation, or `shifting={true}` to always use this animation.
      */
    var shifting: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * @optional
      */
    var theme: Theme
  }
  object Props {
    
    inline def apply(
      navigationState: NavigationState,
      onIndexChange: Double => Unit,
      renderScene: JumpTo => ReactNode | Null,
      theme: Theme
    ): Props = {
      val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any], onIndexChange = js.Any.fromFunction1(onIndexChange), renderScene = js.Any.fromFunction1(renderScene), theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      inline def setBarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
      
      inline def setBarStyleNull: Self = StObject.set(x, "barStyle", null)
      
      inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
      
      inline def setGetAccessibilityLabel(value: /* props */ typings.reactNativePaper.anon.Route => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetAccessibilityLabelUndefined: Self = StObject.set(x, "getAccessibilityLabel", js.undefined)
      
      inline def setGetBadge(value: /* props */ typings.reactNativePaper.anon.Route => js.UndefOr[Boolean | Double | String]): Self = StObject.set(x, "getBadge", js.Any.fromFunction1(value))
      
      inline def setGetBadgeUndefined: Self = StObject.set(x, "getBadge", js.undefined)
      
      inline def setGetColor(value: /* props */ typings.reactNativePaper.anon.Route => js.UndefOr[String]): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
      
      inline def setGetColorUndefined: Self = StObject.set(x, "getColor", js.undefined)
      
      inline def setGetLabelText(value: /* props */ typings.reactNativePaper.anon.Route => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
      
      inline def setGetTestID(value: /* props */ typings.reactNativePaper.anon.Route => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setGetTestIDUndefined: Self = StObject.set(x, "getTestID", js.undefined)
      
      inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
      
      inline def setKeyboardHidesNavigationBar(value: Boolean): Self = StObject.set(x, "keyboardHidesNavigationBar", value.asInstanceOf[js.Any])
      
      inline def setKeyboardHidesNavigationBarUndefined: Self = StObject.set(x, "keyboardHidesNavigationBar", js.undefined)
      
      inline def setLabelMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "labelMaxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setLabelMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "labelMaxFontSizeMultiplier", js.undefined)
      
      inline def setLabeled(value: Boolean): Self = StObject.set(x, "labeled", value.asInstanceOf[js.Any])
      
      inline def setLabeledUndefined: Self = StObject.set(x, "labeled", js.undefined)
      
      inline def setNavigationState(value: NavigationState): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOnIndexChange(value: Double => Unit): Self = StObject.set(x, "onIndexChange", js.Any.fromFunction1(value))
      
      inline def setOnTabPress(value: /* props */ routeRouteTabPressEvent => Unit): Self = StObject.set(x, "onTabPress", js.Any.fromFunction1(value))
      
      inline def setOnTabPressUndefined: Self = StObject.set(x, "onTabPress", js.undefined)
      
      inline def setRenderIcon(value: /* props */ Focused => ReactNode): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setRenderLabel(value: /* props */ Focused => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setRenderScene(value: JumpTo => ReactNode | Null): Self = StObject.set(x, "renderScene", js.Any.fromFunction1(value))
      
      inline def setRenderTouchable(value: /* props */ TouchableProps => ReactNode): Self = StObject.set(x, "renderTouchable", js.Any.fromFunction1(value))
      
      inline def setRenderTouchableUndefined: Self = StObject.set(x, "renderTouchable", js.undefined)
      
      inline def setSafeAreaInsets(value: Bottom): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
      
      inline def setSafeAreaInsetsUndefined: Self = StObject.set(x, "safeAreaInsets", js.undefined)
      
      inline def setSceneAnimationEnabled(value: Boolean): Self = StObject.set(x, "sceneAnimationEnabled", value.asInstanceOf[js.Any])
      
      inline def setSceneAnimationEnabledUndefined: Self = StObject.set(x, "sceneAnimationEnabled", js.undefined)
      
      inline def setShifting(value: Boolean): Self = StObject.set(x, "shifting", value.asInstanceOf[js.Any])
      
      inline def setShiftingUndefined: Self = StObject.set(x, "shifting", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait Route extends StObject {
    
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    var badge: js.UndefOr[String | Double | Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[IconSource] = js.undefined
    
    var key: String
    
    var testID: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Route {
    
    inline def apply(key: String): Route = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setBadge(value: String | Double | Boolean): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: IconSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ IconPropscolorstring => ReactNode): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: ImageURISource*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabPressEvent extends StObject {
    
    var defaultPrevented: Boolean
    
    def preventDefault(): Unit
  }
  object TabPressEvent {
    
    inline def apply(defaultPrevented: Boolean, preventDefault: () => Unit): TabPressEvent = {
      val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[TabPressEvent]
    }
    
    extension [Self <: TabPressEvent](x: Self) {
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
  
  trait TouchableProps
    extends StObject
       with TouchableWithoutFeedbackProps {
    
    var borderless: js.UndefOr[Boolean] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    @JSName("children")
    var children_TouchableProps: ReactNode
    
    var key: String
    
    var rippleColor: js.UndefOr[String] = js.undefined
    
    var route: Route
  }
  object TouchableProps {
    
    inline def apply(key: String, route: Route): TouchableProps = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchableProps]
    }
    
    extension [Self <: TouchableProps](x: Self) {
      
      inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
      
      inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
      
      inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[PickPropsstylenavigationS] & (NonReactStatics[ComponentType[Props] & SceneMap, js.Object])
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationMod.foo` */
  override def _to: ComponentType[PickPropsstylenavigationS] & (NonReactStatics[ComponentType[Props] & SceneMap, js.Object]) = default
}
