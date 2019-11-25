package typings.procfsDashStats.procfsDashStatsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tcp extends js.Object {
  var `_`: StringDictionary[String]
  var inode: String
  var local_address: String
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

object Tcp {
  @scala.inline
  def apply(
    `_`: StringDictionary[String],
    inode: String,
    local_address: String,
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
  ): Tcp = {
    val __obj = js.Dynamic.literal(inode = inode.asInstanceOf[js.Any], local_address = local_address.asInstanceOf[js.Any], rem_address = rem_address.asInstanceOf[js.Any], retrnsmt = retrnsmt.asInstanceOf[js.Any], rx_queue = rx_queue.asInstanceOf[js.Any], sl = sl.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], tx_queue = tx_queue.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(`_`.asInstanceOf[js.Any])
    __obj.updateDynamic("tm->when")(`tm->when`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tcp]
  }
}

