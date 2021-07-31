package typings.pulumiAws.ec2Mod

import typings.pulumiAws.networkInterfaceMod.NetworkInterfaceArgs
import typings.pulumiAws.networkInterfaceMod.NetworkInterfaceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object NetworkInterface {
  
  @JSImport("@pulumi/aws/ec2", "NetworkInterface")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get an existing NetworkInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  @scala.inline
  def get(name: String, id: Input[ID]): typings.pulumiAws.networkInterfaceMod.NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkInterfaceMod.NetworkInterface]
  @scala.inline
  def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.networkInterfaceMod.NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkInterfaceMod.NetworkInterface]
  @scala.inline
  def get(name: String, id: Input[ID], state: NetworkInterfaceState): typings.pulumiAws.networkInterfaceMod.NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkInterfaceMod.NetworkInterface]
  @scala.inline
  def get(name: String, id: Input[ID], state: NetworkInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.networkInterfaceMod.NetworkInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkInterfaceMod.NetworkInterface]
  
  /**
    * Returns true if the given object is an instance of NetworkInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  @scala.inline
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkInterface.NetworkInterface */ Boolean]
}
