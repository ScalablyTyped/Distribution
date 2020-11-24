package typings.pulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.workspaces.DirectorySelfServicePermissions
import typings.pulumiAws.outputMod.workspaces.DirectoryWorkspaceCreationProperties
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/workspaces/directory", "Directory")
@js.native
class Directory protected () extends CustomResource {
  /**
    * Create a Directory resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DirectoryArgs) = this()
  def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The directory alias.
    */
  val alias: Output_[String] = js.native
  
  /**
    * The user name for the service account.
    */
  val customerUserName: Output_[String] = js.native
  
  /**
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: Output_[String] = js.native
  
  /**
    * The name of the directory.
    */
  val directoryName: Output_[String] = js.native
  
  /**
    * The directory type.
    */
  val directoryType: Output_[String] = js.native
  
  /**
    * The IP addresses of the DNS servers for the directory.
    */
  val dnsIpAddresses: Output_[js.Array[String]] = js.native
  
  /**
    * The identifier of the IAM role. This is the role that allows Amazon WorkSpaces to make calls to other services, such as Amazon EC2, on your behalf.
    */
  val iamRoleId: Output_[String] = js.native
  
  /**
    * The identifiers of the IP access control groups associated with the directory.
    */
  val ipGroupIds: Output_[js.Array[String]] = js.native
  
  /**
    * The registration code for the directory. This is the code that users enter in their Amazon WorkSpaces client application to connect to the directory.
    */
  val registrationCode: Output_[String] = js.native
  
  /**
    * Permissions to enable or disable self-service capabilities. Defined below.
    */
  val selfServicePermissions: Output_[DirectorySelfServicePermissions] = js.native
  
  /**
    * The subnets identifiers where the workspaces are created.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  
  /**
    * A map of tags assigned to the WorkSpaces directory.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Default properties that are used for creating WorkSpaces. Defined below.
    */
  val workspaceCreationProperties: Output_[DirectoryWorkspaceCreationProperties] = js.native
  
  /**
    * The identifier of the security group that is assigned to new WorkSpaces.
    */
  val workspaceSecurityGroupId: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/workspaces/directory", "Directory")
@js.native
object Directory extends js.Object {
  
  /**
    * Get an existing Directory resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Directory = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
  
  /**
    * Returns true if the given object is an instance of Directory.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = js.native
}
