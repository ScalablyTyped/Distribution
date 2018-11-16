package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

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
    reactLib.reactMod.ReactNs.ReactElement[reactDashDataDashGridLib.AdazzleReactDataGridNs.EditorBaseProps] | (reactLib.reactMod.ReactNs.ComponentClass[
      reactDashDataDashGridLib.AdazzleReactDataGridNs.EditorBaseProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]) | reactLib.reactMod.ReactNs.StatelessComponent[reactDashDataDashGridLib.AdazzleReactDataGridNs.EditorBaseProps]
  ] = js.undefined
  /**
           * Events to be bound to the cells in this specific column.
           * Each event must respect this standard in order to work correctly:
           * @example
           * function onXxx(ev :SyntheticEvent, (rowIdx, idx, name): args)
           */
  var events: js.UndefOr[
    ScalablyTyped.runtime.StringDictionary[reactDashDataDashGridLib.AdazzleReactDataGridNs.ColumnEventCallback]
  ] = js.undefined
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
  var getRowMetaData: js.UndefOr[
    js.Function2[
      /* rowdata */ T, 
      /* column */ js.UndefOr[reactDashDataDashGridLib.AdazzleReactDataGridNs.Column[T]], 
      _
    ]
  ] = js.undefined
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

