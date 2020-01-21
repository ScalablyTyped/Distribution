package typings.pulumiAws.outputMod.macie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketAssociationClassificationType extends js.Object {
  /**
    * A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
    * The only valid value is the default value, `FULL`.
    */
  var continuous: js.UndefOr[String] = js.native
  /**
    * A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
    * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
    */
  var oneTime: js.UndefOr[String] = js.native
}

object S3BucketAssociationClassificationType {
  @scala.inline
  def apply(continuous: String = null, oneTime: String = null): S3BucketAssociationClassificationType = {
    val __obj = js.Dynamic.literal()
    if (continuous != null) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (oneTime != null) __obj.updateDynamic("oneTime")(oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketAssociationClassificationType]
  }
}

