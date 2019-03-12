package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val columnResizingPluginKey: prosemirrorDashStateLib.prosemirrorDashStateMod.PluginKey[js.Any, js.Any] = js.native
  def addColumnAfter[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def addColumnAfter[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def addColumnBefore[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def addColumnBefore[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def addRowAfter[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def addRowAfter[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def addRowBefore[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def addRowBefore[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def cellAround[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]): prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] | scala.Null = js.native
  def colCount(pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[_]): scala.Double = js.native
  def columnResizing[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](props: prosemirrorDashTablesLib.Anon_CellMinWidth[S]): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[S, _] = js.native
  def deleteColumn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def deleteColumn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def deleteRow[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def deleteRow[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def deleteTable[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def deleteTable[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def findCell(pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[_]): prosemirrorDashTablesLib.Anon_Buttom = js.native
  def goToNextCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](direction: scala.Double): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def inSameTable[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    $a: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    $b: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]
  ): scala.Boolean = js.native
  def isInTable(state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[_]): scala.Boolean = js.native
  def mergeCells[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def mergeCells[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def moveCellForward[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]): prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  def nextCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    pos: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    axis: java.lang.String,
    dir: scala.Double
  ): scala.Null | prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  def selectionCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): js.UndefOr[prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] | scala.Null] = js.native
  def setCellAttr[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](name: java.lang.String, value: js.Any): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def splitCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def splitCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def tableEditing(): prosemirrorDashStateLib.prosemirrorDashStateMod.Plugin[_, _] = js.native
  def tableNodes(options: TableNodesOptions): TableNodes = js.native
  def toggleHeaderCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def toggleHeaderCell[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def toggleHeaderColumn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def toggleHeaderColumn[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def toggleHeaderRow[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S]): scala.Boolean = js.native
  def toggleHeaderRow[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    state: prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S],
    dispatch: js.Function1[
      /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def updateColumnsOnResize(
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_],
    colgroup: stdLib.Element,
    table: stdLib.Element,
    cellMinWidth: scala.Double
  ): scala.Unit = js.native
  def updateColumnsOnResize(
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_],
    colgroup: stdLib.Element,
    table: stdLib.Element,
    cellMinWidth: scala.Double,
    overrideCol: scala.Double
  ): scala.Unit = js.native
  def updateColumnsOnResize(
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_],
    colgroup: stdLib.Element,
    table: stdLib.Element,
    cellMinWidth: scala.Double,
    overrideCol: scala.Double,
    overrideValue: scala.Double
  ): scala.Unit = js.native
}

