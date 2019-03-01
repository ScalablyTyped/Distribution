package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alarms extends js.Object {
  var alarms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var ignorePollAlarmFailure: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Alarms {
  @scala.inline
  def apply(
    alarms: js.Array[java.lang.String] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePollAlarmFailure: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Alarms = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(ignorePollAlarmFailure)) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure)
    __obj.asInstanceOf[Anon_Alarms]
  }
}

