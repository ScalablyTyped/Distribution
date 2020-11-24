package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cpu extends js.Object {
  
  var btime: String = js.native
  
  var cpu: CpuDetail = js.native
  
  var ctxt: String = js.native
  
  var intr: String = js.native
  
  var processes: String = js.native
  
  var procs_blocked: String = js.native
  
  var procs_running: String = js.native
  
  var softirq: String = js.native
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
  
  @scala.inline
  implicit class CpuOps[Self <: Cpu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBtime(value: String): Self = this.set("btime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpu(value: CpuDetail): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxt(value: String): Self = this.set("ctxt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntr(value: String): Self = this.set("intr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcesses(value: String): Self = this.set("processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcs_blocked(value: String): Self = this.set("procs_blocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcs_running(value: String): Self = this.set("procs_running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftirq(value: String): Self = this.set("softirq", value.asInstanceOf[js.Any])
  }
}
