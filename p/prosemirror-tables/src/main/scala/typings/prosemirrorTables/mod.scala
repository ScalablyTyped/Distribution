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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-tables", "CellSelection")
  @js.native
  class CellSelection[S /* <: Schema[_, _] */] protected () extends StObject {
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
    
    @JSImport("prosemirror-tables", "CellSelection.colSelection")
    @js.native
    def colSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S]): CellSelection[S] = js.native
    @JSImport("prosemirror-tables", "CellSelection.colSelection")
    @js.native
    def colSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = js.native
    
    @JSImport("prosemirror-tables", "CellSelection.create")
    @js.native
    def create[S /* <: Schema[_, _] */](doc: Node[S], anchorCell: Double): CellSelection[S] = js.native
    @JSImport("prosemirror-tables", "CellSelection.create")
    @js.native
    def create[S /* <: Schema[_, _] */](doc: Node[S], anchorCell: Double, headCell: Double): CellSelection[S] = js.native
    
    @JSImport("prosemirror-tables", "CellSelection.fromJSON")
    @js.native
    def fromJSON[S /* <: Schema[_, _] */](doc: Node[S], json: CellSelectionJSON): CellSelection[S] = js.native
    
    @JSImport("prosemirror-tables", "CellSelection.rowSelection")
    @js.native
    def rowSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S]): CellSelection[S] = js.native
    @JSImport("prosemirror-tables", "CellSelection.rowSelection")
    @js.native
    def rowSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = js.native
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
    
    def positionAt(row: Double, col: Double, table: Node[_]): Double = js.native
    
    var problems: js.UndefOr[js.Array[js.Object]] = js.native
    
    def rectBetween(a: Double, b: Double): Rect = js.native
    
    var width: Double = js.native
  }
  /* static members */
  object TableMap {
    
    @JSImport("prosemirror-tables", "TableMap.get")
    @js.native
    def get(table: Node[_]): TableMap = js.native
  }
  
  @JSImport("prosemirror-tables", "addColSpan")
  @js.native
  def addColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = js.native
  @JSImport("prosemirror-tables", "addColSpan")
  @js.native
  def addColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = js.native
  
  @JSImport("prosemirror-tables", "addColumn")
  @js.native
  def addColumn[S /* <: Schema[_, _] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = js.native
  
  @JSImport("prosemirror-tables", "addColumnAfter")
  @js.native
  def addColumnAfter[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "addColumnAfter")
  @js.native
  def addColumnAfter[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "addColumnBefore")
  @js.native
  def addColumnBefore[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "addColumnBefore")
  @js.native
  def addColumnBefore[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "addRow")
  @js.native
  def addRow[S /* <: Schema[_, _] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = js.native
  
  @JSImport("prosemirror-tables", "addRowAfter")
  @js.native
  def addRowAfter[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "addRowAfter")
  @js.native
  def addRowAfter[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "addRowBefore")
  @js.native
  def addRowBefore[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "addRowBefore")
  @js.native
  def addRowBefore[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "cellAround")
  @js.native
  def cellAround[S /* <: Schema[_, _] */](pos: ResolvedPos[S]): ResolvedPos[S] | Null = js.native
  
  @JSImport("prosemirror-tables", "colCount")
  @js.native
  def colCount(pos: ResolvedPos[_]): Double = js.native
  
  @JSImport("prosemirror-tables", "columnIsHeader")
  @js.native
  def columnIsHeader(map: TableMap, table: Node[_], col: Double): Boolean = js.native
  
  @JSImport("prosemirror-tables", "columnResizing")
  @js.native
  def columnResizing[S /* <: Schema[_, _] */](props: CellMinWidth[S]): Plugin[S, _] = js.native
  
  @JSImport("prosemirror-tables", "columnResizingPluginKey")
  @js.native
  val columnResizingPluginKey: PluginKey[js.Any, js.Any] = js.native
  
  @JSImport("prosemirror-tables", "deleteColumn")
  @js.native
  def deleteColumn[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "deleteColumn")
  @js.native
  def deleteColumn[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "deleteRow")
  @js.native
  def deleteRow[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "deleteRow")
  @js.native
  def deleteRow[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "deleteTable")
  @js.native
  def deleteTable[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "deleteTable")
  @js.native
  def deleteTable[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "findCell")
  @js.native
  def findCell(pos: ResolvedPos[_]): Buttom = js.native
  
  @JSImport("prosemirror-tables", "fixTables")
  @js.native
  def fixTables[S /* <: Schema[_, _] */](state: EditorState[S]): Null | Transaction[S] = js.native
  @JSImport("prosemirror-tables", "fixTables")
  @js.native
  def fixTables[S /* <: Schema[_, _] */](state: EditorState[S], oldState: EditorState[S]): Null | Transaction[S] = js.native
  
  @JSImport("prosemirror-tables", "fixTablesKey")
  @js.native
  val fixTablesKey: PluginKey[js.Any, js.Any] = js.native
  
  @JSImport("prosemirror-tables", "goToNextCell")
  @js.native
  def goToNextCell[S /* <: Schema[_, _] */](direction: Double): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-tables", "inSameTable")
  @js.native
  def inSameTable[S /* <: Schema[_, _] */]($a: ResolvedPos[S], $b: ResolvedPos[S]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "isInTable")
  @js.native
  def isInTable(state: EditorState[_]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "mergeCells")
  @js.native
  def mergeCells[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "mergeCells")
  @js.native
  def mergeCells[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "moveCellForward")
  @js.native
  def moveCellForward[S /* <: Schema[_, _] */](pos: ResolvedPos[S]): ResolvedPos[S] = js.native
  
  @JSImport("prosemirror-tables", "nextCell")
  @js.native
  def nextCell[S /* <: Schema[_, _] */](pos: ResolvedPos[S], axis: String, dir: Double): Null | ResolvedPos[S] = js.native
  
  @JSImport("prosemirror-tables", "removeColSpan")
  @js.native
  def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double): T = js.native
  @JSImport("prosemirror-tables", "removeColSpan")
  @js.native
  def removeColSpan[T /* <: js.Object */](attrs: T, pos: Double, n: Double): T = js.native
  
  @JSImport("prosemirror-tables", "rowIsHeader")
  @js.native
  def rowIsHeader[S /* <: Schema[_, _] */](map: TableMap, table: Node[S], row: Double): Boolean = js.native
  
  @JSImport("prosemirror-tables", "selectedRect")
  @js.native
  def selectedRect[S /* <: Schema[_, _] */](state: EditorState[S]): TableRect = js.native
  
  @JSImport("prosemirror-tables", "selectionCell")
  @js.native
  def selectionCell[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
  
  @JSImport("prosemirror-tables", "setCellAttr")
  @js.native
  def setCellAttr[S /* <: Schema[_, _] */](name: String, value: js.Any): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-tables", "splitCell")
  @js.native
  def splitCell[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "splitCell")
  @js.native
  def splitCell[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "splitCellWithType")
  @js.native
  def splitCellWithType[S /* <: Schema[_, _] */](getCellType: js.Function1[/* options */ GetCellTypeOptions, NodeType[S]]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-tables", "tableEditing")
  @js.native
  def tableEditing(): Plugin[_, _] = js.native
  @JSImport("prosemirror-tables", "tableEditing")
  @js.native
  def tableEditing(options: TableEditingOptions): Plugin[_, _] = js.native
  
  @JSImport("prosemirror-tables", "tableEditingKey")
  @js.native
  val tableEditingKey: PluginKey[js.Any, js.Any] = js.native
  
  @JSImport("prosemirror-tables", "tableNodeTypes")
  @js.native
  def tableNodeTypes(schema: Schema[_, _]): RecordTableRolesNodeTypea = js.native
  
  @JSImport("prosemirror-tables", "tableNodes")
  @js.native
  def tableNodes(options: TableNodesOptions): TableNodes_ = js.native
  
  @JSImport("prosemirror-tables", "toggleHeaderCell")
  @js.native
  def toggleHeaderCell[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "toggleHeaderCell")
  @js.native
  def toggleHeaderCell[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "toggleHeaderColumn")
  @js.native
  def toggleHeaderColumn[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "toggleHeaderColumn")
  @js.native
  def toggleHeaderColumn[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "toggleHeaderRow")
  @js.native
  def toggleHeaderRow[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-tables", "toggleHeaderRow")
  @js.native
  def toggleHeaderRow[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-tables", "toggleHeader")
  @js.native
  def toggleHeader_column[S /* <: Schema[_, _] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-tables", "toggleHeader")
  @js.native
  def toggleHeader_column[S /* <: Schema[_, _] */](`type`: column, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-tables", "toggleHeader")
  @js.native
  def toggleHeader_row[S /* <: Schema[_, _] */](`type`: row): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-tables", "toggleHeader")
  @js.native
  def toggleHeader_row[S /* <: Schema[_, _] */](`type`: row, options: UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-tables", "updateColumnsOnResize")
  @js.native
  def updateColumnsOnResize(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double): Unit = js.native
  @JSImport("prosemirror-tables", "updateColumnsOnResize")
  @js.native
  def updateColumnsOnResize(
    node: Node[_],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: js.UndefOr[scala.Nothing],
    overrideValue: Double
  ): Unit = js.native
  @JSImport("prosemirror-tables", "updateColumnsOnResize")
  @js.native
  def updateColumnsOnResize(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double, overrideCol: Double): Unit = js.native
  @JSImport("prosemirror-tables", "updateColumnsOnResize")
  @js.native
  def updateColumnsOnResize(
    node: Node[_],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Double,
    overrideValue: Double
  ): Unit = js.native
  
  @js.native
  trait CellAttributes extends StObject {
    
    var default: js.Any = js.native
    
    var getFromDOM: js.UndefOr[typings.prosemirrorTables.mod.getFromDOM] = js.native
    
    var setDOMAttr: js.UndefOr[typings.prosemirrorTables.mod.setDOMAttr] = js.native
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
  
  @js.native
  trait CellSelectionJSON extends StObject {
    
    var anchor: Double = js.native
    
    var head: Double = js.native
    
    var `type`: String = js.native
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
  
  @js.native
  trait GetCellTypeOptions extends StObject {
    
    var col: Double = js.native
    
    var node: Node[_] = js.native
    
    var row: Double = js.native
  }
  object GetCellTypeOptions {
    
    @scala.inline
    def apply(col: Double, node: Node[_], row: Double): GetCellTypeOptions = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetCellTypeOptions]
    }
    
    @scala.inline
    implicit class GetCellTypeOptionsMutableBuilder[Self <: GetCellTypeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node[_]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rect extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
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
  
  @js.native
  trait TableEditingOptions extends StObject {
    
    var allowTableNodeSelection: js.UndefOr[Boolean] = js.native
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
  
  @js.native
  trait TableNodesOptions extends StObject {
    
    var cellAttributes: StringDictionary[CellAttributes] = js.native
    
    var cellContent: String = js.native
    
    var tableGroup: js.UndefOr[String] = js.native
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
  
  @js.native
  trait TableNodes_ extends StObject {
    
    var table: NodeSpec = js.native
    
    var table_cell: NodeSpec = js.native
    
    var table_header: NodeSpec = js.native
    
    var table_row: NodeSpec = js.native
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
  
  @js.native
  trait TableRect extends Rect {
    
    var map: TableMap = js.native
    
    var table: Node[_] = js.native
    
    var tableStart: Double = js.native
  }
  object TableRect {
    
    @scala.inline
    def apply(
      bottom: Double,
      left: Double,
      map: TableMap,
      right: Double,
      table: Node[_],
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
      def setTable(value: Node[_]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
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
