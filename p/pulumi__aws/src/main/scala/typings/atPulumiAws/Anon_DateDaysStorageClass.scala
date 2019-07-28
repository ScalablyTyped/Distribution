package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDaysStorageClass extends js.Object {
  var date: js.UndefOr[Input[String]] = js.undefined
  var days: js.UndefOr[Input[Double]] = js.undefined
  var storageClass: Input[String]
}

object Anon_DateDaysStorageClass {
  @scala.inline
  def apply(storageClass: Input[String], date: Input[String] = null, days: Input[Double] = null): Anon_DateDaysStorageClass = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateDaysStorageClass]
  }
}

