package typings.reactDashNativeDashModal.distModalMod

import typings.reactDashNative.reactDashNativeMod.Animated.ValueXY
import typings.reactDashNativeDashModal.distTypesMod.OrNull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var deviceHeight: Double
  var deviceWidth: Double
  var isSwipeable: Boolean
  var isVisible: Boolean
  var pan: OrNull[ValueXY]
  var showContent: Boolean
}

object State {
  @scala.inline
  def apply(
    deviceHeight: Double,
    deviceWidth: Double,
    isSwipeable: Boolean,
    isVisible: Boolean,
    showContent: Boolean,
    pan: OrNull[ValueXY] = null
  ): State = {
    val __obj = js.Dynamic.literal(deviceHeight = deviceHeight, deviceWidth = deviceWidth, isSwipeable = isSwipeable, isVisible = isVisible, showContent = showContent)
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

