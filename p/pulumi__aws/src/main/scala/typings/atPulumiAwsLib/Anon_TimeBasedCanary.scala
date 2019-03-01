package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeBasedCanary extends js.Object {
  var timeBasedCanary: js.UndefOr[Anon_Interval] = js.undefined
  var timeBasedLinear: js.UndefOr[Anon_Interval] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TimeBasedCanary {
  @scala.inline
  def apply(
    timeBasedCanary: Anon_Interval = null,
    timeBasedLinear: Anon_Interval = null,
    `type`: java.lang.String = null
  ): Anon_TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    if (timeBasedCanary != null) __obj.updateDynamic("timeBasedCanary")(timeBasedCanary)
    if (timeBasedLinear != null) __obj.updateDynamic("timeBasedLinear")(timeBasedLinear)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TimeBasedCanary]
  }
}

