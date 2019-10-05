package typings.atPulumiAws.atPulumiAwsMod.cloudwatch

import typings.atPulumiAws.cloudwatchEventTargetMod.EventTargetArgs
import typings.atPulumiAws.cloudwatchEventTargetMod.EventTargetState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cloudwatch.EventTarget")
@js.native
class EventTarget protected ()
  extends typings.atPulumiAws.cloudwatchMod.EventTarget {
  /**
    * Create a EventTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventTargetArgs) = this()
  def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "cloudwatch.EventTarget")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
  def get(name: String, id: Input[ID], state: EventTargetState): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
  def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): typings.atPulumiAws.cloudwatchEventTargetMod.EventTarget = js.native
  /**
    * Returns true if the given object is an instance of EventTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
}

