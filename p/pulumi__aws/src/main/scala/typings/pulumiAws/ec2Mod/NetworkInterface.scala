package typings.pulumiAws.ec2Mod

import typings.pulumiAws.networkInterfaceMod.NetworkInterfaceArgs
import typings.pulumiAws.networkInterfaceMod.NetworkInterfaceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "NetworkInterface")
@js.native
class NetworkInterface protected ()
  extends typings.pulumiAws.networkInterfaceMod.NetworkInterface {
  /**
    * Create a NetworkInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NetworkInterfaceArgs) = this()
  def this(name: String, args: NetworkInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ec2", "NetworkInterface")
@js.native
object NetworkInterface extends js.Object {
  /**
    * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.networkInterfaceMod.NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.networkInterfaceMod.NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState): typings.pulumiAws.networkInterfaceMod.NetworkInterface = js.native
  def get(name: String, id: Input[ID], state: NetworkInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.networkInterfaceMod.NetworkInterface = js.native
  /**
    * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean = js.native
}

