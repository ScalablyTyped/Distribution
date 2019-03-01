package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPause extends js.Object {
  var autoPause: js.UndefOr[scala.Boolean] = js.undefined
  var maxCapacity: js.UndefOr[scala.Double] = js.undefined
  var minCapacity: js.UndefOr[scala.Double] = js.undefined
  var secondsUntilAutoPause: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AutoPause {
  @scala.inline
  def apply(
    autoPause: js.UndefOr[scala.Boolean] = js.undefined,
    maxCapacity: scala.Int | scala.Double = null,
    minCapacity: scala.Int | scala.Double = null,
    secondsUntilAutoPause: scala.Int | scala.Double = null
  ): Anon_AutoPause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause)
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    if (secondsUntilAutoPause != null) __obj.updateDynamic("secondsUntilAutoPause")(secondsUntilAutoPause.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoPause]
  }
}

