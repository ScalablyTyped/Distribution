package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDays extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var days: js.UndefOr[scala.Double] = js.undefined
  var storageClass: java.lang.String
}

object Anon_DateDays {
  @scala.inline
  def apply(
    storageClass: java.lang.String,
    date: java.lang.String = null,
    days: scala.Int | scala.Double = null
  ): Anon_DateDays = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("storageClass")(storageClass)
    if (date != null) __obj.updateDynamic("date")(date)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDays]
  }
}

