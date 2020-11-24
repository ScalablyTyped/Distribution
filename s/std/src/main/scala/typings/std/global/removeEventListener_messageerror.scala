package typings.std.global

import typings.std.EventListenerOptions
import typings.std.Window
import typings.std.stdStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_messageerror extends js.Object {
  
  def apply(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MessageEvent[_], _]
  ): Unit = js.native
  def apply(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MessageEvent[_], _],
    options: scala.Boolean
  ): Unit = js.native
  def apply(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ typings.std.MessageEvent[_], _],
    options: EventListenerOptions
  ): Unit = js.native
}
