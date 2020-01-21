package typings.pulumiAws.s3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.inputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3LocationState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: js.UndefOr[Input[ARN]] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: js.UndefOr[Input[S3LocationS3Config]] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  val uri: js.UndefOr[Input[String]] = js.native
}

object S3LocationState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    s3BucketArn: Input[ARN] = null,
    s3Config: Input[S3LocationS3Config] = null,
    subdirectory: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null,
    uri: Input[String] = null
  ): S3LocationState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (s3BucketArn != null) __obj.updateDynamic("s3BucketArn")(s3BucketArn.asInstanceOf[js.Any])
    if (s3Config != null) __obj.updateDynamic("s3Config")(s3Config.asInstanceOf[js.Any])
    if (subdirectory != null) __obj.updateDynamic("subdirectory")(subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationState]
  }
}

