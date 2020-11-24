package typings.pulumiAws.glueTriggerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.TriggerAction
import typings.pulumiAws.outputMod.glue.TriggerPredicate
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/trigger", "Trigger")
@js.native
class Trigger protected () extends CustomResource {
  /**
    * Create a Trigger resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TriggerArgs) = this()
  def this(name: String, args: TriggerArgs, opts: CustomResourceOptions) = this()
  
  /**
    * List of actions initiated by this trigger when it fires. Defined below.
    */
  val actions: Output_[js.Array[TriggerAction]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of Glue Trigger
    */
  val arn: Output_[String] = js.native
  
  /**
    * A description of the new trigger.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Start the trigger. Defaults to `true`. Not valid to disable for `ON_DEMAND` type.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The name of the trigger.
    */
  val name: Output_[String] = js.native
  
  /**
    * A predicate to specify when the new trigger should fire. Required when trigger type is `CONDITIONAL`. Defined below.
    */
  val predicate: Output_[js.UndefOr[TriggerPredicate]] = js.native
  
  /**
    * A cron expression used to specify the schedule. [Time-Based Schedules for Jobs and Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html)
    */
  val schedule: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The type of trigger. Valid values are `CONDITIONAL`, `ON_DEMAND`, and `SCHEDULED`.
    */
  val `type`: Output_[String] = js.native
  
  /**
    * A workflow to which the trigger should be associated to. Every workflow graph (DAG) needs a starting trigger (`ON_DEMAND` or `SCHEDULED` type) and can contain multiple additional `CONDITIONAL` triggers.
    */
  val workflowName: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/trigger", "Trigger")
@js.native
object Trigger extends js.Object {
  
  /**
    * Get an existing Trigger resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Trigger = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState): Trigger = js.native
  def get(name: String, id: Input[ID], state: TriggerState, opts: CustomResourceOptions): Trigger = js.native
  
  /**
    * Returns true if the given object is an instance of Trigger.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/trigger.Trigger */ Boolean = js.native
}
