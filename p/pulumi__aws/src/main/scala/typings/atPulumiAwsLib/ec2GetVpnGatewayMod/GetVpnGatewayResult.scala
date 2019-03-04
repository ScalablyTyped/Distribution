package typings
package atPulumiAwsLib.ec2GetVpnGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnGatewayResult extends js.Object {
  val amazonSideAsn: java.lang.String
  val attachedVpcId: java.lang.String
  val availabilityZone: java.lang.String
  val id: java.lang.String
  val state: java.lang.String
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetVpnGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: java.lang.String,
    attachedVpcId: java.lang.String,
    availabilityZone: java.lang.String,
    id: java.lang.String,
    state: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetVpnGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, attachedVpcId = attachedVpcId, availabilityZone = availabilityZone, id = id, state = state, tags = tags)
  
    __obj.asInstanceOf[GetVpnGatewayResult]
  }
}

