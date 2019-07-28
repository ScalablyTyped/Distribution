package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
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
    val __obj = js.Dynamic.literal(blocked = blocked, cguest_time = cguest_time, cmajflt = cmajflt, cminflt = cminflt, cnswap = cnswap, comm = comm, cstime = cstime, cutime = cutime, delayacct_blkio_ticks = delayacct_blkio_ticks, endcode = endcode, exit_signal = exit_signal, flags = flags, guest_time = guest_time, itrealvalue = itrealvalue, kstkeip = kstkeip, kstkesp = kstkesp, majflt = majflt, minflt = minflt, nice = nice, nswap = nswap, num_threads = num_threads, pgrp = pgrp, pid = pid, policy = policy, ppid = ppid, priority = priority, processor = processor, rss = rss, rsslim = rsslim, rt_priority = rt_priority, session = session, sigcatch = sigcatch, sigignore = sigignore, signal = signal, startcode = startcode, startstack = startstack, starttime = starttime, state = state, stime = stime, tpgid = tpgid, tty_nr = tty_nr, utime = utime, vsize = vsize, wchan = wchan)
  
    __obj.asInstanceOf[Stat]
  }
}

