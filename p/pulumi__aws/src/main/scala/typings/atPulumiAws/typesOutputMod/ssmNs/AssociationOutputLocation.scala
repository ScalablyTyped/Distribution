package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationOutputLocation extends js.Object {
  /**
    * The S3 bucket name.
    */
  var s3BucketName: String
  /**
    * The S3 bucket prefix. Results stored in the root if not configured.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.undefined
}

object AssociationOutputLocation {
  @scala.inline
  def apply(s3BucketName: String, s3KeyPrefix: String = null): AssociationOutputLocation = {
    val __obj = js.Dynamic.literal(s3BucketName = s3BucketName)
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix)
    __obj.asInstanceOf[AssociationOutputLocation]
  }
}

