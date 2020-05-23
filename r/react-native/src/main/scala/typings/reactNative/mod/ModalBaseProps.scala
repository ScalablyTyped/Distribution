package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.none
import typings.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBaseProps extends js.Object {
  /**
    * @deprecated Use animationType instead
    */
  var animated: js.UndefOr[Boolean] = js.undefined
  /**
    * The `animationType` prop controls how the modal animates.
    *
    * - `slide` slides in from the bottom
    * - `fade` fades into view
    * - `none` appears without an animation
    */
  var animationType: js.UndefOr[none | slide | fade] = js.undefined
  /**
    * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
    * _On the Android platform, this is a required function._
    */
  var onRequestClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], Unit]] = js.undefined
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /**
    * The `visible` prop determines whether your modal is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ModalBaseProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    animationType: none | slide | fade = null,
    onRequestClose: () => Unit = null,
    onShow: /* event */ NativeSyntheticEvent[_] => Unit = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ModalBaseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.get.asInstanceOf[js.Any])
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(js.Any.fromFunction0(onRequestClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalBaseProps]
  }
}

