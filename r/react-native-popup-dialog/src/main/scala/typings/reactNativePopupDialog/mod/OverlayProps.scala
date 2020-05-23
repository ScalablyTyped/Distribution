package typings.reactNativePopupDialog.mod

import typings.reactNative.mod.GestureResponderEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pointerEvents: js.UndefOr[String] = js.undefined
  var showOverlay: js.UndefOr[Boolean] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  def onPress(event: GestureResponderEvent): Unit
}

object OverlayProps {
  @scala.inline
  def apply(
    onPress: GestureResponderEvent => Unit,
    animationDuration: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pointerEvents: String = null,
    showOverlay: js.UndefOr[Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(onPress = js.Any.fromFunction1(onPress))
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

