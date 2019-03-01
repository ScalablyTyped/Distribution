package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdOffsetX extends js.Object {
  var id: java.lang.String
  var offsetX: scala.Double
  var offsetY: scala.Double
  var selected: scala.Boolean
  var `type`: java.lang.String
}

object Anon_IdOffsetX {
  @scala.inline
  def apply(
    id: java.lang.String,
    offsetX: scala.Double,
    offsetY: scala.Double,
    selected: scala.Boolean,
    `type`: java.lang.String
  ): Anon_IdOffsetX = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[Anon_IdOffsetX]
  }
}

