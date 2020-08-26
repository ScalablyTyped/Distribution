package typings.pulumiAws.getSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.GetSecurityGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupsResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetSecurityGroupsFilter]] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * IDs of the matches security groups.
    */
  val ids: js.Array[String] = js.native
  val tags: StringDictionary[String] = js.native
  /**
    * The VPC IDs of the matched security groups. The data source's tag or filter *will span VPCs*
    * unless the `vpc-id` filter is also used.
    */
  val vpcIds: js.Array[String] = js.native
}

object GetSecurityGroupsResult {
  @scala.inline
  def apply(id: String, ids: js.Array[String], tags: StringDictionary[String], vpcIds: js.Array[String]): GetSecurityGroupsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcIds = vpcIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityGroupsResult]
  }
  @scala.inline
  implicit class GetSecurityGroupsResultOps[Self <: GetSecurityGroupsResult] (val x: Self) extends AnyVal {
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcIdsVarargs(value: String*): Self = this.set("vpcIds", js.Array(value :_*))
    @scala.inline
    def setVpcIds(value: js.Array[String]): Self = this.set("vpcIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetSecurityGroupsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetSecurityGroupsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

