package typings.procfsDashStats.procfsDashStatsMod

import typings.procfsDashStats.Anon_Receive
import typings.procfsDashStats.Anon_ReceiveString
import typings.procfsDashStats.Anon_Transmit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Net extends js.Object {
  var Interface: String
  var bytes: Anon_Receive
  var carrier: Anon_Transmit
  var colls: Anon_Transmit
  var compressed: Anon_Receive
  var drop: Anon_Receive
  var errs: Anon_Receive
  var fifo: Anon_Receive
  var frame: Anon_ReceiveString
  var multicast: Anon_ReceiveString
  var packets: Anon_Receive
}

object Net {
  @scala.inline
  def apply(
    Interface: String,
    bytes: Anon_Receive,
    carrier: Anon_Transmit,
    colls: Anon_Transmit,
    compressed: Anon_Receive,
    drop: Anon_Receive,
    errs: Anon_Receive,
    fifo: Anon_Receive,
    frame: Anon_ReceiveString,
    multicast: Anon_ReceiveString,
    packets: Anon_Receive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface, bytes = bytes, carrier = carrier, colls = colls, compressed = compressed, drop = drop, errs = errs, fifo = fifo, frame = frame, multicast = multicast, packets = packets)
  
    __obj.asInstanceOf[Net]
  }
}

