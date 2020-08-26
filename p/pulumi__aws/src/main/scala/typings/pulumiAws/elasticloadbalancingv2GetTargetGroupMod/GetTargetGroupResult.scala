package typings.pulumiAws.elasticloadbalancingv2GetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticloadbalancingv2.GetTargetGroupHealthCheck
import typings.pulumiAws.outputMod.elasticloadbalancingv2.GetTargetGroupStickiness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTargetGroupResult extends js.Object {
  val arn: String = js.native
  val arnSuffix: String = js.native
  val deregistrationDelay: Double = js.native
  val healthCheck: GetTargetGroupHealthCheck = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val lambdaMultiValueHeadersEnabled: Boolean = js.native
  val loadBalancingAlgorithmType: String = js.native
  val name: String = js.native
  val port: Double = js.native
  val protocol: String = js.native
  val proxyProtocolV2: Boolean = js.native
  val slowStart: Double = js.native
  val stickiness: GetTargetGroupStickiness = js.native
  val tags: StringDictionary[String] = js.native
  val targetType: String = js.native
  val vpcId: String = js.native
}

object GetTargetGroupResult {
  @scala.inline
  def apply(
    arn: String,
    arnSuffix: String,
    deregistrationDelay: Double,
    healthCheck: GetTargetGroupHealthCheck,
    id: String,
    lambdaMultiValueHeadersEnabled: Boolean,
    loadBalancingAlgorithmType: String,
    name: String,
    port: Double,
    protocol: String,
    proxyProtocolV2: Boolean,
    slowStart: Double,
    stickiness: GetTargetGroupStickiness,
    tags: StringDictionary[String],
    targetType: String,
    vpcId: String
  ): GetTargetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], deregistrationDelay = deregistrationDelay.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled.asInstanceOf[js.Any], loadBalancingAlgorithmType = loadBalancingAlgorithmType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], proxyProtocolV2 = proxyProtocolV2.asInstanceOf[js.Any], slowStart = slowStart.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupResult]
  }
  @scala.inline
  implicit class GetTargetGroupResultOps[Self <: GetTargetGroupResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setArnSuffix(value: String): Self = this.set("arnSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeregistrationDelay(value: Double): Self = this.set("deregistrationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheck(value: GetTargetGroupHealthCheck): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLambdaMultiValueHeadersEnabled(value: Boolean): Self = this.set("lambdaMultiValueHeadersEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancingAlgorithmType(value: String): Self = this.set("loadBalancingAlgorithmType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyProtocolV2(value: Boolean): Self = this.set("proxyProtocolV2", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlowStart(value: Double): Self = this.set("slowStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setStickiness(value: GetTargetGroupStickiness): Self = this.set("stickiness", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetType(value: String): Self = this.set("targetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
  }
  
}

