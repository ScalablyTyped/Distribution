package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.mod.Command
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.PluginKey
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTables.anon.FixTables
import typings.prosemirrorTables.anon.RecordTableRoleNodeType
import typings.prosemirrorTables.anon.UseDeprecatedLogic
import typings.prosemirrorTables.mod.^
import typings.prosemirrorTables.prosemirrorTablesStrings.horiz
import typings.prosemirrorTables.prosemirrorTablesStrings.vert
import typings.prosemirrorView.mod.EditorView
import typings.std.ClipboardEvent
import typings.std.HTMLElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * @public
  */
inline def addColSpan(attrs: CellAttrs, pos: Double): Attrs = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Attrs]
inline def addColSpan(attrs: CellAttrs, pos: Double, n: Double): Attrs = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Attrs]

/**
  * Add a column at the given position in a table.
  *
  * @public
  */
inline def addColumn(tr: Transaction, param1: TableRect, col: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumn")(tr.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Transaction]

/**
  * Command to add a column after the column with the selection.
  *
  * @public
  */
inline def addColumnAfter(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def addColumnAfter(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Command to add a column before the column with the selection.
  *
  * @public
  */
inline def addColumnBefore(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def addColumnBefore(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @public
  */
inline def addRow(tr: Transaction, param1: TableRect, row: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("addRow")(tr.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Transaction]

/**
  * Add a table row after the selection.
  *
  * @public
  */
inline def addRowAfter(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def addRowAfter(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Add a table row before the selection.
  *
  * @public
  */
inline def addRowBefore(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def addRowBefore(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @public
  */
inline def cellAround($pos: ResolvedPos): ResolvedPos | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cellAround")($pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos | Null]

/**
  * Clip or extend (repeat) the given set of cells to cover the given
  * width and height. Will clip rowspan/colspan cells at the edges when
  * they stick out.
  *
  * @internal
  */
inline def clipCells(param0: Area, newWidth: Double, newHeight: Double): Area = (^.asInstanceOf[js.Dynamic].applyDynamic("__clipCells")(param0.asInstanceOf[js.Any], newWidth.asInstanceOf[js.Any], newHeight.asInstanceOf[js.Any])).asInstanceOf[Area]

/**
  * @public
  */
inline def colCount($pos: ResolvedPos): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colCount")($pos.asInstanceOf[js.Any]).asInstanceOf[Double]

/**
  * @public
  */
inline def columnIsHeader(map: TableMap, table: Node, col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("columnIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @public
  */
inline def columnResizing(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("columnResizing")().asInstanceOf[Plugin[Any]]
inline def columnResizing(param0: ColumnResizingOptions): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("columnResizing")(param0.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]

/**
  * @public
  */
inline def columnResizingPluginKey: PluginKey[ResizeState] = ^.asInstanceOf[js.Dynamic].selectDynamic("columnResizingPluginKey").asInstanceOf[PluginKey[ResizeState]]

/**
  * Command function that removes the selected columns from a table.
  *
  * @public
  */
inline def deleteColumn(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def deleteColumn(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Remove the selected rows from a table.
  *
  * @public
  */
inline def deleteRow(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def deleteRow(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Deletes the table around the selection, if any.
  *
  * @public
  */
inline def deleteTable(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def deleteTable(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @public
  */
inline def findCell($pos: ResolvedPos): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("findCell")($pos.asInstanceOf[js.Any]).asInstanceOf[Rect]

/**
  * Inspect all tables in the given state's document and return a
  * transaction that fixes them, if necessary. If `oldState` was
  * provided, that is assumed to hold a previous, known-good state,
  * which will be used to avoid re-scanning unchanged parts of the
  * document.
  *
  * @public
  */
inline def fixTables(state: EditorState): js.UndefOr[Transaction] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Transaction]]
inline def fixTables(state: EditorState, oldState: EditorState): js.UndefOr[Transaction] = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Transaction]]

/**
  * @public
  */
inline def fixTablesKey: PluginKey[FixTables] = ^.asInstanceOf[js.Dynamic].selectDynamic("fixTablesKey").asInstanceOf[PluginKey[FixTables]]

/**
  * Returns a command for selecting the next (direction=1) or previous
  * (direction=-1) cell in a table.
  *
  * @public
  */
inline def goToNextCell(direction: Direction): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("goToNextCell")(direction.asInstanceOf[js.Any]).asInstanceOf[Command]

/**
  * @public
  */
inline def handlePaste(view: EditorView, _underscore: ClipboardEvent, slice: Slice): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("handlePaste")(view.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @internal
  */
inline def inSameTable($cellA: ResolvedPos, $cellB: ResolvedPos): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inSameTable")($cellA.asInstanceOf[js.Any], $cellB.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Insert the given set of cells (as returned by `pastedCells`) into a
  * table, at the position pointed at by rect.
  *
  * @internal
  */
inline def insertCells(
  state: EditorState,
  dispatch: js.Function1[/* tr */ Transaction, Unit],
  tableStart: Double,
  rect: Rect,
  cells: Area
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__insertCells")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], tableStart.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], cells.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @public
  */
inline def isInTable(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Merge the selected cells into a single cell. Only available when
  * the selected cells' outline forms a rectangle.
  *
  * @public
  */
inline def mergeCells(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def mergeCells(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * @public
  */
inline def moveCellForward($pos: ResolvedPos): ResolvedPos = ^.asInstanceOf[js.Dynamic].applyDynamic("moveCellForward")($pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos]

/**
  * @public
  */
inline def nextCell($pos: ResolvedPos, axis: horiz | vert, dir: Double): ResolvedPos | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("nextCell")($pos.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[ResolvedPos | Null]

/**
  * Get a rectangular area of cells from a slice, or null if the outer
  * nodes of the slice aren't table cells or rows.
  *
  * @internal
  */
inline def pastedCells(slice: Slice): Area | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("__pastedCells")(slice.asInstanceOf[js.Any]).asInstanceOf[Area | Null]

/**
  * @public
  */
inline def pointsAtCell($pos: ResolvedPos): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pointsAtCell")($pos.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * @public
  */
inline def removeColSpan(attrs: CellAttrs, pos: Double): CellAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[CellAttrs]
inline def removeColSpan(attrs: CellAttrs, pos: Double, n: Double): CellAttrs = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[CellAttrs]

/**
  * @public
  */
inline def removeColumn(tr: Transaction, param1: TableRect, col: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColumn")(tr.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @public
  */
inline def removeRow(tr: Transaction, param1: TableRect, row: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeRow")(tr.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @public
  */
inline def rowIsHeader(map: TableMap, table: Node, row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rowIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Helper to get the selected rectangle in a table, if any. Adds table
  * map, table node, and table start offset to the object for
  * convenience.
  *
  * @public
  */
inline def selectedRect(state: EditorState): TableRect = ^.asInstanceOf[js.Dynamic].applyDynamic("selectedRect")(state.asInstanceOf[js.Any]).asInstanceOf[TableRect]

/**
  * @internal
  */
inline def selectionCell(state: EditorState): ResolvedPos = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionCell")(state.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos]

/**
  * Returns a command that sets the given attribute to the given value,
  * and is only available when the currently selected cell doesn't
  * already have that attribute set to that value.
  *
  * @public
  */
inline def setCellAttr(name: String, value: Any): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("setCellAttr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Command]

/**
  * Split a selected cell, whose rowpan or colspan is greater than one,
  * into smaller cells. Use the first cell type for the new cells.
  *
  * @public
  */
inline def splitCell(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def splitCell(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Split a selected cell, whose rowpan or colspan is greater than one,
  * into smaller cells with the cell type (th, td) returned by getType function.
  *
  * @public
  */
inline def splitCellWithType(getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType]): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCellWithType")(getCellType.asInstanceOf[js.Any]).asInstanceOf[Command]

/**
  * Creates a [plugin](http://prosemirror.net/docs/ref/#state.Plugin)
  * that, when added to an editor, enables cell-selection, handles
  * cell-based copy/paste, and makes sure tables stay well-formed (each
  * row has the same width, and cells don't overlap).
  *
  * You should probably put this plugin near the end of your array of
  * plugins, since it handles mouse and arrow key events in tables
  * rather broadly, and other plugins, like the gap cursor or the
  * column-width dragging plugin, might want to get a turn first to
  * perform more specific behavior.
  *
  * @public
  */
inline def tableEditing(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")().asInstanceOf[Plugin[Any]]
inline def tableEditing(param0: TableEditingOptions): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")(param0.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]

/**
  * @public
  */
inline def tableEditingKey: PluginKey[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("tableEditingKey").asInstanceOf[PluginKey[Double]]

/**
  * @public
  */
inline def tableNodeTypes(schema: Schema[Any, Any]): RecordTableRoleNodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodeTypes")(schema.asInstanceOf[js.Any]).asInstanceOf[RecordTableRoleNodeType]

/**
  * This function creates a set of [node
  * specs](http://prosemirror.net/docs/ref/#model.SchemaSpec.nodes) for
  * `table`, `table_row`, and `table_cell` nodes types as used by this
  * module. The result can then be added to the set of nodes when
  * creating a schema.
  *
  * @public
  */
inline def tableNodes(options: TableNodesOptions): TableNodes_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodes")(options.asInstanceOf[js.Any]).asInstanceOf[TableNodes_]

/**
  * Toggles between row/column header and normal cells (Only applies to first row/column).
  * For deprecated behavior pass `useDeprecatedLogic` in options with true.
  *
  * @public
  */
inline def toggleHeader(`type`: ToggleHeaderType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any]).asInstanceOf[Command]
inline def toggleHeader(`type`: ToggleHeaderType, options: UseDeprecatedLogic): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Command]

/**
  * Toggles whether the selected cells are header cells.
  *
  * @public
  */
inline def toggleHeaderCell: Command = ^.asInstanceOf[js.Dynamic].selectDynamic("toggleHeaderCell").asInstanceOf[Command]

/**
  * Toggles whether the selected column contains header cells.
  *
  * @public
  */
inline def toggleHeaderColumn: Command = ^.asInstanceOf[js.Dynamic].selectDynamic("toggleHeaderColumn").asInstanceOf[Command]

/**
  * Toggles whether the selected row contains header cells.
  *
  * @public
  */
inline def toggleHeaderRow: Command = ^.asInstanceOf[js.Dynamic].selectDynamic("toggleHeaderRow").asInstanceOf[Command]

/**
  * @public
  */
inline def updateColumnsOnResize(node: Node, colgroup: HTMLTableColElement, table: HTMLTableElement, cellMinWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def updateColumnsOnResize(
  node: Node,
  colgroup: HTMLTableColElement,
  table: HTMLTableElement,
  cellMinWidth: Double,
  overrideCol: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def updateColumnsOnResize(
  node: Node,
  colgroup: HTMLTableColElement,
  table: HTMLTableElement,
  cellMinWidth: Double,
  overrideCol: Double,
  overrideValue: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def updateColumnsOnResize(
  node: Node,
  colgroup: HTMLTableColElement,
  table: HTMLTableElement,
  cellMinWidth: Double,
  overrideCol: Unit,
  overrideValue: Double
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * @public
  */
type ColWidths = js.Array[Double]

/**
  * @public
  */
type MutableAttrs = Record[String, Any]

/**
  * @public
  */
type getFromDOM = js.Function1[/* dom */ HTMLElement, Any]

/**
  * @public
  */
type setDOMAttr = js.Function2[/* value */ Any, /* attrs */ MutableAttrs, Unit]
