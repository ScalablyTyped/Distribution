package typings.atPulumiAws.macieS3BucketAssociationMod

import typings.atPulumiAws.typesInputMod.macie.S3BucketAssociationClassificationType
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BucketAssociationState extends js.Object {
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  val bucketName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The configuration of how Amazon Macie classifies the S3 objects.
    */
  val classificationType: js.UndefOr[Input[S3BucketAssociationClassificationType]] = js.undefined
  /**
    * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `memberAccountId` isn't specified, the action associates specified S3 resources with Macie for the current master account.
    */
  val memberAccountId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Object key prefix identifying one or more S3 objects to which the association applies.
    */
  val prefix: js.UndefOr[Input[String]] = js.undefined
}

object S3BucketAssociationState {
  @scala.inline
  def apply(
    bucketName: Input[String] = null,
    classificationType: Input[S3BucketAssociationClassificationType] = null,
    memberAccountId: Input[String] = null,
    prefix: Input[String] = null
  ): S3BucketAssociationState = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (classificationType != null) __obj.updateDynamic("classificationType")(classificationType.asInstanceOf[js.Any])
    if (memberAccountId != null) __obj.updateDynamic("memberAccountId")(memberAccountId.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketAssociationState]
  }
}

