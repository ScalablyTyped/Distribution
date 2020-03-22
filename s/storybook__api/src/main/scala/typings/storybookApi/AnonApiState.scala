package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiState extends js.Object {
  var api: AnonFocusOnUIElement
  var state: js.Any
}

object AnonApiState {
  @scala.inline
  def apply(api: AnonFocusOnUIElement, state: js.Any): AnonApiState = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiState]
  }
}

