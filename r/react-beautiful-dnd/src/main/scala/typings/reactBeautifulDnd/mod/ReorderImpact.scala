package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReorderImpact extends ImpactLocation {
  var destination: DraggableLocation
  var `type`: REORDER
}

object ReorderImpact {
  @scala.inline
  def apply(destination: DraggableLocation, `type`: REORDER): ReorderImpact = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReorderImpact]
  }
}

