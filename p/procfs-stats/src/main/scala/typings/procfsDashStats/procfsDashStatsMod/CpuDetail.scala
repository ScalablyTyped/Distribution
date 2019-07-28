package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuDetail extends js.Object {
  var guest: String
  var guest_nice: String
  var idle: String
  var iowait: String
  var irq: String
  var nice: String
  var softirq: String
  var steal: String
  var system: String
  var user: String
}

object CpuDetail {
  @scala.inline
  def apply(
    guest: String,
    guest_nice: String,
    idle: String,
    iowait: String,
    irq: String,
    nice: String,
    softirq: String,
    steal: String,
    system: String,
    user: String
  ): CpuDetail = {
    val __obj = js.Dynamic.literal(guest = guest, guest_nice = guest_nice, idle = idle, iowait = iowait, irq = irq, nice = nice, softirq = softirq, steal = steal, system = system, user = user)
  
    __obj.asInstanceOf[CpuDetail]
  }
}

