package typings.procfsStats.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stat extends StObject {
  
  var blocked: String
  
  var cguest_time: String
  
  var cmajflt: String
  
  var cminflt: String
  
  var cnswap: String
  
  var comm: String
  
  var cstime: String
  
  var cutime: String
  
  var delayacct_blkio_ticks: String
  
  var endcode: String
  
  var exit_signal: String
  
  var flags: String
  
  var guest_time: String
  
  var itrealvalue: String
  
  var kstkeip: String
  
  var kstkesp: String
  
  var majflt: String
  
  var minflt: String
  
  var nice: String
  
  var nswap: String
  
  var num_threads: String
  
  var pgrp: String
  
  var pid: String
  
  var policy: String
  
  var ppid: String
  
  var priority: String
  
  var processor: String
  
  var rss: String
  
  var rsslim: String
  
  var rt_priority: String
  
  var session: String
  
  var sigcatch: String
  
  var sigignore: String
  
  var signal: String
  
  var startcode: String
  
  var startstack: String
  
  var starttime: String
  
  var state: String
  
  var stime: String
  
  var tpgid: String
  
  var tty_nr: String
  
  var utime: String
  
  var vsize: String
  
  var wchan: String
}
object Stat {
  
  inline def apply(
    blocked: String,
    cguest_time: String,
    cmajflt: String,
    cminflt: String,
    cnswap: String,
    comm: String,
    cstime: String,
    cutime: String,
    delayacct_blkio_ticks: String,
    endcode: String,
    exit_signal: String,
    flags: String,
    guest_time: String,
    itrealvalue: String,
    kstkeip: String,
    kstkesp: String,
    majflt: String,
    minflt: String,
    nice: String,
    nswap: String,
    num_threads: String,
    pgrp: String,
    pid: String,
    policy: String,
    ppid: String,
    priority: String,
    processor: String,
    rss: String,
    rsslim: String,
    rt_priority: String,
    session: String,
    sigcatch: String,
    sigignore: String,
    signal: String,
    startcode: String,
    startstack: String,
    starttime: String,
    state: String,
    stime: String,
    tpgid: String,
    tty_nr: String,
    utime: String,
    vsize: String,
    wchan: String
  ): Stat = {
    val __obj = js.Dynamic.literal(blocked = blocked.asInstanceOf[js.Any], cguest_time = cguest_time.asInstanceOf[js.Any], cmajflt = cmajflt.asInstanceOf[js.Any], cminflt = cminflt.asInstanceOf[js.Any], cnswap = cnswap.asInstanceOf[js.Any], comm = comm.asInstanceOf[js.Any], cstime = cstime.asInstanceOf[js.Any], cutime = cutime.asInstanceOf[js.Any], delayacct_blkio_ticks = delayacct_blkio_ticks.asInstanceOf[js.Any], endcode = endcode.asInstanceOf[js.Any], exit_signal = exit_signal.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], guest_time = guest_time.asInstanceOf[js.Any], itrealvalue = itrealvalue.asInstanceOf[js.Any], kstkeip = kstkeip.asInstanceOf[js.Any], kstkesp = kstkesp.asInstanceOf[js.Any], majflt = majflt.asInstanceOf[js.Any], minflt = minflt.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], nswap = nswap.asInstanceOf[js.Any], num_threads = num_threads.asInstanceOf[js.Any], pgrp = pgrp.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], rsslim = rsslim.asInstanceOf[js.Any], rt_priority = rt_priority.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], sigcatch = sigcatch.asInstanceOf[js.Any], sigignore = sigignore.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startcode = startcode.asInstanceOf[js.Any], startstack = startstack.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], stime = stime.asInstanceOf[js.Any], tpgid = tpgid.asInstanceOf[js.Any], tty_nr = tty_nr.asInstanceOf[js.Any], utime = utime.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any], wchan = wchan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
    
    inline def setBlocked(value: String): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setCguest_time(value: String): Self = StObject.set(x, "cguest_time", value.asInstanceOf[js.Any])
    
    inline def setCmajflt(value: String): Self = StObject.set(x, "cmajflt", value.asInstanceOf[js.Any])
    
    inline def setCminflt(value: String): Self = StObject.set(x, "cminflt", value.asInstanceOf[js.Any])
    
    inline def setCnswap(value: String): Self = StObject.set(x, "cnswap", value.asInstanceOf[js.Any])
    
    inline def setComm(value: String): Self = StObject.set(x, "comm", value.asInstanceOf[js.Any])
    
    inline def setCstime(value: String): Self = StObject.set(x, "cstime", value.asInstanceOf[js.Any])
    
    inline def setCutime(value: String): Self = StObject.set(x, "cutime", value.asInstanceOf[js.Any])
    
    inline def setDelayacct_blkio_ticks(value: String): Self = StObject.set(x, "delayacct_blkio_ticks", value.asInstanceOf[js.Any])
    
    inline def setEndcode(value: String): Self = StObject.set(x, "endcode", value.asInstanceOf[js.Any])
    
    inline def setExit_signal(value: String): Self = StObject.set(x, "exit_signal", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGuest_time(value: String): Self = StObject.set(x, "guest_time", value.asInstanceOf[js.Any])
    
    inline def setItrealvalue(value: String): Self = StObject.set(x, "itrealvalue", value.asInstanceOf[js.Any])
    
    inline def setKstkeip(value: String): Self = StObject.set(x, "kstkeip", value.asInstanceOf[js.Any])
    
    inline def setKstkesp(value: String): Self = StObject.set(x, "kstkesp", value.asInstanceOf[js.Any])
    
    inline def setMajflt(value: String): Self = StObject.set(x, "majflt", value.asInstanceOf[js.Any])
    
    inline def setMinflt(value: String): Self = StObject.set(x, "minflt", value.asInstanceOf[js.Any])
    
    inline def setNice(value: String): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNswap(value: String): Self = StObject.set(x, "nswap", value.asInstanceOf[js.Any])
    
    inline def setNum_threads(value: String): Self = StObject.set(x, "num_threads", value.asInstanceOf[js.Any])
    
    inline def setPgrp(value: String): Self = StObject.set(x, "pgrp", value.asInstanceOf[js.Any])
    
    inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPpid(value: String): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProcessor(value: String): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setRss(value: String): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
    
    inline def setRsslim(value: String): Self = StObject.set(x, "rsslim", value.asInstanceOf[js.Any])
    
    inline def setRt_priority(value: String): Self = StObject.set(x, "rt_priority", value.asInstanceOf[js.Any])
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSigcatch(value: String): Self = StObject.set(x, "sigcatch", value.asInstanceOf[js.Any])
    
    inline def setSigignore(value: String): Self = StObject.set(x, "sigignore", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setStartcode(value: String): Self = StObject.set(x, "startcode", value.asInstanceOf[js.Any])
    
    inline def setStartstack(value: String): Self = StObject.set(x, "startstack", value.asInstanceOf[js.Any])
    
    inline def setStarttime(value: String): Self = StObject.set(x, "starttime", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStime(value: String): Self = StObject.set(x, "stime", value.asInstanceOf[js.Any])
    
    inline def setTpgid(value: String): Self = StObject.set(x, "tpgid", value.asInstanceOf[js.Any])
    
    inline def setTty_nr(value: String): Self = StObject.set(x, "tty_nr", value.asInstanceOf[js.Any])
    
    inline def setUtime(value: String): Self = StObject.set(x, "utime", value.asInstanceOf[js.Any])
    
    inline def setVsize(value: String): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
    
    inline def setWchan(value: String): Self = StObject.set(x, "wchan", value.asInstanceOf[js.Any])
  }
}
