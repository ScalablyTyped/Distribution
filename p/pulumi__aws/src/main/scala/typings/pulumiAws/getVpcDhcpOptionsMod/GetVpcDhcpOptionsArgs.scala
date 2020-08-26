package typings.pulumiAws.getVpcDhcpOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcDhcpOptionsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcDhcpOptionsArgs extends js.Object {
  /**
    * The EC2 DHCP Options ID.
    */
  val dhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * List of custom filters as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcDhcpOptionsFilter]] = js.native
  /**
    * A map of tags assigned to the resource.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpcDhcpOptionsArgs {
  @scala.inline
  def apply(): GetVpcDhcpOptionsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcDhcpOptionsArgs]
  }
  @scala.inline
  implicit class GetVpcDhcpOptionsArgsOps[Self <: GetVpcDhcpOptionsArgs] (val x: Self) extends AnyVal {
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
    def setDhcpOptionsId(value: String): Self = this.set("dhcpOptionsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("dhcpOptionsId", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetVpcDhcpOptionsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpcDhcpOptionsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

