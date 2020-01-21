package typings.pulumiAws.getVpnGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetVpnGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayResult extends js.Object {
  val amazonSideAsn: String = js.native
  val attachedVpcId: String = js.native
  val availabilityZone: String = js.native
  val filters: js.UndefOr[js.Array[GetVpnGatewayFilter]] = js.native
  val id: String = js.native
  val state: String = js.native
  val tags: StringDictionary[js.Any] = js.native
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
    val __obj = js.Dynamic.literal(amazonSideAsn = amazonSideAsn.asInstanceOf[js.Any], attachedVpcId = attachedVpcId.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnGatewayResult]
  }
}

