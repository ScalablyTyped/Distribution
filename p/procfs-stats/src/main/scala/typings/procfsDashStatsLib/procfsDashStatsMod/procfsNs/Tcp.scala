package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tcp extends js.Object {
  var `_`: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inode: java.lang.String
  var local_address: java.lang.String
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

object Tcp {
  @scala.inline
  def apply(
    `_`: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inode: java.lang.String,
    local_address: java.lang.String,
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
  ): Tcp = {
    val __obj = js.Dynamic.literal(`_` = `_`, `tm->when` = `tm->when`)
    __obj.updateDynamic("inode")(inode)
    __obj.updateDynamic("local_address")(local_address)
    __obj.updateDynamic("rem_address")(rem_address)
    __obj.updateDynamic("retrnsmt")(retrnsmt)
    __obj.updateDynamic("rx_queue")(rx_queue)
    __obj.updateDynamic("sl")(sl)
    __obj.updateDynamic("st")(st)
    __obj.updateDynamic("timeout")(timeout)
    __obj.updateDynamic("tr")(tr)
    __obj.updateDynamic("tx_queue")(tx_queue)
    __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Tcp]
  }
}

