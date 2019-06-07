package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cfg")
@js.native
object cfgNs extends js.Object {
  @js.native
  class AggregateAuthorization protected ()
    extends atPulumiAwsLib.cfgMod.AggregateAuthorization {
    /**
      * Create a AggregateAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorizationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorizationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationAggregator protected ()
    extends atPulumiAwsLib.cfgMod.ConfigurationAggregator {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class DeliveryChannel protected ()
    extends atPulumiAwsLib.cfgMod.DeliveryChannel {
    /**
      * Create a DeliveryChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Recorder protected ()
    extends atPulumiAwsLib.cfgMod.Recorder {
    /**
      * Create a Recorder resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRecorderMod.RecorderArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRecorderMod.RecorderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class RecorderStatus protected ()
    extends atPulumiAwsLib.cfgMod.RecorderStatus {
    /**
      * Create a RecorderStatus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Rule protected ()
    extends atPulumiAwsLib.cfgMod.Rule {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRuleMod.RuleArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cfgRuleMod.RuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object AggregateAuthorization extends js.Object {
    /**
      * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorizationState
    ): atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorizationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ConfigurationAggregator extends js.Object {
    /**
      * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorState
    ): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregatorState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DeliveryChannel extends js.Object {
    /**
      * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState
    ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannelState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgDeliveryChannelMod.DeliveryChannel = js.native
    /**
      * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Recorder extends js.Object {
    /**
      * Get an existing Recorder resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRecorderMod.RecorderState
    ): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRecorderMod.RecorderState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgRecorderMod.Recorder = js.native
    /**
      * Returns true if the given object is an instance of Recorder.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RecorderStatus extends js.Object {
    /**
      * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusState
    ): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatusState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgRecorderStatusMod.RecorderStatus = js.native
    /**
      * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Rule extends js.Object {
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cfgRuleMod.Rule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRuleMod.RuleState
    ): atPulumiAwsLib.cfgRuleMod.Rule = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cfgRuleMod.RuleState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cfgRuleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ scala.Boolean = js.native
  }
  
}

