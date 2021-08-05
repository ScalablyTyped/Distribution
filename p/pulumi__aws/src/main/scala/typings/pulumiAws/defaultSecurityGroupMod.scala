package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.DefaultSecurityGroupEgress
import typings.pulumiAws.outputMod.ec2.DefaultSecurityGroupIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultSecurityGroupMod {
  
  @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
  @js.native
  class DefaultSecurityGroup protected () extends CustomResource {
    /**
      * Create a DefaultSecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DefaultSecurityGroupArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DefaultSecurityGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the security group
      */
    val arn: Output_[String] = js.native
    
    /**
      * Description of this egress rule.
      */
    val description: Output_[String] = js.native
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: Output_[js.Array[DefaultSecurityGroupEgress]] = js.native
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: Output_[js.Array[DefaultSecurityGroupIngress]] = js.native
    
    /**
      * The name of the security group
      */
    val name: Output_[String] = js.native
    
    /**
      * The owner ID.
      */
    val ownerId: Output_[String] = js.native
    
    val revokeRulesOnDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultSecurityGroup {
    
    @JSImport("@pulumi/aws/ec2/defaultSecurityGroup", "DefaultSecurityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultSecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultSecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultSecurityGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultSecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultSecurityGroup]
    inline def get(name: String, id: Input[ID], state: DefaultSecurityGroupState): DefaultSecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultSecurityGroup]
    inline def get(name: String, id: Input[ID], state: DefaultSecurityGroupState, opts: CustomResourceOptions): DefaultSecurityGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultSecurityGroup]
    
    /**
      * Returns true if the given object is an instance of DefaultSecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultSecurityGroup.DefaultSecurityGroup */ Boolean]
  }
  
  trait DefaultSecurityGroupArgs extends StObject {
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]
      ] = js.undefined
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]]
      ] = js.undefined
    
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultSecurityGroupArgs {
    
    inline def apply(): DefaultSecurityGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSecurityGroupArgs]
    }
    
    extension [Self <: DefaultSecurityGroupArgs](x: Self) {
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      inline def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  trait DefaultSecurityGroupState extends StObject {
    
    /**
      * The ARN of the security group
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of this egress rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
      */
    val egress: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]
      ] = js.undefined
    
    /**
      * Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
      */
    val ingress: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]]
      ] = js.undefined
    
    /**
      * The name of the security group
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The owner ID.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    val revokeRulesOnDelete: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC ID. **Note that changing the `vpcId` will _not_ restore any default security group rules that were modified, added, or removed.** It will be left in its current state
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultSecurityGroupState {
    
    inline def apply(): DefaultSecurityGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSecurityGroupState]
    }
    
    extension [Self <: DefaultSecurityGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultSecurityGroupIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setRevokeRulesOnDelete(value: Input[Boolean]): Self = StObject.set(x, "revokeRulesOnDelete", value.asInstanceOf[js.Any])
      
      inline def setRevokeRulesOnDeleteUndefined: Self = StObject.set(x, "revokeRulesOnDelete", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
