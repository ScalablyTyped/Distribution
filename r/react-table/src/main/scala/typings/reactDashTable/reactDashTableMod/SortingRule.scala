package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingRule extends js.Object {
  var desc: Boolean
  var id: String
}

object SortingRule {
  @scala.inline
  def apply(desc: Boolean, id: String): SortingRule = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortingRule]
  }
}

