package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.animationiteration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_animationiteration extends js.Object {
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _]
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: animationiteration,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.AnimationEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

