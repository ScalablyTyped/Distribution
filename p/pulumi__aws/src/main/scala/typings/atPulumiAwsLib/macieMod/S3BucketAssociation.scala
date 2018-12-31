package typings
package atPulumiAwsLib.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/macie", "S3BucketAssociation")
@js.native
class S3BucketAssociation protected ()
  extends atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociation {
  /**
    * Create a S3BucketAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.macieS3BucketAssociationMod.S3BucketAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/macie", "S3BucketAssociation")
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

