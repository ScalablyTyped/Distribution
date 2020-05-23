package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.unhandledrejection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_unhandledrejection extends js.Object {
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
    options: AddEventListenerOptions
  ): Unit = js.native
}

