package typings
package atPulumiAwsLib.macieS3BucketAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/macie/s3BucketAssociation", "S3BucketAssociation")
@js.native
class S3BucketAssociation protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: S3BucketAssociationArgs) = this()
  def this(name: java.lang.String, args: S3BucketAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  val bucketName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The configuration of how Amazon Macie classifies the S3 objects.
    */
  val classificationType: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_Continuous] = js.native
  /**
    * The ID of the Amazon Macie member account whose S3 resources you want to associate with Macie. If `member_account_id` isn't specified, the action associates specified S3 resources with Macie for the current master account.
    */
  val memberAccountId: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Object key prefix identifying one or more S3 objects to which the association applies.
    */
  val prefix: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

@JSImport("@pulumi/aws/macie/s3BucketAssociation", "S3BucketAssociation")
@js.native
object S3BucketAssociation extends js.Object {
  /**
    * Get an existing S3BucketAssociation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociationState
  ): atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociation = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociation = js.native
}

