package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DaysStorageClassInput extends js.Object {
  var days: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var storageClass: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DaysStorageClassInput {
  @scala.inline
  def apply(
    storageClass: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    days: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DaysStorageClassInput = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DaysStorageClassInput]
  }
}

