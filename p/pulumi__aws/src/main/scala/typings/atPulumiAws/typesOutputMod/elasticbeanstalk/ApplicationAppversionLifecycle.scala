package typings.atPulumiAws.typesOutputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationAppversionLifecycle extends js.Object {
  /**
    * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of days to retain an application version.
    */
  var maxAgeInDays: js.UndefOr[Double] = js.undefined
  /**
    * The maximum number of application versions to retain.
    */
  var maxCount: js.UndefOr[Double] = js.undefined
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String
}

object ApplicationAppversionLifecycle {
  @scala.inline
  def apply(
    serviceRole: String,
    deleteSourceFromS3: js.UndefOr[Boolean] = js.undefined,
    maxAgeInDays: Int | Double = null,
    maxCount: Int | Double = null
  ): ApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole)
    if (!js.isUndefined(deleteSourceFromS3)) __obj.updateDynamic("deleteSourceFromS3")(deleteSourceFromS3)
    if (maxAgeInDays != null) __obj.updateDynamic("maxAgeInDays")(maxAgeInDays.asInstanceOf[js.Any])
    if (maxCount != null) __obj.updateDynamic("maxCount")(maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppversionLifecycle]
  }
}

