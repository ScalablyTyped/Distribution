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
    argv: Callback[js.Array[java.lang.String]] => scala.Nothing,
    cpu: Callback[Cpu] => scala.Nothing,
    cwd: Callback[java.lang.String] => scala.Nothing,
    disk: Callback[js.Array[DiskStat]] => scala.Nothing,
    env: Callback[js.Array[java.lang.String]] => scala.Nothing,
    fd: (java.lang.String, Callback[FileDescriptor]) => scala.Nothing,
    fds: Callback[js.Array[java.lang.String]] => scala.Nothing,
    io: Callback[Io] => scala.Nothing,
    meminfo: Callback[MemoryInfo] => scala.Nothing,
    net: Callback[js.Array[Net]] => scala.Nothing,
    stat: Callback[Stat] => scala.Nothing,
    statm: Callback[MemoryStat] => scala.Nothing,
    status: Callback[Status] => scala.Nothing,
    tcp: Callback[js.Array[Tcp]] => scala.Nothing,
    thread: scala.Double => Stat,
    threads: Callback[js.Array[java.lang.String]] => scala.Nothing,
    udp: Callback[js.Array[Udp]] => scala.Nothing,
    unix: Callback[js.Array[UnixSocket]] => scala.Nothing,
    wifi: Callback[js.Array[Wifi]] => scala.Nothing,
    works: scala.Boolean
  ): StatStatic = {
    val __obj = js.Dynamic.literal(argv = js.Any.fromFunction1(argv), cpu = js.Any.fromFunction1(cpu), cwd = js.Any.fromFunction1(cwd), disk = js.Any.fromFunction1(disk), env = js.Any.fromFunction1(env), fd = js.Any.fromFunction2(fd), fds = js.Any.fromFunction1(fds), io = js.Any.fromFunction1(io), meminfo = js.Any.fromFunction1(meminfo), net = js.Any.fromFunction1(net), stat = js.Any.fromFunction1(stat), statm = js.Any.fromFunction1(statm), status = js.Any.fromFunction1(status), tcp = js.Any.fromFunction1(tcp), thread = js.Any.fromFunction1(thread), threads = js.Any.fromFunction1(threads), udp = js.Any.fromFunction1(udp), unix = js.Any.fromFunction1(unix), wifi = js.Any.fromFunction1(wifi), works = works)
  
    __obj.asInstanceOf[StatStatic]
  }
}

