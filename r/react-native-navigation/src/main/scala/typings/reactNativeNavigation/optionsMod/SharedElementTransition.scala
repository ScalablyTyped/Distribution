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
  def apply(
    fromId: String,
    interpolation: Interpolation,
    toId: String,
    duration: js.UndefOr[Double] = js.undefined
  ): SharedElementTransition = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedElementTransition]
  }
}

