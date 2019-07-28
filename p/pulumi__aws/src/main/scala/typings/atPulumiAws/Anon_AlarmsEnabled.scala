package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmsEnabled extends js.Object {
  var alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var ignorePollAlarmFailure: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_AlarmsEnabled {
  @scala.inline
  def apply(
    alarms: Input[js.Array[Input[String]]] = null,
    enabled: Input[Boolean] = null,
    ignorePollAlarmFailure: Input[Boolean] = null
  ): Anon_AlarmsEnabled = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ignorePollAlarmFailure != null) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlarmsEnabled]
  }
}

