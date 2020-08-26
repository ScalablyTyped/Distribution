package typings.reactNativeElements.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactNative.mod.ModalBaseProps
import typings.reactNative.mod.ModalPropsAndroid
import typings.reactNative.mod.ModalPropsIOS
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps
  extends ModalBaseProps
     with ModalPropsIOS
     with ModalPropsAndroid {
  /**
    *  Override React Native `Modal` component (usable for web-platform)
    */
  var ModalComponent: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.native
  /**
    * Style for the backdrop
    */
  var backdropStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  /**
    * Content of the overlay
    */
  var children: ReactElement = js.native
  /**
    * If to take up full screen width and height
    *
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.native
  /**
    * If true, the overlay is visible
    */
  var isVisible: Boolean = js.native
  /**
    * Callback when user touches the backdrop
    */
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Style of the actual overlay
    */
  var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object OverlayProps {
  @scala.inline
  def apply(children: ReactElement, isVisible: Boolean): OverlayProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def setModalComponent(value: ComponentClass[js.Object, ComponentState]): Self = this.set("ModalComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModalComponent: Self = this.set("ModalComponent", js.undefined)
    @scala.inline
    def setBackdropStyle(value: StyleProp[ViewStyle]): Self = this.set("backdropStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropStyle: Self = this.set("backdropStyle", js.undefined)
    @scala.inline
    def setBackdropStyleNull: Self = this.set("backdropStyle", null)
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setOnBackdropPress(value: () => Unit): Self = this.set("onBackdropPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBackdropPress: Self = this.set("onBackdropPress", js.undefined)
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewStyle]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
  }
  
}

