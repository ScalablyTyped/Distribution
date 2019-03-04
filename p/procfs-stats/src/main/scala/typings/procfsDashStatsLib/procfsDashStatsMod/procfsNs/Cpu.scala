package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cpu extends js.Object {
  var btime: java.lang.String
  var cpu: CpuDetail
  var ctxt: java.lang.String
  var intr: java.lang.String
  var processes: java.lang.String
  var procs_blocked: java.lang.String
  var procs_running: java.lang.String
  var softirq: java.lang.String
}

object Cpu {
  @scala.inline
  def apply(
    btime: java.lang.String,
    cpu: CpuDetail,
    ctxt: java.lang.String,
    intr: java.lang.String,
    processes: java.lang.String,
    procs_blocked: java.lang.String,
    procs_running: java.lang.String,
    softirq: java.lang.String
  ): Cpu = {
    val __obj = js.Dynamic.literal(btime = btime, cpu = cpu, ctxt = ctxt, intr = intr, processes = processes, procs_blocked = procs_blocked, procs_running = procs_running, softirq = softirq)
  
    __obj.asInstanceOf[Cpu]
  }
}

