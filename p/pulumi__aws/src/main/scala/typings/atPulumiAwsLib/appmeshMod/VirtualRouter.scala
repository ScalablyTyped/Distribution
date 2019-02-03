package typings
package atPulumiAwsLib.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appmesh", "VirtualRouter")
@js.native
class VirtualRouter protected ()
  extends atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter {
  /**
    * Create a VirtualRouter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appmesh", "VirtualRouter")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState
  ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
}

