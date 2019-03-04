package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysMode extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
  var mode: java.lang.String
  var years: js.UndefOr[scala.Double] = js.undefined
}

object Anon_DaysMode {
  @scala.inline
  def apply(
    mode: java.lang.String,
    days: scala.Int | scala.Double = null,
    years: scala.Int | scala.Double = null
  ): Anon_DaysMode = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysMode]
  }
}

