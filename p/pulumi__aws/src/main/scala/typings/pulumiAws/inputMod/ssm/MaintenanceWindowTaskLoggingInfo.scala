package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskLoggingInfo extends js.Object {
  var s3BucketName: Input[String] = js.native
  var s3BucketPrefix: js.UndefOr[Input[String]] = js.native
  var s3Region: Input[String] = js.native
}

object MaintenanceWindowTaskLoggingInfo {
  @scala.inline
  def apply(s3BucketName: Input[String], s3Region: Input[String], s3BucketPrefix: Input[String] = null): MaintenanceWindowTaskLoggingInfo = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any])
    if (s3BucketPrefix != null) __obj.updateDynamic("s3BucketPrefix")(s3BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskLoggingInfo]
  }
}

