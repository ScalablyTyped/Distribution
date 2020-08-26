package typings.pulumiAws.outputMod.resourcegroups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupResourceQuery extends js.Object {
  /**
    * The resource query as a JSON string.
    */
  var query: String = js.native
  /**
    * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object GroupResourceQuery {
  @scala.inline
  def apply(query: String): GroupResourceQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupResourceQuery]
  }
  @scala.inline
  implicit class GroupResourceQueryOps[Self <: GroupResourceQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

