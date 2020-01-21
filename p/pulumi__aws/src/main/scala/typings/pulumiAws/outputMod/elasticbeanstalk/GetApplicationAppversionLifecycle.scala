package typings.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationAppversionLifecycle extends js.Object {
  /**
    * Specifies whether delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: Boolean = js.native
  /**
    * The number of days to retain an application version.
    */
  var maxAgeInDays: Double = js.native
  /**
    * The maximum number of application versions to retain.
    */
  var maxCount: Double = js.native
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String = js.native
}

object GetApplicationAppversionLifecycle {
  @scala.inline
  def apply(deleteSourceFromS3: Boolean, maxAgeInDays: Double, maxCount: Double, serviceRole: String): GetApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(deleteSourceFromS3 = deleteSourceFromS3.asInstanceOf[js.Any], maxAgeInDays = maxAgeInDays.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationAppversionLifecycle]
  }
}

