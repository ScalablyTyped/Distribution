package typings.rcTable

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenColumns extends js.Object {
  var children: ReactNode
  var columns: js.Any
}

object AnonChildrenColumns {
  @scala.inline
  def apply(columns: js.Any, children: ReactNode = null): AnonChildrenColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenColumns]
  }
}

