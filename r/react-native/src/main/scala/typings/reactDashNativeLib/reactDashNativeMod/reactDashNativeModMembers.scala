package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", JSImport.Namespace)
@js.native
object reactDashNativeModMembers extends js.Object {
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
  val ColorPropType: reactLib.reactMod.ReactNs.Validator[java.lang.String] = js.native
  val DatePickerAndroid: DatePickerAndroidStatic = js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  val Dimensions: Dimensions = js.native
  val Easing: EasingStatic = js.native
  val EdgeInsetsPropType: reactLib.reactMod.ReactNs.Validator[Insets] = js.native
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
  val NativeAppEventEmitter: reactDashNativeLib.RCTNativeAppEventEmitter = js.native
  val NativeComponent: NativeMethodsMixinStatic = js.native
  val NativeEventEmitter: NativeEventEmitter = js.native
  val NativeMethodsMixin: NativeMethodsMixinStatic = js.native
  val NativeModules: NativeModulesStatic = js.native
  val NetInfo: NetInfoStatic = js.native
  val PanResponder: PanResponderStatic = js.native
  val PermissionsAndroid: PermissionsAndroidStatic = js.native
  val PixelRatio: PixelRatioStatic = js.native
  val Platform: PlatformStatic = js.native
  val PlatformIOS: PlatformIOSStatic = js.native
  val PointPropType: reactLib.reactMod.ReactNs.Validator[PointPropType] = js.native
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
  val ViewPropTypes: reactLib.reactMod.ReactNs.ValidationMap[ViewProps] = js.native
  val YellowBox: (reactLib.reactMod.Component[_, _, _]) with reactDashNativeLib.Anon_IgnoreWarnings = js.native
  def __spread(target: js.Any, sources: js.Any*): js.Any = js.native
  def createElement[P](`type`: reactLib.reactMod.ReactNs.ReactType[_]): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def createElement[P](
    `type`: reactLib.reactMod.ReactNs.ReactType[_],
    props: P,
    children: reactLib.reactMod.ReactNs.ReactNode*
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def findNodeHandle(): scala.Null | scala.Double = js.native
  def findNodeHandle(componentOrHandle: reactLib.reactMod.Component[_, _, _]): scala.Null | scala.Double = js.native
  def findNodeHandle(
    componentOrHandle: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  ): scala.Null | scala.Double = js.native
  def findNodeHandle(componentOrHandle: scala.Double): scala.Null | scala.Double = js.native
  def processColor(color: js.Any): scala.Double = js.native
  def requireNativeComponent[P, NP](viewName: java.lang.String): reactLib.reactMod.ReactNs.ComponentClass[
    (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[
      propDashTypesLib.propDashTypesMod.ValidationMap[
        (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[propDashTypesLib.propDashTypesMod.ValidationMap[P]]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any
      ]
    ]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def requireNativeComponent[P, NP](viewName: java.lang.String, componentInterface: ComponentInterface[P]): reactLib.reactMod.ReactNs.ComponentClass[
    (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[
      propDashTypesLib.propDashTypesMod.ValidationMap[
        (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[propDashTypesLib.propDashTypesMod.ValidationMap[P]]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any
      ]
    ]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def requireNativeComponent[P, NP](
    viewName: java.lang.String,
    componentInterface: ComponentInterface[P],
    extraConfig: reactDashNativeLib.Anon_NativeOnly[NP]
  ): reactLib.reactMod.ReactNs.ComponentClass[
    (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[
      propDashTypesLib.propDashTypesMod.ValidationMap[
        (/* InlineNestedIdentityAlias: stdLib.Partial*/ propDashTypesLib.propDashTypesMod.InferProps[propDashTypesLib.propDashTypesMod.ValidationMap[P]]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any
      ]
    ]) with reactDashNativeLib.reactDashNativeLibStrings.requireNativeComponent with js.Any, 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
}

