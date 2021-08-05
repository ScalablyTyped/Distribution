package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcLinkMod {
  
  @JSImport("@pulumi/aws/apigatewayv2/vpcLink", "VpcLink")
  @js.native
  class VpcLink protected () extends CustomResource {
    /**
      * Create a VpcLink resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcLinkArgs) = this()
    def this(name: String, args: VpcLinkArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The VPC Link ARN.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The name of the VPC Link. Must be between 1 and 128 characters in length.
      */
    val name: Output_[String] = js.native
    
    /**
      * Security group IDs for the VPC Link.
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * Subnet IDs for the VPC Link.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the VPC Link.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object VpcLink {
    
    @JSImport("@pulumi/aws/apigatewayv2/vpcLink", "VpcLink")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcLink resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcLink]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcLink]
    inline def get(name: String, id: Input[ID], state: VpcLinkState): VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcLink]
    inline def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): VpcLink = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcLink]
    
    /**
      * Returns true if the given object is an instance of VpcLink.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/vpcLink.VpcLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/apigatewayv2/vpcLink.VpcLink */ Boolean]
  }
  
  trait VpcLinkArgs extends StObject {
    
    /**
      * The name of the VPC Link. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Security group IDs for the VPC Link.
      */
    val securityGroupIds: Input[js.Array[Input[String]]]
    
    /**
      * Subnet IDs for the VPC Link.
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the VPC Link.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VpcLinkArgs {
    
    inline def apply(securityGroupIds: Input[js.Array[Input[String]]], subnetIds: Input[js.Array[Input[String]]]): VpcLinkArgs = {
      val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcLinkArgs]
    }
    
    extension [Self <: VpcLinkArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait VpcLinkState extends StObject {
    
    /**
      * The VPC Link ARN.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the VPC Link. Must be between 1 and 128 characters in length.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Security group IDs for the VPC Link.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Subnet IDs for the VPC Link.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the VPC Link.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object VpcLinkState {
    
    inline def apply(): VpcLinkState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcLinkState]
    }
    
    extension [Self <: VpcLinkState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
