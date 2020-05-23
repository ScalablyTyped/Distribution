package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_abort extends js.Object {
  def apply(`type`: abort, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.UIEvent, _]): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.UIEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: abort,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.UIEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

