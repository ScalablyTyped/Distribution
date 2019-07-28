package typings.procfsDashStats.procfsDashStatsMod

import typings.procfsDashStats.procfsDashStatsStrings.`136524`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  var Active: String
  var `Active(anon)`: String
  var `Active(file)`: String
  var AnonHugePages: String
  var AnonPages: String
  var Bounce: String
  var Buffers: String
  var Cached: String
  var CommitLimit: String
  var Committed_AS: String
  var DirectMap2M: String
  var DirectMap4k: String
  var Dirty: String
  var HugePages_Free: String
  var HugePages_Rsvd: String
  var HugePages_Surp: String
  var HugePages_Total: String
  var Hugepagesize: String
  var Inactive: `136524`
  var `Inactive(anon)`: String
  var `Inactive(file)`: String
  var KernelStack: String
  var Mapped: String
  var MemAvailable: String
  var MemFree: String
  var MemTotal: String
  var Mlocked: String
  var NFS_Unstable: String
  var PageTables: String
  var SReclaimable: String
  var SUnreclaim: String
  var Shmem: String
  var Slab: String
  var SwapCached: String
  var SwapFree: String
  var SwapTotal: String
  var Unevictable: String
  var VmallocChunk: String
  var VmallocTotal: String
  var VmallocUsed: String
  var Writeback: String
  var WritebackTmp: String
}

object MemoryInfo {
  @scala.inline
  def apply(
    Active: String,
    `Active(anon)`: String,
    `Active(file)`: String,
    AnonHugePages: String,
    AnonPages: String,
    Bounce: String,
    Buffers: String,
    Cached: String,
    CommitLimit: String,
    Committed_AS: String,
    DirectMap2M: String,
    DirectMap4k: String,
    Dirty: String,
    HugePages_Free: String,
    HugePages_Rsvd: String,
    HugePages_Surp: String,
    HugePages_Total: String,
    Hugepagesize: String,
    Inactive: `136524`,
    `Inactive(anon)`: String,
    `Inactive(file)`: String,
    KernelStack: String,
    Mapped: String,
    MemAvailable: String,
    MemFree: String,
    MemTotal: String,
    Mlocked: String,
    NFS_Unstable: String,
    PageTables: String,
    SReclaimable: String,
    SUnreclaim: String,
    Shmem: String,
    Slab: String,
    SwapCached: String,
    SwapFree: String,
    SwapTotal: String,
    Unevictable: String,
    VmallocChunk: String,
    VmallocTotal: String,
    VmallocUsed: String,
    Writeback: String,
    WritebackTmp: String
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(Active = Active, AnonHugePages = AnonHugePages, AnonPages = AnonPages, Bounce = Bounce, Buffers = Buffers, Cached = Cached, CommitLimit = CommitLimit, Committed_AS = Committed_AS, DirectMap2M = DirectMap2M, DirectMap4k = DirectMap4k, Dirty = Dirty, HugePages_Free = HugePages_Free, HugePages_Rsvd = HugePages_Rsvd, HugePages_Surp = HugePages_Surp, HugePages_Total = HugePages_Total, Hugepagesize = Hugepagesize, Inactive = Inactive, KernelStack = KernelStack, Mapped = Mapped, MemAvailable = MemAvailable, MemFree = MemFree, MemTotal = MemTotal, Mlocked = Mlocked, NFS_Unstable = NFS_Unstable, PageTables = PageTables, SReclaimable = SReclaimable, SUnreclaim = SUnreclaim, Shmem = Shmem, Slab = Slab, SwapCached = SwapCached, SwapFree = SwapFree, SwapTotal = SwapTotal, Unevictable = Unevictable, VmallocChunk = VmallocChunk, VmallocTotal = VmallocTotal, VmallocUsed = VmallocUsed, Writeback = Writeback, WritebackTmp = WritebackTmp)
    __obj.updateDynamic("Active(anon)")(`Active(anon)`)
    __obj.updateDynamic("Active(file)")(`Active(file)`)
    __obj.updateDynamic("Inactive(anon)")(`Inactive(anon)`)
    __obj.updateDynamic("Inactive(file)")(`Inactive(file)`)
    __obj.asInstanceOf[MemoryInfo]
  }
}

