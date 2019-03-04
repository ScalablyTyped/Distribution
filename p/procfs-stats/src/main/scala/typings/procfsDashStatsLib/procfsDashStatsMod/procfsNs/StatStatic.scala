package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatStatic extends js.Object {
  var works: scala.Boolean
  def argv(callback: Callback[js.Array[java.lang.String]]): scala.Nothing
  def cpu(callback: Callback[Cpu]): scala.Nothing
  def cwd(callback: Callback[java.lang.String]): scala.Nothing
  def disk(callback: Callback[js.Array[DiskStat]]): scala.Nothing
  def env(callback: Callback[js.Array[java.lang.String]]): scala.Nothing
  def fd(fdPath: java.lang.String, callback: Callback[FileDescriptor]): scala.Nothing
  def fds(callback: Callback[js.Array[java.lang.String]]): scala.Nothing
  def io(callback: Callback[Io]): scala.Nothing
  def meminfo(callback: Callback[MemoryInfo]): scala.Nothing
  def net(callback: Callback[js.Array[Net]]): scala.Nothing
  def stat(callback: Callback[Stat]): scala.Nothing
  def statm(callback: Callback[MemoryStat]): scala.Nothing
  def status(callback: Callback[Status]): scala.Nothing
  def tcp(callback: Callback[js.Array[Tcp]]): scala.Nothing
  def thread(tid: scala.Double): Stat
  def threads(callback: Callback[js.Array[java.lang.String]]): scala.Nothing
  def udp(callback: Callback[js.Array[Udp]]): scala.Nothing
  def unix(callback: Callback[js.Array[UnixSocket]]): scala.Nothing
  def wifi(callback: Callback[js.Array[Wifi]]): scala.Nothing
}

object StatStatic {
  @scala.inline
  def apply(
    argv: js.Function1[Callback[js.Array[java.lang.String]], scala.Nothing],
    cpu: js.Function1[Callback[Cpu], scala.Nothing],
    cwd: js.Function1[Callback[java.lang.String], scala.Nothing],
    disk: js.Function1[Callback[js.Array[DiskStat]], scala.Nothing],
    env: js.Function1[Callback[js.Array[java.lang.String]], scala.Nothing],
    fd: js.Function2[java.lang.String, Callback[FileDescriptor], scala.Nothing],
    fds: js.Function1[Callback[js.Array[java.lang.String]], scala.Nothing],
    io: js.Function1[Callback[Io], scala.Nothing],
    meminfo: js.Function1[Callback[MemoryInfo], scala.Nothing],
    net: js.Function1[Callback[js.Array[Net]], scala.Nothing],
    stat: js.Function1[Callback[Stat], scala.Nothing],
    statm: js.Function1[Callback[MemoryStat], scala.Nothing],
    status: js.Function1[Callback[Status], scala.Nothing],
    tcp: js.Function1[Callback[js.Array[Tcp]], scala.Nothing],
    thread: js.Function1[scala.Double, Stat],
    threads: js.Function1[Callback[js.Array[java.lang.String]], scala.Nothing],
    udp: js.Function1[Callback[js.Array[Udp]], scala.Nothing],
    unix: js.Function1[Callback[js.Array[UnixSocket]], scala.Nothing],
    wifi: js.Function1[Callback[js.Array[Wifi]], scala.Nothing],
    works: scala.Boolean
  ): StatStatic = {
    val __obj = js.Dynamic.literal(argv = argv, cpu = cpu, cwd = cwd, disk = disk, env = env, fd = fd, fds = fds, io = io, meminfo = meminfo, net = net, stat = stat, statm = statm, status = status, tcp = tcp, thread = thread, threads = threads, udp = udp, unix = unix, wifi = wifi, works = works)
  
    __obj.asInstanceOf[StatStatic]
  }
}

