package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a specific column to be rendered.
  */
trait Column[T] extends js.Object {
  /**
    * A class name to be applied to the cells in the column
    */
  var cellClass: js.UndefOr[String] = js.undefined
  /**
    * Whether this column can be dragged (re-arranged).
    * @default false
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this column can be edited.
    * @default false
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * The editor for this column. Several editors are available in "react-data-grid/addons".
    * @default A simple text editor
    */
  var editor: js.UndefOr[
    ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps]
  ] = js.undefined
  /**
    * Events to be bound to the cells in this specific column.
    * Each event must respect this standard in order to work correctly:
    * @example
    * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
    */
  var events: js.UndefOr[StringDictionary[ColumnEventCallback]] = js.undefined
  /**
    * A custom formatter for this column's filter.
    */
  var filterRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * Whether the rows in the grid can be filtered by this column.
    * @default false
    */
  var filterable: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
    */
  var formatter: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * Retrieve meta data about the row, optionally provide column as a second argument
    */
  var getRowMetaData: js.UndefOr[js.Function2[/* rowdata */ T, /* column */ js.UndefOr[Column[T]], _]] = js.undefined
  /**
    * A custom formatter for this column's header.
    */
  var headerRenderer: js.UndefOr[ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_]] = js.undefined
  /**
    * A unique key for this column. Required.
    * Each row should have a property with this name, which contains this column's value.
    */
  var key: String
  /**
    * Whether this column should stay fixed on the left as the user scrolls horizontally.
    * @default false
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  /**
    * This column's display name. Required.
    */
  var name: String
  /**
    * Whether this column can be resized by the user.
    * @default false
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the rows in the grid can be sorted by this column.
    * @default false
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom width for this specific column.
    * @default minColumnWidth from the ReactDataGrid
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Column {
  @scala.inline
  def apply[T](
    key: String,
    name: String,
    cellClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    editor: ReactElement | (ComponentClass[EditorBaseProps, ComponentState]) | StatelessComponent[EditorBaseProps] = null,
    events: StringDictionary[ColumnEventCallback] = null,
    filterRenderer: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    formatter: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    getRowMetaData: (/* rowdata */ T, /* column */ js.UndefOr[Column[T]]) => _ = null,
    headerRenderer: ReactElement | (ComponentClass[_, ComponentState]) | StatelessComponent[_] = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    sortable: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): Column[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (filterRenderer != null) __obj.updateDynamic("filterRenderer")(filterRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (getRowMetaData != null) __obj.updateDynamic("getRowMetaData")(js.Any.fromFunction2(getRowMetaData))
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(headerRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

