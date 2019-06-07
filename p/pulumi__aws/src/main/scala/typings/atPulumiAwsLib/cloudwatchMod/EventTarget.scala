package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventTarget")
@js.native
class EventTarget protected ()
  extends atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget {
  /**
    * Create a EventTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "EventTarget")
@js.native
object EventTarget extends js.Object {
  /**
    * Get an existing EventTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetState
  ): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventTargetMod.EventTargetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchEventTargetMod.EventTarget = js.native
  /**
    * Returns true if the given object is an instance of EventTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ scala.Boolean = js.native
}

