package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskLoggingInfo extends js.Object {
  var s3BucketName: String = js.native
  var s3BucketPrefix: js.UndefOr[String] = js.native
  var s3Region: String = js.native
}

object MaintenanceWindowTaskLoggingInfo {
  @scala.inline
  def apply(s3BucketName: String, s3Region: String, s3BucketPrefix: String = null): MaintenanceWindowTaskLoggingInfo = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any])
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskLoggingInfo]
  }
}

