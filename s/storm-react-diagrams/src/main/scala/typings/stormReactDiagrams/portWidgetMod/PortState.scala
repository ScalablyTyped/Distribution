package typings.stormReactDiagrams.portWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortState extends js.Object {
  var selected: Boolean
}

object PortState {
  @scala.inline
  def apply(selected: Boolean): PortState = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortState]
  }
}

