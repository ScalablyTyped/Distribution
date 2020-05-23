package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.pointerleave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pointerleave extends js.Object {
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pointerleave,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PointerEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

