package typings.pulumiAws.eventRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventHandler
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscription
import typings.pulumiAws.eventRuleMixinsMod.EventRuleEventSubscriptionArgs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule")
@js.native
class EventRule protected () extends CustomResource {
  /**
    * Create a EventRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EventRuleArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EventRuleArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The description of the rule.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
    */
  val eventBusName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
    */
  val eventPattern: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Whether the rule should be enabled (defaults to `true`).
    */
  val isEnabled: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
    */
  val name: Output_[String] = js.native
  
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Creates a new subscription to events fired from this EventRule to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: String, handler: EventRuleEventHandler): EventRuleEventSubscription = js.native
  def onEvent(
    name: String,
    handler: EventRuleEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
  def onEvent(name: String, handler: EventRuleEventHandler, args: EventRuleEventSubscriptionArgs): EventRuleEventSubscription = js.native
  def onEvent(
    name: String,
    handler: EventRuleEventHandler,
    args: EventRuleEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): EventRuleEventSubscription = js.native
  
  /**
    * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
    */
  val roleArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus.
    */
  val scheduleExpression: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule")
@js.native
object EventRule extends js.Object {
  
  /**
    * Get an existing EventRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EventRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventRule = js.native
  def get(name: String, id: Input[ID], state: EventRuleState): EventRule = js.native
  def get(name: String, id: Input[ID], state: EventRuleState, opts: CustomResourceOptions): EventRule = js.native
  
  /**
    * Returns true if the given object is an instance of EventRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventRule.EventRule */ Boolean = js.native
}
