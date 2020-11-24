package typings.pulumiAws.bucketOwnershipControlsMod

import typings.pulumiAws.outputMod.s3.BucketOwnershipControlsRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls")
@js.native
class BucketOwnershipControls protected () extends CustomResource {
  /**
    * Create a BucketOwnershipControls resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketOwnershipControlsArgs) = this()
  def this(name: String, args: BucketOwnershipControlsArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the bucket that you want to associate this access point with.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * Configuration block(s) with Ownership Controls rules. Detailed below.
    */
  val rule: Output_[BucketOwnershipControlsRule] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3/bucketOwnershipControls", "BucketOwnershipControls")
@js.native
object BucketOwnershipControls extends js.Object {
  
  /**
    * Get an existing BucketOwnershipControls resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketOwnershipControls = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketOwnershipControls = js.native
  def get(name: String, id: Input[ID], state: BucketOwnershipControlsState): BucketOwnershipControls = js.native
  def get(name: String, id: Input[ID], state: BucketOwnershipControlsState, opts: CustomResourceOptions): BucketOwnershipControls = js.native
  
  /**
    * Returns true if the given object is an instance of BucketOwnershipControls.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketOwnershipControls.BucketOwnershipControls */ Boolean = js.native
}
