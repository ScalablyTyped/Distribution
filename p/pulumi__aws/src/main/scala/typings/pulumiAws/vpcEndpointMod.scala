package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpcEndpointDnsEntry
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcEndpointMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
  @js.native
  class VpcEndpoint protected () extends CustomResource {
    /**
      * Create a VpcEndpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointArgs) = this()
    def this(name: String, args: VpcEndpointArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
      */
    val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val cidrBlocks: Output_[js.Array[String]] = js.native
    
    /**
      * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
      */
    val dnsEntries: Output_[js.Array[VpcEndpointDnsEntry]] = js.native
    
    /**
      * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
      */
    val networkInterfaceIds: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the VPC endpoint.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val prefixListId: Output_[String] = js.native
    
    /**
      * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
      * Defaults to `false`.
      */
    val privateDnsEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
      */
    val requesterManaged: Output_[Boolean] = js.native
    
    /**
      * One or more route table IDs. Applicable for endpoints of type `Gateway`.
      */
    val routeTableIds: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
      */
    val securityGroupIds: Output_[js.Array[String]] = js.native
    
    /**
      * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: Output_[String] = js.native
    
    /**
      * The state of the VPC endpoint.
      */
    val state: Output_[String] = js.native
    
    /**
      * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
      */
    val vpcEndpointType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the VPC in which the endpoint will be used.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object VpcEndpoint {
    
    @JSImport("@pulumi/aws/ec2/vpcEndpoint", "VpcEndpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcEndpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcEndpointState): VpcEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcEndpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcEndpointState, opts: CustomResourceOptions): VpcEndpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpoint]
    
    /**
      * Returns true if the given object is an instance of VpcEndpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpoint.VpcEndpoint */ Boolean]
  }
  
  trait VpcEndpointArgs extends StObject {
    
    /**
      * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
      * Defaults to `false`.
      */
    val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * One or more route table IDs. Applicable for endpoints of type `Gateway`.
      */
    val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: Input[String]
    
    /**
      * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
      */
    val vpcEndpointType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC in which the endpoint will be used.
      */
    val vpcId: Input[String]
  }
  object VpcEndpointArgs {
    
    @scala.inline
    def apply(serviceName: Input[String], vpcId: Input[String]): VpcEndpointArgs = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointArgsMutableBuilder[Self <: VpcEndpointArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPrivateDnsEnabled(value: Input[Boolean]): Self = StObject.set(x, "privateDnsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "privateDnsEnabled", js.undefined)
      
      @scala.inline
      def setRouteTableIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "routeTableIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdsUndefined: Self = StObject.set(x, "routeTableIds", js.undefined)
      
      @scala.inline
      def setRouteTableIdsVarargs(value: Input[String]*): Self = StObject.set(x, "routeTableIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcEndpointType(value: Input[String]): Self = StObject.set(x, "vpcEndpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointTypeUndefined: Self = StObject.set(x, "vpcEndpointType", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcEndpointState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
      */
    val dnsEntries: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpcEndpointDnsEntry]]]] = js.undefined
    
    /**
      * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
      */
    val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the VPC endpoint.
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
      */
    val prefixListId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
      * Defaults to `false`.
      */
    val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
      */
    val requesterManaged: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * One or more route table IDs. Applicable for endpoints of type `Gateway`.
      */
    val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
      */
    val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The service name. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The state of the VPC endpoint.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
      */
    val vpcEndpointType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC in which the endpoint will be used.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcEndpointState {
    
    @scala.inline
    def apply(): VpcEndpointState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointState]
    }
    
    @scala.inline
    implicit class VpcEndpointStateMutableBuilder[Self <: VpcEndpointState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      @scala.inline
      def setCidrBlocks(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksUndefined: Self = StObject.set(x, "cidrBlocks", js.undefined)
      
      @scala.inline
      def setCidrBlocksVarargs(value: Input[String]*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setDnsEntries(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ec2.VpcEndpointDnsEntry]]]): Self = StObject.set(x, "dnsEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsEntriesUndefined: Self = StObject.set(x, "dnsEntries", js.undefined)
      
      @scala.inline
      def setDnsEntriesVarargs(value: Input[typings.pulumiAws.inputMod.ec2.VpcEndpointDnsEntry]*): Self = StObject.set(x, "dnsEntries", js.Array(value :_*))
      
      @scala.inline
      def setNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "networkInterfaceIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdsUndefined: Self = StObject.set(x, "networkInterfaceIds", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceIdsVarargs(value: Input[String]*): Self = StObject.set(x, "networkInterfaceIds", js.Array(value :_*))
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setPrefixListId(value: Input[String]): Self = StObject.set(x, "prefixListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixListIdUndefined: Self = StObject.set(x, "prefixListId", js.undefined)
      
      @scala.inline
      def setPrivateDnsEnabled(value: Input[Boolean]): Self = StObject.set(x, "privateDnsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsEnabledUndefined: Self = StObject.set(x, "privateDnsEnabled", js.undefined)
      
      @scala.inline
      def setRequesterManaged(value: Input[Boolean]): Self = StObject.set(x, "requesterManaged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterManagedUndefined: Self = StObject.set(x, "requesterManaged", js.undefined)
      
      @scala.inline
      def setRouteTableIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "routeTableIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdsUndefined: Self = StObject.set(x, "routeTableIds", js.undefined)
      
      @scala.inline
      def setRouteTableIdsVarargs(value: Input[String]*): Self = StObject.set(x, "routeTableIds", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcEndpointType(value: Input[String]): Self = StObject.set(x, "vpcEndpointType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointTypeUndefined: Self = StObject.set(x, "vpcEndpointType", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
