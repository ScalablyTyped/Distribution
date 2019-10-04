package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskLoggingInfo extends js.Object {
  var s3BucketName: String
  var s3BucketPrefix: js.UndefOr[String] = js.undefined
  var s3Region: String
}

object MaintenanceWindowTaskLoggingInfo {
  @scala.inline
  def apply(s3BucketName: String, s3Region: String, s3BucketPrefix: String = null): MaintenanceWindowTaskLoggingInfo = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName, s3Region = s3Region)
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix)
    __obj.asInstanceOf[MaintenanceWindowTaskLoggingInfo]
  }
}

