package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.hashchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_hashchange extends js.Object {
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.HashChangeEvent, _]
  ): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.HashChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

