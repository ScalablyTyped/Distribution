package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns")
@js.native
object snsNs extends js.Object {
  @js.native
  class PlatformApplication protected ()
    extends atPulumiAwsLib.snsMod.PlatformApplication {
    /**
      * Create a PlatformApplication resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SmsPreferences protected ()
    extends atPulumiAwsLib.snsMod.SmsPreferences {
    /**
      * Create a SmsPreferences resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferencesArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferencesArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Topic protected ()
    extends atPulumiAwsLib.snsMod.Topic {
    /**
      * Create a Topic resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicMod.TopicArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicMod.TopicArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicEventSubscription protected ()
    extends atPulumiAwsLib.snsMod.TopicEventSubscription {
    def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler, args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs) = this()
    def this(name: java.lang.String, topic: atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic, handler: atPulumiAwsLib.snsSnsMixinsMod.TopicEventHandler, args: atPulumiAwsLib.snsSnsMixinsMod.TopicEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  }
  
  @js.native
  class TopicPolicy protected ()
    extends atPulumiAwsLib.snsMod.TopicPolicy {
    /**
      * Create a TopicPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TopicSubscription protected ()
    extends atPulumiAwsLib.snsMod.TopicSubscription {
    /**
      * Create a TopicSubscription resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscriptionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getTopic(args: atPulumiAwsLib.snsGetTopicMod.GetTopicArgs): js.Promise[atPulumiAwsLib.snsGetTopicMod.GetTopicResult] = js.native
  def getTopic(args: atPulumiAwsLib.snsGetTopicMod.GetTopicArgs, opts: atPulumiPulumiLib.invokeMod.InvokeOptions): js.Promise[atPulumiAwsLib.snsGetTopicMod.GetTopicResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationState
    ): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferences = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferencesState
    ): atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferences = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferencesState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.snsSmsPreferencesMod.SmsPreferences = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicMod.TopicState
    ): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicMod.TopicState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.snsSnsMixinsMod.snsTopicMod.Topic = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyState
    ): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicPolicyMod.TopicPolicyState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.snsTopicPolicyMod.TopicPolicy = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscriptionState
    ): atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscription = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscriptionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.snsTopicSubscriptionMod.TopicSubscription = js.native
  }
  
}

