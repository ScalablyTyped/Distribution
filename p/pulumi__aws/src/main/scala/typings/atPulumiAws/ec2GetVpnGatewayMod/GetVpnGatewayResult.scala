package typings.atPulumiAws.ec2GetVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnGatewayResult extends js.Object {
  val amazonSideAsn: String
  val attachedVpcId: String
  val availabilityZone: String
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.undefined
  val id: String
  val state: String
  val tags: StringDictionary[js.Any]
}

object GetVpnGatewayResult {
  @scala.inline
  def apply(
    amazonSideAsn: String,
    attachedVpcId: String,
    availabilityZone: String,
    id: String,
    state: String,
    tags: StringDictionary[js.Any],
    filters: js.Array[GetVpnGatewayFilter] = null
  ): GetVpnGatewayResult = {
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn, attachedVpcId = attachedVpcId, availabilityZone = availabilityZone, id = id, state = state, tags = tags)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetVpnGatewayResult]
  }
}

