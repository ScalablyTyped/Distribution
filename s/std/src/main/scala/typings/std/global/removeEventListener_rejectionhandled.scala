package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.rejectionhandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_rejectionhandled extends js.Object {
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

