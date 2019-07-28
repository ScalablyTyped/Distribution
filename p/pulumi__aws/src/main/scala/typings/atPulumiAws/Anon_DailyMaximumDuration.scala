package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DailyMaximumDuration extends js.Object {
  var daily: js.UndefOr[Input[Double]] = js.undefined
  var maximumDuration: js.UndefOr[Input[Double]] = js.undefined
  var messagesPerSecond: js.UndefOr[Input[Double]] = js.undefined
  var total: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_DailyMaximumDuration {
  @scala.inline
  def apply(
    daily: Input[Double] = null,
    maximumDuration: Input[Double] = null,
    messagesPerSecond: Input[Double] = null,
    total: Input[Double] = null
  ): Anon_DailyMaximumDuration = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DailyMaximumDuration]
  }
}

