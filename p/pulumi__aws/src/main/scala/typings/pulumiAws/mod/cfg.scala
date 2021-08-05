package typings.pulumiAws.mod

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
import typings.pulumiAws.remediationConfigurationMod.RemediationConfigurationArgs
import typings.pulumiAws.remediationConfigurationMod.RemediationConfigurationState
import typings.pulumiAws.ruleMod.RuleArgs
import typings.pulumiAws.ruleMod.RuleState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfg {
  
  @JSImport("@pulumi/aws", "cfg.AggregateAuthorization")
  @js.native
  class AggregateAuthorization protected ()
    extends typings.pulumiAws.cfgMod.AggregateAuthorization {
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
  /* static members */
  object AggregateAuthorization {
    
    @JSImport("@pulumi/aws", "cfg.AggregateAuthorization")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AggregateAuthorization resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: AggregateAuthorizationState): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization]
    inline def get(name: String, id: Input[ID], state: AggregateAuthorizationState, opts: CustomResourceOptions): typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.aggregateAuthorizationMod.AggregateAuthorization]
    
    /**
      * Returns true if the given object is an instance of AggregateAuthorization.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/aggregateAuthorization.AggregateAuthorization */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.ConfigurationAggregator")
  @js.native
  class ConfigurationAggregator protected ()
    extends typings.pulumiAws.cfgMod.ConfigurationAggregator {
    /**
      * Create a ConfigurationAggregator resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ConfigurationAggregatorArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ConfigurationAggregatorArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ConfigurationAggregator {
    
    @JSImport("@pulumi/aws", "cfg.ConfigurationAggregator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ConfigurationAggregator resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: ConfigurationAggregatorState): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator]
    inline def get(name: String, id: Input[ID], state: ConfigurationAggregatorState, opts: CustomResourceOptions): typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.configurationAggregatorMod.ConfigurationAggregator]
    
    /**
      * Returns true if the given object is an instance of ConfigurationAggregator.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/configurationAggregator.ConfigurationAggregator */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.DeliveryChannel")
  @js.native
  class DeliveryChannel protected ()
    extends typings.pulumiAws.cfgMod.DeliveryChannel {
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
  /* static members */
  object DeliveryChannel {
    
    @JSImport("@pulumi/aws", "cfg.DeliveryChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DeliveryChannel resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deliveryChannelMod.DeliveryChannel]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deliveryChannelMod.DeliveryChannel]
    inline def get(name: String, id: Input[ID], state: DeliveryChannelState): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deliveryChannelMod.DeliveryChannel]
    inline def get(name: String, id: Input[ID], state: DeliveryChannelState, opts: CustomResourceOptions): typings.pulumiAws.deliveryChannelMod.DeliveryChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.deliveryChannelMod.DeliveryChannel]
    
    /**
      * Returns true if the given object is an instance of DeliveryChannel.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/deliveryChannel.DeliveryChannel */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.OrganizationCustomRule")
  @js.native
  class OrganizationCustomRule protected ()
    extends typings.pulumiAws.cfgMod.OrganizationCustomRule {
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
  /* static members */
  object OrganizationCustomRule {
    
    @JSImport("@pulumi/aws", "cfg.OrganizationCustomRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationCustomRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule]
    inline def get(name: String, id: Input[ID], state: OrganizationCustomRuleState): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule]
    inline def get(name: String, id: Input[ID], state: OrganizationCustomRuleState, opts: CustomResourceOptions): typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationCustomRuleMod.OrganizationCustomRule]
    
    /**
      * Returns true if the given object is an instance of OrganizationCustomRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/organizationCustomRule.OrganizationCustomRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.OrganizationManagedRule")
  @js.native
  class OrganizationManagedRule protected ()
    extends typings.pulumiAws.cfgMod.OrganizationManagedRule {
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
  /* static members */
  object OrganizationManagedRule {
    
    @JSImport("@pulumi/aws", "cfg.OrganizationManagedRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing OrganizationManagedRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule]
    inline def get(name: String, id: Input[ID], state: OrganizationManagedRuleState): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule]
    inline def get(name: String, id: Input[ID], state: OrganizationManagedRuleState, opts: CustomResourceOptions): typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.organizationManagedRuleMod.OrganizationManagedRule]
    
    /**
      * Returns true if the given object is an instance of OrganizationManagedRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/organizationManagedRule.OrganizationManagedRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.Recorder")
  @js.native
  class Recorder protected ()
    extends typings.pulumiAws.cfgMod.Recorder {
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
  /* static members */
  object Recorder {
    
    @JSImport("@pulumi/aws", "cfg.Recorder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Recorder resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.recorderMod.Recorder = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderMod.Recorder]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.recorderMod.Recorder = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderMod.Recorder]
    inline def get(name: String, id: Input[ID], state: RecorderState): typings.pulumiAws.recorderMod.Recorder = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderMod.Recorder]
    inline def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): typings.pulumiAws.recorderMod.Recorder = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderMod.Recorder]
    
    /**
      * Returns true if the given object is an instance of Recorder.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.RecorderStatus")
  @js.native
  class RecorderStatus protected ()
    extends typings.pulumiAws.cfgMod.RecorderStatus {
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
  /* static members */
  object RecorderStatus {
    
    @JSImport("@pulumi/aws", "cfg.RecorderStatus")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.recorderStatusMod.RecorderStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderStatusMod.RecorderStatus]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.recorderStatusMod.RecorderStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderStatusMod.RecorderStatus]
    inline def get(name: String, id: Input[ID], state: RecorderStatusState): typings.pulumiAws.recorderStatusMod.RecorderStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderStatusMod.RecorderStatus]
    inline def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): typings.pulumiAws.recorderStatusMod.RecorderStatus = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.recorderStatusMod.RecorderStatus]
    
    /**
      * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.RemediationConfiguration")
  @js.native
  class RemediationConfiguration protected ()
    extends typings.pulumiAws.cfgMod.RemediationConfiguration {
    /**
      * Create a RemediationConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RemediationConfigurationArgs) = this()
    def this(name: String, args: RemediationConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RemediationConfiguration {
    
    @JSImport("@pulumi/aws", "cfg.RemediationConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RemediationConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration]
    inline def get(name: String, id: Input[ID], state: RemediationConfigurationState): typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration]
    inline def get(name: String, id: Input[ID], state: RemediationConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.remediationConfigurationMod.RemediationConfiguration]
    
    /**
      * Returns true if the given object is an instance of RemediationConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/remediationConfiguration.RemediationConfiguration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/remediationConfiguration.RemediationConfiguration */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "cfg.Rule")
  @js.native
  class Rule protected ()
    extends typings.pulumiAws.cfgMod.Rule {
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
  object Rule {
    
    @JSImport("@pulumi/aws", "cfg.Rule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Rule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.ruleMod.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ruleMod.Rule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ruleMod.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ruleMod.Rule]
    inline def get(name: String, id: Input[ID], state: RuleState): typings.pulumiAws.ruleMod.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ruleMod.Rule]
    inline def get(name: String, id: Input[ID], state: RuleState, opts: CustomResourceOptions): typings.pulumiAws.ruleMod.Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ruleMod.Rule]
    
    /**
      * Returns true if the given object is an instance of Rule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cfg/rule.Rule */ Boolean]
  }
}
