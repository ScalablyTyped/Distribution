package typings.std

import typings.std.stdStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_storage extends js.Object {
  def apply(`type`: storage, listener: js.ThisFunction1[/* this */ Window_, /* ev */ StorageEvent, _]): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

