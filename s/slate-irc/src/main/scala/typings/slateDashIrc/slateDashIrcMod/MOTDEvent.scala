package typings.slateDashIrc.slateDashIrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MOTDEvent extends js.Object {
  var motd: js.Array[String]
}

object MOTDEvent {
  @scala.inline
  def apply(motd: js.Array[String]): MOTDEvent = {
    val __obj = js.Dynamic.literal(motd = motd)
  
    __obj.asInstanceOf[MOTDEvent]
  }
}

