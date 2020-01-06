package typings.atPulumiAws.ec2GetNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.GetNatGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNatGatewayResult extends js.Object {
  /**
    * The Id of the EIP allocated to the selected Nat Gateway.
    */
  val allocationId: String = js.native
  val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.native
  val id: String = js.native
  /**
    * The Id of the ENI allocated to the selected Nat Gateway.
    */
  val networkInterfaceId: String = js.native
  /**
    * The private Ip address of the selected Nat Gateway.
    */
  val privateIp: String = js.native
  /**
    * The public Ip (EIP) address of the selected Nat Gateway.
    */
  val publicIp: String = js.native
  val state: String = js.native
  val subnetId: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetNatGatewayResult {
  @scala.inline
  def apply(
    allocationId: String,
    id: String,
    networkInterfaceId: String,
    privateIp: String,
    publicIp: String,
    state: String,
    subnetId: String,
    tags: StringDictionary[js.Any],
    vpcId: String,
    filters: js.Array[GetNatGatewayFilter] = null
  ): GetNatGatewayResult = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNatGatewayResult]
  }
}

