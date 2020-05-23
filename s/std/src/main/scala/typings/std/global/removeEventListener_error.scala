package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_error extends js.Object {
  def apply(`type`: error, listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.ErrorEvent, _]): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.ErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.ErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

