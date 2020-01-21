package typings.pulumiAws.outputMod.resourcegroups

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupResourceQuery extends js.Object {
  var query: String = js.native
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

