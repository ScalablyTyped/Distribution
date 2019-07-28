package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Udp extends js.Object {
  var drops: String
  var inode: String
  var local_address: String
  var pointer: String
  var ref: String
  var rem_address: String
  var retrnsmt: String
  var rx_queue: String
  var sl: String
  var st: String
  var timeout: String
  var `tm->when`: String
  var tr: String
  var tx_queue: String
  var uid: String
}

object Udp {
  @scala.inline
  def apply(
    drops: String,
    inode: String,
    local_address: String,
    pointer: String,
    ref: String,
    rem_address: String,
    retrnsmt: String,
    rx_queue: String,
    sl: String,
    st: String,
    timeout: String,
    `tm->when`: String,
    tr: String,
    tx_queue: String,
    uid: String
  ): Udp = {
    val __obj = js.Dynamic.literal(drops = drops, inode = inode, local_address = local_address, pointer = pointer, ref = ref, rem_address = rem_address, retrnsmt = retrnsmt, rx_queue = rx_queue, sl = sl, st = st, timeout = timeout, tr = tr, tx_queue = tx_queue, uid = uid)
    __obj.updateDynamic("tm->when")(`tm->when`)
    __obj.asInstanceOf[Udp]
  }
}

