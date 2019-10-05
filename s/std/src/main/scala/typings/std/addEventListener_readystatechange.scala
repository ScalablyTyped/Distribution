package typings.std

import typings.std.stdStrings.readystatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_readystatechange extends js.Object {
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[Window], _]
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[Window], _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ ProgressEvent[Window], _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

