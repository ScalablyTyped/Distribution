package typings
package slateDashIrcLib.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MOTDEvent extends js.Object {
  var motd: js.Array[java.lang.String]
}

object MOTDEvent {
  @scala.inline
  def apply(motd: js.Array[java.lang.String]): MOTDEvent = {
    val __obj = js.Dynamic.literal(motd = motd)
  
    __obj.asInstanceOf[MOTDEvent]
  }
}

