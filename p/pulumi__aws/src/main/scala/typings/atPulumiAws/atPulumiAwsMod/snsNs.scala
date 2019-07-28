package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.snsGetTopicMod.GetTopicArgs
import typings.atPulumiAws.snsGetTopicMod.GetTopicResult
import typings.atPulumiAws.snsPlatformApplicationMod.PlatformApplicationArgs
import typings.atPulumiAws.snsPlatformApplicationMod.PlatformApplicationState
import typings.atPulumiAws.snsSmsPreferencesMod.SmsPreferencesArgs
import typings.atPulumiAws.snsSmsPreferencesMod.SmsPreferencesState
import typings.atPulumiAws.snsSnsMixinsMod.TopicEventHandler
import typings.atPulumiAws.snsSnsMixinsMod.TopicEventSubscriptionArgs
import typings.atPulumiAws.snsTopicMod.TopicArgs
import typings.atPulumiAws.snsTopicMod.TopicState
import typings.atPulumiAws.snsTopicPolicyMod.TopicPolicyArgs
import typings.atPulumiAws.snsTopicPolicyMod.TopicPolicyState
import typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscriptionArgs
import typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscriptionState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns")
@js.native
object snsNs extends js.Object {
  @js.native
  class PlatformApplication protected ()
    extends typings.atPulumiAws.snsMod.PlatformApplication {
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
  
  @js.native
  class SmsPreferences protected ()
    extends typings.atPulumiAws.snsMod.SmsPreferences {
    /**
      * Create a SmsPreferences resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SmsPreferencesArgs) = this()
    def this(name: String, args: SmsPreferencesArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Topic protected ()
    extends typings.atPulumiAws.snsMod.Topic {
    /**
      * Create a Topic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TopicArgs) = this()
    def this(name: String, args: TopicArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicEventSubscription protected ()
    extends typings.atPulumiAws.snsMod.TopicEventSubscription {
    def this(
      name: String,
      topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
      handler: TopicEventHandler
    ) = this()
    def this(
      name: String,
      topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs
    ) = this()
    def this(
      name: String,
      topic: typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic,
      handler: TopicEventHandler,
      args: TopicEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ) = this()
  }
  
  @js.native
  class TopicPolicy protected ()
    extends typings.atPulumiAws.snsMod.TopicPolicy {
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
  
  @js.native
  class TopicSubscription protected ()
    extends typings.atPulumiAws.snsMod.TopicSubscription {
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
  
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] with GetTopicResult = js.native
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] with GetTopicResult = js.native
  /* static members */
  @js.native
  object PlatformApplication extends js.Object {
    /**
      * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.snsPlatformApplicationMod.PlatformApplication = js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState): typings.atPulumiAws.snsPlatformApplicationMod.PlatformApplication = js.native
    def get(name: String, id: Input[ID], state: PlatformApplicationState, opts: CustomResourceOptions): typings.atPulumiAws.snsPlatformApplicationMod.PlatformApplication = js.native
    /**
      * Returns true if the given object is an instance of PlatformApplication.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/platformApplication.PlatformApplication */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SmsPreferences extends js.Object {
    /**
      * Get an existing SmsPreferences resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState): typings.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
    def get(name: String, id: Input[ID], state: SmsPreferencesState, opts: CustomResourceOptions): typings.atPulumiAws.snsSmsPreferencesMod.SmsPreferences = js.native
    /**
      * Returns true if the given object is an instance of SmsPreferences.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/smsPreferences.SmsPreferences */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Topic extends js.Object {
    /**
      * Get an existing Topic resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
    def get(name: String, id: Input[ID], state: TopicState): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
    def get(name: String, id: Input[ID], state: TopicState, opts: CustomResourceOptions): typings.atPulumiAws.snsSnsMixinsMod.snsTopicMod.Topic = js.native
    /**
      * Returns true if the given object is an instance of Topic.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/snsMixins.@pulumi/aws/sns/topic.Topic */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TopicPolicy extends js.Object {
    /**
      * Get an existing TopicPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
    def get(name: String, id: Input[ID], state: TopicPolicyState, opts: CustomResourceOptions): typings.atPulumiAws.snsTopicPolicyMod.TopicPolicy = js.native
    /**
      * Returns true if the given object is an instance of TopicPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicPolicy.TopicPolicy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object TopicSubscription extends js.Object {
    /**
      * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscription = js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState): typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscription = js.native
    def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): typings.atPulumiAws.snsTopicSubscriptionMod.TopicSubscription = js.native
    /**
      * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
  }
  
}

