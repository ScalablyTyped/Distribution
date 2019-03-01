package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3MaxAgeInDays extends js.Object {
  var deleteSourceFromS3: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var maxAgeInDays: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var maxCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var serviceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DeleteSourceFromS3MaxAgeInDays {
  @scala.inline
  def apply(
    serviceRole: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    deleteSourceFromS3: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    maxAgeInDays: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    maxCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DeleteSourceFromS3MaxAgeInDays = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (deleteSourceFromS3 != null) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3.asInstanceOf[js.Any])
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteSourceFromS3MaxAgeInDays]
  }
}

