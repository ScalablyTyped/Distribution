package typings.primus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimusPacket extends js.Object {
  var data: js.Any
}

object PrimusPacket {
  @scala.inline
  def apply(data: js.Any): PrimusPacket = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrimusPacket]
  }
}

