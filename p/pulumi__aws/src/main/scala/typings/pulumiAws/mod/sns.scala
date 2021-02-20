package typings.pulumiAws.mod

import typings.pulumiAws.getTopicMod.GetTopicArgs
import typings.pulumiAws.getTopicMod.GetTopicResult
import typings.pulumiAws.platformApplicationMod.PlatformApplicationArgs
import typings.pulumiAws.platformApplicationMod.PlatformApplicationState
import typings.pulumiAws.smsPreferencesMod.SmsPreferencesArgs
import typings.pulumiAws.smsPreferencesMod.SmsPreferencesState
import typings.pulumiAws.snsMixinsMod.TopicEventHandler
import typings.pulumiAws.snsMixinsMod.TopicEventSubscriptionArgs
import typings.pulumiAws.topicMod.TopicArgs
import typings.pulumiAws.topicMod.TopicState
import typings.pulumiAws.topicPolicyMod.TopicPolicyArgs
import typings.pulumiAws.topicPolicyMod.TopicPolicyState
import typings.pulumiAws.topicSubscriptionMod.TopicSubscriptionArgs
import typings.pulumiAws.topicSubscriptionMod.TopicSubscriptionState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sns {
  
  @JSImport("@pulumi/aws", "sns.PlatformApplication")
  @js.native
  class PlatformApplication protected ()
    extends typings.pulumiAws.snsMod.PlatformApplication {
    /**
      * Create a PlatformApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: PlatformApplicationArgs) = this()
    def this(name: String, args: PlatformApplicationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object PlatformApplication {
    
    /**
      * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState): typings.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    @JSImport("@pulumi/aws", "sns.PlatformApplication.get")
    @js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): typings.pulumiAws.platformApplicationMod.PlatformApplication = js.native
    
    /**
      * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.PlatformApplication.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.SmsPreferences")
  @js.native
  class SmsPreferences protected ()
    extends typings.pulumiAws.snsMod.SmsPreferences {
    /**
      * Create a SmsPreferences resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SmsPreferencesArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SmsPreferences {
    
    /**
      * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState): typings.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    @JSImport("@pulumi/aws", "sns.SmsPreferences.get")
    @js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): typings.pulumiAws.smsPreferencesMod.SmsPreferences = js.native
    
    /**
      * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.SmsPreferences.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.Topic")
  @js.native
  class Topic protected ()
    extends typings.pulumiAws.snsMod.Topic {
    /**
      * Create a Topic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TopicArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TopicArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Topic {
    
    /**
      * Get an existing Topic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicState): typings.pulumiAws.topicMod.Topic = js.native
    @JSImport("@pulumi/aws", "sns.Topic.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicState, opts: CustomResourceOptions): typings.pulumiAws.topicMod.Topic = js.native
    
    /**
      * Returns true if the given object is an instance of Topic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.Topic.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topic.Topic */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.TopicEventSubscription")
  @js.native
  class TopicEventSubscription protected ()
    extends typings.pulumiAws.snsMod.TopicEventSubscription {
    def this(name: String, topic: typings.pulumiAws.topicMod.Topic, handler: TopicEventHandler) = this()
    def this(
      name: String,
      topic: typings.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      topic: typings.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ) = this()
    def this(
      name: String,
      topic: typings.pulumiAws.topicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @JSImport("@pulumi/aws", "sns.TopicPolicy")
  @js.native
  class TopicPolicy protected ()
    extends typings.pulumiAws.snsMod.TopicPolicy {
    /**
      * Create a TopicPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicPolicyArgs) = this()
    def this(name: String, args: TopicPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TopicPolicy {
    
    /**
      * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState): typings.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    @JSImport("@pulumi/aws", "sns.TopicPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): typings.pulumiAws.topicPolicyMod.TopicPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.TopicPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.TopicSubscription")
  @js.native
  class TopicSubscription protected ()
    extends typings.pulumiAws.snsMod.TopicSubscription {
    /**
      * Create a TopicSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TopicSubscriptionArgs) = this()
    def this(name: String, args: TopicSubscriptionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TopicSubscription {
    
    /**
      * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState): typings.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    @JSImport("@pulumi/aws", "sns.TopicSubscription.get")
    @js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): typings.pulumiAws.topicSubscriptionMod.TopicSubscription = js.native
    
    /**
      * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "sns.TopicSubscription.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "sns.getTopic")
  @js.native
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] = js.native
  @JSImport("@pulumi/aws", "sns.getTopic")
  @js.native
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = js.native
  
  /* augmented module */
  object pulumiAwsSnsTopicAugmentingMod {
    
    @js.native
    trait Topic extends StObject {
      
      /**
        * Creates a new subscription to events fired from this Topic to the handler provided, along
        * with options to control the behavior of the subscription.
        */
      def onEvent(name: String, handler: TopicEventHandler): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TopicEventHandler,
        args: js.UndefOr[scala.Nothing],
        opts: ComponentResourceOptions
      ): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(name: String, handler: TopicEventHandler, args: TopicEventSubscriptionArgs): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
      def onEvent(
        name: String,
        handler: TopicEventHandler,
        args: TopicEventSubscriptionArgs,
        opts: ComponentResourceOptions
      ): typings.pulumiAws.snsMixinsMod.TopicEventSubscription = js.native
    }
  }
}
