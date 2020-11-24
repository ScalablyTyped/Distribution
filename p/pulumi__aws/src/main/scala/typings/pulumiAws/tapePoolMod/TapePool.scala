package typings.pulumiAws.tapePoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/storagegateway/tapePool", "TapePool")
@js.native
class TapePool protected () extends CustomResource {
  /**
    * Create a TapePool resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TapePoolArgs) = this()
  def this(name: String, args: TapePoolArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Volume Amazon Resource Name (ARN), e.g. `aws_storagegateway_tape_pool.example arn:aws:storagegateway:us-east-1:123456789012:tapepool/pool-12345678`.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the new custom tape pool.
    */
  val poolName: Output_[String] = js.native
  
  /**
    * Tape retention lock time is set in days. Tape retention lock can be enabled for up to 100 years (36,500 days). Default value is 0.
    */
  val retentionLockTimeInDays: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * Tape retention lock can be configured in two modes. When configured in governance mode, AWS accounts with specific IAM permissions are authorized to remove the tape retention lock from archived virtual tapes. When configured in compliance mode, the tape retention lock cannot be removed by any user, including the root AWS account. Possible values are `COMPLIANCE`, `GOVERNANCE`, and `NONE`. Default value is `NONE`.
    */
  val retentionLockType: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The storage class that is associated with the new custom pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class that corresponds to the pool. Possible values are `DEEP_ARCHIVE` or `GLACIER`.
    */
  val storageClass: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/storagegateway/tapePool", "TapePool")
@js.native
object TapePool extends js.Object {
  
  /**
    * Get an existing TapePool resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TapePool = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TapePool = js.native
  def get(name: String, id: Input[ID], state: TapePoolState): TapePool = js.native
  def get(name: String, id: Input[ID], state: TapePoolState, opts: CustomResourceOptions): TapePool = js.native
  
  /**
    * Returns true if the given object is an instance of TapePool.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/tapePool.TapePool */ Boolean = js.native
}
