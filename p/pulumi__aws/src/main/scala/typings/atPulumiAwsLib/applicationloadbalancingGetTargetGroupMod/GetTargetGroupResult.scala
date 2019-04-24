package typings
package atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupResult extends js.Object {
  val arn: java.lang.String
  val arnSuffix: java.lang.String
  val deregistrationDelay: scala.Double
  val healthCheck: atPulumiAwsLib.Anon_Enabled
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val lambdaMultiValueHeadersEnabled: scala.Boolean
  val name: java.lang.String
  val port: scala.Double
  val protocol: java.lang.String
  val proxyProtocolV2: scala.Boolean
  val slowStart: scala.Double
  val stickiness: atPulumiAwsLib.Anon_CookieDuration
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val targetType: java.lang.String
  val vpcId: java.lang.String
}

object GetTargetGroupResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    arnSuffix: java.lang.String,
    deregistrationDelay: scala.Double,
    healthCheck: atPulumiAwsLib.Anon_Enabled,
    id: java.lang.String,
    lambdaMultiValueHeadersEnabled: scala.Boolean,
    name: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String,
    proxyProtocolV2: scala.Boolean,
    slowStart: scala.Double,
    stickiness: atPulumiAwsLib.Anon_CookieDuration,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    targetType: java.lang.String,
    vpcId: java.lang.String
  ): GetTargetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, arnSuffix = arnSuffix, deregistrationDelay = deregistrationDelay, healthCheck = healthCheck, id = id, lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled, name = name, port = port, protocol = protocol, proxyProtocolV2 = proxyProtocolV2, slowStart = slowStart, stickiness = stickiness, tags = tags, targetType = targetType, vpcId = vpcId)
  
    __obj.asInstanceOf[GetTargetGroupResult]
  }
}

