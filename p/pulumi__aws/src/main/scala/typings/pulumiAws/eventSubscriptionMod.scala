package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventSubscriptionMod {
  
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
  object EventSubscription {
    
    @JSImport("@pulumi/aws/dms/eventSubscription", "EventSubscription")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing EventSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
    inline def get(name: String, id: Input[ID], state: EventSubscriptionState): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
    inline def get(name: String, id: Input[ID], state: EventSubscriptionState, opts: CustomResourceOptions): EventSubscription = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[EventSubscription]
    
    /**
      * Returns true if the given object is an instance of EventSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/eventSubscription.EventSubscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/dms/eventSubscription.EventSubscription */ Boolean]
  }
  
  trait EventSubscriptionArgs extends StObject {
    
    /**
      * Whether the event subscription should be enabled.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
      */
    val eventCategories: Input[js.Array[Input[String]]]
    
    /**
      * Name of event subscription.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * SNS topic arn to send events on.
      */
    val snsTopicArn: Input[String]
    
    /**
      * Ids of sources to listen to.
      */
    val sourceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Type of source for events. Valid values: `replication-instance` or `replication-task`
      */
    val sourceType: js.UndefOr[Input[String]] = js.undefined
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EventSubscriptionArgs {
    
    inline def apply(eventCategories: Input[js.Array[Input[String]]], snsTopicArn: Input[String]): EventSubscriptionArgs = {
      val __obj = js.Dynamic.literal(eventCategories = eventCategories.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSubscriptionArgs]
    }
    
    extension [Self <: EventSubscriptionArgs](x: Self) {
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEventCategories(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "eventCategories", value.asInstanceOf[js.Any])
      
      inline def setEventCategoriesVarargs(value: Input[String]*): Self = StObject.set(x, "eventCategories", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      inline def setSourceIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "sourceIds", value.asInstanceOf[js.Any])
      
      inline def setSourceIdsUndefined: Self = StObject.set(x, "sourceIds", js.undefined)
      
      inline def setSourceIdsVarargs(value: Input[String]*): Self = StObject.set(x, "sourceIds", js.Array(value :_*))
      
      inline def setSourceType(value: Input[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait EventSubscriptionState extends StObject {
    
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether the event subscription should be enabled.
      */
    val enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
      */
    val eventCategories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Name of event subscription.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * SNS topic arn to send events on.
      */
    val snsTopicArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Ids of sources to listen to.
      */
    val sourceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Type of source for events. Valid values: `replication-instance` or `replication-task`
      */
    val sourceType: js.UndefOr[Input[String]] = js.undefined
    
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object EventSubscriptionState {
    
    inline def apply(): EventSubscriptionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventSubscriptionState]
    }
    
    extension [Self <: EventSubscriptionState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEventCategories(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "eventCategories", value.asInstanceOf[js.Any])
      
      inline def setEventCategoriesUndefined: Self = StObject.set(x, "eventCategories", js.undefined)
      
      inline def setEventCategoriesVarargs(value: Input[String]*): Self = StObject.set(x, "eventCategories", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSnsTopicArn(value: Input[String]): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
      
      inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
      
      inline def setSourceIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "sourceIds", value.asInstanceOf[js.Any])
      
      inline def setSourceIdsUndefined: Self = StObject.set(x, "sourceIds", js.undefined)
      
      inline def setSourceIdsVarargs(value: Input[String]*): Self = StObject.set(x, "sourceIds", js.Array(value :_*))
      
      inline def setSourceType(value: Input[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
