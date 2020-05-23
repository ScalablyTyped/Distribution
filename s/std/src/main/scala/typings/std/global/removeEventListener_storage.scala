package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_storage extends js.Object {
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.StorageEvent, _]
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

