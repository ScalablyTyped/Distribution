package typings
package procfsDashStatsLib.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("procfs-stats", "StatStatic")
@js.native
class StatStatic ()
  extends procfsDashStatsLib.procfsDashStatsMod.procfsNs.StatStatic {
  /* CompleteClass */
  override var works: scala.Boolean = js.native
  /* CompleteClass */
  override def argv(callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  /* CompleteClass */
  override def cpu(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Cpu]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def cwd(callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[java.lang.String]): scala.Nothing = js.native
  /* CompleteClass */
  override def disk(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.DiskStat]]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def env(callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  /* CompleteClass */
  override def fd(
    fdPath: java.lang.String,
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.FileDescriptor]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def fds(callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  /* CompleteClass */
  override def io(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Io]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def meminfo(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.MemoryInfo]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def net(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Net]]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def stat(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Stat]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def statm(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.MemoryStat]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def status(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Status]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def tcp(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Tcp]]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def thread(tid: scala.Double): procfsDashStatsLib.procfsDashStatsMod.procfsNs.Stat = js.native
  /* CompleteClass */
  override def threads(callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[java.lang.String]]): scala.Nothing = js.native
  /* CompleteClass */
  override def udp(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Udp]]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def unix(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.UnixSocket]]
  ): scala.Nothing = js.native
  /* CompleteClass */
  override def wifi(
    callback: procfsDashStatsLib.procfsDashStatsMod.procfsNs.Callback[js.Array[procfsDashStatsLib.procfsDashStatsMod.procfsNs.Wifi]]
  ): scala.Nothing = js.native
}

