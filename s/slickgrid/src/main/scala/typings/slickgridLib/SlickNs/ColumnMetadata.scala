package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMetadata[T /* <: SlickData */] extends js.Object {
  /**
  		 * Number of columns this cell will span. Can also contain "*" to indicate that the cell should span the rest of the row.
  		 */
  var colspan: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  		 * A custom cell editor.
  		 */
  var editor: js.UndefOr[slickgridLib.SlickNs.EditorsNs.Editor[T]] = js.undefined
  /**
  		 * Whether or not a cell can be set as "active".
  		 */
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * A custom cell formatter.
  		 */
  var formatter: js.UndefOr[Formatter[T]] = js.undefined
  /**
  		 * Whether or not a cell can be selected.
  		 */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnMetadata {
  @scala.inline
  def apply[T /* <: SlickData */](
    colspan: scala.Double | java.lang.String = null,
    editor: slickgridLib.SlickNs.EditorsNs.Editor[T] = null,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: Formatter[T] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnMetadata[T] = {
    val __obj = js.Dynamic.literal()
    if (colspan != null) __obj.updateDynamic("colspan")(colspan.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[ColumnMetadata[T]]
  }
}

