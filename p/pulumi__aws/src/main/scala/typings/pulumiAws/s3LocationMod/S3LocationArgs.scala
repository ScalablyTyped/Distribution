package typings.pulumiAws.s3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Input[ARN] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Input[S3LocationS3Config] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Input[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object S3LocationArgs {
  @scala.inline
  def apply(
    s3BucketArn: Input[ARN],
    s3Config: Input[S3LocationS3Config],
    subdirectory: Input[String],
    tags: Input[StringDictionary[_]] = null
  ): S3LocationArgs = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Config = s3Config.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationArgs]
  }
}

