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
    val __obj = js.Dynamic.literal(guest = guest.asInstanceOf[js.Any], guest_nice = guest_nice.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], iowait = iowait.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any], steal = steal.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuDetail]
  }
}

