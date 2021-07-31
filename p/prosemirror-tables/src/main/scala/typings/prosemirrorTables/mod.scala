package typings.prosemirrorTables

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.PluginKey
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.SelectionRange
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTables.anon.Anchor
import typings.prosemirrorTables.anon.Buttom
import typings.prosemirrorTables.anon.CellMinWidth
import typings.prosemirrorTables.anon.RecordTableRolesNodeTypea
import typings.prosemirrorTables.anon.UseDeprecatedLogic
import typings.prosemirrorTables.prosemirrorTablesStrings.column
import typings.prosemirrorTables.prosemirrorTablesStrings.row
import typings.prosemirrorTransform.mod.Mappable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-tables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-tables", "CellSelection")
  @js.native
  class CellSelection[S /* <: Schema[js.Any, js.Any] */] protected () extends StObject {
    def this($anchorCell: ResolvedPos[S]) = this()
    def this($anchorCell: ResolvedPos[S], $headCell: ResolvedPos[S]) = this()
    
    @JSName("$anchor")
    var $anchor: ResolvedPos[S] = js.native
    
    @JSName("$anchorCell")
    var $anchorCell: ResolvedPos[S] = js.native
    
    @JSName("$from")
    var $from: ResolvedPos[S] = js.native
    
    @JSName("$head")
    var $head: ResolvedPos[S] = js.native
    
    @JSName("$headCell")
    var $headCell: ResolvedPos[S] = js.native
    
    @JSName("$to")
    var $to: ResolvedPos[S] = js.native
    
    var anchor: Double = js.native
    
    def content(): Slice[S] = js.native
    
    var empty: Boolean = js.native
    
    def eq(other: Selection[S]): Boolean = js.native
    
    def forEachCell(f: js.Function2[/* node */ Node[S], /* pos */ Double, Unit]): Unit = js.native
    
    var from: Double = js.native
    
    def getBookmark(): Anchor = js.native
    
    var head: Double = js.native
    
    def isColSelection(): Boolean = js.native
    
    def isRowSelection(): Boolean = js.native
    
    def map(doc: Node[S], mapping: Mappable): js.Any = js.native
    
    var ranges: js.Array[SelectionRange[S]] = js.native
    
    def replace(tr: Transaction[S], content: Slice[S]): Unit = js.native
    
    def replaceWith(tr: Transaction[S], node: Node[S]): Unit = js.native
    
    var to: Double = js.native
    
    def toJSON(): CellSelectionJSON = js.native
  }
  /* static members */
  object CellSelection {
    
    @JSImport("prosemirror-tables", "CellSelection")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def colSelection[S /* <: Schema[js.Any, js.Any] */](anchorCell: ResolvedPos[S]): CellSelection[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")(anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection[S]]
    @scala.inline
    def colSelection[S /* <: Schema[js.Any, js.Any] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")(anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection[S]]
    
    @scala.inline
    def create[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], anchorCell: Double): CellSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection[S]]
    @scala.inline
    def create[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], anchorCell: Double, headCell: Double): CellSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection[S]]
    
    @scala.inline
    def fromJSON[S /* <: Schema[js.Any, js.Any] */](doc: Node[S], json: CellSelectionJSON): CellSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(doc.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[CellSelection[S]]
    
    @scala.inline
    def rowSelection[S /* <: Schema[js.Any, js.Any] */](anchorCell: ResolvedPos[S]): CellSelection[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")(anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection[S]]
    @scala.inline
    def rowSelection[S /* <: Schema[js.Any, js.Any] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")(anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection[S]]
  }
  
  @JSImport("prosemirror-tables", "TableMap")
  @js.native
  class TableMap () extends StObject {
    
    def cellsInRect(rect: Rect): js.Array[Double] = js.native
    
    def colCount(pos: Double): Double = js.native
    
    def findCell(pos: Double): Rect = js.native
    
    var height: Double = js.native
    
    var map: js.Array[Double] = js.native
    
    def nextCell(pos: Double, axis: String, dir: Double): Double = js.native
    
    def positionAt(row: Double, col: Double, table: Node[js.Any]): Double = js.native
    
    var problems: js.UndefOr[js.Array[js.Object]] = js.native
    
    def rectBetween(a: Double, b: Double): Rect = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object TableMap {
    
    @JSImport("prosemirror-tables", "TableMap")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def get(table: Node[js.Any]): TableMap = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(table.asInstanceOf[js.Any]).asInstanceOf[TableMap]
  }
  
  @scala.inline
  def addColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def addColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def addColumn[S /* <: Schema[js.Any, js.Any] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumn")(transaction.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Transaction[S]]
  
  @scala.inline
  def addColumnAfter[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def addColumnAfter[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def addColumnBefore[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def addColumnBefore[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def addRow[S /* <: Schema[js.Any, js.Any] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("addRow")(transaction.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Transaction[S]]
  
  @scala.inline
  def addRowAfter[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def addRowAfter[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def addRowBefore[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def addRowBefore[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def cellAround[S /* <: Schema[js.Any, js.Any] */](pos: ResolvedPos[S]): ResolvedPos[S] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cellAround")(pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos[S] | Null]
  
  @scala.inline
  def colCount(pos: ResolvedPos[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colCount")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def columnIsHeader(map: TableMap, table: Node[js.Any], col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("columnIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def columnResizing[S /* <: Schema[js.Any, js.Any] */](props: CellMinWidth[S]): Plugin[S, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("columnResizing")(props.asInstanceOf[js.Any]).asInstanceOf[Plugin[S, js.Any]]
  
  @JSImport("prosemirror-tables", "columnResizingPluginKey")
  @js.native
  val columnResizingPluginKey: PluginKey[js.Any, js.Any] = js.native
  
  @scala.inline
  def deleteColumn[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deleteColumn[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def deleteRow[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deleteRow[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def deleteTable[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deleteTable[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def findCell(pos: ResolvedPos[js.Any]): Buttom = ^.asInstanceOf[js.Dynamic].applyDynamic("findCell")(pos.asInstanceOf[js.Any]).asInstanceOf[Buttom]
  
  @scala.inline
  def fixTables[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Null | Transaction[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any]).asInstanceOf[Null | Transaction[S]]
  @scala.inline
  def fixTables[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], oldState: EditorState[S]): Null | Transaction[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any])).asInstanceOf[Null | Transaction[S]]
  
  @JSImport("prosemirror-tables", "fixTablesKey")
  @js.native
  val fixTablesKey: PluginKey[js.Any, js.Any] = js.native
  
  @scala.inline
  def goToNextCell[S /* <: Schema[js.Any, js.Any] */](direction: Double): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("goToNextCell")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def inSameTable[S /* <: Schema[js.Any, js.Any] */]($a: ResolvedPos[S], $b: ResolvedPos[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inSameTable")($a.asInstanceOf[js.Any], $b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isInTable(state: EditorState[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def mergeCells[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def mergeCells[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def moveCellForward[S /* <: Schema[js.Any, js.Any] */](pos: ResolvedPos[S]): ResolvedPos[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("moveCellForward")(pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos[S]]
  
  @scala.inline
  def nextCell[S /* <: Schema[js.Any, js.Any] */](pos: ResolvedPos[S], axis: String, dir: Double): Null | ResolvedPos[S] = (^.asInstanceOf[js.Dynamic].applyDynamic("nextCell")(pos.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Null | ResolvedPos[S]]
  
  @scala.inline
  def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def rowIsHeader[S /* <: Schema[js.Any, js.Any] */](map: TableMap, table: Node[S], row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rowIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def selectedRect[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): TableRect = ^.asInstanceOf[js.Dynamic].applyDynamic("selectedRect")(state.asInstanceOf[js.Any]).asInstanceOf[TableRect]
  
  @scala.inline
  def selectionCell[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionCell")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResolvedPos[S] | Null]]
  
  @scala.inline
  def setCellAttr[S /* <: Schema[js.Any, js.Any] */](name: String, value: js.Any): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCellAttr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def splitCell[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def splitCell[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def splitCellWithType[S /* <: Schema[js.Any, js.Any] */](getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType[S]]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCellWithType")(getCellType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def tableEditing(): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")().asInstanceOf[Plugin[js.Any, js.Any]]
  @scala.inline
  def tableEditing(options: TableEditingOptions): Plugin[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[js.Any, js.Any]]
  
  @JSImport("prosemirror-tables", "tableEditingKey")
  @js.native
  val tableEditingKey: PluginKey[js.Any, js.Any] = js.native
  
  @scala.inline
  def tableNodeTypes(schema: Schema[js.Any, js.Any]): RecordTableRolesNodeTypea = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodeTypes")(schema.asInstanceOf[js.Any]).asInstanceOf[RecordTableRolesNodeTypea]
  
  @scala.inline
  def tableNodes(options: TableNodesOptions): TableNodes_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodes")(options.asInstanceOf[js.Any]).asInstanceOf[TableNodes_]
  
  @scala.inline
  def toggleHeaderCell[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderCell")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def toggleHeaderCell[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderCell")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toggleHeaderColumn[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderColumn")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def toggleHeaderColumn[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderColumn")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toggleHeaderRow[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderRow")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def toggleHeaderRow[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderRow")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toggleHeader_column[S /* <: Schema[js.Any, js.Any] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def toggleHeader_column[S /* <: Schema[js.Any, js.Any] */](`type`: column, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def toggleHeader_row[S /* <: Schema[js.Any, js.Any] */](`type`: row): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def toggleHeader_row[S /* <: Schema[js.Any, js.Any] */](`type`: row, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def updateColumnsOnResize(node: Node[js.Any], colgroup: Element, table: Element, cellMinWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateColumnsOnResize(node: Node[js.Any], colgroup: Element, table: Element, cellMinWidth: Double, overrideCol: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateColumnsOnResize(
    node: Node[js.Any],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Double,
    overrideValue: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def updateColumnsOnResize(
    node: Node[js.Any],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Unit,
    overrideValue: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CellAttributes extends StObject {
    
    var default: js.Any
    
    var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.undefined
    
    var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.undefined
  }
  object CellAttributes {
    
    @scala.inline
    def apply(default: js.Any): CellAttributes = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellAttributes]
    }
    
    @scala.inline
    implicit class CellAttributesMutableBuilder[Self <: CellAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetFromDOM(value: /* dom */ Element => js.Any): Self = StObject.set(x, "getFromDOM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFromDOMUndefined: Self = StObject.set(x, "getFromDOM", js.undefined)
      
      @scala.inline
      def setSetDOMAttr(value: (/* value */ js.Any, /* attrs */ js.Any) => js.Any): Self = StObject.set(x, "setDOMAttr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDOMAttrUndefined: Self = StObject.set(x, "setDOMAttr", js.undefined)
    }
  }
  
  trait CellSelectionJSON extends StObject {
    
    var anchor: Double
    
    var head: Double
    
    var `type`: String
  }
  object CellSelectionJSON {
    
    @scala.inline
    def apply(anchor: Double, head: Double, `type`: String): CellSelectionJSON = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellSelectionJSON]
    }
    
    @scala.inline
    implicit class CellSelectionJSONMutableBuilder[Self <: CellSelectionJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCellTypeOptions extends StObject {
    
    var col: Double
    
    var node: Node[js.Any]
    
    var row: Double
  }
  object GetCellTypeOptions {
    
    @scala.inline
    def apply(col: Double, node: Node[js.Any], row: Double): GetCellTypeOptions = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCellTypeOptions]
    }
    
    @scala.inline
    implicit class GetCellTypeOptionsMutableBuilder[Self <: GetCellTypeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node[js.Any]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Rect {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableEditingOptions extends StObject {
    
    var allowTableNodeSelection: js.UndefOr[Boolean] = js.undefined
  }
  object TableEditingOptions {
    
    @scala.inline
    def apply(): TableEditingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableEditingOptions]
    }
    
    @scala.inline
    implicit class TableEditingOptionsMutableBuilder[Self <: TableEditingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTableNodeSelection(value: Boolean): Self = StObject.set(x, "allowTableNodeSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTableNodeSelectionUndefined: Self = StObject.set(x, "allowTableNodeSelection", js.undefined)
    }
  }
  
  trait TableNodesOptions extends StObject {
    
    var cellAttributes: StringDictionary[CellAttributes]
    
    var cellContent: String
    
    var tableGroup: js.UndefOr[String] = js.undefined
  }
  object TableNodesOptions {
    
    @scala.inline
    def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String): TableNodesOptions = {
      val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableNodesOptions]
    }
    
    @scala.inline
    implicit class TableNodesOptionsMutableBuilder[Self <: TableNodesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellAttributes(value: StringDictionary[CellAttributes]): Self = StObject.set(x, "cellAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellContent(value: String): Self = StObject.set(x, "cellContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableGroup(value: String): Self = StObject.set(x, "tableGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableGroupUndefined: Self = StObject.set(x, "tableGroup", js.undefined)
    }
  }
  
  trait TableNodes_ extends StObject {
    
    var table: NodeSpec
    
    var table_cell: NodeSpec
    
    var table_header: NodeSpec
    
    var table_row: NodeSpec
  }
  object TableNodes_ {
    
    @scala.inline
    def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes_ = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], table_cell = table_cell.asInstanceOf[js.Any], table_header = table_header.asInstanceOf[js.Any], table_row = table_row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableNodes_]
    }
    
    @scala.inline
    implicit class TableNodes_MutableBuilder[Self <: TableNodes_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTable(value: NodeSpec): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable_cell(value: NodeSpec): Self = StObject.set(x, "table_cell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable_header(value: NodeSpec): Self = StObject.set(x, "table_header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable_row(value: NodeSpec): Self = StObject.set(x, "table_row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRect
    extends StObject
       with Rect {
    
    var map: TableMap
    
    var table: Node[js.Any]
    
    var tableStart: Double
  }
  object TableRect {
    
    @scala.inline
    def apply(
      bottom: Double,
      left: Double,
      map: TableMap,
      right: Double,
      table: Node[js.Any],
      tableStart: Double,
      top: Double
    ): TableRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableStart = tableStart.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRect]
    }
    
    @scala.inline
    implicit class TableRectMutableBuilder[Self <: TableRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: TableMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable(value: Node[js.Any]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableStart(value: Double): Self = StObject.set(x, "tableStart", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.prosemirrorTables.prosemirrorTablesStrings.table
    - typings.prosemirrorTables.prosemirrorTablesStrings.row
    - typings.prosemirrorTables.prosemirrorTablesStrings.cell
    - typings.prosemirrorTables.prosemirrorTablesStrings.header_cell
  */
  trait TableRoles extends StObject
  object TableRoles {
    
    @scala.inline
    def cell: typings.prosemirrorTables.prosemirrorTablesStrings.cell = "cell".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.cell]
    
    @scala.inline
    def header_cell: typings.prosemirrorTables.prosemirrorTablesStrings.header_cell = "header_cell".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.header_cell]
    
    @scala.inline
    def row: typings.prosemirrorTables.prosemirrorTablesStrings.row = "row".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.row]
    
    @scala.inline
    def table: typings.prosemirrorTables.prosemirrorTablesStrings.table = "table".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.table]
  }
  
  type getFromDOM = js.Function1[/* dom */ Element, js.Any]
  
  type setDOMAttr = js.Function2[/* value */ js.Any, /* attrs */ js.Any, js.Any]
}
