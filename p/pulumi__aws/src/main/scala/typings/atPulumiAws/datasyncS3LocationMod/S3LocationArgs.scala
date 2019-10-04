package typings.atPulumiAws.datasyncS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.typesInputMod.datasyncNs.S3LocationS3Config
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3LocationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Input[ARN]
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Input[S3LocationS3Config]
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Input[String]
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object S3LocationArgs {
  @scala.inline
  def apply(
    s3BucketArn: Input[ARN],
    s3Config: Input[S3LocationS3Config],
    subdirectory: Input[String],
    tags: Input[StringDictionary[Input[String]]] = null
  ): S3LocationArgs = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Config = s3Config.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationArgs]
  }
}

