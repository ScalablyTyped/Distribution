package typings.std

import typings.std.stdStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_resize extends js.Object {
  def apply(`type`: resize, listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _]): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: resize,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ UIEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

