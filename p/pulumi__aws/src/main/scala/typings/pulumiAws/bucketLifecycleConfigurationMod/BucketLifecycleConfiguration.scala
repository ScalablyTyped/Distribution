package typings.pulumiAws.bucketLifecycleConfigurationMod

import typings.pulumiAws.outputMod.s3control.BucketLifecycleConfigurationRule
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration")
@js.native
class BucketLifecycleConfiguration protected () extends CustomResource {
  /**
    * Create a BucketLifecycleConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketLifecycleConfigurationArgs) = this()
  def this(name: String, args: BucketLifecycleConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the bucket.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * Configuration block(s) containing lifecycle rules for the bucket.
    */
  val rules: Output_[js.Array[BucketLifecycleConfigurationRule]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3control/bucketLifecycleConfiguration", "BucketLifecycleConfiguration")
@js.native
object BucketLifecycleConfiguration extends js.Object {
  
  /**
    * Get an existing BucketLifecycleConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketLifecycleConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketLifecycleConfiguration = js.native
  def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState): BucketLifecycleConfiguration = js.native
  def get(name: String, id: Input[ID], state: BucketLifecycleConfigurationState, opts: CustomResourceOptions): BucketLifecycleConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of BucketLifecycleConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3control/bucketLifecycleConfiguration.BucketLifecycleConfiguration */ Boolean = js.native
}
