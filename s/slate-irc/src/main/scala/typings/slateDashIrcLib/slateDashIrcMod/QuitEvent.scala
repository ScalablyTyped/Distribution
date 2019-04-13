package typings
package slateDashIrcLib.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuitEvent extends js.Object {
  var hostmask: java.lang.String
  var message: java.lang.String
  var nick: java.lang.String
}

object QuitEvent {
  @scala.inline
  def apply(hostmask: java.lang.String, message: java.lang.String, nick: java.lang.String): QuitEvent = {
    val __obj = js.Dynamic.literal(hostmask = hostmask, message = message, nick = nick)
  
    __obj.asInstanceOf[QuitEvent]
  }
}

