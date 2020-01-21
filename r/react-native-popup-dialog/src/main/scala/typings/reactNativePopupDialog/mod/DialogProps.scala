package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dialogAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.undefined
  var dialogStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var dialogTitle: js.UndefOr[js.Any] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var hasOverlay: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHardwareBackPress: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTouchOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayBackgroundColor: js.UndefOr[String] = js.undefined
  var overlayOpacity: js.UndefOr[Double] = js.undefined
  var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.undefined
  var rounded: js.UndefOr[Boolean] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    containerStyle: StyleProp[ViewStyle] = null,
    dialogAnimation: FadeAnimation | ScaleAnimation | SlideAnimation = null,
    dialogStyle: StyleProp[ViewStyle] = null,
    dialogTitle: js.Any = null,
    footer: js.Any = null,
    hasOverlay: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    onDismiss: () => Unit = null,
    onHardwareBackPress: () => Boolean = null,
    onShow: () => Unit = null,
    onTouchOutside: () => Unit = null,
    overlayBackgroundColor: String = null,
    overlayOpacity: Int | Double = null,
    overlayPointerEvents: OverlayPointerEventTypes = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dialogAnimation != null) __obj.updateDynamic("dialogAnimation")(dialogAnimation.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (!js.isUndefined(hasOverlay)) __obj.updateDynamic("hasOverlay")(hasOverlay.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onHardwareBackPress != null) __obj.updateDynamic("onHardwareBackPress")(js.Any.fromFunction0(onHardwareBackPress))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onTouchOutside != null) __obj.updateDynamic("onTouchOutside")(js.Any.fromFunction0(onTouchOutside))
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor.asInstanceOf[js.Any])
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (overlayPointerEvents != null) __obj.updateDynamic("overlayPointerEvents")(overlayPointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

