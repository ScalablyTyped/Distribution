package typings.pulumiAws.hostedTransitVirtualInterfaceAcceptorMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor")
@js.native
class HostedTransitVirtualInterfaceAcceptor protected () extends CustomResource {
  /**
    * Create a HostedTransitVirtualInterfaceAcceptor resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs) = this()
  def this(name: String, args: HostedTransitVirtualInterfaceAcceptorArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output_[String] = js.native
  /**
    * The ID of the Direct Connect gateway to which to connect the virtual interface.
    */
  val dxGatewayId: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor", "HostedTransitVirtualInterfaceAcceptor")
@js.native
object HostedTransitVirtualInterfaceAcceptor extends js.Object {
  /**
    * Get an existing HostedTransitVirtualInterfaceAcceptor resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): HostedTransitVirtualInterfaceAcceptor = js.native
  def get(name: String, id: Input[ID], state: HostedTransitVirtualInterfaceAcceptorState): HostedTransitVirtualInterfaceAcceptor = js.native
  def get(
    name: String,
    id: Input[ID],
    state: HostedTransitVirtualInterfaceAcceptorState,
    opts: CustomResourceOptions
  ): HostedTransitVirtualInterfaceAcceptor = js.native
  /**
    * Returns true if the given object is an instance of HostedTransitVirtualInterfaceAcceptor.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedTransitVirtualInterfaceAcceptor.HostedTransitVirtualInterfaceAcceptor */ Boolean = js.native
}

