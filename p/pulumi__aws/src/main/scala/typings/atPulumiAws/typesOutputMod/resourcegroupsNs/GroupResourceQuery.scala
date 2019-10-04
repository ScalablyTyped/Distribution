package typings.atPulumiAws.typesOutputMod.resourcegroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupResourceQuery extends js.Object {
  var query: String
  var `type`: js.UndefOr[String] = js.undefined
}

object GroupResourceQuery {
  @scala.inline
  def apply(query: String, `type`: String = null): GroupResourceQuery = {
    val __obj = js.Dynamic.literal(query = query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GroupResourceQuery]
  }
}

