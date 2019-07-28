package typings.prosemirrorDashTables.prosemirrorDashTablesMod

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
    val __obj = js.Dynamic.literal(anchor = anchor, head = head)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CellSelectionJSON]
  }
}

