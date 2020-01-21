package typings.procfsStats.mod

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
  @JSName("tm->when")
  var `tm-Greaterthansignwhen`: String
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
    `tm-Greaterthansignwhen`: String,
    tr: String,
    tx_queue: String,
    uid: String
  ): Udp = {
    val __obj = js.Dynamic.literal(drops = drops.asInstanceOf[js.Any], inode = inode.asInstanceOf[js.Any], local_address = local_address.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rem_address = rem_address.asInstanceOf[js.Any], retrnsmt = retrnsmt.asInstanceOf[js.Any], rx_queue = rx_queue.asInstanceOf[js.Any], sl = sl.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], tx_queue = tx_queue.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("tm->when")(`tm-Greaterthansignwhen`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Udp]
  }
}

