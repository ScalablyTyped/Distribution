package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_storage extends js.Object {
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
    options: AddEventListenerOptions
  ): Unit = js.native
}

