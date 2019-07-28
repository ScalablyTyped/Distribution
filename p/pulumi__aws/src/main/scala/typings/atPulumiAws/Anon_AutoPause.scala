package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoPause extends js.Object {
  var autoPause: js.UndefOr[Boolean] = js.undefined
  var maxCapacity: js.UndefOr[Double] = js.undefined
  var minCapacity: js.UndefOr[Double] = js.undefined
  var secondsUntilAutoPause: js.UndefOr[Double] = js.undefined
  var timeoutAction: js.UndefOr[String] = js.undefined
}

object Anon_AutoPause {
  @scala.inline
  def apply(
    autoPause: js.UndefOr[Boolean] = js.undefined,
    maxCapacity: Int | Double = null,
    minCapacity: Int | Double = null,
    secondsUntilAutoPause: Int | Double = null,
    timeoutAction: String = null
  ): Anon_AutoPause = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPause)) __obj.updateDynamic("autoPause")(autoPause)
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    if (secondsUntilAutoPause != null) __obj.updateDynamic("secondsUntilAutoPause")(secondsUntilAutoPause.asInstanceOf[js.Any])
    if (timeoutAction != null) __obj.updateDynamic("timeoutAction")(timeoutAction)
    __obj.asInstanceOf[Anon_AutoPause]
  }
}

