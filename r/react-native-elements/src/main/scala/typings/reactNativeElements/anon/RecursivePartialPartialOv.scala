package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-left`
import typings.reactNativeElements.reactNativeElementsStrings.`landscape-right`
import typings.reactNativeElements.reactNativeElementsStrings.`portrait-upside-down`
import typings.reactNativeElements.reactNativeElementsStrings.fade
import typings.reactNativeElements.reactNativeElementsStrings.formSheet
import typings.reactNativeElements.reactNativeElementsStrings.fullScreen
import typings.reactNativeElements.reactNativeElementsStrings.landscape
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.overFullScreen
import typings.reactNativeElements.reactNativeElementsStrings.pageSheet
import typings.reactNativeElements.reactNativeElementsStrings.portrait
import typings.reactNativeElements.reactNativeElementsStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.OverlayProps>> */
@js.native
trait RecursivePartialPartialOv extends js.Object {
  var ModalComponent: js.UndefOr[RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]] = js.native
  var animated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var animationType: js.UndefOr[RecursivePartial[js.UndefOr[none | slide | fade]]] = js.native
  var backdropStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var children: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.native
  var fullScreen: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var hardwareAccelerated: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var isVisible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var onBackdropPress: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onDismiss: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onOrientationChange: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]
  ] = js.native
  var onRequestClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.native
  var onShow: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]
  ] = js.native
  var overlayStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.native
  var presentationStyle: js.UndefOr[
    RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]]
  ] = js.native
  var statusBarTranslucent: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var supportedOrientations: js.UndefOr[
    RecursivePartial[
      js.UndefOr[
        js.Array[
          portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
        ]
      ]
    ]
  ] = js.native
  var transparent: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
  var visible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.native
}

object RecursivePartialPartialOv {
  @scala.inline
  def apply(): RecursivePartialPartialOv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialOv]
  }
  @scala.inline
  implicit class RecursivePartialPartialOvOps[Self <: RecursivePartialPartialOv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setModalComponent(value: RecursivePartial[js.UndefOr[ComponentClass[js.Object, ComponentState]]]): Self = this.set("ModalComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalComponent: Self = this.set("ModalComponent", js.undefined)
    @scala.inline
    def setAnimated(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimationType(value: RecursivePartial[js.UndefOr[none | slide | fade]]): Self = this.set("animationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationType: Self = this.set("animationType", js.undefined)
    @scala.inline
    def setBackdropStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("backdropStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropStyle: Self = this.set("backdropStyle", js.undefined)
    @scala.inline
    def setChildren(value: RecursivePartial[js.UndefOr[ReactElement]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFullScreen(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setHardwareAccelerated(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("hardwareAccelerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareAccelerated: Self = this.set("hardwareAccelerated", js.undefined)
    @scala.inline
    def setIsVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setOnBackdropPress(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onBackdropPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBackdropPress: Self = this.set("onBackdropPress", js.undefined)
    @scala.inline
    def setOnDismiss(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnOrientationChange(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]): Self = this.set("onOrientationChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOrientationChange: Self = this.set("onOrientationChange", js.undefined)
    @scala.inline
    def setOnRequestClose(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = this.set("onRequestClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRequestClose: Self = this.set("onRequestClose", js.undefined)
    @scala.inline
    def setOnShow(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]]]): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOverlayStyle(value: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setPresentationStyle(value: RecursivePartial[js.UndefOr[fullScreen | pageSheet | formSheet | overFullScreen]]): Self = this.set("presentationStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePresentationStyle: Self = this.set("presentationStyle", js.undefined)
    @scala.inline
    def setStatusBarTranslucent(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("statusBarTranslucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarTranslucent: Self = this.set("statusBarTranslucent", js.undefined)
    @scala.inline
    def setSupportedOrientations(
      value: RecursivePartial[
          js.UndefOr[
            js.Array[
              portrait | `portrait-upside-down` | landscape | `landscape-left` | `landscape-right`
            ]
          ]
        ]
    ): Self = this.set("supportedOrientations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedOrientations: Self = this.set("supportedOrientations", js.undefined)
    @scala.inline
    def setTransparent(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
    @scala.inline
    def setVisible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

