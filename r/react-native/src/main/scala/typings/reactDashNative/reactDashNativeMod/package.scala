package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.BaseSyntheticEvent
  import typings.react.reactMod.Component
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.ReactElement
  import typings.reactDashNative.Anon_ActionName
  import typings.reactDashNative.Anon_Label
  import typings.reactDashNative.Anon_RegisteredStyleBrand
  import typings.reactDashNative.reactDashNativeNumbers.`false`
  import typings.reactDashNative.reactDashNativeStrings.`visible-password`
  import typings.reactDashNative.reactDashNativeStrings.hardwareBackPress

  type ART = ARTStatic
  type AccessibilityActionEvent = NativeSyntheticEvent[Anon_ActionName]
  type AccessibilityActionInfo = Anon_Label
  type AccessibilityChangeEvent = Boolean
  type AccessibilityEvent = AccessibilityChangeEvent | AccessibilityAnnoucementFinishedEvent
  type AccessibilityInfo = AccessibilityInfoStatic
  type AccessibilityProperties = AccessibilityProps
  type AccessibilityPropertiesAndroid = AccessibilityPropsAndroid
  type AccessibilityPropertiesIOS = AccessibilityPropsIOS
  type ActionSheetIOS = ActionSheetIOSStatic
  type ActivityIndicatorComponent = Component[ActivityIndicatorProps, js.Object, js.Any]
  type ActivityIndicatorIOSProperties = ActivityIndicatorIOSProps
  type ActivityIndicatorProperties = ActivityIndicatorProps
  type Alert = AlertStatic
  type AppState = AppStateStatic
  type AsyncStorage = AsyncStorageStatic
  type BackHandler = BackHandlerStatic
  type BackPressEventName = hardwareBackPress
  type ButtonProperties = ButtonProps
  type CameraRoll = CameraRollStatic
  type Clipboard = ClipboardStatic
  type ComponentProvider = js.Function0[ComponentType[js.Any]]
  type Constructor[T] = Instantiable1[/* args (repeated) */ js.Any, T]
  type DatePickerAndroid = DatePickerAndroidStatic
  type DatePickerIOSComponent = Component[DatePickerIOSProps, js.Object, js.Any]
  type DatePickerIOSProperties = DatePickerIOSProps
  type DrawerLayoutAndroidComponent = Component[DrawerLayoutAndroidProps, js.Object, js.Any]
  type DrawerLayoutAndroidProperties = DrawerLayoutAndroidProps
  type DrawerSlideEvent = NativeSyntheticEvent[NativeTouchEvent]
  type Easing = EasingStatic
  type EasingFunction = js.Function1[/* value */ Double, Double]
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[Boolean], Unit]
  type Falsy = js.UndefOr[Null | `false`]
  type FlatListProperties[ItemT] = FlatListProps[ItemT]
  type GestureResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  type Handle = Double
  type I18nManager = I18nManagerStatic
  type ImageBackgroundComponent = Component[ImageBackgroundProps, js.Object, js.Any]
  type ImageBackgroundProperties = ImageBackgroundProps
  type ImageComponent = Component[ImageProps, js.Object, js.Any]
  type ImageEditor = ImageEditorStatic
  type ImagePickerIOS = ImagePickerIOSStatic
  type ImagePickerResult = js.Tuple3[String, Double, Double]
  type ImageProperties = ImageProps
  type ImagePropertiesAndroid = ImagePropsAndroid
  type ImagePropertiesIOS = ImagePropsIOS
  type ImagePropertiesSourceOptions = ImageSourcePropType
  type ImageRequireSource = Double
  type ImageSourcePropType = ImageURISource | js.Array[ImageURISource] | ImageRequireSource
  type ImageStore = ImageStoreStatic
  type InputAccessoryViewProperties = InputAccessoryViewProps
  /**
    * It is a component to solve the common problem of views that need to move out of the way of the virtual keyboard.
    * It can automatically adjust either its position or bottom padding based on the position of the keyboard.
    */
  type KeyboardAvoidingViewComponent = Component[KeyboardAvoidingViewProps, js.Object, js.Any]
  type KeyboardEventListener = js.Function1[/* event */ KeyboardEvent, Unit]
  type KeyboardTypeAndroid = `visible-password`
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashNative.reactDashNativeMod.KeyboardType
    - typings.reactDashNative.reactDashNativeMod.KeyboardTypeAndroid
    - typings.reactDashNative.reactDashNativeMod.KeyboardTypeIOS
  */
  type KeyboardTypeOptions = _KeyboardTypeOptions | KeyboardTypeAndroid
  type LayoutAnimation = LayoutAnimationStatic
  type Linking = LinkingStatic
  type ListRenderItem[ItemT] = js.Function1[/* info */ ListRenderItemInfo[ItemT], ReactElement | Null]
  type ListViewComponent = Component[ListViewProps, js.Object, js.Any]
  type ListViewProperties = ListViewProps
  /**
    * @see https://facebook.github.io/react-native/docs/maskedviewios.html
    */
  type MaskedViewComponent = Component[MaskedViewIOSProps, js.Object, js.Any]
  type MaskedViewIOSProperties = MaskedViewIOSProps
  type MeasureInWindowOnSuccessCallback = js.Function4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, Unit]
  type MeasureLayoutOnSuccessCallback = js.Function4[/* left */ Double, /* top */ Double, /* width */ Double, /* height */ Double, Unit]
  type MeasureOnSuccessCallback = js.Function6[
    /* x */ Double, 
    /* y */ Double, 
    /* width */ Double, 
    /* height */ Double, 
    /* pageX */ Double, 
    /* pageY */ Double, 
    Unit
  ]
  type ModalProperties = ModalProps
  type ModalProps = ModalBaseProps with ModalPropsIOS with ModalPropsAndroid
  type NativeComponent = NativeMethodsMixinStatic
  type NativeEventEmitter = EventEmitter
  type NativeMethodsMixin = NativeMethodsMixinStatic
  /**
    * Interface for NativeModules which allows to augment NativeModules with type informations.
    * See react-native-sensor-manager for example.
    */
  type NativeModulesStatic = StringDictionary[js.Any]
  type NativeSyntheticEvent[T] = BaseSyntheticEvent[T, NodeHandle, NodeHandle]
  type NavigatorIOSProperties = NavigatorIOSProps
  type NodeHandle = Double
  type PanResponder = PanResponderStatic
  type PermissionsAndroid = PermissionsAndroidStatic
  /**
    * @see https://facebook.github.io/react-native/docs/pickerios.html
    * @see PickerIOS.ios.js
    */
  type PickerIOSComponent = Component[PickerIOSProps, js.Object, js.Any]
  type PickerIOSItemProperties = PickerIOSItemProps
  type PickerIOSProperties = PickerIOSProps
  type PickerItemProperties = PickerItemProps
  type PickerProperties = PickerProps
  type PickerPropertiesAndroid = PickerPropsAndroid
  type PickerPropertiesIOS = PickerPropsIOS
  /**
    * React component that wraps the Android-only `ProgressBar`. This component is used to indicate
    * that the app is loading or there is some activity in the app.
    */
  type ProgressBarAndroidComponent = Component[ProgressBarAndroidProps, js.Object, js.Any]
  type ProgressBarAndroidProperties = ProgressBarAndroidProps
  type ProgressViewIOSComponent = Component[ProgressViewIOSProps, js.Object, js.Any]
  type ProgressViewIOSProperties = ProgressViewIOSProps
  type PushNotificationIOS = PushNotificationIOSStatic
  /**
    * Receive events from native-code
    * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
    * adding all event listeners directly to RCTNativeAppEventEmitter.
    * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\EventEmitter\RCTNativeAppEventEmitter.js
    * @see https://facebook.github.io/react-native/docs/native-modules-ios.html#sending-events-to-javascript
    */
  type RCTNativeAppEventEmitter = DeviceEventEmitterStatic
  /**
    * Wrapper around android native recycler view.
    *
    * It simply renders rows passed as children in a separate recycler view cells
    * similarly to how `ScrollView` is doing it. Thanks to the fact that it uses
    * native `RecyclerView` though, rows that are out of sight are going to be
    * automatically detached (similarly on how this would work with
    * `removeClippedSubviews = true` on a `ScrollView.js`).
    *
    * CAUTION: This is an experimental component and should only be used together
    * with javascript implementation of list view (see ListView.js). In order to
    * use it pass this component as `renderScrollComponent` to the list view. For
    * now only horizontal scrolling is supported.
    */
  type RecyclerViewBackedScrollViewComponent = Component[RecyclerViewBackedScrollViewProps, js.Object, js.Any]
  type RecyclerViewBackedScrollViewProperties = RecyclerViewBackedScrollViewProps
  type RecyclerViewBackedScrollViewProps = ScrollViewProps
  /**
    * This component is used inside a ScrollView or ListView to add pull to refresh
    * functionality. When the ScrollView is at `scrollY: 0`, swiping down
    * triggers an `onRefresh` event.
    *
    * __Note:__ `refreshing` is a controlled prop, this is why it needs to be set to true
    * in the `onRefresh` function otherwise the refresh indicator will stop immediately.
    */
  type RefreshControlComponent = Component[RefreshControlProps, js.Object, js.Any]
  type RefreshControlProperties = RefreshControlProps
  type RefreshControlPropertiesAndroid = RefreshControlPropsAndroid
  type RefreshControlPropertiesIOS = RefreshControlPropsIOS
  /** Keep a brand of 'T' so that calls to `StyleSheet.flatten` can take `RegisteredStyle<T>` and return `T`. */
  type RegisteredStyle[T] = Double with Anon_RegisteredStyleBrand[T]
  type Runnable = js.Function1[/* appParameters */ js.Any, Unit]
  /**
    * Renders nested content and automatically applies paddings reflect the portion of the view
    * that is not covered by navigation bars, tab bars, toolbars, and other ancestor views.
    * Moreover, and most importantly, Safe Area's paddings reflect physical limitation of the screen,
    * such as rounded corners or camera notches (aka sensor housing area on iPhone X).
    */
  type SafeAreaViewComponent = Component[ViewProps, js.Object, js.Any]
  type ScrollResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  type ScrollViewComponent = Component[ScrollViewProps, js.Object, js.Any]
  type ScrollViewProperties = ScrollViewProps
  type ScrollViewPropertiesAndroid = ScrollViewPropsAndroid
  type ScrollViewPropertiesIOS = ScrollViewPropsIOS
  type SectionListProperties[ItemT] = SectionListProps[ItemT]
  type SectionListRenderItem[ItemT] = js.Function1[/* info */ SectionListRenderItemInfo[ItemT], ReactElement | Null]
  /**
    * Use `SegmentedControlIOS` to render a UISegmentedControl iOS.
    *
    * #### Programmatically changing selected index
    *
    * The selected index can be changed on the fly by assigning the
    * selectIndex prop to a state variable, then changing that variable.
    * Note that the state variable would need to be updated as the user
    * selects a value and changes the index, as shown in the example below.
    *
    * ````
    * <SegmentedControlIOS
    *   values={['One', 'Two']}
    *   selectedIndex={this.state.selectedIndex}
    *   onChange={(event) => {
    *     this.setState({selectedIndex: event.nativeEvent.selectedSegmentIndex});
    *   }}
    * />
    * ````
    */
  type SegmentedControlIOSComponent = Component[SegmentedControlIOSProps, js.Object, js.Any]
  type SegmentedControlIOSProperties = SegmentedControlIOSProps
  type Settings = SettingsStatic
  type Share = ShareStatic
  /**
    * A component used to select a single value from a range of values.
    */
  type SliderComponent = Component[SliderProps, js.Object, js.Any]
  type SliderIOS = Slider
  type SliderProperties = SliderProps
  type SliderPropertiesAndroid = SliderPropsAndroid
  type SliderPropertiesIOS = SliderPropsIOS
  type SnapshotViewIOSComponent = Component[SnapshotViewIOSProps, js.Object, js.Any]
  type SnapshotViewIOSProperties = SnapshotViewIOSProps
  type StatusBarIOS = StatusBarIOSStatic
  type StatusBarIOSStatic = NativeEventEmitter
  type StatusBarProperties = StatusBarProps
  type StatusBarPropertiesAndroid = StatusBarPropsAndroid
  type StatusBarPropertiesIOS = StatusBarPropsIOS
  type StyleProp[T] = T | RegisteredStyle[T] | (RecursiveArray[T | RegisteredStyle[T] | Falsy]) | Falsy
  /**
    * Renders a boolean input.
    *
    * This is a controlled component that requires an `onValueChange` callback that
    * updates the `value` prop in order for the component to reflect user actions.
    * If the `value` prop is not updated, the component will continue to render
    * the supplied `value` prop instead of the expected result of any user actions.
    */
  type SwitchComponent = Component[SwitchProps, js.Object, js.Any]
  type SwitchIOSProperties = SwitchIOSProps
  type SwitchProperties = SwitchProps
  type SwitchPropertiesIOS = SwitchPropsIOS
  type Systrace = SystraceStatic
  type TabBarIOSItemProperties = TabBarIOSItemProps
  type TabBarIOSProperties = TabBarIOSProps
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[Unit]]
  type TaskProvider = js.Function0[Task]
  /**
    * A React component for displaying text which supports nesting, styling, and touch handling.
    */
  type TextComponent = Component[TextProps, js.Object, js.Any]
  type TextInputAndroidProperties = TextInputAndroidProps
  /**
    * @see https://facebook.github.io/react-native/docs/textinput.html#methods
    */
  type TextInputComponent = Component[TextInputProps, js.Object, js.Any]
  type TextInputIOSProperties = TextInputIOSProps
  type TextInputProperties = TextInputProps
  type TextProperties = TextProps
  type TextPropertiesAndroid = TextPropsAndroid
  type TextPropertiesIOS = TextPropsIOS
  type TimePickerAndroid = TimePickerAndroidStatic
  type ToastAndroid = ToastAndroidStatic
  /**
    * React component that wraps the Android-only [`Toolbar` widget][0]. A Toolbar can display a logo,
    * navigation icon (e.g. hamburger menu), a title & subtitle and a list of actions. The title and
    * subtitle are expanded so the logo and navigation icons are displayed on the left, title and
    * subtitle in the middle and the actions on the right.
    *
    * If the toolbar has an only child, it will be displayed between the title and actions.
    *
    * Although the Toolbar supports remote images for the logo, navigation and action icons, this
    * should only be used in DEV mode where `require('./some_icon.png')` translates into a packager
    * URL. In release mode you should always use a drawable resource for these icons. Using
    * `require('./some_icon.png')` will do this automatically for you, so as long as you don't
    * explicitly use e.g. `{uri: 'http://...'}`, you will be good.
    *
    * [0]: https://developer.android.com/reference/android/support/v7/widget/Toolbar.html
    */
  type ToolbarAndroidComponent = Component[ToolbarAndroidProps, js.Object, js.Any]
  type ToolbarAndroidProperties = ToolbarAndroidProps
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased,
    * which allows the underlay color to show through, darkening or tinting the view.
    * The underlay comes from adding a view to the view hierarchy,
    * which can sometimes cause unwanted visual artifacts if not used correctly,
    * for example if the backgroundColor of the wrapped view isn't explicitly set to an opaque color.
    *
    * NOTE: TouchableHighlight supports only one child
    * If you wish to have several child components, wrap them in a View.
    *
    * @see https://facebook.github.io/react-native/docs/touchablehighlight.html
    */
  type TouchableHighlightComponent = Component[TouchableHighlightProps, js.Object, js.Any]
  type TouchableHighlightProperties = TouchableHighlightProps
  /**
    * A wrapper for making views respond properly to touches (Android only).
    * On Android this component uses native state drawable to display touch feedback.
    * At the moment it only supports having a single View instance as a child node,
    * as it's implemented by replacing that View with another instance of RCTView node with some additional properties set.
    *
    * Background drawable of native feedback touchable can be customized with background property.
    *
    * @see https://facebook.github.io/react-native/docs/touchablenativefeedback.html#content
    */
  type TouchableNativeFeedbackComponent = Component[TouchableNativeFeedbackProps, js.Object, js.Any]
  type TouchableNativeFeedbackProperties = TouchableNativeFeedbackProps
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased, dimming it.
    * This is done without actually changing the view hierarchy,
    * and in general is easy to add to an app without weird side-effects.
    *
    * @see https://facebook.github.io/react-native/docs/touchableopacity.html
    */
  type TouchableOpacityComponent = Component[TouchableOpacityProps, js.Object, js.Any]
  type TouchableOpacityProperties = TouchableOpacityProps
  /**
    * Do not use unless you have a very good reason.
    * All the elements that respond to press should have a visual feedback when touched.
    * This is one of the primary reason a "web" app doesn't feel "native".
    *
    * @see https://facebook.github.io/react-native/docs/touchablewithoutfeedback.html
    */
  type TouchableWithoutFeedbackComponent = Component[TouchableWithoutFeedbackProps, js.Object, js.Any]
  type TouchableWithoutFeedbackProperties = TouchableWithoutFeedbackProps
  type UIManager = UIManagerStatic
  type Vibration = VibrationStatic
  /**
    * The most fundamental component for building UI, View is a container that supports layout with flexbox, style, some touch handling,
    * and accessibility controls, and is designed to be nested inside other views and to have 0 to many children of any type.
    * View maps directly to the native view equivalent on whatever platform React is running on,
    * whether that is a UIView, <div>, android.view, etc.
    */
  type ViewComponent = Component[ViewProps, js.Object, js.Any]
  type ViewPagerAndroidComponent = Component[ViewPagerAndroidProps, js.Object, js.Any]
  type ViewPagerAndroidProperties = ViewPagerAndroidProps
  type ViewProperties = ViewProps
  type ViewPropertiesAndroid = ViewPropsAndroid
  type ViewPropertiesIOS = ViewPropsIOS
  type ViewabilityConfigCallbackPairs = js.Array[ViewabilityConfigCallbackPair]
  type VirtualizedListProperties[ItemT] = VirtualizedListProps[ItemT]
}
