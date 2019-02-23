package typings
package atPulumiAwsLib.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "EventDestination")
@js.native
class EventDestination protected ()
  extends atPulumiAwsLib.sesEventDestinationMod.EventDestination {
  /**
    * Create a EventDestination resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sesEventDestinationMod.EventDestinationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sesEventDestinationMod.EventDestinationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "EventDestination")
@js.native
object EventDestination extends js.Object {
  /**
    * Get an existing EventDestination resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesEventDestinationMod.EventDestinationState
  ): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesEventDestinationMod.EventDestinationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesEventDestinationMod.EventDestination = js.native
}

