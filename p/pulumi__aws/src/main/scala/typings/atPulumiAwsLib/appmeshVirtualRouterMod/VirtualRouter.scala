package typings
package atPulumiAwsLib.appmeshVirtualRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
class VirtualRouter protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VirtualRouter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VirtualRouterArgs) = this()
  def this(name: java.lang.String, args: VirtualRouterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the virtual router.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The creation date of the virtual router.
    */
  val createdDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The last update date of the virtual router.
    */
  val lastUpdatedDate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the service mesh in which to create the virtual router.
    */
  val meshName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name to use for the virtual router.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The virtual router specification to apply.
    */
  val spec: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_ServiceNames] = js.native
}

/* static members */
@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
object VirtualRouter extends js.Object {
  /**
    * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState
  ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
}

