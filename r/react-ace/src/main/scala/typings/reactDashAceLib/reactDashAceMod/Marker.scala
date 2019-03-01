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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("endCol")(endCol)
    __obj.updateDynamic("endRow")(endRow)
    __obj.updateDynamic("startCol")(startCol)
    __obj.updateDynamic("startRow")(startRow)
    __obj.asInstanceOf[Marker]
  }
}

