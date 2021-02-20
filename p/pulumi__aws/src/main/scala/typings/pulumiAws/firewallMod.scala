package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.networkfirewall.FirewallSubnetMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firewallMod {
  
  @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall")
  @js.native
  class Firewall protected () extends CustomResource {
    /**
      * Create a Firewall resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirewallArgs) = this()
    def this(name: String, args: FirewallArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) that identifies the firewall.
      */
    val arn: Output_[String] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
      */
    val deleteProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A friendly description of the firewall.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC Firewall policy.
      */
    val firewallPolicyArn: Output_[String] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
      */
    val firewallPolicyChangeProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A friendly name of the firewall.
      */
    val name: Output_[String] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
      */
    val subnetChangeProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
      */
    val subnetMappings: Output_[js.Array[FirewallSubnetMapping]] = js.native
    
    /**
      * The key:value pairs to associate with the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A string token used when updating a firewall.
      */
    val updateToken: Output_[String] = js.native
    
    /**
      * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
      */
    val vpcId: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID]): Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallState): Firewall = js.native
    @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall.get")
    @js.native
    def get(name: String, id: Input[ID], state: FirewallState, opts: CustomResourceOptions): Firewall = js.native
    
    /**
      * Returns true if the given object is an instance of Firewall.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/networkfirewall/firewall", "Firewall.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/networkfirewall/firewall.Firewall */ Boolean = js.native
  }
  
  @js.native
  trait FirewallArgs extends StObject {
    
    /**
      * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
      */
    val deleteProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A friendly description of the firewall.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC Firewall policy.
      */
    val firewallPolicyArn: Input[String] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
      */
    val firewallPolicyChangeProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A friendly name of the firewall.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
      */
    val subnetChangeProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
      */
    val subnetMappings: Input[
        js.Array[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]]
      ] = js.native
    
    /**
      * The key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
      */
    val vpcId: Input[String] = js.native
  }
  object FirewallArgs {
    
    @scala.inline
    def apply(
      firewallPolicyArn: Input[String],
      subnetMappings: Input[
          js.Array[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]]
        ],
      vpcId: Input[String]
    ): FirewallArgs = {
      val __obj = js.Dynamic.literal(firewallPolicyArn = firewallPolicyArn.asInstanceOf[js.Any], subnetMappings = subnetMappings.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirewallArgs]
    }
    
    @scala.inline
    implicit class FirewallArgsMutableBuilder[Self <: FirewallArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteProtection(value: Input[Boolean]): Self = StObject.set(x, "deleteProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteProtectionUndefined: Self = StObject.set(x, "deleteProtection", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFirewallPolicyArn(value: Input[String]): Self = StObject.set(x, "firewallPolicyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirewallPolicyChangeProtection(value: Input[Boolean]): Self = StObject.set(x, "firewallPolicyChangeProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "firewallPolicyChangeProtection", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubnetChangeProtection(value: Input[Boolean]): Self = StObject.set(x, "subnetChangeProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "subnetChangeProtection", js.undefined)
      
      @scala.inline
      def setSubnetMappings(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]]
            ]
      ): Self = StObject.set(x, "subnetMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetMappingsVarargs(value: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]*): Self = StObject.set(x, "subnetMappings", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FirewallState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) that identifies the firewall.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to delete the firewall. Defaults to `false`.
      */
    val deleteProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A friendly description of the firewall.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC Firewall policy.
      */
    val firewallPolicyArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated firewall policy. Defaults to `false`.
      */
    val firewallPolicyChangeProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * A friendly name of the firewall.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean flag indicating whether it is possible to change the associated subnet(s). Defaults to `false`.
      */
    val subnetChangeProtection: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Set of configuration blocks describing the public subnets. Each subnet must belong to a different Availability Zone in the VPC. AWS Network Firewall creates a firewall endpoint in each subnet. See Subnet Mapping below for details.
      */
    val subnetMappings: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]]
        ]
      ] = js.native
    
    /**
      * The key:value pairs to associate with the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * A string token used when updating a firewall.
      */
    val updateToken: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier of the VPC where AWS Network Firewall should create the firewall.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object FirewallState {
    
    @scala.inline
    def apply(): FirewallState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirewallState]
    }
    
    @scala.inline
    implicit class FirewallStateMutableBuilder[Self <: FirewallState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDeleteProtection(value: Input[Boolean]): Self = StObject.set(x, "deleteProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleteProtectionUndefined: Self = StObject.set(x, "deleteProtection", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFirewallPolicyArn(value: Input[String]): Self = StObject.set(x, "firewallPolicyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirewallPolicyArnUndefined: Self = StObject.set(x, "firewallPolicyArn", js.undefined)
      
      @scala.inline
      def setFirewallPolicyChangeProtection(value: Input[Boolean]): Self = StObject.set(x, "firewallPolicyChangeProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirewallPolicyChangeProtectionUndefined: Self = StObject.set(x, "firewallPolicyChangeProtection", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubnetChangeProtection(value: Input[Boolean]): Self = StObject.set(x, "subnetChangeProtection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetChangeProtectionUndefined: Self = StObject.set(x, "subnetChangeProtection", js.undefined)
      
      @scala.inline
      def setSubnetMappings(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]]
            ]
      ): Self = StObject.set(x, "subnetMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetMappingsUndefined: Self = StObject.set(x, "subnetMappings", js.undefined)
      
      @scala.inline
      def setSubnetMappingsVarargs(value: Input[typings.pulumiAws.inputMod.networkfirewall.FirewallSubnetMapping]*): Self = StObject.set(x, "subnetMappings", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUpdateToken(value: Input[String]): Self = StObject.set(x, "updateToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateTokenUndefined: Self = StObject.set(x, "updateToken", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
