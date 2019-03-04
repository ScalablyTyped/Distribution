package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Net extends js.Object {
  var Interface: java.lang.String
  var bytes: procfsDashStatsLib.Anon_Receive
  var carrier: procfsDashStatsLib.Anon_Transmit
  var colls: procfsDashStatsLib.Anon_Transmit
  var compressed: procfsDashStatsLib.Anon_Receive
  var drop: procfsDashStatsLib.Anon_Receive
  var errs: procfsDashStatsLib.Anon_Receive
  var fifo: procfsDashStatsLib.Anon_Receive
  var frame: procfsDashStatsLib.Anon_ReceiveString
  var multicast: procfsDashStatsLib.Anon_ReceiveString
  var packets: procfsDashStatsLib.Anon_Receive
}

object Net {
  @scala.inline
  def apply(
    Interface: java.lang.String,
    bytes: procfsDashStatsLib.Anon_Receive,
    carrier: procfsDashStatsLib.Anon_Transmit,
    colls: procfsDashStatsLib.Anon_Transmit,
    compressed: procfsDashStatsLib.Anon_Receive,
    drop: procfsDashStatsLib.Anon_Receive,
    errs: procfsDashStatsLib.Anon_Receive,
    fifo: procfsDashStatsLib.Anon_Receive,
    frame: procfsDashStatsLib.Anon_ReceiveString,
    multicast: procfsDashStatsLib.Anon_ReceiveString,
    packets: procfsDashStatsLib.Anon_Receive
  ): Net = {
    val __obj = js.Dynamic.literal(Interface = Interface, bytes = bytes, carrier = carrier, colls = colls, compressed = compressed, drop = drop, errs = errs, fifo = fifo, frame = frame, multicast = multicast, packets = packets)
  
    __obj.asInstanceOf[Net]
  }
}

