package typings.pulumiAws.getLocalGatewayVirtualInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetLocalGatewayVirtualInterfaceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalGatewayVirtualInterfaceResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceFilter]] = js.native
  val id: String = js.native
  /**
    * Local address.
    */
  val localAddress: String = js.native
  /**
    * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
    */
  val localBgpAsn: Double = js.native
  /**
    * Identifier of the EC2 Local Gateway.
    */
  val localGatewayId: String = js.native
  val localGatewayVirtualInterfaceIds: js.Array[String] = js.native
  /**
    * Peer address.
    */
  val peerAddress: String = js.native
  /**
    * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
    */
  val peerBgpAsn: Double = js.native
  val tags: StringDictionary[String] = js.native
  /**
    * Virtual Local Area Network.
    */
  val vlan: Double = js.native
}

object GetLocalGatewayVirtualInterfaceResult {
  @scala.inline
  def apply(
    id: String,
    localAddress: String,
    localBgpAsn: Double,
    localGatewayId: String,
    localGatewayVirtualInterfaceIds: js.Array[String],
    peerAddress: String,
    peerBgpAsn: Double,
    tags: StringDictionary[String],
    vlan: Double
  ): GetLocalGatewayVirtualInterfaceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localBgpAsn = localBgpAsn.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds.asInstanceOf[js.Any], peerAddress = peerAddress.asInstanceOf[js.Any], peerBgpAsn = peerBgpAsn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vlan = vlan.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceResult]
  }
  @scala.inline
  implicit class GetLocalGatewayVirtualInterfaceResultOps[Self <: GetLocalGatewayVirtualInterfaceResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalBgpAsn(value: Double): Self = this.set("localBgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalGatewayVirtualInterfaceIdsVarargs(value: String*): Self = this.set("localGatewayVirtualInterfaceIds", js.Array(value :_*))
    @scala.inline
    def setLocalGatewayVirtualInterfaceIds(value: js.Array[String]): Self = this.set("localGatewayVirtualInterfaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerAddress(value: String): Self = this.set("peerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerBgpAsn(value: Double): Self = this.set("peerBgpAsn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVlan(value: Double): Self = this.set("vlan", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

