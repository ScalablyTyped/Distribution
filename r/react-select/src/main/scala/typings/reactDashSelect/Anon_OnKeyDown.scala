package typings.reactDashSelect

import typings.react.reactMod.KeyboardEvent
import typings.reactDashSelect.srcTypesMod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnKeyDown extends js.Object {
  var onKeyDown: KeyboardEventHandler
}

object Anon_OnKeyDown {
  @scala.inline
  def apply(onKeyDown: /* event */ KeyboardEvent[HTMLElement] => Unit): Anon_OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
  
    __obj.asInstanceOf[Anon_OnKeyDown]
  }
}

