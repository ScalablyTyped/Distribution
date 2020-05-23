package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_unhandledrejection extends js.Object {
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

