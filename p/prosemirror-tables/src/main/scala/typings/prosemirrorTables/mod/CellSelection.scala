package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorState.mod.Selection
import typings.prosemirrorState.mod.SelectionRange
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorTables.AnonAnchor
import typings.prosemirrorTransform.mod.Mappable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "CellSelection")
@js.native
class CellSelection[S /* <: Schema[_, _] */] protected () extends js.Object {
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
  var empty: Boolean = js.native
  var from: Double = js.native
  var head: Double = js.native
  var ranges: js.Array[SelectionRange[S]] = js.native
  var to: Double = js.native
  def content(): Slice[S] = js.native
  def eq(other: Selection[S]): Boolean = js.native
  def forEachCell(f: js.Function2[/* node */ Node[S], /* pos */ Double, Unit]): Unit = js.native
  def getBookmark(): AnonAnchor = js.native
  def isColSelection(): Boolean = js.native
  def isRowSelection(): Boolean = js.native
  def map(doc: Node[S], mapping: Mappable): js.Any = js.native
  def replace(tr: Transaction[S], content: Slice[S]): Unit = js.native
  def replaceWith(tr: Transaction[S], node: Node[S]): Unit = js.native
  def toJSON(): CellSelectionJSON = js.native
}

/* static members */
@JSImport("prosemirror-tables", "CellSelection")
@js.native
object CellSelection extends js.Object {
  def colSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S]): CellSelection[S] = js.native
  def colSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = js.native
  def create[S /* <: Schema[_, _] */](doc: Node[S], anchorCell: Double): CellSelection[S] = js.native
  def create[S /* <: Schema[_, _] */](doc: Node[S], anchorCell: Double, headCell: Double): CellSelection[S] = js.native
  def fromJSON[S /* <: Schema[_, _] */](doc: Node[S], json: CellSelectionJSON): CellSelection[S] = js.native
  def rowSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S]): CellSelection[S] = js.native
  def rowSelection[S /* <: Schema[_, _] */](anchorCell: ResolvedPos[S], headCell: ResolvedPos[S]): CellSelection[S] = js.native
}

