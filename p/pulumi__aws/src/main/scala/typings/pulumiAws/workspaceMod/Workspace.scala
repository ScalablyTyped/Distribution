package typings.pulumiAws.workspaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.WorkspaceWorkspaceProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/workspaces/workspace", "Workspace")
@js.native
class Workspace protected () extends CustomResource {
  /**
    * Create a Workspace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: WorkspaceArgs) = this()
  def this(name: String, args: WorkspaceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the bundle for the WorkSpace.
    */
  val bundleId: Output_[String] = js.native
  
  /**
    * The name of the WorkSpace, as seen by the operating system.
    */
  val computerName: Output_[String] = js.native
  
  /**
    * The ID of the directory for the WorkSpace.
    */
  val directoryId: Output_[String] = js.native
  
  /**
    * The IP address of the WorkSpace.
    */
  val ipAddress: Output_[String] = js.native
  
  /**
    * Indicates whether the data stored on the root volume is encrypted.
    */
  val rootVolumeEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The operational state of the WorkSpace.
    */
  val state: Output_[String] = js.native
  
  /**
    * The tags for the WorkSpace.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The user name of the user for the WorkSpace. This user name must exist in the directory for the WorkSpace.
    */
  val userName: Output_[String] = js.native
  
  /**
    * Indicates whether the data stored on the user volume is encrypted.
    */
  val userVolumeEncryptionEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The symmetric AWS KMS customer master key (CMK) used to encrypt data stored on your WorkSpace. Amazon WorkSpaces does not support asymmetric CMKs.
    */
  val volumeEncryptionKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The WorkSpace properties.
    */
  val workspaceProperties: Output_[WorkspaceWorkspaceProperties] = js.native
}
/* static members */
@JSImport("@pulumi/aws/workspaces/workspace", "Workspace")
@js.native
object Workspace extends js.Object {
  
  /**
    * Get an existing Workspace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Workspace = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Workspace = js.native
  def get(name: String, id: Input[ID], state: WorkspaceState): Workspace = js.native
  def get(name: String, id: Input[ID], state: WorkspaceState, opts: CustomResourceOptions): Workspace = js.native
  
  /**
    * Returns true if the given object is an instance of Workspace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/workspace.Workspace */ Boolean = js.native
}
