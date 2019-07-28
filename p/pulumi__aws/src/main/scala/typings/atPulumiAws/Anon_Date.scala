package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var days: js.UndefOr[Double] = js.undefined
  var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: String = null,
    days: Int | Double = null,
    expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (!js.isUndefined(expiredObjectDeleteMarker)) __obj.updateDynamic("expiredObjectDeleteMarker")(expiredObjectDeleteMarker)
    __obj.asInstanceOf[Anon_Date]
  }
}

