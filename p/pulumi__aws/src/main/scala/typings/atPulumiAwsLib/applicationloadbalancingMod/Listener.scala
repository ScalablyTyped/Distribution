package typings
package atPulumiAwsLib.applicationloadbalancingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing", "Listener")
@js.native
class Listener protected ()
  extends atPulumiAwsLib.applicationloadbalancingListenerMod.Listener {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/applicationloadbalancing", "Listener")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState
  ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.applicationloadbalancingListenerMod.ListenerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.applicationloadbalancingListenerMod.Listener = js.native
  /**
    * Returns true if the given object is an instance of Listener.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/listener.Listener */ scala.Boolean = js.native
}

