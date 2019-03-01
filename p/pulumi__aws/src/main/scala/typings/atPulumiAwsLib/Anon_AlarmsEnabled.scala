package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmsEnabled extends js.Object {
  var alarms: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var ignorePollAlarmFailure: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_AlarmsEnabled {
  @scala.inline
  def apply(
    alarms: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    ignorePollAlarmFailure: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_AlarmsEnabled = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ignorePollAlarmFailure != null) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlarmsEnabled]
  }
}

