package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "TableMap")
@js.native
class TableMap () extends js.Object {
  var height: scala.Double = js.native
  var map: js.Array[scala.Double] = js.native
  var problems: js.UndefOr[js.Array[js.Object]] = js.native
  var width: scala.Double = js.native
  def cellsInRect(rect: Rect): js.Array[scala.Double] = js.native
  def colCount(pos: scala.Double): scala.Double = js.native
  def findCell(pos: scala.Double): Rect = js.native
  def nextCell(pos: scala.Double, axis: java.lang.String, dir: scala.Double): scala.Double = js.native
  def positionAt(
    row: scala.Double,
    col: scala.Double,
    table: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]
  ): scala.Double = js.native
  def rectBetween(a: scala.Double, b: scala.Double): Rect = js.native
}

@JSImport("prosemirror-tables", "TableMap")
@js.native
object TableMap extends js.Object {
  def get(table: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_]): prosemirrorDashTablesLib.prosemirrorDashTablesMod.TableMap = js.native
}

