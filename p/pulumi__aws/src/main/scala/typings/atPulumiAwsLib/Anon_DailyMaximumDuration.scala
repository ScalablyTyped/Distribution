package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DailyMaximumDuration extends js.Object {
  var daily: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var maximumDuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var messagesPerSecond: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var total: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_DailyMaximumDuration {
  @scala.inline
  def apply(
    daily: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    maximumDuration: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    messagesPerSecond: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    total: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DailyMaximumDuration = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DailyMaximumDuration]
  }
}

