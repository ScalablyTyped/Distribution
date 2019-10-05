package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorizationArgs
import typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorizationState
import typings.atPulumiAws.cfgConfigurationAggregatorMod.ConfigurationAggregatorArgs
import typings.atPulumiAws.cfgConfigurationAggregatorMod.ConfigurationAggregatorState
import typings.atPulumiAws.cfgDeliveryChannelMod.DeliveryChannelArgs
import typings.atPulumiAws.cfgDeliveryChannelMod.DeliveryChannelState
import typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRuleArgs
import typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRuleState
import typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRuleArgs
import typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRuleState
import typings.atPulumiAws.cfgRecorderMod.RecorderArgs
import typings.atPulumiAws.cfgRecorderMod.RecorderState
import typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatusArgs
import typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatusState
import typings.atPulumiAws.cfgRuleMod.RuleArgs
import typings.atPulumiAws.cfgRuleMod.RuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cfg")
@js.native
object cfg extends js.Object {
  @js.native
  class AggregateAuthorization protected ()
    extends typings.atPulumiAws.cfgMod.AggregateAuthorization {
    /**
      * Create a AggregateAuthorization resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AggregateAuthorizationArgs) = this()
    def this(name: String, args: AggregateAuthorizationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ConfigurationAggregator protected ()
    extends typings.atPulumiAws.cfgMod.ConfigurationAggregator {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationAggregatorArgs) = this()
    def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DeliveryChannel protected ()
    extends typings.atPulumiAws.cfgMod.DeliveryChannel {
    /**
      * Create a DeliveryChannel resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DeliveryChannelArgs) = this()
    def this(name: String, args: DeliveryChannelArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationCustomRule protected ()
    extends typings.atPulumiAws.cfgMod.OrganizationCustomRule {
    /**
      * Create a OrganizationCustomRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationCustomRuleArgs) = this()
    def this(name: String, args: OrganizationCustomRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class OrganizationManagedRule protected ()
    extends typings.atPulumiAws.cfgMod.OrganizationManagedRule {
    /**
      * Create a OrganizationManagedRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: OrganizationManagedRuleArgs) = this()
    def this(name: String, args: OrganizationManagedRuleArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Recorder protected ()
    extends typings.atPulumiAws.cfgMod.Recorder {
    /**
      * Create a Recorder resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderArgs) = this()
    def this(name: String, args: RecorderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class RecorderStatus protected ()
    extends typings.atPulumiAws.cfgMod.RecorderStatus {
    /**
      * Create a RecorderStatus resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RecorderStatusArgs) = this()
    def this(name: String, args: RecorderStatusArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Rule protected ()
    extends typings.atPulumiAws.cfgMod.Rule {
    /**
      * Create a Rule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleArgs) = this()
    def this(name: String, args: RuleArgs, opts: CustomResourceOptions) = this()
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): typings.atPulumiAws.cfgAggregateAuthorizationMod.AggregateAuthorization = js.native
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): typings.atPulumiAws.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): typings.atPulumiAws.cfgConfigurationAggregatorMod.ConfigurationAggregator = js.native
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgDeliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState): typings.atPulumiAws.cfgDeliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): typings.atPulumiAws.cfgDeliveryChannelMod.DeliveryChannel = js.native
    /**
      * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationCustomRule extends js.Object {
    /**
      * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): typings.atPulumiAws.cfgOrganizationCustomRuleMod.OrganizationCustomRule = js.native
    /**
      * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object OrganizationManagedRule extends js.Object {
    /**
      * Get an existing OrganizationManagedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): typings.atPulumiAws.cfgOrganizationManagedRuleMod.OrganizationManagedRule = js.native
    /**
      * Returns true if the given object is an instance of OrganizationManagedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
    /**
      * Returns true if the given object is an instance of Recorder.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
    /**
      * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState): typings.atPulumiAws.cfgRuleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.atPulumiAws.cfgRuleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = js.native
  }
  
}

