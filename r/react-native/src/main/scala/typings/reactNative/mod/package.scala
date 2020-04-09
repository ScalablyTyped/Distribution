package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ART = typings.reactNative.mod.ARTStatic
  type AccessibilityActionEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNative.ReadonlyactionNamestring]
  type AccessibilityChangeEvent = scala.Boolean
  type AccessibilityEvent = typings.reactNative.mod.AccessibilityChangeEvent | typings.reactNative.mod.AccessibilityAnnoucementFinishedEvent
  type AccessibilityInfo = typings.reactNative.mod.AccessibilityInfoStatic
  type AccessibilityProperties = typings.reactNative.mod.AccessibilityProps
  type AccessibilityPropertiesAndroid = typings.reactNative.mod.AccessibilityPropsAndroid
  type AccessibilityPropertiesIOS = typings.reactNative.mod.AccessibilityPropsIOS
  type ActionSheetIOS = typings.reactNative.mod.ActionSheetIOSStatic
  type ActivityIndicatorComponent = typings.react.mod.Component[typings.reactNative.mod.ActivityIndicatorProps, js.Object, js.Any]
  type ActivityIndicatorIOSProperties = typings.reactNative.mod.ActivityIndicatorIOSProps
  type ActivityIndicatorProperties = typings.reactNative.mod.ActivityIndicatorProps
  type Alert = typings.reactNative.mod.AlertStatic
  type AppState = typings.reactNative.mod.AppStateStatic
  type AsyncStorage = typings.reactNative.mod.AsyncStorageStatic
  type BackHandler = typings.reactNative.mod.BackHandlerStatic
  type BackPressEventName = typings.reactNative.reactNativeStrings.hardwareBackPress
  type ButtonProperties = typings.reactNative.mod.ButtonProps
  type CameraRoll = typings.reactNative.mod.CameraRollStatic
  type Clipboard = typings.reactNative.mod.ClipboardStatic
  /* Rewritten from type alias, can be one of: 
    - typings.reactNative.reactNativeStrings.light
    - typings.reactNative.reactNativeStrings.dark
    - scala.Null
    - `js.undefined`
  */
  type ColorSchemeName = js.UndefOr[typings.reactNative.mod._ColorSchemeName | scala.Null]
  type ComponentProvider = js.Function0[typings.react.mod.ComponentType[js.Any]]
  type Constructor[T] = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]
  type DatePickerAndroid = typings.reactNative.mod.DatePickerAndroidStatic
  type DatePickerIOSComponent = typings.react.mod.Component[typings.reactNative.mod.DatePickerIOSProps, js.Object, js.Any]
  type DatePickerIOSProperties = typings.reactNative.mod.DatePickerIOSProps
  type DrawerLayoutAndroidComponent = typings.react.mod.Component[typings.reactNative.mod.DrawerLayoutAndroidProps, js.Object, js.Any]
  type DrawerLayoutAndroidProperties = typings.reactNative.mod.DrawerLayoutAndroidProps
  type DrawerSlideEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNative.mod.NativeTouchEvent]
  type Easing = typings.reactNative.mod.EasingStatic
  type EasingFunction = js.Function1[/* value */ scala.Double, scala.Double]
  type ErrorHandlerCallback = js.Function2[/* error */ js.Any, /* isFatal */ js.UndefOr[scala.Boolean], scala.Unit]
  type Falsy = js.UndefOr[scala.Null | typings.reactNative.reactNativeBooleans.`false`]
  type FlatListProperties[ItemT] = typings.reactNative.mod.FlatListProps[ItemT]
  type GestureResponderEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNative.mod.NativeTouchEvent]
  type Handle = scala.Double
  type I18nManager = typings.reactNative.mod.I18nManagerStatic
  type ImageBackgroundComponent = typings.react.mod.Component[typings.reactNative.mod.ImageBackgroundProps, js.Object, js.Any]
  type ImageBackgroundProperties = typings.reactNative.mod.ImageBackgroundProps
  type ImageComponent = typings.react.mod.Component[typings.reactNative.mod.ImageProps, js.Object, js.Any]
  type ImageEditor = typings.reactNative.mod.ImageEditorStatic
  type ImagePickerIOS = typings.reactNative.mod.ImagePickerIOSStatic
  type ImagePickerResult = js.Tuple3[java.lang.String, scala.Double, scala.Double]
  type ImageProperties = typings.reactNative.mod.ImageProps
  type ImagePropertiesAndroid = typings.reactNative.mod.ImagePropsAndroid
  type ImagePropertiesIOS = typings.reactNative.mod.ImagePropsIOS
  type ImagePropertiesSourceOptions = typings.reactNative.mod.ImageSourcePropType
  type ImageRequireSource = scala.Double
  type ImageSourcePropType = typings.reactNative.mod.ImageURISource | js.Array[typings.reactNative.mod.ImageURISource] | typings.reactNative.mod.ImageRequireSource
  type ImageStore = typings.reactNative.mod.ImageStoreStatic
  type InputAccessoryViewProperties = typings.reactNative.mod.InputAccessoryViewProps
  /**
    * It is a component to solve the common problem of views that need to move out of the way of the virtual keyboard.
    * It can automatically adjust either its position or bottom padding based on the position of the keyboard.
    */
  type KeyboardAvoidingViewComponent = typings.react.mod.Component[typings.reactNative.mod.KeyboardAvoidingViewProps, js.Object, js.Any]
  type KeyboardEventListener = js.Function1[/* event */ typings.reactNative.mod.KeyboardEvent, scala.Unit]
  type KeyboardTypeAndroid = typings.reactNative.reactNativeStrings.`visible-password`
  /* Rewritten from type alias, can be one of: 
    - typings.reactNative.mod.KeyboardType
    - typings.reactNative.mod.KeyboardTypeAndroid
    - typings.reactNative.mod.KeyboardTypeIOS
  */
  type KeyboardTypeOptions = typings.reactNative.mod._KeyboardTypeOptions | typings.reactNative.mod.KeyboardTypeAndroid
  type LayoutAnimation = typings.reactNative.mod.LayoutAnimationStatic
  type Linking = typings.reactNative.mod.LinkingStatic
  type ListRenderItem[ItemT] = js.Function1[
    /* info */ typings.reactNative.mod.ListRenderItemInfo[ItemT], 
    typings.react.mod.ReactElement | scala.Null
  ]
  type ListViewComponent = typings.react.mod.Component[typings.reactNative.mod.ListViewProps, js.Object, js.Any]
  type ListViewProperties = typings.reactNative.mod.ListViewProps
  /**
    * @see https://facebook.github.io/react-native/docs/maskedviewios.html
    */
  type MaskedViewComponent = typings.react.mod.Component[typings.reactNative.mod.MaskedViewIOSProps, js.Object, js.Any]
  type MaskedViewIOSProperties = typings.reactNative.mod.MaskedViewIOSProps
  type MeasureInWindowOnSuccessCallback = js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  type MeasureLayoutOnSuccessCallback = js.Function4[
    /* left */ scala.Double, 
    /* top */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
  type MeasureOnSuccessCallback = js.Function6[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    /* pageX */ scala.Double, 
    /* pageY */ scala.Double, 
    scala.Unit
  ]
  type ModalProperties = typings.reactNative.mod.ModalProps
  type ModalProps = typings.reactNative.mod.ModalBaseProps with typings.reactNative.mod.ModalPropsIOS with typings.reactNative.mod.ModalPropsAndroid
  type NativeMethodsMixin = typings.reactNative.mod.NativeMethods
  type NativeMethodsMixinType = typings.reactNative.mod.NativeMethods
  /**
    * Interface for NativeModules which allows to augment NativeModules with type informations.
    * See react-native-sensor-manager for example.
    */
  type NativeModulesStatic = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NativeSyntheticEvent[T] = typings.react.mod.BaseSyntheticEvent[T, typings.reactNative.mod.NodeHandle, typings.reactNative.mod.NodeHandle]
  type NavigatorIOSProperties = typings.reactNative.mod.NavigatorIOSProps
  type NodeHandle = scala.Double
  type PanResponder = typings.reactNative.mod.PanResponderStatic
  type PermissionsAndroid = typings.reactNative.mod.PermissionsAndroidStatic
  /**
    * @see https://facebook.github.io/react-native/docs/pickerios.html
    * @see PickerIOS.ios.js
    */
  type PickerIOSComponent = typings.react.mod.Component[typings.reactNative.mod.PickerIOSProps, js.Object, js.Any]
  type PickerIOSItemProperties = typings.reactNative.mod.PickerIOSItemProps
  type PickerIOSProperties = typings.reactNative.mod.PickerIOSProps
  type PickerItemProperties = typings.reactNative.mod.PickerItemProps
  type PickerProperties = typings.reactNative.mod.PickerProps
  type PickerPropertiesAndroid = typings.reactNative.mod.PickerPropsAndroid
  type PickerPropertiesIOS = typings.reactNative.mod.PickerPropsIOS
  /**
    * React component that wraps the Android-only `ProgressBar`. This component is used to indicate
    * that the app is loading or there is some activity in the app.
    */
  type ProgressBarAndroidComponent = typings.react.mod.Component[typings.reactNative.mod.ProgressBarAndroidProps, js.Object, js.Any]
  type ProgressBarAndroidProperties = typings.reactNative.mod.ProgressBarAndroidProps
  type ProgressViewIOSComponent = typings.react.mod.Component[typings.reactNative.mod.ProgressViewIOSProps, js.Object, js.Any]
  type ProgressViewIOSProperties = typings.reactNative.mod.ProgressViewIOSProps
  type PushNotificationIOS = typings.reactNative.mod.PushNotificationIOSStatic
  /**
    * Receive events from native-code
    * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
    * adding all event listeners directly to RCTNativeAppEventEmitter.
    * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\EventEmitter\RCTNativeAppEventEmitter.js
    * @see https://facebook.github.io/react-native/docs/native-modules-ios.html#sending-events-to-javascript
    */
  type RCTNativeAppEventEmitter = typings.reactNative.mod.DeviceEventEmitterStatic
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
  type RecyclerViewBackedScrollViewComponent = typings.react.mod.Component[typings.reactNative.mod.RecyclerViewBackedScrollViewProps, js.Object, js.Any]
  type RecyclerViewBackedScrollViewProperties = typings.reactNative.mod.RecyclerViewBackedScrollViewProps
  type RecyclerViewBackedScrollViewProps = typings.reactNative.mod.ScrollViewProps
  /**
    * This component is used inside a ScrollView or ListView to add pull to refresh
    * functionality. When the ScrollView is at `scrollY: 0`, swiping down
    * triggers an `onRefresh` event.
    *
    * __Note:__ `refreshing` is a controlled prop, this is why it needs to be set to true
    * in the `onRefresh` function otherwise the refresh indicator will stop immediately.
    */
  type RefreshControlComponent = typings.react.mod.Component[typings.reactNative.mod.RefreshControlProps, js.Object, js.Any]
  type RefreshControlProperties = typings.reactNative.mod.RefreshControlProps
  type RefreshControlPropertiesAndroid = typings.reactNative.mod.RefreshControlPropsAndroid
  type RefreshControlPropertiesIOS = typings.reactNative.mod.RefreshControlPropsIOS
  /** Keep a brand of 'T' so that calls to `StyleSheet.flatten` can take `RegisteredStyle<T>` and return `T`. */
  type RegisteredStyle[T] = scala.Double with typings.reactNative.AnonRegisteredStyleBrand[T]
  type Runnable = js.Function1[/* appParameters */ js.Any, scala.Unit]
  /**
    * Renders nested content and automatically applies paddings reflect the portion of the view
    * that is not covered by navigation bars, tab bars, toolbars, and other ancestor views.
    * Moreover, and most importantly, Safe Area's paddings reflect physical limitation of the screen,
    * such as rounded corners or camera notches (aka sensor housing area on iPhone X).
    */
  type SafeAreaViewComponent = typings.react.mod.Component[typings.reactNative.mod.ViewProps, js.Object, js.Any]
  type ScrollResponderEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNative.mod.NativeTouchEvent]
  type ScrollViewComponent = typings.react.mod.Component[typings.reactNative.mod.ScrollViewProps, js.Object, js.Any]
  type ScrollViewProperties = typings.reactNative.mod.ScrollViewProps
  type ScrollViewPropertiesAndroid = typings.reactNative.mod.ScrollViewPropsAndroid
  type ScrollViewPropertiesIOS = typings.reactNative.mod.ScrollViewPropsIOS
  type SectionListProperties[ItemT] = typings.reactNative.mod.SectionListProps[ItemT]
  type SectionListRenderItem[ItemT] = js.Function1[
    /* info */ typings.reactNative.mod.SectionListRenderItemInfo[ItemT], 
    typings.react.mod.ReactElement | scala.Null
  ]
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
  type SegmentedControlIOSComponent = typings.react.mod.Component[typings.reactNative.mod.SegmentedControlIOSProps, js.Object, js.Any]
  type SegmentedControlIOSProperties = typings.reactNative.mod.SegmentedControlIOSProps
  type Settings = typings.reactNative.mod.SettingsStatic
  type Share = typings.reactNative.mod.ShareStatic
  /**
    * A component used to select a single value from a range of values.
    */
  type SliderComponent = typings.react.mod.Component[typings.reactNative.mod.SliderProps, js.Object, js.Any]
  type SliderIOS = typings.reactNative.mod.Slider
  type SliderProperties = typings.reactNative.mod.SliderProps
  type SliderPropertiesAndroid = typings.reactNative.mod.SliderPropsAndroid
  type SliderPropertiesIOS = typings.reactNative.mod.SliderPropsIOS
  type SnapshotViewIOSComponent = typings.react.mod.Component[typings.reactNative.mod.SnapshotViewIOSProps, js.Object, js.Any]
  type SnapshotViewIOSProperties = typings.reactNative.mod.SnapshotViewIOSProps
  type StatusBarIOS = typings.reactNative.mod.StatusBarIOSStatic
  type StatusBarIOSStatic = typings.reactNative.mod.NativeEventEmitter
  type StatusBarProperties = typings.reactNative.mod.StatusBarProps
  type StatusBarPropertiesAndroid = typings.reactNative.mod.StatusBarPropsAndroid
  type StatusBarPropertiesIOS = typings.reactNative.mod.StatusBarPropsIOS
  type StyleProp[T] = T | typings.reactNative.mod.RegisteredStyle[T] | (typings.reactNative.mod.RecursiveArray[T | typings.reactNative.mod.RegisteredStyle[T] | typings.reactNative.mod.Falsy]) | typings.reactNative.mod.Falsy
  /**
    * Renders a boolean input.
    *
    * This is a controlled component that requires an `onValueChange` callback that
    * updates the `value` prop in order for the component to reflect user actions.
    * If the `value` prop is not updated, the component will continue to render
    * the supplied `value` prop instead of the expected result of any user actions.
    */
  type SwitchComponent = typings.react.mod.Component[typings.reactNative.mod.SwitchProps, js.Object, js.Any]
  type SwitchIOSProperties = typings.reactNative.mod.SwitchIOSProps
  type SwitchProperties = typings.reactNative.mod.SwitchProps
  type SwitchPropertiesIOS = typings.reactNative.mod.SwitchPropsIOS
  type Systrace = typings.reactNative.mod.SystraceStatic
  type TabBarIOSItemProperties = typings.reactNative.mod.TabBarIOSItemProps
  type TabBarIOSProperties = typings.reactNative.mod.TabBarIOSProps
  type Task = js.Function1[/* taskData */ js.Any, js.Promise[scala.Unit]]
  type TaskProvider = js.Function0[typings.reactNative.mod.Task]
  /**
    * A React component for displaying text which supports nesting, styling, and touch handling.
    */
  type TextComponent = typings.react.mod.Component[typings.reactNative.mod.TextProps, js.Object, js.Any]
  type TextInputAndroidProperties = typings.reactNative.mod.TextInputAndroidProps
  /**
    * @see https://facebook.github.io/react-native/docs/textinput.html#methods
    */
  type TextInputComponent = typings.react.mod.Component[typings.reactNative.mod.TextInputProps, js.Object, js.Any]
  type TextInputIOSProperties = typings.reactNative.mod.TextInputIOSProps
  type TextInputProperties = typings.reactNative.mod.TextInputProps
  type TextProperties = typings.reactNative.mod.TextProps
  type TextPropertiesAndroid = typings.reactNative.mod.TextPropsAndroid
  type TextPropertiesIOS = typings.reactNative.mod.TextPropsIOS
  type TimePickerAndroid = typings.reactNative.mod.TimePickerAndroidStatic
  type ToastAndroid = typings.reactNative.mod.ToastAndroidStatic
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
  type ToolbarAndroidComponent = typings.react.mod.Component[typings.reactNative.mod.ToolbarAndroidProps, js.Object, js.Any]
  type ToolbarAndroidProperties = typings.reactNative.mod.ToolbarAndroidProps
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
  type TouchableHighlightComponent = typings.react.mod.Component[typings.reactNative.mod.TouchableHighlightProps, js.Object, js.Any]
  type TouchableHighlightProperties = typings.reactNative.mod.TouchableHighlightProps
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
  type TouchableNativeFeedbackComponent = typings.react.mod.Component[typings.reactNative.mod.TouchableNativeFeedbackProps, js.Object, js.Any]
  type TouchableNativeFeedbackProperties = typings.reactNative.mod.TouchableNativeFeedbackProps
  /**
    * A wrapper for making views respond properly to touches.
    * On press down, the opacity of the wrapped view is decreased, dimming it.
    * This is done without actually changing the view hierarchy,
    * and in general is easy to add to an app without weird side-effects.
    *
    * @see https://facebook.github.io/react-native/docs/touchableopacity.html
    */
  type TouchableOpacityComponent = typings.react.mod.Component[typings.reactNative.mod.TouchableOpacityProps, js.Object, js.Any]
  type TouchableOpacityProperties = typings.reactNative.mod.TouchableOpacityProps
  /**
    * Do not use unless you have a very good reason.
    * All the elements that respond to press should have a visual feedback when touched.
    * This is one of the primary reason a "web" app doesn't feel "native".
    *
    * @see https://facebook.github.io/react-native/docs/touchablewithoutfeedback.html
    */
  type TouchableWithoutFeedbackComponent = typings.react.mod.Component[typings.reactNative.mod.TouchableWithoutFeedbackProps, js.Object, js.Any]
  type TouchableWithoutFeedbackProperties = typings.reactNative.mod.TouchableWithoutFeedbackProps
  type UIManager = typings.reactNative.mod.UIManagerStatic
  type Vibration = typings.reactNative.mod.VibrationStatic
  /**
    * The most fundamental component for building UI, View is a container that supports layout with flexbox, style, some touch handling,
    * and accessibility controls, and is designed to be nested inside other views and to have 0 to many children of any type.
    * View maps directly to the native view equivalent on whatever platform React is running on,
    * whether that is a UIView, <div>, android.view, etc.
    */
  type ViewComponent = typings.react.mod.Component[typings.reactNative.mod.ViewProps, js.Object, js.Any]
  type ViewPagerAndroidComponent = typings.react.mod.Component[typings.reactNative.mod.ViewPagerAndroidProps, js.Object, js.Any]
  type ViewPagerAndroidProperties = typings.reactNative.mod.ViewPagerAndroidProps
  type ViewProperties = typings.reactNative.mod.ViewProps
  type ViewPropertiesAndroid = typings.reactNative.mod.ViewPropsAndroid
  type ViewPropertiesIOS = typings.reactNative.mod.ViewPropsIOS
  type ViewabilityConfigCallbackPairs = js.Array[typings.reactNative.mod.ViewabilityConfigCallbackPair]
  type VirtualizedListProperties[ItemT] = typings.reactNative.mod.VirtualizedListProps[ItemT]
}
