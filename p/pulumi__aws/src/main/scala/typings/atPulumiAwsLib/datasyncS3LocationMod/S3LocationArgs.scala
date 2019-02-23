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

