package typings
package reactDashAceLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarker extends js.Object {
  var className: java.lang.String
  var endCol: scala.Double
  var endRow: scala.Double
  var inFront: js.UndefOr[scala.Boolean] = js.undefined
  var startCol: scala.Double
  var startRow: scala.Double
  var `type`: java.lang.String
}

object IMarker {
  @scala.inline
  def apply(
    className: java.lang.String,
    endCol: scala.Double,
    endRow: scala.Double,
    startCol: scala.Double,
    startRow: scala.Double,
    `type`: java.lang.String,
    inFront: js.UndefOr[scala.Boolean] = js.undefined
  ): IMarker = {
    val __obj = js.Dynamic.literal(className = className, endCol = endCol, endRow = endRow, startCol = startCol, startRow = startRow)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(inFront)) __obj.updateDynamic("inFront")(inFront)
    __obj.asInstanceOf[IMarker]
  }
}

