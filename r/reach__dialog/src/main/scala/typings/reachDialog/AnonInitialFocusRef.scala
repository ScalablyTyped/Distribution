package typings.reachDialog

import typings.react.mod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialFocusRef extends js.Object {
  var initialFocusRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}

object AnonInitialFocusRef {
  @scala.inline
  def apply(initialFocusRef: RefObject[HTMLElement] = null): AnonInitialFocusRef = {
    val __obj = js.Dynamic.literal()
    if (initialFocusRef != null) __obj.updateDynamic("initialFocusRef")(initialFocusRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialFocusRef]
  }
}

