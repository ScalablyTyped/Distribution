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
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ResolverEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID]): ResolverEndpoint = js.native
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResolverEndpoint = js.native
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState): ResolverEndpoint = js.native
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResolverEndpointState, opts: CustomResourceOptions): ResolverEndpoint = js.native
    
    /**
      * Returns true if the given object is an instance of ResolverEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/route53/resolverEndpoint", "ResolverEndpoint.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/resolverEndpoint.ResolverEndpoint */ Boolean = js.native
  }
  
  @js.native
  trait ResolverEndpointArgs extends StObject {
    
    /**
      * The direction of DNS queries to or from the Route 53 Resolver endpoint.
      * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
      * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
      */
    val direction: Input[String] = js.native
    
    /**
      * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
      * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
      */
    val ipAddresses: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]] = js.native
    
    /**
      * The friendly name of the Route 53 Resolver endpoint.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC.
      */
    val securityGroupIds: Input[js.Array[Input[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResolverEndpointArgs {
    
    @scala.inline
    def apply(
      direction: Input[String],
      ipAddresses: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]],
      securityGroupIds: Input[js.Array[Input[String]]]
    ): ResolverEndpointArgs = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], securityGroupIds = securityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverEndpointArgs]
    }
    
    @scala.inline
    implicit class ResolverEndpointArgsMutableBuilder[Self <: ResolverEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: Input[String]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddresses(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressesVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait ResolverEndpointState extends StObject {
    
    /**
      * The ARN of the Route 53 Resolver endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The direction of DNS queries to or from the Route 53 Resolver endpoint.
      * Valid values are `INBOUND` (resolver forwards DNS queries to the DNS service for a VPC from your network or another VPC)
      * or `OUTBOUND` (resolver forwards DNS queries from the DNS service for a VPC to your network or another VPC).
      */
    val direction: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC that you want to create the resolver endpoint in.
      */
    val hostVpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The subnets and IP addresses in your VPC that you want DNS queries to pass through on the way from your VPCs
      * to your network (for outbound endpoints) or on the way from your network to your VPCs (for inbound endpoints). Described below.
      */
    val ipAddresses: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]
      ] = js.native
    
    /**
      * The friendly name of the Route 53 Resolver endpoint.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of one or more security groups that you want to use to control access to this VPC.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object ResolverEndpointState {
    
    @scala.inline
    def apply(): ResolverEndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverEndpointState]
    }
    
    @scala.inline
    implicit class ResolverEndpointStateMutableBuilder[Self <: ResolverEndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDirection(value: Input[String]): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setHostVpcId(value: Input[String]): Self = StObject.set(x, "hostVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostVpcIdUndefined: Self = StObject.set(x, "hostVpcId", js.undefined)
      
      @scala.inline
      def setIpAddresses(value: Input[js.Array[Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]]]): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressesUndefined: Self = StObject.set(x, "ipAddresses", js.undefined)
      
      @scala.inline
      def setIpAddressesVarargs(value: Input[typings.pulumiAws.inputMod.route53.ResolverEndpointIpAddress]*): Self = StObject.set(x, "ipAddresses", js.Array(value :_*))
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
