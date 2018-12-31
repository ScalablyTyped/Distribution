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

