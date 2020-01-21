package typings.std

import typings.std.stdStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_progress extends js.Object {
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _]
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: progress,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _],
    options: EventListenerOptions
  ): Unit = js.native
}

