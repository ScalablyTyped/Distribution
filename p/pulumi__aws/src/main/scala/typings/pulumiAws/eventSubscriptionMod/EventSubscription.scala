package typings.pulumiAws.eventSubscriptionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/dms/eventSubscription", "EventSubscription")
@js.native
class EventSubscription protected () extends CustomResource {
  /**
    * Create a EventSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventSubscriptionArgs) = this()
  def this(name: String, args: EventSubscriptionArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  /**
    * Whether the event subscription should be enabled.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
    */
  val eventCategories: Output_[js.Array[String]] = js.native
  
  /**
    * Name of event subscription.
    */
  val name: Output_[String] = js.native
  
  /**
    * SNS topic arn to send events on.
    */
  val snsTopicArn: Output_[String] = js.native
  
  /**
    * Ids of sources to listen to.
    */
  val sourceIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Type of source for events. Valid values: `replication-instance` or `replication-task`
    */
  val sourceType: Output_[js.UndefOr[String]] = js.native
  
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/dms/eventSubscription", "EventSubscription")
@js.native
object EventSubscription extends js.Object {
  
  /**
    * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState): EventSubscription = js.native
  def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): EventSubscription = js.native
  
  /**
    * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/eventSubscription.EventSubscription */ Boolean = js.native
}
