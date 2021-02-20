package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcEndpointServiceMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService")
  @js.native
  class VpcEndpointService protected () extends CustomResource {
    /**
      * Create a VpcEndpointService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointServiceArgs) = this()
    def this(name: String, args: VpcEndpointServiceArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
      */
    val acceptanceRequired: Output_[Boolean] = js.native
    
    /**
      * The ARNs of one or more principals allowed to discover the endpoint service.
      */
    val allowedPrincipals: Output_[js.Array[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint service.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The Availability Zones in which the service is available.
      */
    val availabilityZones: Output_[js.Array[String]] = js.native
    
    /**
      * The DNS names for the service.
      */
    val baseEndpointDnsNames: Output_[js.Array[String]] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
      */
    val gatewayLoadBalancerArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * Whether or not the service manages its VPC endpoints - `true` or `false`.
      */
    val managesVpcEndpoints: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
      */
    val networkLoadBalancerArns: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The private DNS name for the service.
      */
    val privateDnsName: Output_[String] = js.native
    
    /**
      * The service name.
      */
    val serviceName: Output_[String] = js.native
    
    /**
      * The service type, `Gateway` or `Interface`.
      */
    val serviceType: Output_[String] = js.native
    
    /**
      * The state of the VPC endpoint service.
      */
    val state: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object VpcEndpointService {
    
    /**
      * Get an existing VpcEndpointService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcEndpointService = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpointService = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcEndpointServiceState): VpcEndpointService = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcEndpointServiceState, opts: CustomResourceOptions): VpcEndpointService = js.native
    
    /**
      * Returns true if the given object is an instance of VpcEndpointService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointService", "VpcEndpointService.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointService.VpcEndpointService */ Boolean = js.native
  }
  
  @js.native
  trait VpcEndpointServiceArgs extends StObject {
    
    /**
      * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
      */
    val acceptanceRequired: Input[Boolean] = js.native
    
    /**
      * The ARNs of one or more principals allowed to discover the endpoint service.
      */
    val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
      */
    val gatewayLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
      */
    val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object VpcEndpointServiceArgs {
    
    @scala.inline
    def apply(acceptanceRequired: Input[Boolean]): VpcEndpointServiceArgs = {
      val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointServiceArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointServiceArgsMutableBuilder[Self <: VpcEndpointServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptanceRequired(value: Input[Boolean]): Self = StObject.set(x, "acceptanceRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPrincipalsUndefined: Self = StObject.set(x, "allowedPrincipals", js.undefined)
      
      @scala.inline
      def setAllowedPrincipalsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrincipals", js.Array(value :_*))
      
      @scala.inline
      def setGatewayLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "gatewayLoadBalancerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "gatewayLoadBalancerArns", js.undefined)
      
      @scala.inline
      def setGatewayLoadBalancerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "gatewayLoadBalancerArns", js.Array(value :_*))
      
      @scala.inline
      def setNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkLoadBalancerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "networkLoadBalancerArns", js.undefined)
      
      @scala.inline
      def setNetworkLoadBalancerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "networkLoadBalancerArns", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait VpcEndpointServiceState extends StObject {
    
    /**
      * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
      */
    val acceptanceRequired: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ARNs of one or more principals allowed to discover the endpoint service.
      */
    val allowedPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint service.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Availability Zones in which the service is available.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The DNS names for the service.
      */
    val baseEndpointDnsNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
      */
    val gatewayLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Whether or not the service manages its VPC endpoints - `true` or `false`.
      */
    val managesVpcEndpoints: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
      */
    val networkLoadBalancerArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The private DNS name for the service.
      */
    val privateDnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The service name.
      */
    val serviceName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The service type, `Gateway` or `Interface`.
      */
    val serviceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The state of the VPC endpoint service.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object VpcEndpointServiceState {
    
    @scala.inline
    def apply(): VpcEndpointServiceState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointServiceState]
    }
    
    @scala.inline
    implicit class VpcEndpointServiceStateMutableBuilder[Self <: VpcEndpointServiceState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptanceRequired(value: Input[Boolean]): Self = StObject.set(x, "acceptanceRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptanceRequiredUndefined: Self = StObject.set(x, "acceptanceRequired", js.undefined)
      
      @scala.inline
      def setAllowedPrincipals(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrincipals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPrincipalsUndefined: Self = StObject.set(x, "allowedPrincipals", js.undefined)
      
      @scala.inline
      def setAllowedPrincipalsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrincipals", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setBaseEndpointDnsNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "baseEndpointDnsNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseEndpointDnsNamesUndefined: Self = StObject.set(x, "baseEndpointDnsNames", js.undefined)
      
      @scala.inline
      def setBaseEndpointDnsNamesVarargs(value: Input[String]*): Self = StObject.set(x, "baseEndpointDnsNames", js.Array(value :_*))
      
      @scala.inline
      def setGatewayLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "gatewayLoadBalancerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayLoadBalancerArnsUndefined: Self = StObject.set(x, "gatewayLoadBalancerArns", js.undefined)
      
      @scala.inline
      def setGatewayLoadBalancerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "gatewayLoadBalancerArns", js.Array(value :_*))
      
      @scala.inline
      def setManagesVpcEndpoints(value: Input[Boolean]): Self = StObject.set(x, "managesVpcEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagesVpcEndpointsUndefined: Self = StObject.set(x, "managesVpcEndpoints", js.undefined)
      
      @scala.inline
      def setNetworkLoadBalancerArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkLoadBalancerArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkLoadBalancerArnsUndefined: Self = StObject.set(x, "networkLoadBalancerArns", js.undefined)
      
      @scala.inline
      def setNetworkLoadBalancerArnsVarargs(value: Input[String]*): Self = StObject.set(x, "networkLoadBalancerArns", js.Array(value :_*))
      
      @scala.inline
      def setPrivateDnsName(value: Input[String]): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setServiceType(value: Input[String]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
