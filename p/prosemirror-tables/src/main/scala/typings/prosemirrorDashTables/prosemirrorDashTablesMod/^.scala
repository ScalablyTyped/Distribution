package typings.prosemirrorDashTables.prosemirrorDashTablesMod

import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.ResolvedPos
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Plugin
import typings.prosemirrorDashState.prosemirrorDashStateMod.PluginKey
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import typings.prosemirrorDashTables.Anon_Buttom
import typings.prosemirrorDashTables.Anon_CellMinWidth
import typings.prosemirrorDashTables.Anon_UseDeprecatedLogic
import typings.prosemirrorDashTables.prosemirrorDashTablesStrings.column
import typings.prosemirrorDashTables.prosemirrorDashTablesStrings.row
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val columnResizingPluginKey: PluginKey[js.Any, js.Any] = js.native
  def addColumnAfter[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def addColumnAfter[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def addColumnBefore[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def addColumnBefore[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def addRowAfter[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def addRowAfter[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def addRowBefore[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def addRowBefore[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def cellAround[S /* <: Schema[_, _] */](pos: ResolvedPos[S]): ResolvedPos[S] | Null = js.native
  def colCount(pos: ResolvedPos[_]): Double = js.native
  def columnResizing[S /* <: Schema[_, _] */](props: Anon_CellMinWidth[S]): Plugin[S, _] = js.native
  def deleteColumn[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def deleteColumn[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def deleteRow[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def deleteRow[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def deleteTable[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def deleteTable[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def findCell(pos: ResolvedPos[_]): Anon_Buttom = js.native
  def goToNextCell[S /* <: Schema[_, _] */](direction: Double): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def inSameTable[S /* <: Schema[_, _] */]($a: ResolvedPos[S], $b: ResolvedPos[S]): Boolean = js.native
  def isInTable(state: EditorState[_]): Boolean = js.native
  def mergeCells[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def mergeCells[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def moveCellForward[S /* <: Schema[_, _] */](pos: ResolvedPos[S]): ResolvedPos[S] = js.native
  def nextCell[S /* <: Schema[_, _] */](pos: ResolvedPos[S], axis: String, dir: Double): Null | ResolvedPos[S] = js.native
  def selectionCell[S /* <: Schema[_, _] */](state: EditorState[S]): js.UndefOr[ResolvedPos[S] | Null] = js.native
  def setCellAttr[S /* <: Schema[_, _] */](name: String, value: js.Any): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def splitCell[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def splitCell[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def tableEditing(): Plugin[_, _] = js.native
  def tableEditing(options: TableEditingOptions): Plugin[_, _] = js.native
  def tableNodes(options: TableNodesOptions): TableNodes = js.native
  def toggleHeaderCell[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def toggleHeaderCell[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def toggleHeaderColumn[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def toggleHeaderColumn[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def toggleHeaderRow[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def toggleHeaderRow[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  @JSName("toggleHeader")
  def toggleHeader_column[S /* <: Schema[_, _] */](`type`: column): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSName("toggleHeader")
  def toggleHeader_column[S /* <: Schema[_, _] */](`type`: column, options: Anon_UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSName("toggleHeader")
  def toggleHeader_row[S /* <: Schema[_, _] */](`type`: row): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSName("toggleHeader")
  def toggleHeader_row[S /* <: Schema[_, _] */](`type`: row, options: Anon_UseDeprecatedLogic): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def updateColumnsOnResize(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double): Unit = js.native
  def updateColumnsOnResize(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double, overrideCol: Double): Unit = js.native
  def updateColumnsOnResize(
    node: Node[_],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Double,
    overrideValue: Double
  ): Unit = js.native
}

