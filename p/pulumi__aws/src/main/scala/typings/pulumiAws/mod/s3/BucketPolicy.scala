package typings.pulumiAws.mod.s3

import typings.pulumiAws.bucketPolicyMod.BucketPolicyArgs
import typings.pulumiAws.bucketPolicyMod.BucketPolicyState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.BucketPolicy")
@js.native
class BucketPolicy protected ()
  extends typings.pulumiAws.s3Mod.BucketPolicy {
  /**
    * Create a BucketPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketPolicyArgs) = this()
  def this(name: String, args: BucketPolicyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "s3.BucketPolicy")
@js.native
object BucketPolicy extends js.Object {
  /**
    * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
  def get(name: String, id: Input[ID], state: BucketPolicyState): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
  def get(name: String, id: Input[ID], state: BucketPolicyState, opts: CustomResourceOptions): typings.pulumiAws.bucketPolicyMod.BucketPolicy = js.native
  /**
    * Returns true if the given object is an instance of BucketPolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketPolicy.BucketPolicy */ Boolean = js.native
}

