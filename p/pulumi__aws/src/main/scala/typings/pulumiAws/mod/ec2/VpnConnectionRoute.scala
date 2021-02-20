package typings.pulumiAws.mod.ec2

import typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRouteArgs
import typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRouteState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.VpnConnectionRoute")
@js.native
class VpnConnectionRoute protected ()
  extends typings.pulumiAws.ec2Mod.VpnConnectionRoute {
  /**
    * Create a VpnConnectionRoute resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnConnectionRouteArgs) = this()
  def this(name: String, args: VpnConnectionRouteArgs, opts: CustomResourceOptions) = this()
}
/* static members */
object VpnConnectionRoute {
  
  /**
    * Get an existing VpnConnectionRoute resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @JSImport("@pulumi/aws", "ec2.VpnConnectionRoute.get")
  @js.native
  def get(name: String, id: Input[ID]): typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  @JSImport("@pulumi/aws", "ec2.VpnConnectionRoute.get")
  @js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  @JSImport("@pulumi/aws", "ec2.VpnConnectionRoute.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpnConnectionRouteState): typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  @JSImport("@pulumi/aws", "ec2.VpnConnectionRoute.get")
  @js.native
  def get(name: String, id: Input[ID], state: VpnConnectionRouteState, opts: CustomResourceOptions): typings.pulumiAws.vpnConnectionRouteMod.VpnConnectionRoute = js.native
  
  /**
    * Returns true if the given object is an instance of VpnConnectionRoute.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @JSImport("@pulumi/aws", "ec2.VpnConnectionRoute.isInstance")
  @js.native
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnectionRoute.VpnConnectionRoute */ Boolean = js.native
}
