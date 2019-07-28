package typings.atPulumiAws.s3Mod

import typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockArgs
import typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlockState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
@js.native
class BucketPublicAccessBlock protected ()
  extends typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock {
  /**
    * Create a BucketPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketPublicAccessBlockArgs) = this()
  def this(name: String, args: BucketPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): typings.atPulumiAws.s3BucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  /**
    * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = js.native
}

