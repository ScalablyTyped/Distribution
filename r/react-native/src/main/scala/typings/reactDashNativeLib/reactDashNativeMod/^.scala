package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* Extracted nested Instantiables into classes in ARTNs */
  val ART: ARTStatic = js.native
  val AccessibilityInfo: AccessibilityInfoStatic = js.native
  val ActionSheetIOS: ActionSheetIOSStatic = js.native
  val AdSupportIOS: AdSupportIOSStatic = js.native
  val Alert: AlertStatic = js.native
  val AlertAndroid: AlertAndroidStatic = js.native
  val AlertIOS: AlertIOSStatic = js.native
  val AppState: AppStateStatic = js.native
  val AppStateIOS: AppStateStatic = js.native
  val AsyncStorage: AsyncStorageStatic = js.native
  val BackAndroid: BackAndroidStatic = js.native
  val BackHandler: BackHandlerStatic = js.native
  val CameraRoll: CameraRollStatic = js.native
  val Clipboard: ClipboardStatic = js.native
  val ColorPropType: reactLib.reactMod.Validator[java.lang.String] = js.native
  val DatePickerAndroid: DatePickerAndroidStatic = js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  val Dimensions: reactDashNativeLib.reactDashNativeMod.Dimensions = js.native
  val Easing: EasingStatic = js.native
  val EdgeInsetsPropType: reactLib.reactMod.Validator[Insets] = js.native
  val Geolocation: GeolocationStatic = js.native
  val I18nManager: I18nManagerStatic = js.native
  val ImageEditor: ImageEditorStatic = js.native
  val ImagePickerIOS: ImagePickerIOSStatic = js.native
  val ImageStore: ImageStoreStatic = js.native
  val IntentAndroid: IntentAndroidStatic = js.native
  val InteractionManager: InteractionManagerStatic = js.native
  val Keyboard: KeyboardStatic = js.native
  val LayoutAnimation: LayoutAnimationStatic = js.native
  val Linking: LinkingStatic = js.native
  val LinkingIOS: LinkingIOSStatic = js.native
  val NativeAppEventEmitter: RCTNativeAppEventEmitter = js.native
  val NativeComponent: NativeMethodsMixinStatic = js.native
  val NativeEventEmitter: reactDashNativeLib.reactDashNativeMod.NativeEventEmitter = js.native
  val NativeMethodsMixin: NativeMethodsMixinStatic = js.native
  val NativeModules: NativeModulesStatic = js.native
  val NetInfo: NetInfoStatic = js.native
  val PanResponder: PanResponderStatic = js.native
  val PermissionsAndroid: PermissionsAndroidStatic = js.native
  val PixelRatio: PixelRatioStatic = js.native
  val Platform: PlatformIOSStatic | PlatformAndroidStatic | PlatformWindowsOSStatic | PlatformMacOSStatic | PlatformWebStatic = js.native
  val PointPropType: reactLib.reactMod.Validator[PointPropType] = js.native
  val PushNotificationIOS: PushNotificationIOSStatic = js.native
  val SectionList: SectionListStatic[js.Any] = js.native
  val Settings: SettingsStatic = js.native
  val ShadowPropTypesIOS: ShadowPropTypesIOSStatic = js.native
  val Share: ShareStatic = js.native
  val StatusBarIOS: StatusBarIOSStatic = js.native
  val Systrace: SystraceStatic = js.native
  val TimePickerAndroid: TimePickerAndroidStatic = js.native
  val ToastAndroid: ToastAndroidStatic = js.native
  val UIManager: UIManagerStatic = js.native
  val Vibration: VibrationStatic = js.native
  val VibrationIOS: VibrationIOSStatic = js.native
  val ViewPropTypes: reactLib.reactMod.ValidationMap[ViewProps] = js.native
  val YellowBox: (reactLib.reactMod.Component[_, _, _]) with reactDashNativeLib.Anon_IgnoreWarnings = js.native
  def __spread(target: js.Any, sources: js.Any*): js.Any = js.native
  def createElement[P](`type`: reactLib.reactMod.ReactType[_]): reactLib.reactMod.ReactElement = js.native
  def createElement[P](`type`: reactLib.reactMod.ReactType[_], props: P, children: reactLib.reactMod.ReactNode*): reactLib.reactMod.ReactElement = js.native
  def findNodeHandle(): scala.Null | scala.Double = js.native
  def findNodeHandle(componentOrHandle: reactLib.reactMod.Component[_, _, _]): scala.Null | scala.Double = js.native
  def findNodeHandle(componentOrHandle: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState]): scala.Null | scala.Double = js.native
  def findNodeHandle(componentOrHandle: scala.Double): scala.Null | scala.Double = js.native
  def processColor(color: js.Any): scala.Double = js.native
  def requireNativeComponent(viewName: java.lang.String): js.Any = js.native
}

