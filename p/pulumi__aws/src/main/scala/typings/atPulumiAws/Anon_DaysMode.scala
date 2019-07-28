package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysMode extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var mode: String
  var years: js.UndefOr[Double] = js.undefined
}

object Anon_DaysMode {
  @scala.inline
  def apply(mode: String, days: Int | Double = null, years: Int | Double = null): Anon_DaysMode = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysMode]
  }
}

