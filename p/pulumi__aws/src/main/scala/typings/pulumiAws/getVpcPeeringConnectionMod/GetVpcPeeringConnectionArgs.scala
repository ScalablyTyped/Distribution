package typings.pulumiAws.getVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcPeeringConnectionArgs extends js.Object {
  /**
    * The CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
  /**
    * The ID of the specific VPC Peering Connection to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val ownerId: js.UndefOr[String] = js.native
  /**
    * The CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerCidrBlock: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerOwnerId: js.UndefOr[String] = js.native
  /**
    * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerRegion: js.UndefOr[String] = js.native
  /**
    * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerVpcId: js.UndefOr[String] = js.native
  /**
    * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val region: js.UndefOr[String] = js.native
  /**
    * The status of the specific VPC Peering Connection to retrieve.
    */
  val status: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired VPC Peering Connection.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetVpcPeeringConnectionArgs {
  @scala.inline
  def apply(): GetVpcPeeringConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcPeeringConnectionArgs]
  }
  @scala.inline
  implicit class GetVpcPeeringConnectionArgsOps[Self <: GetVpcPeeringConnectionArgs] (val x: Self) extends AnyVal {
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
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetVpcPeeringConnectionFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpcPeeringConnectionFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setPeerCidrBlock(value: String): Self = this.set("peerCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerCidrBlock: Self = this.set("peerCidrBlock", js.undefined)
    @scala.inline
    def setPeerOwnerId(value: String): Self = this.set("peerOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerOwnerId: Self = this.set("peerOwnerId", js.undefined)
    @scala.inline
    def setPeerRegion(value: String): Self = this.set("peerRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerRegion: Self = this.set("peerRegion", js.undefined)
    @scala.inline
    def setPeerVpcId(value: String): Self = this.set("peerVpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerVpcId: Self = this.set("peerVpcId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

