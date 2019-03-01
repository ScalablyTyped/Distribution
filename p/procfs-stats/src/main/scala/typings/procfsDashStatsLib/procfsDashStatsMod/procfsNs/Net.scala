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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Interface")(Interface)
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("carrier")(carrier)
    __obj.updateDynamic("colls")(colls)
    __obj.updateDynamic("compressed")(compressed)
    __obj.updateDynamic("drop")(drop)
    __obj.updateDynamic("errs")(errs)
    __obj.updateDynamic("fifo")(fifo)
    __obj.updateDynamic("frame")(frame)
    __obj.updateDynamic("multicast")(multicast)
    __obj.updateDynamic("packets")(packets)
    __obj.asInstanceOf[Net]
  }
}

