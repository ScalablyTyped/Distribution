package typings.socketIoParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Packet extends js.Object {
  var data: js.Any
  var id: Double
  var `type`: Double
}

object Packet {
  @scala.inline
  def apply(data: js.Any, id: Double, `type`: Double): Packet = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Packet]
  }
}

