package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMetadata[T] extends js.Object {
  /**
  		 * Metadata related to individual columns
  		 */
  var columns: /* import warning: ImportType.apply Failed type conversion: {[index: string] : slickgrid.Slick.ColumnMetadata<T>, [index: number] : slickgrid.Slick.ColumnMetadata<T>} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[index: string] : slickgrid.Slick.ColumnMetadata<T>, [index: number] : slickgrid.Slick.ColumnMetadata<T>} */ js.Any
  ] = js.undefined
  /**
  		 * One or more (space-separated) CSS classes to be added to the entire row.
  		 */
  var cssClasses: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether or not any cells in the row can be set as "active".
  		 */
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Whether or not a row or any cells in it can be selected.
  		 */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
}

