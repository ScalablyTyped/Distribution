package typings.reactDashCollapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Collapse extends js.Object {
  var collapse: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[String] = js.undefined
}

object Anon_Collapse {
  @scala.inline
  def apply(collapse: String = null, content: String = null): Anon_Collapse = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[Anon_Collapse]
  }
}

