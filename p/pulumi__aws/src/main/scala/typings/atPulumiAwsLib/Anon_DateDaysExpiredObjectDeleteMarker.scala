package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDaysExpiredObjectDeleteMarker extends js.Object {
  var date: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var days: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var expiredObjectDeleteMarker: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_DateDaysExpiredObjectDeleteMarker {
  @scala.inline
  def apply(
    date: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    days: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    expiredObjectDeleteMarker: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_DateDaysExpiredObjectDeleteMarker = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (expiredObjectDeleteMarker != null) __obj.updateDynamic("expiredObjectDeleteMarker")(expiredObjectDeleteMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDaysExpiredObjectDeleteMarker]
  }
}

