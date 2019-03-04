package typings
package atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTargetGroupResult extends js.Object {
  val arn: java.lang.String
  val arnSuffix: java.lang.String
  val deregistrationDelay: scala.Double
  val healthCheck: atPulumiAwsLib.Anon_HealthyThreshold
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val name: java.lang.String
  val port: scala.Double
  val protocol: java.lang.String
  val slowStart: scala.Double
  val stickiness: atPulumiAwsLib.Anon_CookieDuration
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
}

object GetTargetGroupResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    arnSuffix: java.lang.String,
    deregistrationDelay: scala.Double,
    healthCheck: atPulumiAwsLib.Anon_HealthyThreshold,
    id: java.lang.String,
    name: java.lang.String,
    port: scala.Double,
    protocol: java.lang.String,
    slowStart: scala.Double,
    stickiness: atPulumiAwsLib.Anon_CookieDuration,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String
  ): GetTargetGroupResult = {
    val __obj = js.Dynamic.literal(arn = arn, arnSuffix = arnSuffix, deregistrationDelay = deregistrationDelay, healthCheck = healthCheck, id = id, name = name, port = port, protocol = protocol, slowStart = slowStart, stickiness = stickiness, tags = tags, vpcId = vpcId)
  
    __obj.asInstanceOf[GetTargetGroupResult]
  }
}

