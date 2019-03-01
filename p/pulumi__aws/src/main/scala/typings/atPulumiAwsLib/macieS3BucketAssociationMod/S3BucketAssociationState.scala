package typings
package atPulumiAwsLib.macieS3BucketAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BucketAssociationState extends js.Object {
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  val bucketName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The configuration of how Amazon Macie classifies the S3 objects.
    */
  val classificationType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContinuousOneTime]] = js.undefined
  /**
    * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn't specified, the action associates specified S3 resources with Macie for the current master account.
    */
  val memberAccountId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Object key prefix identifying one or more S3 objects to which the association applies.
    */
  val prefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object S3BucketAssociationState {
  @scala.inline
  def apply(
    bucketName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    classificationType: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ContinuousOneTime] = null,
    memberAccountId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): S3BucketAssociationState = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketAssociationState]
  }
}

