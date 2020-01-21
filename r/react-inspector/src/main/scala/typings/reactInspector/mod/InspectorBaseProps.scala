package typings.reactInspector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectorBaseProps extends js.Object {
  /**
    * Whether to inspect `data` in a table.
    */
  var table: js.UndefOr[Boolean] = js.undefined
}

object InspectorBaseProps {
  @scala.inline
  def apply(table: js.UndefOr[Boolean] = js.undefined): InspectorBaseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(table)) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectorBaseProps]
  }
}

