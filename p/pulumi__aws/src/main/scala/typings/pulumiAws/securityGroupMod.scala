package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.SecurityGroupEgress
import typings.pulumiAws.outputMod.ec2.SecurityGroupIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityGroupMod {
  
  @JSImport("@pulumi/aws/ec2/securityGroup", "SecurityGroup")
  @js.native
  class SecurityGroup protected () extends CustomResource {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the security group
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of this egress rule.
      */
    val description: Output_[String] = js.native
    
    /**
      * Can be specified multiple times for each
      * egress rule. Each egress block supports fields documented below.
      */
    val egress: Output_[js.Array[SecurityGroupEgress]] = js.native
    
    /**
      * Can be specified multiple times for each
      * ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: Output_[js.Array[SecurityGroupIngress]] = js.native
    
    /**
      * The name of the security group. If omitted, this provider will
      * assign a random, unique name
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The owner ID.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * Instruct this provider to revoke all of the
      * Security Groups attached ingress and egress rules before deleting the rule
      * itself. This is normally not needed, however certain AWS services such as
      * Elastic Map Reduce may automatically add required rules to security groups used
      * with the service, and those rules may contain a cyclic dependency that prevent
      * the security groups from being destroyed without removing the dependency first.
      * Default `false`
      */
    val revokeRulesOnDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object SecurityGroup {
    
    @JSImport("@pulumi/aws/ec2/securityGroup", "SecurityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupState): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): SecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SecurityGroup]
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/securityGroup.SecurityGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/securityGroup.SecurityGroup */ Boolean]
  }
  
  trait SecurityGroupArgs extends StObject {
    
    /**
      * Description of this egress rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be specified multiple times for each
      * egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]]]] = js.undefined
    
    /**
      * Can be specified multiple times for each
      * ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]]]] = js.undefined
    
    /**
      * The name of the security group. If omitted, this provider will
      * assign a random, unique name
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instruct this provider to revoke all of the
      * Security Groups attached ingress and egress rules before deleting the rule
      * itself. This is normally not needed, however certain AWS services such as
      * Elastic Map Reduce may automatically add required rules to security groups used
      * with the service, and those rules may contain a cyclic dependency that prevent
      * the security groups from being destroyed without removing the dependency first.
      * Default `false`
      */
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityGroupArgs {
    
    @scala.inline
    def apply(): SecurityGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupArgs]
    }
    
    @scala.inline
    implicit class SecurityGroupArgsMutableBuilder[Self <: SecurityGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait SecurityGroupState extends StObject {
    
    /**
      * The ARN of the security group
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of this egress rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be specified multiple times for each
      * egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]]]] = js.undefined
    
    /**
      * Can be specified multiple times for each
      * ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]]]] = js.undefined
    
    /**
      * The name of the security group. If omitted, this provider will
      * assign a random, unique name
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified
      * prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The owner ID.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Instruct this provider to revoke all of the
      * Security Groups attached ingress and egress rules before deleting the rule
      * itself. This is normally not needed, however certain AWS services such as
      * Elastic Map Reduce may automatically add required rules to security groups used
      * with the service, and those rules may contain a cyclic dependency that prevent
      * the security groups from being destroyed without removing the dependency first.
      * Default `false`
      */
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object SecurityGroupState {
    
    @scala.inline
    def apply(): SecurityGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecurityGroupState]
    }
    
    @scala.inline
    implicit class SecurityGroupStateMutableBuilder[Self <: SecurityGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      @scala.inline
      def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      @scala.inline
      def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      @scala.inline
      def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.SecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
