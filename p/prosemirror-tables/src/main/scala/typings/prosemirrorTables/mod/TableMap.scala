package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "TableMap")
@js.native
class TableMap () extends js.Object {
  var height: Double = js.native
  var map: js.Array[Double] = js.native
  var problems: js.UndefOr[js.Array[js.Object]] = js.native
  var width: Double = js.native
  def cellsInRect(rect: Rect): js.Array[Double] = js.native
  def colCount(pos: Double): Double = js.native
  def findCell(pos: Double): Rect = js.native
  def nextCell(pos: Double, axis: String, dir: Double): Double = js.native
  def positionAt(row: Double, col: Double, table: Node[_]): Double = js.native
  def rectBetween(a: Double, b: Double): Rect = js.native
}

/* static members */
@JSImport("prosemirror-tables", "TableMap")
@js.native
object TableMap extends js.Object {
  def get(table: Node[_]): TableMap = js.native
}

