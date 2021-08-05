package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.route53.ResolverEndpointIpAddress
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolverEndpointMod {
  
  @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint")
  @js.native
  class ResolverEndpoint protected () extends CustomResource {
    /**
      * Create a ResolverEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResolverEndpointArgs) = this()
    def this(name: String, args: ResolverEndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Route 53 Resolver endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The direction of DNS queries to or from the Route 53 Resolver endpoint.
      * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
      * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
      */
    val direction: Output_[String] = js.native
    
    /**
      * The ID of the VPC that you want to create the resolver endpoint in.
      */
    val hostVpcId: Output_[String] = js.native
    
    /**
      * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
      * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
      */
    val ipAddresses: Output_[js.Array[ResolverEndpointIpAddress]] = js.native
    
    /**
      * The friendly name of the Route 53 Resolver endpoint.
      */
    val name: Output_[String] = js.native
    
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC.
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object ResolverEndpoint {
    
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ResolverEndpoint]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverEndpoint]
    inline def get(name: String, id: Input[ID], state: ResolverEndpointState): ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ResolverEndpoint]
    inline def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): ResolverEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ResolverEndpoint]
    
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean]
  }
  
  trait ResolverEndpointArgs extends StObject {
    
    /**
      * The direction of DNS queries to or from the Route 53 Resolver endpoint.
      * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
      * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
      */
    val direction: Input[String]
    
    /**
      * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
      * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
      */
    val ipAddresses: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]
    
    /**
      * The friendly name of the Route 53 Resolver endpoint.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC.
      */
    val securityGroupIds: Input[js.Array[Input[String]]]
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ResolverEndpointArgs {
    
    inline def apply(
      direction: Input[String],
      ipAddresses: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]],
      securityGroupIds: Input[js.Array[Input[String]]]
    ): ResolverEndpointArgs = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverEndpointArgs]
    }
    
    extension [Self <: ResolverEndpointArgs](x: Self) {
      
      inline def setDirection(value: Input[String]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setIpAddresses(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      inline def setIpAddressesVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait ResolverEndpointState extends StObject {
    
    /**
      * The ARN of the Route 53 Resolver endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The direction of DNS queries to or from the Route 53 Resolver endpoint.
      * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
      * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
      */
    val direction: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC that you want to create the resolver endpoint in.
      */
    val hostVpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
      * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
      */
    val ipAddresses: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]
      ] = js.undefined
    
    /**
      * The friendly name of the Route 53 Resolver endpoint.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object ResolverEndpointState {
    
    inline def apply(): ResolverEndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverEndpointState]
    }
    
    extension [Self <: ResolverEndpointState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDirection(value: Input[String]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setHostVpcId(value: Input[String]): Self = StObject.set(x, "hostVpcId", value.asInstanceOf[js.Any])
      
      inline def setHostVpcIdUndefined: Self = StObject.set(x, "hostVpcId", js.undefined)
      
      inline def setIpAddresses(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      inline def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
      
      inline def setIpAddressesVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
