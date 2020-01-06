package typings.atPulumiAws.typesOutputMod.ssm

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
  def apply(s3BucketName: String, s3KeyPrefix: String = null): AssociationOutputLocation = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationOutputLocation]
  }
}

