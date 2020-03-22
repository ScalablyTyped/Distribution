package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedElementTransition extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var fromId: String
  var interpolation: Interpolation
  var toId: String
}

object SharedElementTransition {
  @scala.inline
  def apply(fromId: String, interpolation: Interpolation, toId: String, duration: Int | Double = null): SharedElementTransition = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedElementTransition]
  }
}

