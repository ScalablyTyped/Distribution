package typings.std

import typings.std.stdStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_unload extends js.Object {
  def apply(`type`: unload, listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _]): Unit = js.native
  def apply(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
}

