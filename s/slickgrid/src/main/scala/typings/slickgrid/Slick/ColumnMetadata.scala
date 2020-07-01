package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnMetadata[T /* <: SlickData */] extends js.Object {
  /**
    * Number of columns this cell will span. Can also contain "*" to indicate that the cell should span the rest of the row.
    */
  var colspan: js.UndefOr[Double | String] = js.undefined
  /**
    * A custom cell editor.
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
    * Whether or not a cell can be set as "active".
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom cell formatter.
    */
  var formatter: js.UndefOr[Formatter[T]] = js.undefined
  /**
    * Whether or not a cell can be selected.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
}

object ColumnMetadata {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](
    colspan: Double | String = null,
    editor: js.Any = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    formatter: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => String = null,
    selectable: js.UndefOr[Boolean] = js.undefined
  ): ColumnMetadata[T] = {
    val __obj = js.Dynamic.literal()
    if (colspan != null) __obj.updateDynamic("colspan")(colspan.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.get.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction5(formatter))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata[T]]
  }
}

