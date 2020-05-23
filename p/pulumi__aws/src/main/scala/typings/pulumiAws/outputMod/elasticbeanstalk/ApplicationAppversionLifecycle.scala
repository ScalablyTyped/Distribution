package typings.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAppversionLifecycle extends js.Object {
  /**
    * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: js.UndefOr[Boolean] = js.native
  /**
    * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxAgeInDays: js.UndefOr[Double] = js.native
  /**
    * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxCount: js.UndefOr[Double] = js.native
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String = js.native
}

object ApplicationAppversionLifecycle {
  @scala.inline
  def apply(
    serviceRole: String,
    deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined,
    maxAgeInDays: js.UndefOr[Double] = js.undefined,
    maxCount: js.UndefOr[Double] = js.undefined
  ): ApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteSourceFromS3)) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAgeInDays)) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCount)) __obj.updateDynamic("maxCount")(maxCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppversionLifecycle]
  }
}

