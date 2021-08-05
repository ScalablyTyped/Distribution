package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.NetworkAclEgress
import typings.pulumiAws.outputMod.ec2.NetworkAclIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkAclMod {
  
  @JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
  @js.native
  class NetworkAcl protected () extends CustomResource {
    /**
      * Create a NetworkAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAclArgs) = this()
    def this(name: String, args: NetworkAclArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the network ACL
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: Output_[js.Array[NetworkAclEgress]] = js.native
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: Output_[js.Array[NetworkAclIngress]] = js.native
    
    /**
      * The ID of the AWS account that owns the network ACL.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of Subnet IDs to apply the ACL to
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the associated VPC.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object NetworkAcl {
    
    @JSImport("@pulumi/aws/ec2/networkAcl", "NetworkAcl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): NetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[NetworkAcl]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): NetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkAcl]
    inline def get(name: String, id: Input[ID], state: NetworkAclState): NetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[NetworkAcl]
    inline def get(name: String, id: Input[ID], state: NetworkAclState, opts: CustomResourceOptions): NetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[NetworkAcl]
    
    /**
      * Returns true if the given object is an instance of NetworkAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/networkAcl.NetworkAcl */ Boolean]
  }
  
  trait NetworkAclArgs extends StObject {
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]]]] = js.undefined
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]]]] = js.undefined
    
    /**
      * A list of Subnet IDs to apply the ACL to
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated VPC.
      */
    val vpcId: Input[String]
  }
  object NetworkAclArgs {
    
    inline def apply(vpcId: Input[String]): NetworkAclArgs = {
      val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAclArgs]
    }
    
    extension [Self <: NetworkAclArgs](x: Self) {
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait NetworkAclState extends StObject {
    
    /**
      * The ARN of the network ACL
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]]]] = js.undefined
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]]]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the network ACL.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of Subnet IDs to apply the ACL to
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object NetworkAclState {
    
    inline def apply(): NetworkAclState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAclState]
    }
    
    extension [Self <: NetworkAclState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.NetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
