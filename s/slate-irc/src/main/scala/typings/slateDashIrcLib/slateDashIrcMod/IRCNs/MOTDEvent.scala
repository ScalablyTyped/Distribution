package typings
package slateDashIrcLib.slateDashIrcMod.IRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MOTDEvent extends js.Object {
  var motd: js.Array[java.lang.String]
}

object MOTDEvent {
  @scala.inline
  def apply(motd: js.Array[java.lang.String]): MOTDEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("motd")(motd)
    __obj.asInstanceOf[MOTDEvent]
  }
}

