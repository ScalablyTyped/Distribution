package typings.rcDashTable

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenColumns extends js.Object {
  var children: ReactNode
  var columns: js.Any
}

object Anon_ChildrenColumns {
  @scala.inline
  def apply(columns: js.Any, children: ReactNode = null): Anon_ChildrenColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenColumns]
  }
}

