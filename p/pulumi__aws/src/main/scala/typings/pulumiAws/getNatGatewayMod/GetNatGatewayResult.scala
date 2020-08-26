package typings.pulumiAws.getNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetNatGatewayFilter
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
  val tags: StringDictionary[String] = js.native
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
    tags: StringDictionary[String],
    vpcId: String
  ): GetNatGatewayResult = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNatGatewayResult]
  }
  @scala.inline
  implicit class GetNatGatewayResultOps[Self <: GetNatGatewayResult] (val x: Self) extends AnyVal {
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
    def setAllocationId(value: String): Self = this.set("allocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateIp(value: String): Self = this.set("privateIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicIp(value: String): Self = this.set("publicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetNatGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetNatGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

