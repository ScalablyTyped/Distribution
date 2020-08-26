package typings.pulumiAws.getInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInstancesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
  /**
    * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
    */
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A map of tags, each pair of which must
    * exactly match a pair on desired instances.
    */
  val instanceTags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetInstancesArgs {
  @scala.inline
  def apply(): GetInstancesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancesArgs]
  }
  @scala.inline
  implicit class GetInstancesArgsOps[Self <: GetInstancesArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetInstancesFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstancesFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setInstanceStateNamesVarargs(value: String*): Self = this.set("instanceStateNames", js.Array(value :_*))
    @scala.inline
    def setInstanceStateNames(value: js.Array[String]): Self = this.set("instanceStateNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceStateNames: Self = this.set("instanceStateNames", js.undefined)
    @scala.inline
    def setInstanceTags(value: StringDictionary[String]): Self = this.set("instanceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTags: Self = this.set("instanceTags", js.undefined)
  }
  
}

