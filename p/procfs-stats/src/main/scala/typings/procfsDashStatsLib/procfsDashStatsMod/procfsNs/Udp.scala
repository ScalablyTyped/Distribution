package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Udp extends js.Object {
  var drops: java.lang.String
  var inode: java.lang.String
  var local_address: java.lang.String
  var pointer: java.lang.String
  var ref: java.lang.String
  var rem_address: java.lang.String
  var retrnsmt: java.lang.String
  var rx_queue: java.lang.String
  var sl: java.lang.String
  var st: java.lang.String
  var timeout: java.lang.String
  var `tm->when`: java.lang.String
  var tr: java.lang.String
  var tx_queue: java.lang.String
  var uid: java.lang.String
}

object Udp {
  @scala.inline
  def apply(
    drops: java.lang.String,
    inode: java.lang.String,
    local_address: java.lang.String,
    pointer: java.lang.String,
    ref: java.lang.String,
    rem_address: java.lang.String,
    retrnsmt: java.lang.String,
    rx_queue: java.lang.String,
    sl: java.lang.String,
    st: java.lang.String,
    timeout: java.lang.String,
    `tm->when`: java.lang.String,
    tr: java.lang.String,
    tx_queue: java.lang.String,
    uid: java.lang.String
  ): Udp = {
    val __obj = js.Dynamic.literal(drops = drops, inode = inode, local_address = local_address, pointer = pointer, ref = ref, rem_address = rem_address, retrnsmt = retrnsmt, rx_queue = rx_queue, sl = sl, st = st, timeout = timeout, tr = tr, tx_queue = tx_queue, uid = uid)
    __obj.updateDynamic("tm->when")(`tm->when`)
    __obj.asInstanceOf[Udp]
  }
}

