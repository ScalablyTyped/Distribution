package typings
package reactDashSplitDashPaneLib.reactDashSplitDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var active: scala.Boolean
  var resized: scala.Boolean
}

object State {
  @scala.inline
  def apply(active: scala.Boolean, resized: scala.Boolean): State = {
    val __obj = js.Dynamic.literal(active = active, resized = resized)
  
    __obj.asInstanceOf[State]
  }
}

