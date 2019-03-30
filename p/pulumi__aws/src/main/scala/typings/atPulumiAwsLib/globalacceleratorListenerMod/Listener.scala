package typings
package atPulumiAwsLib.globalacceleratorListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
@js.native
class Listener protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ListenerArgs) = this()
  def this(name: java.lang.String, args: ListenerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of your accelerator.
    */
  val acceleratorArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
    */
  val clientAffinity: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
    */
  val portRanges: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_FromPortToPort]] = js.native
  /**
    * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
    */
  val protocol: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/globalaccelerator/listener", "Listener")
@js.native
object Listener extends js.Object {
  /**
    * Get an existing Listener resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.globalacceleratorListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.globalacceleratorListenerMod.ListenerState
  ): atPulumiAwsLib.globalacceleratorListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.globalacceleratorListenerMod.ListenerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.globalacceleratorListenerMod.Listener = js.native
}

