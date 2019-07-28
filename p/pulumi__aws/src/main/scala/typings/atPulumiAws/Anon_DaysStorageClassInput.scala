package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysStorageClassInput extends js.Object {
  var days: js.UndefOr[Input[Double]] = js.undefined
  var storageClass: Input[String]
}

object Anon_DaysStorageClassInput {
  @scala.inline
  def apply(storageClass: Input[String], days: Input[Double] = null): Anon_DaysStorageClassInput = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysStorageClassInput]
  }
}

