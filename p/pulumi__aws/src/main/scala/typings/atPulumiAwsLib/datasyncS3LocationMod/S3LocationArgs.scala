package typings
package atPulumiAwsLib.datasyncS3LocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3LocationArgs extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketAccessRoleArnInput]
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object S3LocationArgs {
  @scala.inline
  def apply(
    s3BucketArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN],
    s3Config: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketAccessRoleArnInput],
    subdirectory: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): S3LocationArgs = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Config = s3Config.asInstanceOf[js.Any], subdirectory = subdirectory.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3LocationArgs]
  }
}

