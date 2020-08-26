package typings.pulumiAws.getVpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcArgs extends js.Object {
  /**
    * The cidr block of the desired VPC.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Boolean constraint on whether the desired VPC is
    * the default VPC for the region.
    */
  val default: js.UndefOr[Boolean] = js.native
  /**
    * The DHCP options id of the desired VPC.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcFilter]] = js.native
  /**
    * The id of the specific VPC to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The current state of the desired VPC.
    * Can be either `"pending"` or `"available"`.
    */
  val state: js.UndefOr[String] = js.native
  /**
    * A map of tags, each pair of which must exactly match
    * a pair on the desired VPC.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpcArgs {
  @scala.inline
  def apply(): GetVpcArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcArgs]
  }
  @scala.inline
  implicit class GetVpcArgsOps[Self <: GetVpcArgs] (val x: Self) extends AnyVal {
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
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDhcpOptionsId(value: String): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("dhcpOptionsId", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetVpcFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpcFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
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
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

