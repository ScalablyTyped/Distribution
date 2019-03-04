package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDaysStorageClass extends js.Object {
  var date: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var days: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var storageClass: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DateDaysStorageClass {
  @scala.inline
  def apply(
    storageClass: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    date: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    days: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DateDaysStorageClass = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDaysStorageClass]
  }
}

