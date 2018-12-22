package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeMod {
  type ART = ARTStatic
  type AccessibilityInfo = AccessibilityInfoStatic
  type AccessibilityProperties = AccessibilityProps
  type AccessibilityPropertiesAndroid = AccessibilityPropsAndroid
  type AccessibilityPropertiesIOS = AccessibilityPropsIOS
  type AccessibilityRole = reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.link | reactDashNativeLib.reactDashNativeLibStrings.search | reactDashNativeLib.reactDashNativeLibStrings.image | reactDashNativeLib.reactDashNativeLibStrings.keyboardkey | reactDashNativeLib.reactDashNativeLibStrings.text | reactDashNativeLib.reactDashNativeLibStrings.adjustable | reactDashNativeLib.reactDashNativeLibStrings.header | reactDashNativeLib.reactDashNativeLibStrings.summary | reactDashNativeLib.reactDashNativeLibStrings.imagebutton
  type AccessibilityState = reactDashNativeLib.reactDashNativeLibStrings.selected | reactDashNativeLib.reactDashNativeLibStrings.disabled
  type ActionSheetIOS = ActionSheetIOSStatic
  type ActivityIndicatorComponent = reactLib.reactMod.Component[ActivityIndicatorProps, js.Object, js.Any]
  type ActivityIndicatorIOSProperties = ActivityIndicatorIOSProps
  type ActivityIndicatorProperties = ActivityIndicatorProps
  type AdSupportIOS = AdSupportIOSStatic
  type Alert = AlertStatic
  type AlertAndroid = AlertAndroidStatic
  type AlertIOS = AlertIOSStatic
  type AlertType = reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.`plain-text` | reactDashNativeLib.reactDashNativeLibStrings.`secure-text` | reactDashNativeLib.reactDashNativeLibStrings.`login-password`
  type AppState = AppStateStatic
  type AppStateEvent = reactDashNativeLib.reactDashNativeLibStrings.change | reactDashNativeLib.reactDashNativeLibStrings.memoryWarning
  type AppStateIOS = AppStateStatic
  type AppStateStatus = reactDashNativeLib.reactDashNativeLibStrings.active | reactDashNativeLib.reactDashNativeLibStrings.background | reactDashNativeLib.reactDashNativeLibStrings.inactive
  type AsyncStorage = AsyncStorageStatic
  type BackAndroid = BackAndroidStatic
  type BackHandler = BackHandlerStatic
  type BackPressEventName = reactDashNativeLib.reactDashNativeLibStrings.hardwareBackPress
  type ButtonProperties = ButtonProps
  type CameraRoll = CameraRollStatic
  type CameraRollAssetType = reactDashNativeLib.reactDashNativeLibStrings.All | reactDashNativeLib.reactDashNativeLibStrings.Videos | reactDashNativeLib.reactDashNativeLibStrings.Photos
  type CameraRollGroupType = reactDashNativeLib.reactDashNativeLibStrings.Album | reactDashNativeLib.reactDashNativeLibStrings.All | reactDashNativeLib.reactDashNativeLibStrings.Event | reactDashNativeLib.reactDashNativeLibStrings.Faces | reactDashNativeLib.reactDashNativeLibStrings.Library | reactDashNativeLib.reactDashNativeLibStrings.PhotoStream | reactDashNativeLib.reactDashNativeLibStrings.SavedPhotos
  type Clipboard = ClipboardStatic
  type ComponentProvider = js.Function0[reactLib.reactMod.ReactNs.ComponentType[js.Any]]
  type ConnectionType = reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.wifi | reactDashNativeLib.reactDashNativeLibStrings.cell | reactDashNativeLib.reactDashNativeLibStrings.unknown | reactDashNativeLib.reactDashNativeLibStrings.NONE | reactDashNativeLib.reactDashNativeLibStrings.MOBILE | reactDashNativeLib.reactDashNativeLibStrings.WIFI | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_MMS | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_SUPL | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_DUN | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_HIPRI | reactDashNativeLib.reactDashNativeLibStrings.WIMAX | reactDashNativeLib.reactDashNativeLibStrings.BLUETOOTH | reactDashNativeLib.reactDashNativeLibStrings.DUMMY | reactDashNativeLib.reactDashNativeLibStrings.ETHERNET | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_FOTA | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_IMS | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_CBS | reactDashNativeLib.reactDashNativeLibStrings.WIFI_P2P | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_IA | reactDashNativeLib.reactDashNativeLibStrings.MOBILE_EMERGENCY | reactDashNativeLib.reactDashNativeLibStrings.PROXY | reactDashNativeLib.reactDashNativeLibStrings.VPN | reactDashNativeLib.reactDashNativeLibStrings.UNKNOWN
  type DatePickerAndroid = DatePickerAndroidStatic
  type DatePickerIOSComponent = reactLib.reactMod.Component[DatePickerIOSProps, js.Object, js.Any]
  type DatePickerIOSProperties = DatePickerIOSProps
  type DrawerLayoutAndroidComponent = reactLib.reactMod.Component[DrawerLayoutAndroidProps, js.Object, js.Any]
  type DrawerLayoutAndroidProperties = DrawerLayoutAndroidProps
  type DrawerSlideEvent = NativeSyntheticEvent[NativeTouchEvent]
  type Easing = EasingStatic
  type EasingFunction = js.Function1[/* value */ scala.Double, scala.Double]
  type EffectiveConnectionType = reactDashNativeLib.reactDashNativeLibStrings.`2g` | reactDashNativeLib.reactDashNativeLibStrings.`3g` | reactDashNativeLib.reactDashNativeLibStrings.`4g` | reactDashNativeLib.reactDashNativeLibStrings.unknown
  type FlatListProperties[ItemT] = FlatListProps[ItemT]
  type Geolocation = GeolocationStatic
  type GestureResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  type Handle = scala.Double
  type I18nManager = I18nManagerStatic
  type ImageBackgroundComponent = reactLib.reactMod.Component[ImageBackgroundProps, js.Object, js.Any]
  type ImageBackgroundProperties = ImageBackgroundProps
  type ImageComponent = reactLib.reactMod.Component[ImageProps, js.Object, js.Any]
  type ImageEditor = ImageEditorStatic
  type ImagePickerIOS = ImagePickerIOSStatic
  type ImagePickerResult = js.Tuple3[java.lang.String, scala.Double, scala.Double]
  type ImageProperties = ImageProps
  type ImagePropertiesAndroid = ImagePropsAndroid
  type ImagePropertiesIOS = ImagePropsIOS
  type ImagePropertiesSourceOptions = ImageSourcePropType
  type ImageRequireSource = scala.Double
  type ImageResizeMode = reactDashNativeLib.reactDashNativeLibStrings.cover | reactDashNativeLib.reactDashNativeLibStrings.contain | reactDashNativeLib.reactDashNativeLibStrings.stretch | reactDashNativeLib.reactDashNativeLibStrings.repeat | reactDashNativeLib.reactDashNativeLibStrings.center
  type ImageSourcePropType = ImageURISource | js.Array[ImageURISource] | ImageRequireSource
  type ImageStore = ImageStoreStatic
  type InputAccessoryViewProperties = InputAccessoryViewProps
  type IntentAndroid = IntentAndroidStatic
  /**
   * It is a component to solve the common problem of views that need to move out of the way of the virtual keyboard.
   * It can automatically adjust either its position or bottom padding based on the position of the keyboard.
   */
  type KeyboardAvoidingViewComponent = reactLib.reactMod.Component[KeyboardAvoidingViewProps, js.Object, js.Any]
  type KeyboardType = reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.`email-address` | reactDashNativeLib.reactDashNativeLibStrings.numeric | reactDashNativeLib.reactDashNativeLibStrings.`phone-pad`
  type KeyboardTypeAndroid = reactDashNativeLib.reactDashNativeLibStrings.`visible-password`
  type KeyboardTypeIOS = reactDashNativeLib.reactDashNativeLibStrings.`ascii-capable` | reactDashNativeLib.reactDashNativeLibStrings.`numbers-and-punctuation` | reactDashNativeLib.reactDashNativeLibStrings.url | reactDashNativeLib.reactDashNativeLibStrings.`number-pad` | reactDashNativeLib.reactDashNativeLibStrings.`name-phone-pad` | reactDashNativeLib.reactDashNativeLibStrings.`decimal-pad` | reactDashNativeLib.reactDashNativeLibStrings.twitter | reactDashNativeLib.reactDashNativeLibStrings.`web-search`
  type KeyboardTypeOptions = KeyboardType | KeyboardTypeAndroid | KeyboardTypeIOS
  type LayoutAnimation = LayoutAnimationStatic
  type Linking = LinkingStatic
  type LinkingIOS = LinkingIOSStatic
  type ListRenderItem[ItemT] = js.Function1[
    /* info */ ListRenderItemInfo[ItemT], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
  ]
  type ListViewComponent = reactLib.reactMod.Component[ListViewProps, js.Object, js.Any]
  type ListViewProperties = ListViewProps
  /**
   * @see https://facebook.github.io/react-native/docs/mapview.html#content
   */
  type MapViewComponent = reactLib.reactMod.Component[MapViewProps, js.Object, js.Any]
  type MapViewProperties = MapViewProps
  /**
   * @see https://facebook.github.io/react-native/docs/maskedviewios.html
   */
  type MaskedViewComponent = reactLib.reactMod.Component[MaskedViewIOSProps, js.Object, js.Any]
  type MaskedViewIOSProperties = MaskedViewIOSProps
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
  type ModalProperties = ModalProps
  type ModalProps = ModalBaseProps with ModalPropsIOS with ModalPropsAndroid
  type NativeComponent = NativeMethodsMixinStatic
  type NativeEventEmitter = EventEmitter
  type NativeMethodsMixin = NativeMethodsMixinStatic
  type NativeSyntheticEvent[T] = reactLib.reactMod.ReactNs.BaseSyntheticEvent[T, reactDashNativeLib.NodeHandle, reactDashNativeLib.NodeHandle]
  type NavigatorIOSProperties = NavigatorIOSProps
  type NetInfo = NetInfoStatic
  type PanResponder = PanResponderStatic
  type Permission = reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_CALENDAR | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTWRITE_CALENDAR | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTCAMERA | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_CONTACTS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTWRITE_CONTACTS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTGET_ACCOUNTS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTACCESS_FINE_LOCATION | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTACCESS_COARSE_LOCATION | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTRECORD_AUDIO | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_PHONE_STATE | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTCALL_PHONE | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_CALL_LOG | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTWRITE_CALL_LOG | reactDashNativeLib.reactDashNativeLibStrings.comDOTandroidDOTvoicemailDOTpermissionDOTADD_VOICEMAIL | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTUSE_SIP | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTPROCESS_OUTGOING_CALLS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTBODY_SENSORS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTSEND_SMS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTRECEIVE_SMS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_SMS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTRECEIVE_WAP_PUSH | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTRECEIVE_MMS | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTREAD_EXTERNAL_STORAGE | reactDashNativeLib.reactDashNativeLibStrings.androidDOTpermissionDOTWRITE_EXTERNAL_STORAGE
  type PermissionStatus = reactDashNativeLib.reactDashNativeLibStrings.granted | reactDashNativeLib.reactDashNativeLibStrings.denied | reactDashNativeLib.reactDashNativeLibStrings.never_ask_again
  type PermissionsAndroid = PermissionsAndroidStatic
  /**
   * @see https://facebook.github.io/react-native/docs/pickerios.html
   * @see PickerIOS.ios.js
   */
  type PickerIOSComponent = reactLib.reactMod.Component[PickerIOSProps, js.Object, js.Any]
  type PickerIOSItemProperties = PickerIOSItemProps
  type PickerIOSProperties = PickerIOSProps
  type PickerItemProperties = PickerItemProps
  type PickerProperties = PickerProps
  type PickerPropertiesAndroid = PickerPropsAndroid
  type PickerPropertiesIOS = PickerPropsIOS
  type PlatformOSType = reactDashNativeLib.reactDashNativeLibStrings.ios | reactDashNativeLib.reactDashNativeLibStrings.android | reactDashNativeLib.reactDashNativeLibStrings.macos | reactDashNativeLib.reactDashNativeLibStrings.windows | reactDashNativeLib.reactDashNativeLibStrings.web
  /**
   * React component that wraps the Android-only `ProgressBar`. This component is used to indicate
   * that the app is loading or there is some activity in the app.
   */
  type ProgressBarAndroidComponent = reactLib.reactMod.Component[ProgressBarAndroidProps, js.Object, js.Any]
  type ProgressBarAndroidProperties = ProgressBarAndroidProps
  type ProgressViewIOSComponent = reactLib.reactMod.Component[ProgressViewIOSProps, js.Object, js.Any]
  type ProgressViewIOSProperties = ProgressViewIOSProps
  type PushNotificationEventName = reactDashNativeLib.reactDashNativeLibStrings.notification | reactDashNativeLib.reactDashNativeLibStrings.localNotification | reactDashNativeLib.reactDashNativeLibStrings.register | reactDashNativeLib.reactDashNativeLibStrings.registrationError
  type PushNotificationIOS = PushNotificationIOSStatic
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
  type RecyclerViewBackedScrollViewComponent = reactLib.reactMod.Component[RecyclerViewBackedScrollViewProps, js.Object, js.Any]
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
  type RefreshControlComponent = reactLib.reactMod.Component[RefreshControlProps, js.Object, js.Any]
  type RefreshControlProperties = RefreshControlProps
  type RefreshControlPropertiesAndroid = RefreshControlPropsAndroid
  type RefreshControlPropertiesIOS = RefreshControlPropsIOS
  type ReturnKeyType = reactDashNativeLib.reactDashNativeLibStrings.done | reactDashNativeLib.reactDashNativeLibStrings.go | reactDashNativeLib.reactDashNativeLibStrings.next | reactDashNativeLib.reactDashNativeLibStrings.search | reactDashNativeLib.reactDashNativeLibStrings.send
  type ReturnKeyTypeAndroid = reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.previous
  type ReturnKeyTypeIOS = reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.google | reactDashNativeLib.reactDashNativeLibStrings.join | reactDashNativeLib.reactDashNativeLibStrings.route | reactDashNativeLib.reactDashNativeLibStrings.yahoo | reactDashNativeLib.reactDashNativeLibStrings.`emergency-call`
  type ReturnKeyTypeOptions = ReturnKeyType | ReturnKeyTypeAndroid | ReturnKeyTypeIOS
  type Runnable = js.Function1[/* appParameters */ js.Any, scala.Unit]
  /**
   * Renders nested content and automatically applies paddings reflect the portion of the view
   * that is not covered by navigation bars, tab bars, toolbars, and other ancestor views.
   * Moreover, and most importantly, Safe Area's paddings reflect physical limitation of the screen,
   * such as rounded corners or camera notches (aka sensor housing area on iPhone X).
   */
  type SafeAreaViewComponent = reactLib.reactMod.Component[ViewProps, js.Object, js.Any]
  type ScrollResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  type ScrollViewComponent = reactLib.reactMod.Component[ScrollViewProps, js.Object, js.Any]
  type ScrollViewProperties = ScrollViewProps
  type ScrollViewPropertiesAndroid = ScrollViewPropsAndroid
  type ScrollViewPropertiesIOS = ScrollViewPropsIOS
  type SectionList[ItemT] = SectionListStatic[ItemT]
  type SectionListProperties[ItemT] = SectionListProps[ItemT]
  type SectionListRenderItem[ItemT] = js.Function1[
    /* info */ SectionListRenderItemInfo[ItemT], 
    reactLib.reactMod.ReactNs.ReactElement[js.Any] | scala.Null
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
  type SegmentedControlIOSComponent = reactLib.reactMod.Component[SegmentedControlIOSProps, js.Object, js.Any]
  type SegmentedControlIOSProperties = SegmentedControlIOSProps
  type Settings = SettingsStatic
  type Share = ShareStatic
  type ShareContent = reactDashNativeLib.Anon_Message | reactDashNativeLib.Anon_UrlTitle
  /**
   * A component used to select a single value from a range of values.
   */
  type SliderComponent = reactLib.reactMod.Component[SliderProps, js.Object, js.Any]
  type SliderIOS = Slider
  type SliderProperties = SliderProps
  type SliderPropertiesAndroid = SliderPropsAndroid
  type SliderPropertiesIOS = SliderPropsIOS
  type SnapshotViewIOSComponent = reactLib.reactMod.Component[SnapshotViewIOSProps, js.Object, js.Any]
  type SnapshotViewIOSProperties = SnapshotViewIOSProps
  type StatusBarAnimation = reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.fade | reactDashNativeLib.reactDashNativeLibStrings.slide
  type StatusBarIOS = StatusBarIOSStatic
  type StatusBarIOSStatic = NativeEventEmitter
  type StatusBarProperties = StatusBarProps
  type StatusBarPropertiesAndroid = StatusBarPropsAndroid
  type StatusBarPropertiesIOS = StatusBarPropsIOS
  type StatusBarStyle = reactDashNativeLib.reactDashNativeLibStrings.default | reactDashNativeLib.reactDashNativeLibStrings.`light-content` | reactDashNativeLib.reactDashNativeLibStrings.`dark-content`
  type StyleProp[T] = T | reactDashNativeLib.RegisteredStyle[T] | (RecursiveArray[T | reactDashNativeLib.RegisteredStyle[T] | reactDashNativeLib.Falsy]) | reactDashNativeLib.Falsy
  /**
   * Renders a boolean input.
   *
   * This is a controlled component that requires an `onValueChange` callback that
   * updates the `value` prop in order for the component to reflect user actions.
   * If the `value` prop is not updated, the component will continue to render
   * the supplied `value` prop instead of the expected result of any user actions.
   */
  type SwitchComponent = reactLib.reactMod.Component[SwitchProps, js.Object, js.Any]
  type SwitchIOSProperties = SwitchIOSProps
  type SwitchProperties = SwitchProps
  type SwitchPropertiesIOS = SwitchPropsIOS
  type Systrace = SystraceStatic
  type TabBarIOSItemProperties = TabBarIOSItemProps
  type TabBarIOSProperties = TabBarIOSProps
  /**
   * A React component for displaying text which supports nesting, styling, and touch handling.
   */
  type TextComponent = reactLib.reactMod.Component[TextProps, js.Object, js.Any]
  type TextInputAndroidProperties = TextInputAndroidProps
  /**
   * @see https://facebook.github.io/react-native/docs/textinput.html#methods
   */
  type TextInputComponent = reactLib.reactMod.Component[TextInputProps, js.Object, js.Any]
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
  type ToolbarAndroidComponent = reactLib.reactMod.Component[ToolbarAndroidProps, js.Object, js.Any]
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
  type TouchableHighlightComponent = reactLib.reactMod.Component[TouchableHighlightProps, js.Object, js.Any]
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
  type TouchableNativeFeedbackComponent = reactLib.reactMod.Component[TouchableNativeFeedbackProps, js.Object, js.Any]
  type TouchableNativeFeedbackProperties = TouchableNativeFeedbackProps
  /**
   * A wrapper for making views respond properly to touches.
   * On press down, the opacity of the wrapped view is decreased, dimming it.
   * This is done without actually changing the view hierarchy,
   * and in general is easy to add to an app without weird side-effects.
   *
   * @see https://facebook.github.io/react-native/docs/touchableopacity.html
   */
  type TouchableOpacityComponent = reactLib.reactMod.Component[TouchableOpacityProps, js.Object, js.Any]
  type TouchableOpacityProperties = TouchableOpacityProps
  /**
   * Do not use unless you have a very good reason.
   * All the elements that respond to press should have a visual feedback when touched.
   * This is one of the primary reason a "web" app doesn't feel "native".
   *
   * @see https://facebook.github.io/react-native/docs/touchablewithoutfeedback.html
   */
  type TouchableWithoutFeedbackComponent = reactLib.reactMod.Component[TouchableWithoutFeedbackProps, js.Object, js.Any]
  type TouchableWithoutFeedbackProperties = TouchableWithoutFeedbackProps
  type UIManager = UIManagerStatic
  type Vibration = VibrationStatic
  type VibrationIOS = VibrationIOSStatic
  /**
   * The most fundamental component for building UI, View is a container that supports layout with flexbox, style, some touch handling,
   * and accessibility controls, and is designed to be nested inside other views and to have 0 to many children of any type.
   * View maps directly to the native view equivalent on whatever platform React is running on,
   * whether that is a UIView, <div>, android.view, etc.
   */
  type ViewComponent = reactLib.reactMod.Component[ViewProps, js.Object, js.Any]
  type ViewPagerAndroidComponent = reactLib.reactMod.Component[ViewPagerAndroidProps, js.Object, js.Any]
  type ViewPagerAndroidProperties = ViewPagerAndroidProps
  type ViewProperties = ViewProps
  type ViewPropertiesAndroid = ViewPropsAndroid
  type ViewPropertiesIOS = ViewPropsIOS
  type ViewabilityConfigCallbackPairs = js.Array[ViewabilityConfigCallbackPair]
  type VirtualizedListProperties[ItemT] = VirtualizedListProps[ItemT]
  type WebViewProperties = WebViewProps
  type WebViewPropertiesAndroid = WebViewPropsAndroid
  type WebViewPropertiesIOS = WebViewPropsIOS
}
