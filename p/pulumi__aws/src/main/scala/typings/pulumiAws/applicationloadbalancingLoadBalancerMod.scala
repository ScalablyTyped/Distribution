package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.enumsAlbMod.IpAddressType
import typings.pulumiAws.enumsAlbMod.LoadBalancerType
import typings.pulumiAws.outputMod.applicationloadbalancing.LoadBalancerAccessLogs
import typings.pulumiAws.outputMod.applicationloadbalancing.LoadBalancerSubnetMapping
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationloadbalancingLoadBalancerMod {
  
  @JSImport("@pulumi/aws/applicationloadbalancing/loadBalancer", "LoadBalancer")
  @js.native
  class LoadBalancer protected () extends CustomResource {
    /**
      * Create a LoadBalancer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.applicationloadbalancing.LoadBalancer has been deprecated in favor of aws.alb.LoadBalancer */
    def this(name: String) = this()
    def this(name: String, args: LoadBalancerArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: LoadBalancerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An Access Logs block. Access Logs documented below.
      */
    val accessLogs: Output_[js.UndefOr[LoadBalancerAccessLogs]] = js.native
    
    /**
      * The ARN of the load balancer (matches `id`).
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN suffix for use with CloudWatch Metrics.
      */
    val arnSuffix: Output_[String] = js.native
    
    /**
      * The ID of the customer owned ipv4 pool to use for this load balancer.
      */
    val customerOwnedIpv4Pool: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The DNS name of the load balancer.
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
      */
    val dropInvalidHeaderFields: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If true, cross-zone load balancing of the load balancer will be enabled.
      * This is a `network` load balancer feature. Defaults to `false`.
      */
    val enableCrossZoneLoadBalancing: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * If true, deletion of the load balancer will be disabled via
      * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
      */
    val enableDeletionProtection: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
      */
    val enableHttp2: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
      */
    val idleTimeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * If true, the LB will be internal.
      */
    val internal: Output_[Boolean] = js.native
    
    /**
      * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
      */
    val ipAddressType: Output_[IpAddressType] = js.native
    
    /**
      * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
      */
    val loadBalancerType: Output_[js.UndefOr[LoadBalancerType]] = js.native
    
    /**
      * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
      * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
      * this provider will autogenerate a name beginning with `tf-lb`.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * A subnet mapping block as documented below.
      */
    val subnetMappings: Output_[js.Array[LoadBalancerSubnetMapping]] = js.native
    
    /**
      * A list of subnet IDs to attach to the LB. Subnets
      * cannot be updated for Load Balancers of type `network`. Changing this value
      * for load balancers of type `network` will force a recreation of the resource.
      */
    val subnets: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    val vpcId: Output_[String] = js.native
    
    /**
      * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
      * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
      */
    val zoneId: Output_[String] = js.native
  }
  /* static members */
  object LoadBalancer {
    
    @JSImport("@pulumi/aws/applicationloadbalancing/loadBalancer", "LoadBalancer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LoadBalancer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoadBalancer]
    inline def get(name: String, id: Input[ID], state: LoadBalancerState): LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LoadBalancer]
    inline def get(name: String, id: Input[ID], state: LoadBalancerState, opts: CustomResourceOptions): LoadBalancer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoadBalancer]
    
    /**
      * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/loadBalancer.LoadBalancer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/applicationloadbalancing/loadBalancer.LoadBalancer */ Boolean]
  }
  
  trait LoadBalancerArgs extends StObject {
    
    /**
      * An Access Logs block. Access Logs documented below.
      */
    val accessLogs: js.UndefOr[
        Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs]
      ] = js.undefined
    
    /**
      * The ID of the customer owned ipv4 pool to use for this load balancer.
      */
    val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
      */
    val dropInvalidHeaderFields: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, cross-zone load balancing of the load balancer will be enabled.
      * This is a `network` load balancer feature. Defaults to `false`.
      */
    val enableCrossZoneLoadBalancing: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, deletion of the load balancer will be disabled via
      * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
      */
    val enableDeletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
      */
    val enableHttp2: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
      */
    val idleTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If true, the LB will be internal.
      */
    val internal: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
      */
    val ipAddressType: js.UndefOr[Input[IpAddressType]] = js.undefined
    
    /**
      * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
      */
    val loadBalancerType: js.UndefOr[Input[LoadBalancerType]] = js.undefined
    
    /**
      * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
      * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
      * this provider will autogenerate a name beginning with `tf-lb`.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A subnet mapping block as documented below.
      */
    val subnetMappings: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]
          ]
        ]
      ] = js.undefined
    
    /**
      * A list of subnet IDs to attach to the LB. Subnets
      * cannot be updated for Load Balancers of type `network`. Changing this value
      * for load balancers of type `network` will force a recreation of the resource.
      */
    val subnets: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LoadBalancerArgs {
    
    inline def apply(): LoadBalancerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerArgs]
    }
    
    extension [Self <: LoadBalancerArgs](x: Self) {
      
      inline def setAccessLogs(value: Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs]): Self = StObject.set(x, "accessLogs", value.asInstanceOf[js.Any])
      
      inline def setAccessLogsUndefined: Self = StObject.set(x, "accessLogs", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: Input[String]): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "customerOwnedIpv4Pool", js.undefined)
      
      inline def setDropInvalidHeaderFields(value: Input[Boolean]): Self = StObject.set(x, "dropInvalidHeaderFields", value.asInstanceOf[js.Any])
      
      inline def setDropInvalidHeaderFieldsUndefined: Self = StObject.set(x, "dropInvalidHeaderFields", js.undefined)
      
      inline def setEnableCrossZoneLoadBalancing(value: Input[Boolean]): Self = StObject.set(x, "enableCrossZoneLoadBalancing", value.asInstanceOf[js.Any])
      
      inline def setEnableCrossZoneLoadBalancingUndefined: Self = StObject.set(x, "enableCrossZoneLoadBalancing", js.undefined)
      
      inline def setEnableDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "enableDeletionProtection", value.asInstanceOf[js.Any])
      
      inline def setEnableDeletionProtectionUndefined: Self = StObject.set(x, "enableDeletionProtection", js.undefined)
      
      inline def setEnableHttp2(value: Input[Boolean]): Self = StObject.set(x, "enableHttp2", value.asInstanceOf[js.Any])
      
      inline def setEnableHttp2Undefined: Self = StObject.set(x, "enableHttp2", js.undefined)
      
      inline def setIdleTimeout(value: Input[Double]): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setInternal(value: Input[Boolean]): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setIpAddressType(value: Input[IpAddressType]): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
      
      inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
      
      inline def setLoadBalancerType(value: Input[LoadBalancerType]): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetMappings(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]
              ]
            ]
      ): Self = StObject.set(x, "subnetMappings", value.asInstanceOf[js.Any])
      
      inline def setSubnetMappingsUndefined: Self = StObject.set(x, "subnetMappings", js.undefined)
      
      inline def setSubnetMappingsVarargs(value: Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]*): Self = StObject.set(x, "subnetMappings", js.Array(value :_*))
      
      inline def setSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
      
      inline def setSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait LoadBalancerState extends StObject {
    
    /**
      * An Access Logs block. Access Logs documented below.
      */
    val accessLogs: js.UndefOr[
        Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs]
      ] = js.undefined
    
    /**
      * The ARN of the load balancer (matches `id`).
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN suffix for use with CloudWatch Metrics.
      */
    val arnSuffix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the customer owned ipv4 pool to use for this load balancer.
      */
    val customerOwnedIpv4Pool: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The DNS name of the load balancer.
      */
    val dnsName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether HTTP headers with header fields that are not valid are removed by the load balancer (true) or routed to targets (false). The default is false. Elastic Load Balancing requires that message header names contain only alphanumeric characters and hyphens. Only valid for Load Balancers of type `application`.
      */
    val dropInvalidHeaderFields: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, cross-zone load balancing of the load balancer will be enabled.
      * This is a `network` load balancer feature. Defaults to `false`.
      */
    val enableCrossZoneLoadBalancing: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If true, deletion of the load balancer will be disabled via
      * the AWS API. This will prevent this provider from deleting the load balancer. Defaults to `false`.
      */
    val enableDeletionProtection: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
      */
    val enableHttp2: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
      */
    val idleTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * If true, the LB will be internal.
      */
    val internal: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
      */
    val ipAddressType: js.UndefOr[Input[IpAddressType]] = js.undefined
    
    /**
      * The type of load balancer to create. Possible values are `application`, `gateway`, or `network`. The default value is `application`.
      */
    val loadBalancerType: js.UndefOr[Input[LoadBalancerType]] = js.undefined
    
    /**
      * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
      * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
      * this provider will autogenerate a name beginning with `tf-lb`.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A subnet mapping block as documented below.
      */
    val subnetMappings: js.UndefOr[
        Input[
          js.Array[
            Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]
          ]
        ]
      ] = js.undefined
    
    /**
      * A list of subnet IDs to attach to the LB. Subnets
      * cannot be updated for Load Balancers of type `network`. Changing this value
      * for load balancers of type `network` will force a recreation of the resource.
      */
    val subnets: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The canonical hosted zone ID of the load balancer (to be used in a Route 53 Alias record).
      * * `subnet_mapping.*.outpost_id` - ID of the Outpost containing the load balancer.
      */
    val zoneId: js.UndefOr[Input[String]] = js.undefined
  }
  object LoadBalancerState {
    
    inline def apply(): LoadBalancerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerState]
    }
    
    extension [Self <: LoadBalancerState](x: Self) {
      
      inline def setAccessLogs(value: Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerAccessLogs]): Self = StObject.set(x, "accessLogs", value.asInstanceOf[js.Any])
      
      inline def setAccessLogsUndefined: Self = StObject.set(x, "accessLogs", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnSuffix(value: Input[String]): Self = StObject.set(x, "arnSuffix", value.asInstanceOf[js.Any])
      
      inline def setArnSuffixUndefined: Self = StObject.set(x, "arnSuffix", js.undefined)
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCustomerOwnedIpv4Pool(value: Input[String]): Self = StObject.set(x, "customerOwnedIpv4Pool", value.asInstanceOf[js.Any])
      
      inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "customerOwnedIpv4Pool", js.undefined)
      
      inline def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      inline def setDropInvalidHeaderFields(value: Input[Boolean]): Self = StObject.set(x, "dropInvalidHeaderFields", value.asInstanceOf[js.Any])
      
      inline def setDropInvalidHeaderFieldsUndefined: Self = StObject.set(x, "dropInvalidHeaderFields", js.undefined)
      
      inline def setEnableCrossZoneLoadBalancing(value: Input[Boolean]): Self = StObject.set(x, "enableCrossZoneLoadBalancing", value.asInstanceOf[js.Any])
      
      inline def setEnableCrossZoneLoadBalancingUndefined: Self = StObject.set(x, "enableCrossZoneLoadBalancing", js.undefined)
      
      inline def setEnableDeletionProtection(value: Input[Boolean]): Self = StObject.set(x, "enableDeletionProtection", value.asInstanceOf[js.Any])
      
      inline def setEnableDeletionProtectionUndefined: Self = StObject.set(x, "enableDeletionProtection", js.undefined)
      
      inline def setEnableHttp2(value: Input[Boolean]): Self = StObject.set(x, "enableHttp2", value.asInstanceOf[js.Any])
      
      inline def setEnableHttp2Undefined: Self = StObject.set(x, "enableHttp2", js.undefined)
      
      inline def setIdleTimeout(value: Input[Double]): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      inline def setInternal(value: Input[Boolean]): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setIpAddressType(value: Input[IpAddressType]): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
      
      inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
      
      inline def setLoadBalancerType(value: Input[LoadBalancerType]): Self = StObject.set(x, "loadBalancerType", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerTypeUndefined: Self = StObject.set(x, "loadBalancerType", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      inline def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      inline def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      inline def setSubnetMappings(
        value: Input[
              js.Array[
                Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]
              ]
            ]
      ): Self = StObject.set(x, "subnetMappings", value.asInstanceOf[js.Any])
      
      inline def setSubnetMappingsUndefined: Self = StObject.set(x, "subnetMappings", js.undefined)
      
      inline def setSubnetMappingsVarargs(value: Input[typings.pulumiAws.inputMod.applicationloadbalancing.LoadBalancerSubnetMapping]*): Self = StObject.set(x, "subnetMappings", js.Array(value :_*))
      
      inline def setSubnets(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
      
      inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
      
      inline def setSubnetsVarargs(value: Input[String]*): Self = StObject.set(x, "subnets", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setZoneId(value: Input[String]): Self = StObject.set(x, "zoneId", value.asInstanceOf[js.Any])
      
      inline def setZoneIdUndefined: Self = StObject.set(x, "zoneId", js.undefined)
    }
  }
}
