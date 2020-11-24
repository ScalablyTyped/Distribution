package typings.pulumiAws.s3Mod

import typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlockArgs
import typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlockState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3", "BucketPublicAccessBlock")
@js.native
class BucketPublicAccessBlock protected ()
  extends typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock {
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: BucketPublicAccessBlockState, opts: CustomResourceOptions): typings.pulumiAws.bucketPublicAccessBlockMod.BucketPublicAccessBlock = js.native
  
  /**
    * Returns true if the given object is an instance of BucketPublicAccessBlock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPublicAccessBlock.BucketPublicAccessBlock */ Boolean = js.native
}
