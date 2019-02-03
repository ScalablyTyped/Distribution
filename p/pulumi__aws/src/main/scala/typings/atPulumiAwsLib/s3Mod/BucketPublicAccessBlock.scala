package typings
package atPulumiAwsLib.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
@js.native
class BucketPublicAccessBlock protected ()
  extends atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock {
  /**
    * Create a BucketPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
@js.native
object BucketPublicAccessBlock extends js.Object {
  /**
    * Get an existing BucketPublicAccessBlock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState
  ): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
}

