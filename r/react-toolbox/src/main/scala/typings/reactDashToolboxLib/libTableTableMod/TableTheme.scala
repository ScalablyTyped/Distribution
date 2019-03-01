package typings
package reactDashToolboxLib.libTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableTheme extends js.Object {
  /**
    * Used for the `thead` element.
    */
  var head: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element of the component (`table`).
    */
  var table: js.UndefOr[java.lang.String] = js.undefined
}

object TableTheme {
  @scala.inline
  def apply(head: java.lang.String = null, table: java.lang.String = null): TableTheme = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head)
    if (table != null) __obj.updateDynamic("table")(table)
    __obj.asInstanceOf[TableTheme]
  }
}

