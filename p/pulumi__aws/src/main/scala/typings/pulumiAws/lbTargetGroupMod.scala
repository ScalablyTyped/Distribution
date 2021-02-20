package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.lb.TargetGroupHealthCheck
import typings.pulumiAws.outputMod.lb.TargetGroupStickiness
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbTargetGroupMod {
  
  @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup")
  @js.native
  class TargetGroup protected () extends CustomResource {
    /**
      * Create a TargetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TargetGroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: TargetGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the Target Group (matches `id`)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN suffix for use with CloudWatch Metrics.
      */
    val arnSuffix: Output_[String] = js.native
    
    /**
      * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
      */
    val deregistrationDelay: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A Health Check block. Health Check blocks are documented below.
      */
    val healthCheck: Output_[TargetGroupHealthCheck] = js.native
    
    /**
      * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
      */
    val lambdaMultiValueHeadersEnabled: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
      */
    val loadBalancingAlgorithmType: Output_[String] = js.native
    
    /**
      * The name of the target group. If omitted, this provider will assign a random, unique name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val port: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The protocol to use for routing traffic to the targets. Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val protocol: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
      */
    val proxyProtocolV2: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
      */
    val slowStart: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * A Stickiness block. Stickiness blocks are documented below.
      */
    val stickiness: Output_[TargetGroupStickiness] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The type of target that you must specify when registering targets with this target group.
      * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
      * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
      * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
      * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
      * You can't specify publicly routable IP addresses.
      */
    val targetType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val vpcId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object TargetGroup {
    
    /**
      * Get an existing TargetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): TargetGroup = js.native
    @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TargetGroup = js.native
    @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState): TargetGroup = js.native
    @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: TargetGroupState, opts: CustomResourceOptions): TargetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of TargetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lb/targetGroup", "TargetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/targetGroup.TargetGroup */ Boolean = js.native
  }
  
  @js.native
  trait TargetGroupArgs extends StObject {
    
    /**
      * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
      */
    val deregistrationDelay: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A Health Check block. Health Check blocks are documented below.
      */
    val healthCheck: js.UndefOr[Input[typings.pulumiAws.inputMod.lb.TargetGroupHealthCheck]] = js.native
    
    /**
      * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
      */
    val lambdaMultiValueHeadersEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
      */
    val loadBalancingAlgorithmType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the target group. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The protocol to use for routing traffic to the targets. Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val protocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
      */
    val proxyProtocolV2: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
      */
    val slowStart: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A Stickiness block. Stickiness blocks are documented below.
      */
    val stickiness: js.UndefOr[Input[typings.pulumiAws.inputMod.lb.TargetGroupStickiness]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of target that you must specify when registering targets with this target group.
      * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
      * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
      * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
      * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
      * You can't specify publicly routable IP addresses.
      */
    val targetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object TargetGroupArgs {
    
    @scala.inline
    def apply(): TargetGroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGroupArgs]
    }
    
    @scala.inline
    implicit class TargetGroupArgsMutableBuilder[Self <: TargetGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeregistrationDelay(value: Input[Double]): Self = StObject.set(x, "deregistrationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeregistrationDelayUndefined: Self = StObject.set(x, "deregistrationDelay", js.undefined)
      
      @scala.inline
      def setHealthCheck(value: Input[typings.pulumiAws.inputMod.lb.TargetGroupHealthCheck]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
      
      @scala.inline
      def setLambdaMultiValueHeadersEnabled(value: Input[Boolean]): Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaMultiValueHeadersEnabledUndefined: Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", js.undefined)
      
      @scala.inline
      def setLoadBalancingAlgorithmType(value: Input[String]): Self = StObject.set(x, "loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancingAlgorithmTypeUndefined: Self = StObject.set(x, "loadBalancingAlgorithmType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProxyProtocolV2(value: Input[Boolean]): Self = StObject.set(x, "proxyProtocolV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyProtocolV2Undefined: Self = StObject.set(x, "proxyProtocolV2", js.undefined)
      
      @scala.inline
      def setSlowStart(value: Input[Double]): Self = StObject.set(x, "slowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowStartUndefined: Self = StObject.set(x, "slowStart", js.undefined)
      
      @scala.inline
      def setStickiness(value: Input[typings.pulumiAws.inputMod.lb.TargetGroupStickiness]): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
  
  @js.native
  trait TargetGroupState extends StObject {
    
    /**
      * The ARN of the Target Group (matches `id`)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN suffix for use with CloudWatch Metrics.
      */
    val arnSuffix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
      */
    val deregistrationDelay: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A Health Check block. Health Check blocks are documented below.
      */
    val healthCheck: js.UndefOr[Input[typings.pulumiAws.inputMod.lb.TargetGroupHealthCheck]] = js.native
    
    /**
      * Boolean whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `targetType` is `lambda`.
      */
    val lambdaMultiValueHeadersEnabled: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `roundRobin` or `leastOutstandingRequests`. The default is `roundRobin`.
      */
    val loadBalancingAlgorithmType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the target group. If omitted, this provider will assign a random, unique name.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which targets receive traffic, unless overridden when registering a specific target. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The protocol to use for routing traffic to the targets. Should be one of `GENEVE`, `HTTP`, `HTTPS`, `TCP`, `TCP_UDP`, `TLS`, or `UDP`. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val protocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
      */
    val proxyProtocolV2: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
      */
    val slowStart: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A Stickiness block. Stickiness blocks are documented below.
      */
    val stickiness: js.UndefOr[Input[typings.pulumiAws.inputMod.lb.TargetGroupStickiness]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The type of target that you must specify when registering targets with this target group.
      * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
      * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
      * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
      * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
      * You can't specify publicly routable IP addresses.
      */
    val targetType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The identifier of the VPC in which to create the target group. Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object TargetGroupState {
    
    @scala.inline
    def apply(): TargetGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TargetGroupState]
    }
    
    @scala.inline
    implicit class TargetGroupStateMutableBuilder[Self <: TargetGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnSuffix(value: Input[String]): Self = StObject.set(x, "arnSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnSuffixUndefined: Self = StObject.set(x, "arnSuffix", js.undefined)
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDeregistrationDelay(value: Input[Double]): Self = StObject.set(x, "deregistrationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeregistrationDelayUndefined: Self = StObject.set(x, "deregistrationDelay", js.undefined)
      
      @scala.inline
      def setHealthCheck(value: Input[typings.pulumiAws.inputMod.lb.TargetGroupHealthCheck]): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
      
      @scala.inline
      def setLambdaMultiValueHeadersEnabled(value: Input[Boolean]): Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLambdaMultiValueHeadersEnabledUndefined: Self = StObject.set(x, "lambdaMultiValueHeadersEnabled", js.undefined)
      
      @scala.inline
      def setLoadBalancingAlgorithmType(value: Input[String]): Self = StObject.set(x, "loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancingAlgorithmTypeUndefined: Self = StObject.set(x, "loadBalancingAlgorithmType", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setProxyProtocolV2(value: Input[Boolean]): Self = StObject.set(x, "proxyProtocolV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyProtocolV2Undefined: Self = StObject.set(x, "proxyProtocolV2", js.undefined)
      
      @scala.inline
      def setSlowStart(value: Input[Double]): Self = StObject.set(x, "slowStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlowStartUndefined: Self = StObject.set(x, "slowStart", js.undefined)
      
      @scala.inline
      def setStickiness(value: Input[typings.pulumiAws.inputMod.lb.TargetGroupStickiness]): Self = StObject.set(x, "stickiness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickinessUndefined: Self = StObject.set(x, "stickiness", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTargetType(value: Input[String]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
