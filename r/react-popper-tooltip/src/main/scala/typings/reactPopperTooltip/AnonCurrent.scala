package typings.reactPopperTooltip

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: HTMLElement | Null
}

object AnonCurrent {
  @scala.inline
  def apply(current: HTMLElement = null): AnonCurrent = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrent]
  }
}

