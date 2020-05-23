package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.keyup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_keyup extends js.Object {
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.KeyboardEvent, _]
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.KeyboardEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: keyup,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.KeyboardEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

