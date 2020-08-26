package typings.pulumiAws.getSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubnetArgs extends js.Object {
  /**
    * The availability zone where the
    * subnet must reside.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * The ID of the Availability Zone for the subnet.
    */
  val availabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The cidr block of the desired subnet.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Boolean constraint for whether the desired
    * subnet must be the default subnet for its associated availability zone.
    */
  val defaultForAz: js.UndefOr[Boolean] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
  /**
    * The id of the specific subnet to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The Ipv6 cidr block of the desired subnet
    */
  val ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The state that the desired subnet must have.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired subnet.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The id of the VPC that the desired subnet belongs to.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetSubnetArgs {
  @scala.inline
  def apply(): GetSubnetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubnetArgs]
  }
  @scala.inline
  implicit class GetSubnetArgsOps[Self <: GetSubnetArgs] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("availabilityZoneId", js.undefined)
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    @scala.inline
    def setDefaultForAz(value: Boolean): Self = this.set("defaultForAz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultForAz: Self = this.set("defaultForAz", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetSubnetFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetSubnetFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
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

