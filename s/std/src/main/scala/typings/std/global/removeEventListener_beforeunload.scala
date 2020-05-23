package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.beforeunload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_beforeunload extends js.Object {
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.BeforeUnloadEvent, _]
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

