package typings.atPulumiAws.directconnectHostedPrivateVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter")
@js.native
class HostedPrivateVirtualInterfaceAccepter protected () extends CustomResource {
  /**
    * Create a HostedPrivateVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs) = this()
  def this(name: String, args: HostedPrivateVirtualInterfaceAccepterArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output[String] = js.native
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Output[String] = js.native
  /**
    * The ID of the virtual private gateway to which to connect the virtual interface.
    */
  val vpnGatewayId: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter", "HostedPrivateVirtualInterfaceAccepter")
@js.native
object HostedPrivateVirtualInterfaceAccepter extends js.Object {
  /**
    * Get an existing HostedPrivateVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): HostedPrivateVirtualInterfaceAccepter = js.native
  def get(name: String, id: Input[ID], state: HostedPrivateVirtualInterfaceAccepterState): HostedPrivateVirtualInterfaceAccepter = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedPrivateVirtualInterfaceAccepterState,
    opts: CustomResourceOptions
  ): HostedPrivateVirtualInterfaceAccepter = js.native
  /**
    * Returns true if the given object is an instance of HostedPrivateVirtualInterfaceAccepter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPrivateVirtualInterfaceAccepter.HostedPrivateVirtualInterfaceAccepter */ Boolean = js.native
}

