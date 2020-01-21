package typings.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarker extends js.Object {
  var className: String
  var endCol: Double
  var endRow: Double
  var inFront: js.UndefOr[Boolean] = js.undefined
  var startCol: Double
  var startRow: Double
  var `type`: String
}

object IMarker {
  @scala.inline
  def apply(
    className: String,
    endCol: Double,
    endRow: Double,
    startCol: Double,
    startRow: Double,
    `type`: String,
    inFront: js.UndefOr[Boolean] = js.undefined
  ): IMarker = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(inFront)) __obj.updateDynamic("inFront")(inFront.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
}

