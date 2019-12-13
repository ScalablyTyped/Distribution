package typings.reactDashPopperDashTooltip

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: HTMLElement | Null
}

object Anon_Current {
  @scala.inline
  def apply(current: HTMLElement = null): Anon_Current = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Current]
  }
}

