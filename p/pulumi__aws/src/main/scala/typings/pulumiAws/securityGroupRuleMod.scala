package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityGroupRuleMod {
  
  @JSImport("@pulumi/aws/ec2/securityGroupRule", "SecurityGroupRule")
  @js.native
  class SecurityGroupRule protected () extends CustomResource {
    /**
      * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupRuleArgs) = this()
    def this(name: String, args: SecurityGroupRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
      */
    val cidrBlocks: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Description of the rule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
      */
    val fromPort: Output_[Double] = js.native
    
    /**
      * List of IPv6 CIDR blocks.
      */
    val ipv6CidrBlocks: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * List of prefix list IDs (for allowing access to VPC endpoints).
      * Only valid with `egress`.
      */
    val prefixListIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
      */
    val protocol: Output_[String] = js.native
    
    /**
      * The security group to apply this rule to.
      */
    val securityGroupId: Output_[String] = js.native
    
    /**
      * If true, the security group itself will be added as
      * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
      */
    val self: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The security group id to allow access to/from,
      * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
      */
    val sourceSecurityGroupId: Output_[String] = js.native
    
    /**
      * The end port (or ICMP code if protocol is "icmp").
      */
    val toPort: Output_[Double] = js.native
    
    /**
      * The type of rule being created. Valid options are `ingress` (inbound)
      * or `egress` (outbound).
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object SecurityGroupRule {
    
    @JSImport("@pulumi/aws/ec2/securityGroupRule", "SecurityGroupRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): SecurityGroupRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecurityGroupRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecurityGroupRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroupRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupRuleState): SecurityGroupRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecurityGroupRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupRuleState, opts: CustomResourceOptions): SecurityGroupRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroupRule]
    
    /**
      * Returns true if the given object is an instance of SecurityGroupRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroupRule.SecurityGroupRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/securityGroupRule.SecurityGroupRule */ Boolean]
  }
  
  trait SecurityGroupRuleArgs extends StObject {
    
    /**
      * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
      */
    val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
      */
    val fromPort: Input[Double]
    
    /**
      * List of IPv6 CIDR blocks.
      */
    val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of prefix list IDs (for allowing access to VPC endpoints).
      * Only valid with `egress`.
      */
    val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
      */
    val protocol: Input[String]
    
    /**
      * The security group to apply this rule to.
      */
    val securityGroupId: Input[String]
    
    /**
      * If true, the security group itself will be added as
      * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
      */
    val self: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The security group id to allow access to/from,
      * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
      */
    val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The end port (or ICMP code if protocol is "icmp").
      */
    val toPort: Input[Double]
    
    /**
      * The type of rule being created. Valid options are `ingress` (inbound)
      * or `egress` (outbound).
      */
    val `type`: Input[String]
  }
  object SecurityGroupRuleArgs {
    
    @scala.inline
    def apply(
      fromPort: Input[Double],
      protocol: Input[String],
      securityGroupId: Input[String],
      toPort: Input[Double],
      `type`: Input[String]
    ): SecurityGroupRuleArgs = {
      val __obj = js.Dynamic.literal(fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityGroupRuleArgs]
    }
    
    @scala.inline
    implicit class SecurityGroupRuleArgsMutableBuilder[Self <: SecurityGroupRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
      
      @scala.inline
      def setCidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlocksUndefined: Self = StObject.set(x, "ipv6CidrBlocks", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setPrefixListIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "prefixListIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListIdsUndefined: Self = StObject.set(x, "prefixListIds", js.undefined)
      
      @scala.inline
      def setPrefixListIdsVarargs(value: Input[String]*): Self = StObject.set(x, "prefixListIds", js.Array(value :_*))
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelf(value: Input[Boolean]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      
      @scala.inline
      def setSourceSecurityGroupId(value: Input[String]): Self = StObject.set(x, "sourceSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSecurityGroupIdUndefined: Self = StObject.set(x, "sourceSecurityGroupId", js.undefined)
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecurityGroupRuleState extends StObject {
    
    /**
      * List of CIDR blocks. Cannot be specified with `sourceSecurityGroupId`.
      */
    val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Description of the rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The start port (or ICMP type number if protocol is "icmp" or "icmpv6").
      */
    val fromPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of IPv6 CIDR blocks.
      */
    val ipv6CidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of prefix list IDs (for allowing access to VPC endpoints).
      * Only valid with `egress`.
      */
    val prefixListIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The protocol. If not icmp, icmpv6, tcp, udp, or all use the [protocol number](https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
      */
    val protocol: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The security group to apply this rule to.
      */
    val securityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If true, the security group itself will be added as
      * a source to this ingress rule. Cannot be specified with `sourceSecurityGroupId`.
      */
    val self: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The security group id to allow access to/from,
      * depending on the `type`. Cannot be specified with `cidrBlocks` and `self`.
      */
    val sourceSecurityGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The end port (or ICMP code if protocol is "icmp").
      */
    val toPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The type of rule being created. Valid options are `ingress` (inbound)
      * or `egress` (outbound).
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityGroupRuleState {
    
    @scala.inline
    def apply(): SecurityGroupRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupRuleState]
    }
    
    @scala.inline
    implicit class SecurityGroupRuleStateMutableBuilder[Self <: SecurityGroupRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
      
      @scala.inline
      def setCidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFromPort(value: Input[Double]): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlocksUndefined: Self = StObject.set(x, "ipv6CidrBlocks", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setPrefixListIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "prefixListIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListIdsUndefined: Self = StObject.set(x, "prefixListIds", js.undefined)
      
      @scala.inline
      def setPrefixListIdsVarargs(value: Input[String]*): Self = StObject.set(x, "prefixListIds", js.Array(value :_*))
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSecurityGroupId(value: Input[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
      
      @scala.inline
      def setSelf(value: Input[Boolean]): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      
      @scala.inline
      def setSourceSecurityGroupId(value: Input[String]): Self = StObject.set(x, "sourceSecurityGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceSecurityGroupIdUndefined: Self = StObject.set(x, "sourceSecurityGroupId", js.undefined)
      
      @scala.inline
      def setToPort(value: Input[Double]): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
