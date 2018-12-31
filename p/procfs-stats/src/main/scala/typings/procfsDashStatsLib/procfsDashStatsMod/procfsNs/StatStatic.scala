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

