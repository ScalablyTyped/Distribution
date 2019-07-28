package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3 extends js.Object {
  var deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined
  var maxAgeInDays: js.UndefOr[Double] = js.undefined
  var maxCount: js.UndefOr[Double] = js.undefined
  var serviceRole: String
}

object Anon_DeleteSourceFromS3 {
  @scala.inline
  def apply(
    serviceRole: String,
    deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined,
    maxAgeInDays: Int | Double = null,
    maxCount: Int | Double = null
  ): Anon_DeleteSourceFromS3 = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole)
    if (!js.isUndefined(deleteSourceFromS3)) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3)
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteSourceFromS3]
  }
}

