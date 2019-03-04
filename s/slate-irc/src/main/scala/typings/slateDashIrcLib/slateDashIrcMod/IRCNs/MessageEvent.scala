package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageEvent extends js.Object {
  var from: java.lang.String
  var hostmask: java.lang.String
  var message: java.lang.String
  var to: java.lang.String
}

object MessageEvent {
  @scala.inline
  def apply(
    from: java.lang.String,
    hostmask: java.lang.String,
    message: java.lang.String,
    to: java.lang.String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(from = from, hostmask = hostmask, message = message, to = to)
  
    __obj.asInstanceOf[MessageEvent]
  }
}

