package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cpu extends js.Object {
  var btime: String
  var cpu: CpuDetail
  var ctxt: String
  var intr: String
  var processes: String
  var procs_blocked: String
  var procs_running: String
  var softirq: String
}

object Cpu {
  @scala.inline
  def apply(
    btime: String,
    cpu: CpuDetail,
    ctxt: String,
    intr: String,
    processes: String,
    procs_blocked: String,
    procs_running: String,
    softirq: String
  ): Cpu = {
    val __obj = js.Dynamic.literal(btime = btime.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], ctxt = ctxt.asInstanceOf[js.Any], intr = intr.asInstanceOf[js.Any], processes = processes.asInstanceOf[js.Any], procs_blocked = procs_blocked.asInstanceOf[js.Any], procs_running = procs_running.asInstanceOf[js.Any], softirq = softirq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cpu]
  }
}

