package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3MaxAgeInDays extends js.Object {
  var deleteSourceFromS3: js.UndefOr[Input[Boolean]] = js.undefined
  var maxAgeInDays: js.UndefOr[Input[Double]] = js.undefined
  var maxCount: js.UndefOr[Input[Double]] = js.undefined
  var serviceRole: Input[String]
}

object Anon_DeleteSourceFromS3MaxAgeInDays {
  @scala.inline
  def apply(
    serviceRole: Input[String],
    deleteSourceFromS3: Input[Boolean] = null,
    maxAgeInDays: Input[Double] = null,
    maxCount: Input[Double] = null
  ): Anon_DeleteSourceFromS3MaxAgeInDays = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    if (deleteSourceFromS3 != null) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3.asInstanceOf[js.Any])
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteSourceFromS3MaxAgeInDays]
  }
}

