package typings.pulumiAws

import typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorizationArgs
import typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorizationState
import typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregatorArgs
import typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregatorState
import typings.pulumiAws.deliveryChannelMod.DeliveryChannelArgs
import typings.pulumiAws.deliveryChannelMod.DeliveryChannelState
import typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRuleArgs
import typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRuleState
import typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRuleArgs
import typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRuleState
import typings.pulumiAws.recorderMod.RecorderArgs
import typings.pulumiAws.recorderMod.RecorderState
import typings.pulumiAws.recorderStatusMod.RecorderStatusArgs
import typings.pulumiAws.recorderStatusMod.RecorderStatusState
import typings.pulumiAws.ruleMod.RuleArgs
import typings.pulumiAws.ruleMod.RuleState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", JSImport.Namespace)
@js.native
object cfgMod extends js.Object {
  @js.native
  class AggregateAuthorization protected ()
    extends typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization {
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
    extends typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationAggregatorArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DeliveryChannel protected ()
    extends typings.pulumiAws.deliveryChannelMod.DeliveryChannel {
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
    extends typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule {
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
    extends typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule {
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
    extends typings.pulumiAws.recorderMod.Recorder {
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
    extends typings.pulumiAws.recorderStatusMod.RecorderStatus {
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
    extends typings.pulumiAws.ruleMod.Rule {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
    def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
    def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
    def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
    def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.recorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.recorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState): typings.pulumiAws.recorderMod.Recorder = js.native
    def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): typings.pulumiAws.recorderMod.Recorder = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState): typings.pulumiAws.recorderStatusMod.RecorderStatus = js.native
    def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): typings.pulumiAws.recorderStatusMod.RecorderStatus = js.native
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.ruleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ruleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState): typings.pulumiAws.ruleMod.Rule = js.native
    def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.pulumiAws.ruleMod.Rule = js.native
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = js.native
  }
  
}

