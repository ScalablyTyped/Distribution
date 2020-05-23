package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.pagehide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_pagehide extends js.Object {
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PageTransitionEvent, _]
  ): Unit = js.native
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

