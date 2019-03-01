package typings
package prosemirrorDashTablesLib.prosemirrorDashTablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectionJSON extends js.Object {
  var anchor: scala.Double
  var head: scala.Double
  var `type`: java.lang.String
}

object CellSelectionJSON {
  @scala.inline
  def apply(anchor: scala.Double, head: scala.Double, `type`: java.lang.String): CellSelectionJSON = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("anchor")(anchor)
    __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[CellSelectionJSON]
  }
}

