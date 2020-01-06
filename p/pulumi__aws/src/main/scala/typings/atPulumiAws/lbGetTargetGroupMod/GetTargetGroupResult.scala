package typings.atPulumiAws.lbGetTargetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.lb.GetTargetGroupHealthCheck
import typings.atPulumiAws.typesOutputMod.lb.GetTargetGroupStickiness
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
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val lambdaMultiValueHeadersEnabled: Boolean = js.native
  val name: String = js.native
  val port: Double = js.native
  val protocol: String = js.native
  val proxyProtocolV2: Boolean = js.native
  val slowStart: Double = js.native
  val stickiness: GetTargetGroupStickiness = js.native
  val tags: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], arnSuffix = arnSuffix.asInstanceOf[js.Any], deregistrationDelay = deregistrationDelay.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lambdaMultiValueHeadersEnabled = lambdaMultiValueHeadersEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], proxyProtocolV2 = proxyProtocolV2.asInstanceOf[js.Any], slowStart = slowStart.asInstanceOf[js.Any], stickiness = stickiness.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTargetGroupResult]
  }
}

