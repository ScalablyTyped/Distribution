package typings.atPulumiAws.elasticloadbalancingv2GetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2Ns.GetTargetGroupHealthCheck
import typings.atPulumiAws.typesOutputMod.elasticloadbalancingv2Ns.GetTargetGroupStickiness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupResult extends js.Object {
  val arn: String
  val arnSuffix: String
  val deregistrationDelay: Double
  val healthCheck: GetTargetGroupHealthCheck
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val lambdaMultiValueHeadersEnabled: Boolean
  val name: String
  val port: Double
  val protocol: String
  val proxyProtocolV2: Boolean
  val slowStart: Double
  val stickiness: GetTargetGroupStickiness
  val tags: StringDictionary[js.Any]
  val targetType: String
  val vpcId: String
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
    name: String,
    port: Double,
    protocol: String,
    proxyProtocolV2: Boolean,
    slowStart: Double,
    stickiness: GetTargetGroupStickiness,
    tags: StringDictionary[js.Any],
    targetType: String,
    vpcId: String
  ): GetTargetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, arnSuffix = arnSuffix, deregistrationDelay = deregistrationDelay, healthCheck = healthCheck, id = id, lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled, name = name, port = port, protocol = protocol, proxyProtocolV2 = proxyProtocolV2, slowStart = slowStart, stickiness = stickiness, tags = tags, targetType = targetType, vpcId = vpcId)
  
    __obj.asInstanceOf[GetTargetGroupResult]
  }
}

