package typings.pulumiAws

import typings.pulumiAws.firewallMod.FirewallArgs
import typings.pulumiAws.firewallMod.FirewallState
import typings.pulumiAws.firewallPolicyMod.FirewallPolicyArgs
import typings.pulumiAws.firewallPolicyMod.FirewallPolicyState
import typings.pulumiAws.loggingConfigurationMod.LoggingConfigurationArgs
import typings.pulumiAws.loggingConfigurationMod.LoggingConfigurationState
import typings.pulumiAws.ruleGroupMod.RuleGroupArgs
import typings.pulumiAws.ruleGroupMod.RuleGroupState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkfirewallMod {
  
  @JSImport("@pulumi/aws/networkfirewall", "Firewall")
  @js.native
  class Firewall protected ()
    extends typings.pulumiAws.firewallMod.Firewall {
    /**
      * Create a Firewall resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallArgs) = this()
    def this(name: String, args: FirewallArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Firewall {
    
    /**
      * Get an existing Firewall resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/networkfirewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.firewallMod.Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.firewallMod.Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallState): typings.pulumiAws.firewallMod.Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallState, opts: CustomResourceOptions): typings.pulumiAws.firewallMod.Firewall = js.native
    
    /**
      * Returns true if the given object is an instance of Firewall.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall", "Firewall.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewall.Firewall */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy")
  @js.native
  class FirewallPolicy protected ()
    extends typings.pulumiAws.firewallPolicyMod.FirewallPolicy {
    /**
      * Create a FirewallPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallPolicyArgs) = this()
    def this(name: String, args: FirewallPolicyArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object FirewallPolicy {
    
    /**
      * Get an existing FirewallPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState): typings.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState, opts: CustomResourceOptions): typings.pulumiAws.firewallPolicyMod.FirewallPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FirewallPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall", "FirewallPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewallPolicy.FirewallPolicy */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration")
  @js.native
  class LoggingConfiguration protected ()
    extends typings.pulumiAws.loggingConfigurationMod.LoggingConfiguration {
    /**
      * Create a LoggingConfiguration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoggingConfigurationArgs) = this()
    def this(name: String, args: LoggingConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object LoggingConfiguration {
    
    /**
      * Get an existing LoggingConfiguration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoggingConfigurationState): typings.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoggingConfigurationState, opts: CustomResourceOptions): typings.pulumiAws.loggingConfigurationMod.LoggingConfiguration = js.native
    
    /**
      * Returns true if the given object is an instance of LoggingConfiguration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall", "LoggingConfiguration.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/loggingConfiguration.LoggingConfiguration */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/networkfirewall", "RuleGroup")
  @js.native
  class RuleGroup protected ()
    extends typings.pulumiAws.ruleGroupMod.RuleGroup {
    /**
      * Create a RuleGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RuleGroupArgs) = this()
    def this(name: String, args: RuleGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RuleGroup {
    
    /**
      * Get an existing RuleGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/networkfirewall", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.ruleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/networkfirewall", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ruleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/networkfirewall", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState): typings.pulumiAws.ruleGroupMod.RuleGroup = js.native
    @JSImport("@pulumi/aws/networkfirewall", "RuleGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: RuleGroupState, opts: CustomResourceOptions): typings.pulumiAws.ruleGroupMod.RuleGroup = js.native
    
    /**
      * Returns true if the given object is an instance of RuleGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall", "RuleGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/ruleGroup.RuleGroup */ Boolean = js.native
  }
}
