package typings
package stormDashReactDashDiagramsLib.distSrcWidgetsPortWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortState extends js.Object {
  var selected: scala.Boolean
}

object PortState {
  @scala.inline
  def apply(selected: scala.Boolean): PortState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[PortState]
  }
}

