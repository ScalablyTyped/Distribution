package typings.std

import typings.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_readystatechange extends js.Object {
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _]
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window_, /* ev */ ProgressEvent[Window_], _],
    options: EventListenerOptions
  ): Unit = js.native
}

