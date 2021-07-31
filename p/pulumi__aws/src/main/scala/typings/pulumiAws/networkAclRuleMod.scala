package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkAclRuleMod {
  
  @JSImport("@pulumi/aws/ec2/networkAclRule", "NetworkAclRule")
  @js.native
  class NetworkAclRule protected () extends CustomResource {
    /**
      * Create a NetworkAclRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAclRuleArgs) = this()
    def this(name: String, args: NetworkAclRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
      */
    val cidrBlock: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
      */
    val egress: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The from port to match.
      */
    val fromPort: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpCode: Output_[js.UndefOr[String]] = js.native
    
    /**
      * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IPv6 CIDR block to allow or deny.
      */
    val ipv6CidrBlock: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the network ACL.
      */
    val networkAclId: Output_[String] = js.native
    
    /**
      * The protocol. A value of -1 means all protocols.
      */
    val protocol: Output_[String] = js.native
    
    /**
      * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
      */
    val ruleAction: Output_[String] = js.native
    
    /**
      * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
      */
    val ruleNumber: Output_[Double] = js.native
    
    /**
      * The to port to match.
      */
    val toPort: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object NetworkAclRule {
    
    @JSImport("@pulumi/aws/ec2/networkAclRule", "NetworkAclRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkAclRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): NetworkAclRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NetworkAclRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NetworkAclRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkAclRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkAclRuleState): NetworkAclRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NetworkAclRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkAclRuleState, opts: CustomResourceOptions): NetworkAclRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkAclRule]
    
    /**
      * Returns true if the given object is an instance of NetworkAclRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkAclRule.NetworkAclRule */ Boolean]
  }
  
  trait NetworkAclRuleArgs extends StObject {
    
    /**
      * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
      */
    val egress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The from port to match.
      */
    val fromPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv6 CIDR block to allow or deny.
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the network ACL.
      */
    val networkAclId: Input[String]
    
    /**
      * The protocol. A value of -1 means all protocols.
      */
    val protocol: Input[String]
    
    /**
      * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
      */
    val ruleAction: Input[String]
    
    /**
      * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
      */
    val ruleNumber: Input[Double]
    
    /**
      * The to port to match.
      */
    val toPort: js.UndefOr[Input[Double]] = js.undefined
  }
  object NetworkAclRuleArgs {
    
    @scala.inline
    def apply(
      networkAclId: Input[String],
      protocol: Input[String],
      ruleAction: Input[String],
      ruleNumber: Input[Double]
    ): NetworkAclRuleArgs = {
      val __obj = js.Dynamic.literal(networkAclId = networkAclId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleAction = ruleAction.asInstanceOf[js.Any], ruleNumber = ruleNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAclRuleArgs]
    }
    
    @scala.inline
    implicit class NetworkAclRuleArgsMutableBuilder[Self <: NetworkAclRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[Boolean]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
      
      @scala.inline
      def setIcmpCode(value: Input[String]): Self = StObject.set(x, "icmpCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcmpCodeUndefined: Self = StObject.set(x, "icmpCode", js.undefined)
      
      @scala.inline
      def setIcmpType(value: Input[String]): Self = StObject.set(x, "icmpType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcmpTypeUndefined: Self = StObject.set(x, "icmpType", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      @scala.inline
      def setNetworkAclId(value: Input[String]): Self = StObject.set(x, "networkAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleAction(value: Input[String]): Self = StObject.set(x, "ruleAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNumber(value: Input[Double]): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
    }
  }
  
  trait NetworkAclRuleState extends StObject {
    
    /**
      * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
      */
    val egress: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The from port to match.
      */
    val fromPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocol. e.g. -1
      */
    val icmpType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv6 CIDR block to allow or deny.
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the network ACL.
      */
    val networkAclId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The protocol. A value of -1 means all protocols.
      */
    val protocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
      */
    val ruleAction: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
      */
    val ruleNumber: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The to port to match.
      */
    val toPort: js.UndefOr[Input[Double]] = js.undefined
  }
  object NetworkAclRuleState {
    
    @scala.inline
    def apply(): NetworkAclRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAclRuleState]
    }
    
    @scala.inline
    implicit class NetworkAclRuleStateMutableBuilder[Self <: NetworkAclRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[Boolean]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
      
      @scala.inline
      def setIcmpCode(value: Input[String]): Self = StObject.set(x, "icmpCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcmpCodeUndefined: Self = StObject.set(x, "icmpCode", js.undefined)
      
      @scala.inline
      def setIcmpType(value: Input[String]): Self = StObject.set(x, "icmpType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcmpTypeUndefined: Self = StObject.set(x, "icmpType", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      @scala.inline
      def setNetworkAclId(value: Input[String]): Self = StObject.set(x, "networkAclId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkAclIdUndefined: Self = StObject.set(x, "networkAclId", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRuleAction(value: Input[String]): Self = StObject.set(x, "ruleAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleActionUndefined: Self = StObject.set(x, "ruleAction", js.undefined)
      
      @scala.inline
      def setRuleNumber(value: Input[Double]): Self = StObject.set(x, "ruleNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNumberUndefined: Self = StObject.set(x, "ruleNumber", js.undefined)
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
    }
  }
}
