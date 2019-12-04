package typings.reactDashToolbox.componentsTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTheme extends js.Object {
  /**
    * Used for the `thead` element.
    */
  var head: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element of the component (`table`).
    */
  var table: js.UndefOr[String] = js.undefined
}

object TableTheme {
  @scala.inline
  def apply(head: String = null, table: String = null): TableTheme = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTheme]
  }
}

