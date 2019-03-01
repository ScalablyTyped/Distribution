package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuDetail extends js.Object {
  var guest: java.lang.String
  var guest_nice: java.lang.String
  var idle: java.lang.String
  var iowait: java.lang.String
  var irq: java.lang.String
  var nice: java.lang.String
  var softirq: java.lang.String
  var steal: java.lang.String
  var system: java.lang.String
  var user: java.lang.String
}

object CpuDetail {
  @scala.inline
  def apply(
    guest: java.lang.String,
    guest_nice: java.lang.String,
    idle: java.lang.String,
    iowait: java.lang.String,
    irq: java.lang.String,
    nice: java.lang.String,
    softirq: java.lang.String,
    steal: java.lang.String,
    system: java.lang.String,
    user: java.lang.String
  ): CpuDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("guest")(guest)
    __obj.updateDynamic("guest_nice")(guest_nice)
    __obj.updateDynamic("idle")(idle)
    __obj.updateDynamic("iowait")(iowait)
    __obj.updateDynamic("irq")(irq)
    __obj.updateDynamic("nice")(nice)
    __obj.updateDynamic("softirq")(softirq)
    __obj.updateDynamic("steal")(steal)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[CpuDetail]
  }
}

