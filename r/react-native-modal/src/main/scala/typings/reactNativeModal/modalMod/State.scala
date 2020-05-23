package typings.reactNativeModal.modalMod

import typings.reactNative.mod.Animated.ValueXY
import typings.reactNativeModal.typesMod.OrNull
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
    val __obj = js.Dynamic.literal(deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], isSwipeable = isSwipeable.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

