package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.DefaultNetworkAclEgress
import typings.pulumiAws.outputMod.ec2.DefaultNetworkAclIngress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultNetworkAclMod {
  
  @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
  @js.native
  class DefaultNetworkAcl protected () extends CustomResource {
    /**
      * Create a DefaultNetworkAcl resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultNetworkAclArgs) = this()
    def this(name: String, args: DefaultNetworkAclArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Default Network ACL
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: Output_[String] = js.native
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: Output_[js.UndefOr[js.Array[DefaultNetworkAclEgress]]] = js.native
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: Output_[js.UndefOr[js.Array[DefaultNetworkAclIngress]]] = js.native
    
    /**
      * The ID of the AWS account that owns the Default Network ACL
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the associated VPC
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object DefaultNetworkAcl {
    
    @JSImport("@pulumi/aws/ec2/defaultNetworkAcl", "DefaultNetworkAcl")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DefaultNetworkAcl resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): DefaultNetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[DefaultNetworkAcl]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): DefaultNetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultNetworkAcl]
    inline def get(name: String, id: Input[ID], state: DefaultNetworkAclState): DefaultNetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[DefaultNetworkAcl]
    inline def get(name: String, id: Input[ID], state: DefaultNetworkAclState, opts: CustomResourceOptions): DefaultNetworkAcl = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DefaultNetworkAcl]
    
    /**
      * Returns true if the given object is an instance of DefaultNetworkAcl.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/defaultNetworkAcl.DefaultNetworkAcl */ Boolean]
  }
  
  trait DefaultNetworkAclArgs extends StObject {
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: Input[String]
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]] = js.undefined
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]] = js.undefined
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object DefaultNetworkAclArgs {
    
    inline def apply(defaultNetworkAclId: Input[String]): DefaultNetworkAclArgs = {
      val __obj = js.Dynamic.literal(defaultNetworkAclId = defaultNetworkAclId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultNetworkAclArgs]
    }
    
    extension [Self <: DefaultNetworkAclArgs](x: Self) {
      
      inline def setDefaultNetworkAclId(value: Input[String]): Self = StObject.set(x, "defaultNetworkAclId", value.asInstanceOf[js.Any])
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait DefaultNetworkAclState extends StObject {
    
    /**
      * The ARN of the Default Network ACL
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Network ACL ID to manage. This
      * attribute is exported from `aws.ec2.Vpc`, or manually found via the AWS Console.
      */
    val defaultNetworkAclId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies an egress rule. Parameters defined below.
      */
    val egress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]] = js.undefined
    
    /**
      * Specifies an ingress rule. Parameters defined below.
      */
    val ingress: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the Default Network ACL
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of Subnet IDs to apply the ACL to. See the
      * notes below on managing Subnets in the Default Network ACL
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the associated VPC
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DefaultNetworkAclState {
    
    inline def apply(): DefaultNetworkAclState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultNetworkAclState]
    }
    
    extension [Self <: DefaultNetworkAclState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDefaultNetworkAclId(value: Input[String]): Self = StObject.set(x, "defaultNetworkAclId", value.asInstanceOf[js.Any])
      
      inline def setDefaultNetworkAclIdUndefined: Self = StObject.set(x, "defaultNetworkAclId", js.undefined)
      
      inline def setEgress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]]]): Self = StObject.set(x, "egress", value.asInstanceOf[js.Any])
      
      inline def setEgressUndefined: Self = StObject.set(x, "egress", js.undefined)
      
      inline def setEgressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclEgress]*): Self = StObject.set(x, "egress", js.Array(value :_*))
      
      inline def setIngress(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]]]): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
      
      inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
      
      inline def setIngressVarargs(value: Input[typings.pulumiAws.inputMod.ec2.DefaultNetworkAclIngress]*): Self = StObject.set(x, "ingress", js.Array(value :_*))
      
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
