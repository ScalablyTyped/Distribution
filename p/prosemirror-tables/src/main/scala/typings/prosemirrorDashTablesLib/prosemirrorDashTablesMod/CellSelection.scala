package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "CellSelection")
@js.native
class CellSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */] protected () extends js.Object {
  def this($anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  def this($anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S], $headCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]) = this()
  @JSName("$anchor")
  var $anchor: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  @JSName("$anchorCell")
  var $anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  @JSName("$from")
  var $from: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  @JSName("$head")
  var $head: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  @JSName("$headCell")
  var $headCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  @JSName("$to")
  var $to: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S] = js.native
  var anchor: scala.Double = js.native
  var empty: scala.Boolean = js.native
  var from: scala.Double = js.native
  var head: scala.Double = js.native
  var ranges: js.Array[prosemirrorDashStateLib.prosemirrorDashStateMod.SelectionRange[S]] = js.native
  var to: scala.Double = js.native
  def content(): prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S] = js.native
  def eq(other: js.Any): scala.Boolean = js.native
  def forEachCell(
    f: js.Function2[
      /* node */ prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], 
      /* pos */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getBookmark(): prosemirrorDashTablesLib.Anon_Anchor = js.native
  def isColSelection(): scala.Boolean = js.native
  def isRowSelection(): scala.Boolean = js.native
  def map(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], mapping: js.Any): js.Any = js.native
  def replace(
    tr: prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S],
    content: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): scala.Unit = js.native
  def replaceWith(
    tr: prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S],
    node: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S]
  ): scala.Unit = js.native
  def toJSON(): CellSelectionJSON = js.native
}

/* static members */
@JSImport("prosemirror-tables", "CellSelection")
@js.native
object CellSelection extends js.Object {
  def colSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def colSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    headCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]
  ): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], anchorCell: scala.Double): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def create[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    anchorCell: scala.Double,
    headCell: scala.Double
  ): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def fromJSON[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    json: prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelectionJSON
  ): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def rowSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
  def rowSelection[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    anchorCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S],
    headCell: prosemirrorDashModelLib.prosemirrorDashModelMod.ResolvedPos[S]
  ): prosemirrorDashTablesLib.prosemirrorDashTablesMod.CellSelection[S] = js.native
}

