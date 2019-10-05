package typings.atPulumiAws.typesOutputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApplicationAppversionLifecycle extends js.Object {
  /**
    * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: Boolean
  /**
    * The number of days to retain an application version.
    */
  var maxAgeInDays: Double
  /**
    * The maximum number of application versions to retain.
    */
  var maxCount: Double
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String
}

object GetApplicationAppversionLifecycle {
  @scala.inline
  def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): GetApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3, maxAgeInDays = maxAgeInDays, maxCount = maxCount, serviceRole = serviceRole)
  
    __obj.asInstanceOf[GetApplicationAppversionLifecycle]
  }
}

