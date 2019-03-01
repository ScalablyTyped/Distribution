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

object RowMetadata {
  @scala.inline
  def apply[T](
    columns: /* import warning: ImportType.apply Failed type conversion: {[index: string] : slickgrid.Slick.ColumnMetadata<T>, [index: number] : slickgrid.Slick.ColumnMetadata<T>} */ js.Any = null,
    cssClasses: java.lang.String = null,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    selectable: js.UndefOr[scala.Boolean] = js.undefined
  ): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    __obj.asInstanceOf[RowMetadata[T]]
  }
}

