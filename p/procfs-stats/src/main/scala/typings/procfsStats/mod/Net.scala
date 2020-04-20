package typings.procfsStats.mod

import typings.procfsStats.AnonReceive
import typings.procfsStats.AnonReceiveString
import typings.procfsStats.AnonTransmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Net extends js.Object {
  var Interface: String
  var bytes: AnonReceive
  var carrier: AnonTransmit
  var colls: AnonTransmit
  var compressed: AnonReceive
  var drop: AnonReceive
  var errs: AnonReceive
  var fifo: AnonReceive
  var frame: AnonReceiveString
  var multicast: AnonReceiveString
  var packets: AnonReceive
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: AnonReceive,
    carrier: AnonTransmit,
    colls: AnonTransmit,
    compressed: AnonReceive,
    drop: AnonReceive,
    errs: AnonReceive,
    fifo: AnonReceive,
    frame: AnonReceiveString,
    multicast: AnonReceiveString,
    packets: AnonReceive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], colls = colls.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], errs = errs.asInstanceOf[js.Any], fifo = fifo.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], multicast = multicast.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Net]
  }
}

