package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QTable extends js.Object {
  var colCount: scala.Double
  var headers: js.Array[QHeader]
  var rowCount: scala.Double
  var rows: js.Array[QRow]
  var totals: js.Array[QMeasureCell]
  def exportData(options: ExportDataOptions, callback: js.Function1[/* url */ java.lang.String, scala.Unit]): scala.Unit
  def getColByName(fld: java.lang.String): js.UndefOr[scala.Double]
  def getMoreData(): scala.Unit
}

