package typings.std.global

import typings.std.AddEventListenerOptions
import typings.std.Window
import typings.std.stdStrings.popstate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("addEventListener")
@js.native
object addEventListener_popstate extends js.Object {
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PopStateEvent, _]
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.PopStateEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
}

