package typings.atPulumiAws.workspacesDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.workspaces.DirectorySelfServicePermissions
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The directory identifier for registration in WorkSpaces service.
    */
  val directoryId: Output[String] = js.native
  /**
    * The permissions to enable or disable self-service capabilities.
    */
  val selfServicePermissions: Output[DirectorySelfServicePermissions] = js.native
  /**
    * The identifiers of the subnets where the directory resides.
    */
  val subnetIds: Output[js.Array[String]] = js.native
  /**
    * A mapping of tags assigned to the WorkSpaces directory.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
  /**
    * Returns true if the given object is an instance of Directory.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/workspaces/directory.Directory */ Boolean = js.native
}

