package typings.atPulumiAws.ec2GetNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2Ns.GetNatGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNatGatewayResult extends js.Object {
  /**
    * The Id of the EIP allocated to the selected Nat Gateway.
    */
  val allocationId: String
  val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.undefined
  val id: String
  /**
    * The Id of the ENI allocated to the selected Nat Gateway.
    */
  val networkInterfaceId: String
  /**
    * The private Ip address of the selected Nat Gateway.
    */
  val privateIp: String
  /**
    * The public Ip (EIP) address of the selected Nat Gateway.
    */
  val publicIp: String
  val state: String
  val subnetId: String
  val tags: StringDictionary[js.Any]
  val vpcId: String
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
    val __obj = js.Dynamic.literal(allocationId = allocationId, id = id, networkInterfaceId = networkInterfaceId, privateIp = privateIp, publicIp = publicIp, state = state, subnetId = subnetId, tags = tags, vpcId = vpcId)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[GetNatGatewayResult]
  }
}

