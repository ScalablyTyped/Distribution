package typings
package reactDashCollapseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collapse extends js.Object {
  var collapse: java.lang.String
  var content: java.lang.String
}

object Anon_Collapse {
  @scala.inline
  def apply(collapse: java.lang.String, content: java.lang.String): Anon_Collapse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collapse")(collapse)
    __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[Anon_Collapse]
  }
}

