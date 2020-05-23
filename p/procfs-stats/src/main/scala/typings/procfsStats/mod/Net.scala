package typings.procfsStats.mod

import typings.procfsStats.anon.Receive
import typings.procfsStats.anon.ReceiveString
import typings.procfsStats.anon.Transmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Net extends js.Object {
  var Interface: String
  var bytes: Receive
  var carrier: Transmit
  var colls: Transmit
  var compressed: Receive
  var drop: Receive
  var errs: Receive
  var fifo: Receive
  var frame: ReceiveString
  var multicast: ReceiveString
  var packets: Receive
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: Receive,
    carrier: Transmit,
    colls: Transmit,
    compressed: Receive,
    drop: Receive,
    errs: Receive,
    fifo: Receive,
    frame: ReceiveString,
    multicast: ReceiveString,
    packets: Receive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], carrier = carrier.asInstanceOf[js.Any], colls = colls.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], errs = errs.asInstanceOf[js.Any], fifo = fifo.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], multicast = multicast.asInstanceOf[js.Any], packets = packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Net]
  }
}

