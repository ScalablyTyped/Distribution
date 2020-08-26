package typings.pulumiAws.getLocalGatewayVirtualInterfaceGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetLocalGatewayVirtualInterfaceGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalGatewayVirtualInterfaceGroupsArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetLocalGatewayVirtualInterfaceGroupsFilter]] = js.native
  /**
    * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetLocalGatewayVirtualInterfaceGroupsArgs {
  @scala.inline
  def apply(): GetLocalGatewayVirtualInterfaceGroupsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocalGatewayVirtualInterfaceGroupsArgs]
  }
  @scala.inline
  implicit class GetLocalGatewayVirtualInterfaceGroupsArgsOps[Self <: GetLocalGatewayVirtualInterfaceGroupsArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetLocalGatewayVirtualInterfaceGroupsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetLocalGatewayVirtualInterfaceGroupsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

