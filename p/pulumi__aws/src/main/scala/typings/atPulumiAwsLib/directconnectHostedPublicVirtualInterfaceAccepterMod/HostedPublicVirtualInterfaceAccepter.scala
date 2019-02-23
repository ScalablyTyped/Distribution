package typings
package atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter", "HostedPublicVirtualInterfaceAccepter")
@js.native
class HostedPublicVirtualInterfaceAccepter protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a HostedPublicVirtualInterfaceAccepter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: HostedPublicVirtualInterfaceAccepterArgs) = this()
  def this(name: java.lang.String, args: HostedPublicVirtualInterfaceAccepterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the virtual interface.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterfaceAccepter", "HostedPublicVirtualInterfaceAccepter")
@js.native
object HostedPublicVirtualInterfaceAccepter extends js.Object {
  /**
    * Get an existing HostedPublicVirtualInterfaceAccepter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState
  ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepterState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceAccepterMod.HostedPublicVirtualInterfaceAccepter = js.native
}

