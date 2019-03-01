package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomGestureProps extends js.Object {
  var config: js.Array[moves]
  def onGesture(): scala.Unit
}

object CustomGestureProps {
  @scala.inline
  def apply(config: js.Array[moves], onGesture: js.Function0[scala.Unit]): CustomGestureProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("onGesture")(onGesture)
    __obj.asInstanceOf[CustomGestureProps]
  }
}

