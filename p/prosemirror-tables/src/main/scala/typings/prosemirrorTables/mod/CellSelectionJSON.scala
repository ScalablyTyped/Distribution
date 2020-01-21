package typings.prosemirrorTables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectionJSON extends js.Object {
  var anchor: Double
  var head: Double
  var `type`: String
}

object CellSelectionJSON {
  @scala.inline
  def apply(anchor: Double, head: Double, `type`: String): CellSelectionJSON = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectionJSON]
  }
}

