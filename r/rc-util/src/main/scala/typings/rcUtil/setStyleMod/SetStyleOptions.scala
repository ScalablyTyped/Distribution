package typings.rcUtil.setStyleMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStyleOptions extends js.Object {
  var element: js.UndefOr[HTMLElement] = js.undefined
}

object SetStyleOptions {
  @scala.inline
  def apply(element: HTMLElement = null): SetStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleOptions]
  }
}

