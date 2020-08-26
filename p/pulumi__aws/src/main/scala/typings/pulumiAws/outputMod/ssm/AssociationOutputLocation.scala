package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationOutputLocation extends js.Object {
  /**
    * The S3 bucket name.
    */
  var s3BucketName: String = js.native
  /**
    * The S3 bucket prefix. Results stored in the root if not configured.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.native
}

object AssociationOutputLocation {
  @scala.inline
  def apply(s3BucketName: String): AssociationOutputLocation = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOutputLocation]
  }
  @scala.inline
  implicit class AssociationOutputLocationOps[Self <: AssociationOutputLocation] (val x: Self) extends AnyVal {
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
    def setS3KeyPrefix(value: String): Self = this.set("s3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3KeyPrefix: Self = this.set("s3KeyPrefix", js.undefined)
  }
  
}

