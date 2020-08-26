package typings.pulumiAws.getNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetNatGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNatGatewayArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.native
  /**
    * The id of the specific Nat Gateway to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The state of the NAT gateway (pending | failed | available | deleting | deleted ).
    */
  val state: js.UndefOr[String] = js.native
  /**
    * The id of subnet that the Nat Gateway resides in.
    */
  val subnetId: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired Nat Gateway.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The id of the VPC that the Nat Gateway resides in.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetNatGatewayArgs {
  @scala.inline
  def apply(): GetNatGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNatGatewayArgs]
  }
  @scala.inline
  implicit class GetNatGatewayArgsOps[Self <: GetNatGatewayArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetNatGatewayFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetNatGatewayFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
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

