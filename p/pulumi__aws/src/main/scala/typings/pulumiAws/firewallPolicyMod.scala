package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.networkfirewall.FirewallPolicyFirewallPolicy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firewallPolicyMod {
  
  @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy")
  @js.native
  class FirewallPolicy protected () extends CustomResource {
    /**
      * Create a FirewallPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallPolicyArgs) = this()
    def this(name: String, args: FirewallPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the firewall policy.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A friendly description of the firewall policy.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
      */
    val firewallPolicy: Output_[FirewallPolicyFirewallPolicy] = js.native
    
    /**
      * A friendly name of the firewall policy.
      */
    val name: Output_[String] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A string token used when updating a firewall policy.
      */
    val updateToken: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState): FirewallPolicy = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallPolicyState, opts: CustomResourceOptions): FirewallPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of FirewallPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall/firewallPolicy", "FirewallPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewallPolicy.FirewallPolicy */ Boolean = js.native
  }
  
  @js.native
  trait FirewallPolicyArgs extends StObject {
    
    /**
      * A friendly description of the firewall policy.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
      */
    val firewallPolicy: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy] = js.native
    
    /**
      * A friendly name of the firewall policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object FirewallPolicyArgs {
    
    @scala.inline
    def apply(firewallPolicy: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy]): FirewallPolicyArgs = {
      val __obj = js.Dynamic.literal(firewallPolicy = firewallPolicy.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirewallPolicyArgs]
    }
    
    @scala.inline
    implicit class FirewallPolicyArgsMutableBuilder[Self <: FirewallPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFirewallPolicy(value: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy]): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait FirewallPolicyState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the firewall policy.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly description of the firewall policy.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * A configuration block describing the rule groups and policy actions to use in the firewall policy. See Firewall Policy below for details.
      */
    val firewallPolicy: js.UndefOr[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy]] = js.native
    
    /**
      * A friendly name of the firewall policy.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * An array of key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A string token used when updating a firewall policy.
      */
    val updateToken: js.UndefOr[Input[String]] = js.native
  }
  object FirewallPolicyState {
    
    @scala.inline
    def apply(): FirewallPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirewallPolicyState]
    }
    
    @scala.inline
    implicit class FirewallPolicyStateMutableBuilder[Self <: FirewallPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFirewallPolicy(value: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallPolicyFirewallPolicy]): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUpdateToken(value: Input[String]): Self = StObject.set(x, "updateToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTokenUndefined: Self = StObject.set(x, "updateToken", js.undefined)
    }
  }
}
