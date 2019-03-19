package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingRule extends js.Object {
  var desc: scala.Boolean
  var id: java.lang.String
}

object SortingRule {
  @scala.inline
  def apply(desc: scala.Boolean, id: java.lang.String): SortingRule = {
    val __obj = js.Dynamic.literal(desc = desc, id = id)
  
    __obj.asInstanceOf[SortingRule]
  }
}

