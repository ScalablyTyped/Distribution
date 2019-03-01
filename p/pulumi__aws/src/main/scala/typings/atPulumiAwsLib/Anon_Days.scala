package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Days extends js.Object {
  var days: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Days {
  @scala.inline
  def apply(days: scala.Int | scala.Double = null): Anon_Days = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Days]
  }
}

