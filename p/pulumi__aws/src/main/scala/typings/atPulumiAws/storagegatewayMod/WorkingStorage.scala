package typings.atPulumiAws.storagegatewayMod

import typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorageArgs
import typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorageState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "WorkingStorage")
@js.native
class WorkingStorage protected ()
  extends typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage {
  /**
    * Create a WorkingStorage resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WorkingStorageArgs) = this()
  def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/storagegateway", "WorkingStorage")
@js.native
object WorkingStorage extends js.Object {
  /**
    * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
  def get(name: String, id: Input[ID], state: WorkingStorageState): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
  def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayWorkingStorageMod.WorkingStorage = js.native
  /**
    * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
}

