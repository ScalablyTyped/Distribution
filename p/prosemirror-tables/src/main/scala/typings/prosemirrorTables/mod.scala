package typings.prosemirrorTables

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorState.mod.PluginKey
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTables.anon.Bottom
import typings.prosemirrorTables.anon.CellMinWidth
import typings.prosemirrorTables.anon.RecordTableRolesNodeType
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
  open class CellSelection protected () extends Selection {
    def this($anchorCell: ResolvedPos) = this()
    def this($anchorCell: ResolvedPos, $headCell: ResolvedPos) = this()
    
    @JSName("$anchorCell")
    var $anchorCell: ResolvedPos = js.native
    
    @JSName("$headCell")
    var $headCell: ResolvedPos = js.native
    
    def forEachCell(f: js.Function2[/* node */ Node, /* pos */ Double, Unit]): Unit = js.native
    
    def isColSelection(): Boolean = js.native
    
    def isRowSelection(): Boolean = js.native
  }
  /* static members */
  object CellSelection {
    
    @JSImport("prosemirror-tables", "CellSelection")
    @js.native
    val ^ : js.Any = js.native
    
    inline def colSelection(anchorCell: ResolvedPos): CellSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")(anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection]
    inline def colSelection(anchorCell: ResolvedPos, headCell: ResolvedPos): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("colSelection")(anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
    
    inline def create(doc: Node, anchorCell: Double): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
    inline def create(doc: Node, anchorCell: Double, headCell: Double): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(doc.asInstanceOf[js.Any], anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
    
    inline def fromJSON(doc: Node, json: CellSelectionJSON): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(doc.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
    
    inline def rowSelection(anchorCell: ResolvedPos): CellSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")(anchorCell.asInstanceOf[js.Any]).asInstanceOf[CellSelection]
    inline def rowSelection(anchorCell: ResolvedPos, headCell: ResolvedPos): CellSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("rowSelection")(anchorCell.asInstanceOf[js.Any], headCell.asInstanceOf[js.Any])).asInstanceOf[CellSelection]
  }
  
  @JSImport("prosemirror-tables", "TableMap")
  @js.native
  open class TableMap () extends StObject {
    
    def cellsInRect(rect: Rect): js.Array[Double] = js.native
    
    def colCount(pos: Double): Double = js.native
    
    def findCell(pos: Double): Rect = js.native
    
    var height: Double = js.native
    
    var map: js.Array[Double] = js.native
    
    def nextCell(pos: Double, axis: String, dir: Double): Double = js.native
    
    def positionAt(row: Double, col: Double, table: Node): Double = js.native
    
    var problems: js.UndefOr[js.Array[js.Object]] = js.native
    
    def rectBetween(a: Double, b: Double): Rect = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object TableMap {
    
    @JSImport("prosemirror-tables", "TableMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(table: Node): TableMap = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(table.asInstanceOf[js.Any]).asInstanceOf[TableMap]
  }
  
  inline def addColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def addColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def addColumn(transaction: Transaction, rect: TableRect, row: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumn")(transaction.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  inline def addColumnAfter(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def addColumnAfter(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def addColumnBefore(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def addColumnBefore(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addColumnBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def addRow(transaction: Transaction, rect: TableRect, row: Double): Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("addRow")(transaction.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  inline def addRowAfter(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def addRowAfter(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowAfter")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def addRowBefore(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def addRowBefore(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("addRowBefore")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def cellAround(pos: ResolvedPos): ResolvedPos | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cellAround")(pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos | Null]
  
  inline def colCount(pos: ResolvedPos): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colCount")(pos.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def columnIsHeader(map: TableMap, table: Node, col: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("columnIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def columnResizing(props: CellMinWidth): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("columnResizing")(props.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  @JSImport("prosemirror-tables", "columnResizingPluginKey")
  @js.native
  val columnResizingPluginKey: PluginKey[Any] = js.native
  
  inline def deleteColumn(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def deleteColumn(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteColumn")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteRow(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def deleteRow(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteRow")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteTable(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def deleteTable(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteTable")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findCell(pos: ResolvedPos): Bottom = ^.asInstanceOf[js.Dynamic].applyDynamic("findCell")(pos.asInstanceOf[js.Any]).asInstanceOf[Bottom]
  
  inline def fixTables(state: EditorState): Null | Transaction = ^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any]).asInstanceOf[Null | Transaction]
  inline def fixTables(state: EditorState, oldState: EditorState): Null | Transaction = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTables")(state.asInstanceOf[js.Any], oldState.asInstanceOf[js.Any])).asInstanceOf[Null | Transaction]
  
  @JSImport("prosemirror-tables", "fixTablesKey")
  @js.native
  val fixTablesKey: PluginKey[Any] = js.native
  
  inline def goToNextCell(direction: Double): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("goToNextCell")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def inSameTable($a: ResolvedPos, $b: ResolvedPos): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inSameTable")($a.asInstanceOf[js.Any], $b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInTable(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInTable")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def mergeCells(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def mergeCells(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCells")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def moveCellForward(pos: ResolvedPos): ResolvedPos = ^.asInstanceOf[js.Dynamic].applyDynamic("moveCellForward")(pos.asInstanceOf[js.Any]).asInstanceOf[ResolvedPos]
  
  inline def nextCell(pos: ResolvedPos, axis: String, dir: Double): Null | ResolvedPos = (^.asInstanceOf[js.Dynamic].applyDynamic("nextCell")(pos.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[Null | ResolvedPos]
  
  inline def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("removeColSpan")(attrs.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def rowIsHeader(map: TableMap, table: Node, row: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rowIsHeader")(map.asInstanceOf[js.Any], table.asInstanceOf[js.Any], row.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def selectedRect(state: EditorState): TableRect = ^.asInstanceOf[js.Dynamic].applyDynamic("selectedRect")(state.asInstanceOf[js.Any]).asInstanceOf[TableRect]
  
  inline def selectionCell(state: EditorState): js.UndefOr[ResolvedPos | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectionCell")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResolvedPos | Null]]
  
  inline def setCellAttr(name: String, value: Any): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setCellAttr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def splitCell(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def splitCell(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitCell")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def splitCellWithType(getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType]): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitCellWithType")(getCellType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def tableEditing(): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")().asInstanceOf[Plugin[Any]]
  inline def tableEditing(options: TableEditingOptions): Plugin[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tableEditing")(options.asInstanceOf[js.Any]).asInstanceOf[Plugin[Any]]
  
  @JSImport("prosemirror-tables", "tableEditingKey")
  @js.native
  val tableEditingKey: PluginKey[Any] = js.native
  
  inline def tableNodeTypes(schema: Schema[Any, Any]): RecordTableRolesNodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodeTypes")(schema.asInstanceOf[js.Any]).asInstanceOf[RecordTableRolesNodeType]
  
  inline def tableNodes(options: TableNodesOptions): TableNodes_ = ^.asInstanceOf[js.Dynamic].applyDynamic("tableNodes")(options.asInstanceOf[js.Any]).asInstanceOf[TableNodes_]
  
  inline def toggleHeader(`type`: column | row): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def toggleHeader(`type`: column | row, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeader")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def toggleHeaderCell(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderCell")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def toggleHeaderCell(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderCell")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toggleHeaderColumn(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderColumn")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def toggleHeaderColumn(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderColumn")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toggleHeaderRow(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderRow")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def toggleHeaderRow(state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleHeaderRow")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateColumnsOnResize(node: Node, colgroup: Element, table: Element, cellMinWidth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateColumnsOnResize(node: Node, colgroup: Element, table: Element, cellMinWidth: Double, overrideCol: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateColumnsOnResize(
    node: Node,
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Double,
    overrideValue: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateColumnsOnResize(
    node: Node,
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Unit,
    overrideValue: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateColumnsOnResize")(node.asInstanceOf[js.Any], colgroup.asInstanceOf[js.Any], table.asInstanceOf[js.Any], cellMinWidth.asInstanceOf[js.Any], overrideCol.asInstanceOf[js.Any], overrideValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CellAttributes extends StObject {
    
    var default: Any
    
    var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.undefined
    
    var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.undefined
  }
  object CellAttributes {
    
    inline def apply(default: Any): CellAttributes = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellAttributes] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setGetFromDOM(value: /* dom */ Element => Any): Self = StObject.set(x, "getFromDOM", js.Any.fromFunction1(value))
      
      inline def setGetFromDOMUndefined: Self = StObject.set(x, "getFromDOM", js.undefined)
      
      inline def setSetDOMAttr(value: (/* value */ Any, /* attrs */ Any) => Any): Self = StObject.set(x, "setDOMAttr", js.Any.fromFunction2(value))
      
      inline def setSetDOMAttrUndefined: Self = StObject.set(x, "setDOMAttr", js.undefined)
    }
  }
  
  trait CellBookmark extends StObject {
    
    var anchor: Double
    
    var head: Double
    
    def map(mapping: Mappable): CellBookmark
    
    def resolve(doc: Node): Selection
  }
  object CellBookmark {
    
    inline def apply(anchor: Double, head: Double, map: Mappable => CellBookmark, resolve: Node => Selection): CellBookmark = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[CellBookmark]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellBookmark] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Mappable => CellBookmark): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Node => Selection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait CellSelectionJSON extends StObject {
    
    var anchor: Double
    
    var head: Double
    
    var `type`: String
  }
  object CellSelectionJSON {
    
    inline def apply(anchor: Double, head: Double, `type`: String): CellSelectionJSON = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellSelectionJSON]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSelectionJSON] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: Double): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setHead(value: Double): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetCellTypeOptions extends StObject {
    
    var col: Double
    
    var node: Node
    
    var row: Double
  }
  object GetCellTypeOptions {
    
    inline def apply(col: Double, node: Node, row: Double): GetCellTypeOptions = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCellTypeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetCellTypeOptions] (val x: Self) extends AnyVal {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Rect {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableEditingOptions extends StObject {
    
    var allowTableNodeSelection: js.UndefOr[Boolean] = js.undefined
  }
  object TableEditingOptions {
    
    inline def apply(): TableEditingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableEditingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableEditingOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowTableNodeSelection(value: Boolean): Self = StObject.set(x, "allowTableNodeSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowTableNodeSelectionUndefined: Self = StObject.set(x, "allowTableNodeSelection", js.undefined)
    }
  }
  
  trait TableNodesOptions extends StObject {
    
    var cellAttributes: StringDictionary[CellAttributes]
    
    var cellContent: String
    
    var tableGroup: js.UndefOr[String] = js.undefined
  }
  object TableNodesOptions {
    
    inline def apply(cellAttributes: StringDictionary[CellAttributes], cellContent: String): TableNodesOptions = {
      val __obj = js.Dynamic.literal(cellAttributes = cellAttributes.asInstanceOf[js.Any], cellContent = cellContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableNodesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableNodesOptions] (val x: Self) extends AnyVal {
      
      inline def setCellAttributes(value: StringDictionary[CellAttributes]): Self = StObject.set(x, "cellAttributes", value.asInstanceOf[js.Any])
      
      inline def setCellContent(value: String): Self = StObject.set(x, "cellContent", value.asInstanceOf[js.Any])
      
      inline def setTableGroup(value: String): Self = StObject.set(x, "tableGroup", value.asInstanceOf[js.Any])
      
      inline def setTableGroupUndefined: Self = StObject.set(x, "tableGroup", js.undefined)
    }
  }
  
  trait TableNodes_ extends StObject {
    
    var table: NodeSpec
    
    var table_cell: NodeSpec
    
    var table_header: NodeSpec
    
    var table_row: NodeSpec
  }
  object TableNodes_ {
    
    inline def apply(table: NodeSpec, table_cell: NodeSpec, table_header: NodeSpec, table_row: NodeSpec): TableNodes_ = {
      val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any], table_cell = table_cell.asInstanceOf[js.Any], table_header = table_header.asInstanceOf[js.Any], table_row = table_row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableNodes_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableNodes_] (val x: Self) extends AnyVal {
      
      inline def setTable(value: NodeSpec): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTable_cell(value: NodeSpec): Self = StObject.set(x, "table_cell", value.asInstanceOf[js.Any])
      
      inline def setTable_header(value: NodeSpec): Self = StObject.set(x, "table_header", value.asInstanceOf[js.Any])
      
      inline def setTable_row(value: NodeSpec): Self = StObject.set(x, "table_row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRect
    extends StObject
       with Rect {
    
    var map: TableMap
    
    var table: Node
    
    var tableStart: Double
  }
  object TableRect {
    
    inline def apply(
      bottom: Double,
      left: Double,
      map: TableMap,
      right: Double,
      table: Node,
      tableStart: Double,
      top: Double
    ): TableRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tableStart = tableStart.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRect] (val x: Self) extends AnyVal {
      
      inline def setMap(value: TableMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setTable(value: Node): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableStart(value: Double): Self = StObject.set(x, "tableStart", value.asInstanceOf[js.Any])
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
    
    inline def cell: typings.prosemirrorTables.prosemirrorTablesStrings.cell = "cell".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.cell]
    
    inline def header_cell: typings.prosemirrorTables.prosemirrorTablesStrings.header_cell = "header_cell".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.header_cell]
    
    inline def row: typings.prosemirrorTables.prosemirrorTablesStrings.row = "row".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.row]
    
    inline def table: typings.prosemirrorTables.prosemirrorTablesStrings.table = "table".asInstanceOf[typings.prosemirrorTables.prosemirrorTablesStrings.table]
  }
  
  type getFromDOM = js.Function1[/* dom */ Element, Any]
  
  type setDOMAttr = js.Function2[/* value */ Any, /* attrs */ Any, Any]
}
