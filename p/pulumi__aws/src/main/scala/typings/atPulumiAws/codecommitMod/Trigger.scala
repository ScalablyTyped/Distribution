package typings.atPulumiAws.codecommitMod

import typings.atPulumiAws.codecommitTriggerMod.TriggerArgs
import typings.atPulumiAws.codecommitTriggerMod.TriggerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/codecommit", "Trigger")
@js.native
class Trigger protected ()
  extends typings.atPulumiAws.codecommitTriggerMod.Trigger {
  /**
    * Create a Trigger resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TriggerArgs) = this()
  def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/codecommit", "Trigger")
@js.native
object Trigger extends js.Object {
  /**
    * Get an existing Trigger resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.codecommitTriggerMod.Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState): typings.atPulumiAws.codecommitTriggerMod.Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): typings.atPulumiAws.codecommitTriggerMod.Trigger = js.native
  /**
    * Returns true if the given object is an instance of Trigger.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codecommit/trigger.Trigger */ Boolean = js.native
}

