package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteSourceFromS3 extends js.Object {
  var deleteSourceFromS3: js.UndefOr[scala.Boolean] = js.undefined
  var maxAgeInDays: js.UndefOr[scala.Double] = js.undefined
  var maxCount: js.UndefOr[scala.Double] = js.undefined
  var serviceRole: java.lang.String
}

object Anon_DeleteSourceFromS3 {
  @scala.inline
  def apply(
    serviceRole: java.lang.String,
    deleteSourceFromS3: js.UndefOr[scala.Boolean] = js.undefined,
    maxAgeInDays: scala.Int | scala.Double = null,
    maxCount: scala.Int | scala.Double = null
  ): Anon_DeleteSourceFromS3 = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole)
    if (!js.isUndefined(deleteSourceFromS3)) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3)
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeleteSourceFromS3]
  }
}

