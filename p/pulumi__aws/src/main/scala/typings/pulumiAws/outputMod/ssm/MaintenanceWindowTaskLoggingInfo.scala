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
  def apply(s3BucketName: String, s3Region: String): MaintenanceWindowTaskLoggingInfo = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3Region = s3Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskLoggingInfo]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskLoggingInfoOps[Self <: MaintenanceWindowTaskLoggingInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setS3BucketName(value: String): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3Region(value: String): Self = this.set("s3Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3BucketPrefix(value: String): Self = this.set("s3BucketPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BucketPrefix: Self = this.set("s3BucketPrefix", js.undefined)
  }
  
}

