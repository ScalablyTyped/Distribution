package typings.std

import typings.std.stdStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_keyup extends js.Object {
  def apply(`type`: keyup, listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _]): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ KeyboardEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

