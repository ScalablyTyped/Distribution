package typings.atReachDialog

import typings.react.reactMod.RefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialFocusRef extends js.Object {
  var initialFocusRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
}

object Anon_InitialFocusRef {
  @scala.inline
  def apply(initialFocusRef: RefObject[HTMLElement] = null): Anon_InitialFocusRef = {
    val __obj = js.Dynamic.literal()
    if (initialFocusRef != null) __obj.updateDynamic("initialFocusRef")(initialFocusRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_InitialFocusRef]
  }
}

