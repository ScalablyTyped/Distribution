package typings.procfsStats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stat extends js.Object {
  var blocked: String = js.native
  var cguest_time: String = js.native
  var cmajflt: String = js.native
  var cminflt: String = js.native
  var cnswap: String = js.native
  var comm: String = js.native
  var cstime: String = js.native
  var cutime: String = js.native
  var delayacct_blkio_ticks: String = js.native
  var endcode: String = js.native
  var exit_signal: String = js.native
  var flags: String = js.native
  var guest_time: String = js.native
  var itrealvalue: String = js.native
  var kstkeip: String = js.native
  var kstkesp: String = js.native
  var majflt: String = js.native
  var minflt: String = js.native
  var nice: String = js.native
  var nswap: String = js.native
  var num_threads: String = js.native
  var pgrp: String = js.native
  var pid: String = js.native
  var policy: String = js.native
  var ppid: String = js.native
  var priority: String = js.native
  var processor: String = js.native
  var rss: String = js.native
  var rsslim: String = js.native
  var rt_priority: String = js.native
  var session: String = js.native
  var sigcatch: String = js.native
  var sigignore: String = js.native
  var signal: String = js.native
  var startcode: String = js.native
  var startstack: String = js.native
  var starttime: String = js.native
  var state: String = js.native
  var stime: String = js.native
  var tpgid: String = js.native
  var tty_nr: String = js.native
  var utime: String = js.native
  var vsize: String = js.native
  var wchan: String = js.native
}

object Stat {
  @scala.inline
  def apply(
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
  implicit class StatOps[Self <: Stat] (val x: Self) extends AnyVal {
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
    def setBlocked(value: String): Self = this.set("blocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setCguest_time(value: String): Self = this.set("cguest_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setCmajflt(value: String): Self = this.set("cmajflt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCminflt(value: String): Self = this.set("cminflt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCnswap(value: String): Self = this.set("cnswap", value.asInstanceOf[js.Any])
    @scala.inline
    def setComm(value: String): Self = this.set("comm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCstime(value: String): Self = this.set("cstime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCutime(value: String): Self = this.set("cutime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayacct_blkio_ticks(value: String): Self = this.set("delayacct_blkio_ticks", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndcode(value: String): Self = this.set("endcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit_signal(value: String): Self = this.set("exit_signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlags(value: String): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuest_time(value: String): Self = this.set("guest_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setItrealvalue(value: String): Self = this.set("itrealvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def setKstkeip(value: String): Self = this.set("kstkeip", value.asInstanceOf[js.Any])
    @scala.inline
    def setKstkesp(value: String): Self = this.set("kstkesp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMajflt(value: String): Self = this.set("majflt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinflt(value: String): Self = this.set("minflt", value.asInstanceOf[js.Any])
    @scala.inline
    def setNice(value: String): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def setNswap(value: String): Self = this.set("nswap", value.asInstanceOf[js.Any])
    @scala.inline
    def setNum_threads(value: String): Self = this.set("num_threads", value.asInstanceOf[js.Any])
    @scala.inline
    def setPgrp(value: String): Self = this.set("pgrp", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpid(value: String): Self = this.set("ppid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessor(value: String): Self = this.set("processor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRss(value: String): Self = this.set("rss", value.asInstanceOf[js.Any])
    @scala.inline
    def setRsslim(value: String): Self = this.set("rsslim", value.asInstanceOf[js.Any])
    @scala.inline
    def setRt_priority(value: String): Self = this.set("rt_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigcatch(value: String): Self = this.set("sigcatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigignore(value: String): Self = this.set("sigignore", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartcode(value: String): Self = this.set("startcode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartstack(value: String): Self = this.set("startstack", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarttime(value: String): Self = this.set("starttime", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStime(value: String): Self = this.set("stime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTpgid(value: String): Self = this.set("tpgid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTty_nr(value: String): Self = this.set("tty_nr", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtime(value: String): Self = this.set("utime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVsize(value: String): Self = this.set("vsize", value.asInstanceOf[js.Any])
    @scala.inline
    def setWchan(value: String): Self = this.set("wchan", value.asInstanceOf[js.Any])
  }
  
}

