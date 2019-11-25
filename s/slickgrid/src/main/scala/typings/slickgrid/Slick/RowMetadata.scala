package typings.slickgrid.Slick

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowMetadata[T] extends js.Object {
  /**
  		 * Metadata related to individual columns
  		 */
  var columns: js.UndefOr[
    (/**
  			 * Metadata indexed by column id
  			 */
  StringDictionary[ColumnMetadata[T]]) with (/**
  			 * Metadata indexed by column index
  			 */
  NumberDictionary[ColumnMetadata[T]])
  ] = js.undefined
  /**
  		 * One or more (space-separated) CSS classes to be added to the entire row.
  		 */
  var cssClasses: js.UndefOr[String] = js.undefined
  /**
  		 * Whether or not any cells in the row can be set as "active".
  		 */
  var focusable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Whether or not a row or any cells in it can be selected.
  		 */
  var selectable: js.UndefOr[Boolean] = js.undefined
}

object RowMetadata {
  @scala.inline
  def apply[T](
    columns: (/**
  			 * Metadata indexed by column id
  			 */
  StringDictionary[ColumnMetadata[T]]) with (/**
  			 * Metadata indexed by column index
  			 */
  NumberDictionary[ColumnMetadata[T]]) = null,
    cssClasses: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined
  ): RowMetadata[T] = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowMetadata[T]]
  }
}

