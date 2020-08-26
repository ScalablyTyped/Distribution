package typings.pulumiAws.elasticloadbalancingv2TargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.elasticloadbalancingv2.TargetGroupHealthCheck
import typings.pulumiAws.inputMod.elasticloadbalancingv2.TargetGroupStickiness
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupState extends js.Object {
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
  val healthCheck: js.UndefOr[Input[TargetGroupHealthCheck]] = js.native
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
    * The protocol to use for routing traffic to the targets. Should be one of "TCP", "TLS", "UDP", "TCP_UDP", "HTTP" or "HTTPS". Required when `targetType` is `instance` or `ip`. Does not apply when `targetType` is `lambda`.
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
    * A Stickiness block. Stickiness blocks are documented below. `stickiness` is only valid if used with Load Balancers of type `Application`
    */
  val stickiness: js.UndefOr[Input[TargetGroupStickiness]] = js.native
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
  implicit class TargetGroupStateOps[Self <: TargetGroupState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setArnSuffix(value: Input[String]): Self = this.set("arnSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArnSuffix: Self = this.set("arnSuffix", js.undefined)
    @scala.inline
    def setDeregistrationDelay(value: Input[Double]): Self = this.set("deregistrationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeregistrationDelay: Self = this.set("deregistrationDelay", js.undefined)
    @scala.inline
    def setHealthCheck(value: Input[TargetGroupHealthCheck]): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    @scala.inline
    def setLambdaMultiValueHeadersEnabled(value: Input[Boolean]): Self = this.set("lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaMultiValueHeadersEnabled: Self = this.set("lambdaMultiValueHeadersEnabled", js.undefined)
    @scala.inline
    def setLoadBalancingAlgorithmType(value: Input[String]): Self = this.set("loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancingAlgorithmType: Self = this.set("loadBalancingAlgorithmType", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProxyProtocolV2(value: Input[Boolean]): Self = this.set("proxyProtocolV2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyProtocolV2: Self = this.set("proxyProtocolV2", js.undefined)
    @scala.inline
    def setSlowStart(value: Input[Double]): Self = this.set("slowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlowStart: Self = this.set("slowStart", js.undefined)
    @scala.inline
    def setStickiness(value: Input[TargetGroupStickiness]): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickiness: Self = this.set("stickiness", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetType(value: Input[String]): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

