package typings.std

import typings.std.stdStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_error extends js.Object {
  def apply(`type`: error, listener: js.ThisFunction1[/* this */ Window_, /* ev */ ErrorEvent, _]): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: error,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

