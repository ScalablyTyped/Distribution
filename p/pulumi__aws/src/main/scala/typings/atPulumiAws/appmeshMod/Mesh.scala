package typings.atPulumiAws.appmeshMod

import typings.atPulumiAws.appmeshMeshMod.MeshArgs
import typings.atPulumiAws.appmeshMeshMod.MeshState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh", "Mesh")
@js.native
class Mesh protected ()
  extends typings.atPulumiAws.appmeshMeshMod.Mesh {
  /**
    * Create a Mesh resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: MeshArgs) = this()
  def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appmesh", "Mesh")
@js.native
object Mesh extends js.Object {
  /**
    * Get an existing Mesh resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
  def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
  /**
    * Returns true if the given object is an instance of Mesh.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
}

