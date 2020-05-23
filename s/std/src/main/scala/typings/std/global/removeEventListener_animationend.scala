package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.animationend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_animationend extends js.Object {
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationend,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

