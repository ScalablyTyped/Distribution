package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDaysExpiredObjectDeleteMarker extends js.Object {
  var date: js.UndefOr[Input[String]] = js.undefined
  var days: js.UndefOr[Input[Double]] = js.undefined
  var expiredObjectDeleteMarker: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_DateDaysExpiredObjectDeleteMarker {
  @scala.inline
  def apply(
    date: Input[String] = null,
    days: Input[Double] = null,
    expiredObjectDeleteMarker: Input[Boolean] = null
  ): Anon_DateDaysExpiredObjectDeleteMarker = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (expiredObjectDeleteMarker != null) __obj.updateDynamic("expiredObjectDeleteMarker")(expiredObjectDeleteMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDaysExpiredObjectDeleteMarker]
  }
}

