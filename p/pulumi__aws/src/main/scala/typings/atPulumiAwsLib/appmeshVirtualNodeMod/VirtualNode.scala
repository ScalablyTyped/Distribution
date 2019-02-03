package typings
package atPulumiAwsLib.appmeshVirtualNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualNode", "VirtualNode")
@js.native
class VirtualNode protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VirtualNode resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VirtualNodeArgs) = this()
  def this(name: java.lang.String, args: VirtualNodeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the virtual node.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The creation date of the virtual node.
    */
  val createdDate: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The last update date of the virtual node.
    */
  val lastUpdatedDate: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the service mesh in which to create the virtual node.
    */
  val meshName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name to use for the virtual node.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The virtual node specification to apply.
    */
  val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_Backends] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/virtualNode", "VirtualNode")
@js.native
object VirtualNode extends js.Object {
  /**
    * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState
  ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
}

