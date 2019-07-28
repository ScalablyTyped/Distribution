package typings.reactDashSplitDashPane.reactDashSplitDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var active: Boolean
  var resized: Boolean
}

object State {
  @scala.inline
  def apply(active: Boolean, resized: Boolean): State = {
    val __obj = js.Dynamic.literal(active = active, resized = resized)
  
    __obj.asInstanceOf[State]
  }
}

