package typings.reactPopperTooltip.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: HTMLElement | Null
}

object Current {
  @scala.inline
  def apply(current: HTMLElement = null): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

