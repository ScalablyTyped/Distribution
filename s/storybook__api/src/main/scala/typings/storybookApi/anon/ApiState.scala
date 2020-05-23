package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiState extends js.Object {
  var api: FocusOnUIElement
  var state: js.Any
}

object ApiState {
  @scala.inline
  def apply(api: FocusOnUIElement, state: js.Any): ApiState = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiState]
  }
}

