package typings.rmcFeedback.propTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchState extends js.Object {
  var active: Boolean
}

object ITouchState {
  @scala.inline
  def apply(active: Boolean): ITouchState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchState]
  }
}

