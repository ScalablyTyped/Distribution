package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codestarnotifications.NotificationRuleTarget
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationRuleMod {
  
  @JSImport("@pulumi/aws/codestarnotifications/notificationRule", "NotificationRule")
  @js.native
  class NotificationRule protected () extends CustomResource {
    /**
      * Create a NotificationRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationRuleArgs) = this()
    def this(name: String, args: NotificationRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The codestar notification rule ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
      */
    val detailType: Output_[String] = js.native
    
    /**
      * A list of event types associated with this notification rule.
      * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
      */
    val eventTypeIds: Output_[js.Array[String]] = js.native
    
    /**
      * The name of notification rule.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ARN of the resource to associate with the notification rule.
      */
    val resource: Output_[String] = js.native
    
    /**
      * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
      */
    val status: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
      */
    val targets: Output_[js.UndefOr[js.Array[NotificationRuleTarget]]] = js.native
  }
  /* static members */
  object NotificationRule {
    
    @JSImport("@pulumi/aws/codestarnotifications/notificationRule", "NotificationRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): NotificationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NotificationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NotificationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NotificationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: NotificationRuleState): NotificationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NotificationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: NotificationRuleState, opts: CustomResourceOptions): NotificationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NotificationRule]
    
    /**
      * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codestarnotifications/notificationRule.NotificationRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codestarnotifications/notificationRule.NotificationRule */ Boolean]
  }
  
  trait NotificationRuleArgs extends StObject {
    
    /**
      * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
      */
    val detailType: Input[String]
    
    /**
      * A list of event types associated with this notification rule.
      * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
      */
    val eventTypeIds: Input[js.Array[Input[String]]]
    
    /**
      * The name of notification rule.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the resource to associate with the notification rule.
      */
    val resource: Input[String]
    
    /**
      * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
      */
    val targets: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]]
        ]
      ] = js.undefined
  }
  object NotificationRuleArgs {
    
    @scala.inline
    def apply(detailType: Input[String], eventTypeIds: Input[js.Array[Input[String]]], resource: Input[String]): NotificationRuleArgs = {
      val __obj = js.Dynamic.literal(detailType = detailType.asInstanceOf[js.Any], eventTypeIds = eventTypeIds.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationRuleArgs]
    }
    
    @scala.inline
    implicit class NotificationRuleArgsMutableBuilder[Self <: NotificationRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailType(value: Input[String]): Self = StObject.set(x, "detailType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "eventTypeIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeIdsVarargs(value: Input[String]*): Self = StObject.set(x, "eventTypeIds", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
  trait NotificationRuleState extends StObject {
    
    /**
      * The codestar notification rule ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The level of detail to include in the notifications for this resource. Possible values are `BASIC` and `FULL`.
      */
    val detailType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of event types associated with this notification rule.
      * For list of allowed events see [here](https://docs.aws.amazon.com/codestar-notifications/latest/userguide/concepts.html#concepts-api).
      */
    val eventTypeIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The name of notification rule.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the resource to associate with the notification rule.
      */
    val resource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
      */
    val targets: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]]
        ]
      ] = js.undefined
  }
  object NotificationRuleState {
    
    @scala.inline
    def apply(): NotificationRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationRuleState]
    }
    
    @scala.inline
    implicit class NotificationRuleStateMutableBuilder[Self <: NotificationRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDetailType(value: Input[String]): Self = StObject.set(x, "detailType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailTypeUndefined: Self = StObject.set(x, "detailType", js.undefined)
      
      @scala.inline
      def setEventTypeIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "eventTypeIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTypeIdsUndefined: Self = StObject.set(x, "eventTypeIds", js.undefined)
      
      @scala.inline
      def setEventTypeIdsVarargs(value: Input[String]*): Self = StObject.set(x, "eventTypeIds", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargets(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]]
            ]
      ): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.codestarnotifications.NotificationRuleTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
}
