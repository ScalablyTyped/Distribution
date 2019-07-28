package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDays extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var days: js.UndefOr[Double] = js.undefined
  var storageClass: String
}

object Anon_DateDays {
  @scala.inline
  def apply(storageClass: String, date: String = null, days: Int | Double = null): Anon_DateDays = {
    val __obj = js.Dynamic.literal(storageClass = storageClass)
    if (date != null) __obj.updateDynamic("date")(date)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDays]
  }
}

