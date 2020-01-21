package typings.sauronjs.componentMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentParameters extends js.Object {
  var element: HTMLElement
  var state: js.UndefOr[js.Any] = js.undefined
}

object ComponentParameters {
  @scala.inline
  def apply(element: HTMLElement, state: js.Any = null): ComponentParameters = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentParameters]
  }
}

