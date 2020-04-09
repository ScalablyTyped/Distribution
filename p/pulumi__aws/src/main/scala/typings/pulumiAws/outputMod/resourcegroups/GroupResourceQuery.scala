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
  def apply(query: String, `type`: String = null): GroupResourceQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupResourceQuery]
  }
}

