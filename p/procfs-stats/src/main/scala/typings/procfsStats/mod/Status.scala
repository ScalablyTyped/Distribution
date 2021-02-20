package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends StObject {
  
  var CapBnd: String = js.native
  
  var CapEff: String = js.native
  
  var CapInh: String = js.native
  
  var CapPrm: String = js.native
  
  var Cpus_allowed: String = js.native
  
  var Cpus_allowed_list: String = js.native
  
  var FDSize: String = js.native
  
  var Gid: String = js.native
  
  var Groups: String = js.native
  
  var Mems_allowed: String = js.native
  
  var Mems_allowed_list: String = js.native
  
  var Name: String = js.native
  
  var PPid: String = js.native
  
  var Pid: String = js.native
  
  var ShdPnd: String = js.native
  
  var SigBlk: String = js.native
  
  var SigCgt: String = js.native
  
  var SigIgn: String = js.native
  
  var SigPnd: String = js.native
  
  var SigQ: String = js.native
  
  var State: String = js.native
  
  var Tgid: String = js.native
  
  var Threads: String = js.native
  
  var TracerPid: String = js.native
  
  var Uid: String = js.native
  
  var VmData: String = js.native
  
  var VmExe: String = js.native
  
  var VmHWM: String = js.native
  
  var VmLck: String = js.native
  
  var VmLib: String = js.native
  
  var VmPTE: String = js.native
  
  var VmPeak: String = js.native
  
  var VmPin: String = js.native
  
  var VmRSS: String = js.native
  
  var VmSize: String = js.native
  
  var VmStk: String = js.native
  
  var VmSwap: String = js.native
  
  var nonvoluntary_ctxt_switches: String = js.native
  
  var voluntary_ctxt_switches: String = js.native
}
object Status {
  
  @scala.inline
  def apply(
    CapBnd: String,
    CapEff: String,
    CapInh: String,
    CapPrm: String,
    Cpus_allowed: String,
    Cpus_allowed_list: String,
    FDSize: String,
    Gid: String,
    Groups: String,
    Mems_allowed: String,
    Mems_allowed_list: String,
    Name: String,
    PPid: String,
    Pid: String,
    ShdPnd: String,
    SigBlk: String,
    SigCgt: String,
    SigIgn: String,
    SigPnd: String,
    SigQ: String,
    State: String,
    Tgid: String,
    Threads: String,
    TracerPid: String,
    Uid: String,
    VmData: String,
    VmExe: String,
    VmHWM: String,
    VmLck: String,
    VmLib: String,
    VmPTE: String,
    VmPeak: String,
    VmPin: String,
    VmRSS: String,
    VmSize: String,
    VmStk: String,
    VmSwap: String,
    nonvoluntary_ctxt_switches: String,
    voluntary_ctxt_switches: String
  ): Status = {
    val __obj = js.Dynamic.literal(CapBnd = CapBnd.asInstanceOf[js.Any], CapEff = CapEff.asInstanceOf[js.Any], CapInh = CapInh.asInstanceOf[js.Any], CapPrm = CapPrm.asInstanceOf[js.Any], Cpus_allowed = Cpus_allowed.asInstanceOf[js.Any], Cpus_allowed_list = Cpus_allowed_list.asInstanceOf[js.Any], FDSize = FDSize.asInstanceOf[js.Any], Gid = Gid.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Mems_allowed = Mems_allowed.asInstanceOf[js.Any], Mems_allowed_list = Mems_allowed_list.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PPid = PPid.asInstanceOf[js.Any], Pid = Pid.asInstanceOf[js.Any], ShdPnd = ShdPnd.asInstanceOf[js.Any], SigBlk = SigBlk.asInstanceOf[js.Any], SigCgt = SigCgt.asInstanceOf[js.Any], SigIgn = SigIgn.asInstanceOf[js.Any], SigPnd = SigPnd.asInstanceOf[js.Any], SigQ = SigQ.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Tgid = Tgid.asInstanceOf[js.Any], Threads = Threads.asInstanceOf[js.Any], TracerPid = TracerPid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any], VmData = VmData.asInstanceOf[js.Any], VmExe = VmExe.asInstanceOf[js.Any], VmHWM = VmHWM.asInstanceOf[js.Any], VmLck = VmLck.asInstanceOf[js.Any], VmLib = VmLib.asInstanceOf[js.Any], VmPTE = VmPTE.asInstanceOf[js.Any], VmPeak = VmPeak.asInstanceOf[js.Any], VmPin = VmPin.asInstanceOf[js.Any], VmRSS = VmRSS.asInstanceOf[js.Any], VmSize = VmSize.asInstanceOf[js.Any], VmStk = VmStk.asInstanceOf[js.Any], VmSwap = VmSwap.asInstanceOf[js.Any], nonvoluntary_ctxt_switches = nonvoluntary_ctxt_switches.asInstanceOf[js.Any], voluntary_ctxt_switches = voluntary_ctxt_switches.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapBnd(value: String): Self = StObject.set(x, "CapBnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapEff(value: String): Self = StObject.set(x, "CapEff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapInh(value: String): Self = StObject.set(x, "CapInh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapPrm(value: String): Self = StObject.set(x, "CapPrm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus_allowed(value: String): Self = StObject.set(x, "Cpus_allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpus_allowed_list(value: String): Self = StObject.set(x, "Cpus_allowed_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFDSize(value: String): Self = StObject.set(x, "FDSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGid(value: String): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: String): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMems_allowed(value: String): Self = StObject.set(x, "Mems_allowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMems_allowed_list(value: String): Self = StObject.set(x, "Mems_allowed_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonvoluntary_ctxt_switches(value: String): Self = StObject.set(x, "nonvoluntary_ctxt_switches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPPid(value: String): Self = StObject.set(x, "PPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: String): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShdPnd(value: String): Self = StObject.set(x, "ShdPnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigBlk(value: String): Self = StObject.set(x, "SigBlk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigCgt(value: String): Self = StObject.set(x, "SigCgt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigIgn(value: String): Self = StObject.set(x, "SigIgn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigPnd(value: String): Self = StObject.set(x, "SigPnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigQ(value: String): Self = StObject.set(x, "SigQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTgid(value: String): Self = StObject.set(x, "Tgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreads(value: String): Self = StObject.set(x, "Threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracerPid(value: String): Self = StObject.set(x, "TracerPid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmData(value: String): Self = StObject.set(x, "VmData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmExe(value: String): Self = StObject.set(x, "VmExe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmHWM(value: String): Self = StObject.set(x, "VmHWM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmLck(value: String): Self = StObject.set(x, "VmLck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmLib(value: String): Self = StObject.set(x, "VmLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmPTE(value: String): Self = StObject.set(x, "VmPTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmPeak(value: String): Self = StObject.set(x, "VmPeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmPin(value: String): Self = StObject.set(x, "VmPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmRSS(value: String): Self = StObject.set(x, "VmRSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmSize(value: String): Self = StObject.set(x, "VmSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmStk(value: String): Self = StObject.set(x, "VmStk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmSwap(value: String): Self = StObject.set(x, "VmSwap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoluntary_ctxt_switches(value: String): Self = StObject.set(x, "voluntary_ctxt_switches", value.asInstanceOf[js.Any])
  }
}
