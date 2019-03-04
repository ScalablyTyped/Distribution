package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

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
  var cellClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether this column can be dragged (re-arranged).
    * @default false
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this column can be edited.
    * @default false
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The editor for this column. Several editors are available in "react-data-grid/addons".
    * @default A simple text editor
    */
  var editor: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[EditorBaseProps] | (reactLib.reactMod.ReactNs.ComponentClass[EditorBaseProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[EditorBaseProps]
  ] = js.undefined
  /**
    * Events to be bound to the cells in this specific column.
    * Each event must respect this standard in order to work correctly:
    * @example
    * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
    */
  var events: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ColumnEventCallback]] = js.undefined
  /**
    * A custom formatter for this column's filter.
    */
  var filterRenderer: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * Whether the rows in the grid can be filtered by this column.
    * @default false
    */
  var filterable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom read-only formatter for this column. An image formatter is available in "react-data-grid/addons".
    */
  var formatter: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * Retrieve meta data about the row, optionally provide column as a second argument
    */
  var getRowMetaData: js.UndefOr[js.Function2[/* rowdata */ T, /* column */ js.UndefOr[Column[T]], _]] = js.undefined
  /**
    * A custom formatter for this column's header.
    */
  var headerRenderer: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * A unique key for this column. Required.
    * Each row should have a property with this name, which contains this column's value.
    */
  var key: java.lang.String
  /**
    * Whether this column should stay fixed on the left as the user scrolls horizontally.
    * @default false
    */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This column's display name. Required.
    */
  var name: java.lang.String
  /**
    * Whether this column can be resized by the user.
    * @default false
    */
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the rows in the grid can be sorted by this column.
    * @default false
    */
  var sortable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A custom width for this specific column.
    * @default minColumnWidth from the ReactDataGrid
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Column {
  @scala.inline
  def apply[T](
    key: java.lang.String,
    name: java.lang.String,
    cellClass: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    editor: reactLib.reactMod.ReactNs.ReactElement[EditorBaseProps] | (reactLib.reactMod.ReactNs.ComponentClass[EditorBaseProps, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[EditorBaseProps] = null,
    events: org.scalablytyped.runtime.StringDictionary[ColumnEventCallback] = null,
    filterRenderer: reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    filterable: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    getRowMetaData: js.Function2[/* rowdata */ T, /* column */ js.UndefOr[Column[T]], _] = null,
    headerRenderer: reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    locked: js.UndefOr[scala.Boolean] = js.undefined,
    resizable: js.UndefOr[scala.Boolean] = js.undefined,
    sortable: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): Column[T] = {
    val __obj = js.Dynamic.literal(key = key, name = name)
    if (cellClass != null) __obj.updateDynamic("cellClass")(cellClass)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (filterRenderer != null) __obj.updateDynamic("filterRenderer")(filterRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (getRowMetaData != null) __obj.updateDynamic("getRowMetaData")(getRowMetaData)
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(headerRenderer.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[T]]
  }
}

