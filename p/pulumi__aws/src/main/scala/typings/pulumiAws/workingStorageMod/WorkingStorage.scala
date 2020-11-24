package typings.pulumiAws.workingStorageMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage")
@js.native
class WorkingStorage protected () extends CustomResource {
  /**
    * Create a WorkingStorage resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WorkingStorageArgs) = this()
  def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: Output_[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/storagegateway/workingStorage", "WorkingStorage")
@js.native
object WorkingStorage extends js.Object {
  
  /**
    * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): WorkingStorage = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WorkingStorage = js.native
  def get(name: String, id: Input[ID], state: WorkingStorageState): WorkingStorage = js.native
  def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): WorkingStorage = js.native
  
  /**
    * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
}
