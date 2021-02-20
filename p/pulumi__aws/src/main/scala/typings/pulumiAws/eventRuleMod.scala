package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventRuleMod {
  
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
  object EventRule {
    
    /**
      * Get an existing EventRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID]): EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState): EventRule = js.native
    @JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: EventRuleState, opts: CustomResourceOptions): EventRule = js.native
    
    /**
      * Returns true if the given object is an instance of EventRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/cloudwatch/eventRule", "EventRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventRule.EventRule */ Boolean = js.native
  }
  
  @js.native
  trait EventRuleArgs extends StObject {
    
    /**
      * The description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
      */
    val eventPattern: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the rule should be enabled (defaults to `true`).
      */
    val isEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus.
      */
    val scheduleExpression: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EventRuleArgs {
    
    @scala.inline
    def apply(): EventRuleArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventRuleArgs]
    }
    
    @scala.inline
    implicit class EventRuleArgsMutableBuilder[Self <: EventRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setEventPattern(value: Input[String]): Self = StObject.set(x, "eventPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPatternUndefined: Self = StObject.set(x, "eventPattern", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setScheduleExpression(value: Input[String]): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait EventRuleState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the rule.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The event bus to associate with this rule. If you omit this, the `default` event bus is used.
      */
    val eventBusName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The event pattern described a JSON object. At least one of `scheduleExpression` or `eventPattern` is required. See full documentation of [Events and Event Patterns in EventBridge](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html) for details.
      */
    val eventPattern: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether the rule should be enabled (defaults to `true`).
      */
    val isEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The name of the rule. If omitted, this provider will assign a random, unique name. Conflicts with `namePrefix`.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) associated with the role that is used for target invocation.
      */
    val roleArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The scheduling expression. For example, `cron(0 20 * * ? *)` or `rate(5 minutes)`. At least one of `scheduleExpression` or `eventPattern` is required. Can only be used on the default event bus.
      */
    val scheduleExpression: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object EventRuleState {
    
    @scala.inline
    def apply(): EventRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventRuleState]
    }
    
    @scala.inline
    implicit class EventRuleStateMutableBuilder[Self <: EventRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEventBusName(value: Input[String]): Self = StObject.set(x, "eventBusName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventBusNameUndefined: Self = StObject.set(x, "eventBusName", js.undefined)
      
      @scala.inline
      def setEventPattern(value: Input[String]): Self = StObject.set(x, "eventPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPatternUndefined: Self = StObject.set(x, "eventPattern", js.undefined)
      
      @scala.inline
      def setIsEnabled(value: Input[Boolean]): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setScheduleExpression(value: Input[String]): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
