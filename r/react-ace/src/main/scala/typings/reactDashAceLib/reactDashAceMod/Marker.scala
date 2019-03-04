package typings
package reactDashAceLib.reactDashAceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends js.Object {
  var className: java.lang.String
  var endCol: scala.Double
  var endRow: scala.Double
  var startCol: scala.Double
  var startRow: scala.Double
  var `type`: java.lang.String
}

object Marker {
  @scala.inline
  def apply(
    className: java.lang.String,
    endCol: scala.Double,
    endRow: scala.Double,
    startCol: scala.Double,
    startRow: scala.Double,
    `type`: java.lang.String
  ): Marker = {
    val __obj = js.Dynamic.literal(className = className, endCol = endCol, endRow = endRow, startCol = startCol, startRow = startRow)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Marker]
  }
}

