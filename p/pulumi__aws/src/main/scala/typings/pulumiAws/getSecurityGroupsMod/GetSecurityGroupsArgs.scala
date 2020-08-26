package typings.pulumiAws.getSecurityGroupsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetSecurityGroupsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecurityGroupsArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-security-groups in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetSecurityGroupsFilter]] = js.native
  /**
    * A map of tags, each pair of which must exactly match for
    * desired security groups.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetSecurityGroupsArgs {
  @scala.inline
  def apply(): GetSecurityGroupsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityGroupsArgs]
  }
  @scala.inline
  implicit class GetSecurityGroupsArgsOps[Self <: GetSecurityGroupsArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetSecurityGroupsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetSecurityGroupsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

