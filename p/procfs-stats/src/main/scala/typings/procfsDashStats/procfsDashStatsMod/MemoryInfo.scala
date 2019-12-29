package typings.procfsDashStats.procfsDashStatsMod

import typings.procfsDashStats.procfsDashStatsStrings.`136524`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  var Active: String
  @JSName("Active(anon)")
  var ActiveLeftparenthesisanonRightparenthesis: String
  @JSName("Active(file)")
  var ActiveLeftparenthesisfileRightparenthesis: String
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
  @JSName("Inactive(anon)")
  var InactiveLeftparenthesisanonRightparenthesis: String
  @JSName("Inactive(file)")
  var InactiveLeftparenthesisfileRightparenthesis: String
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
    ActiveLeftparenthesisanonRightparenthesis: String,
    ActiveLeftparenthesisfileRightparenthesis: String,
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
    InactiveLeftparenthesisanonRightparenthesis: String,
    InactiveLeftparenthesisfileRightparenthesis: String,
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
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AnonHugePages = AnonHugePages.asInstanceOf[js.Any], AnonPages = AnonPages.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Buffers = Buffers.asInstanceOf[js.Any], Cached = Cached.asInstanceOf[js.Any], CommitLimit = CommitLimit.asInstanceOf[js.Any], Committed_AS = Committed_AS.asInstanceOf[js.Any], DirectMap2M = DirectMap2M.asInstanceOf[js.Any], DirectMap4k = DirectMap4k.asInstanceOf[js.Any], Dirty = Dirty.asInstanceOf[js.Any], HugePages_Free = HugePages_Free.asInstanceOf[js.Any], HugePages_Rsvd = HugePages_Rsvd.asInstanceOf[js.Any], HugePages_Surp = HugePages_Surp.asInstanceOf[js.Any], HugePages_Total = HugePages_Total.asInstanceOf[js.Any], Hugepagesize = Hugepagesize.asInstanceOf[js.Any], Inactive = Inactive.asInstanceOf[js.Any], KernelStack = KernelStack.asInstanceOf[js.Any], Mapped = Mapped.asInstanceOf[js.Any], MemAvailable = MemAvailable.asInstanceOf[js.Any], MemFree = MemFree.asInstanceOf[js.Any], MemTotal = MemTotal.asInstanceOf[js.Any], Mlocked = Mlocked.asInstanceOf[js.Any], NFS_Unstable = NFS_Unstable.asInstanceOf[js.Any], PageTables = PageTables.asInstanceOf[js.Any], SReclaimable = SReclaimable.asInstanceOf[js.Any], SUnreclaim = SUnreclaim.asInstanceOf[js.Any], Shmem = Shmem.asInstanceOf[js.Any], Slab = Slab.asInstanceOf[js.Any], SwapCached = SwapCached.asInstanceOf[js.Any], SwapFree = SwapFree.asInstanceOf[js.Any], SwapTotal = SwapTotal.asInstanceOf[js.Any], Unevictable = Unevictable.asInstanceOf[js.Any], VmallocChunk = VmallocChunk.asInstanceOf[js.Any], VmallocTotal = VmallocTotal.asInstanceOf[js.Any], VmallocUsed = VmallocUsed.asInstanceOf[js.Any], Writeback = Writeback.asInstanceOf[js.Any], WritebackTmp = WritebackTmp.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(anon)")(ActiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(file)")(ActiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(anon)")(InactiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(file)")(InactiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

