package typings.procfsStats.mod

import typings.procfsStats.procfsStatsStrings.`136524`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  var Active: String = js.native
  @JSName("Active(anon)")
  var ActiveLeftparenthesisanonRightparenthesis: String = js.native
  @JSName("Active(file)")
  var ActiveLeftparenthesisfileRightparenthesis: String = js.native
  var AnonHugePages: String = js.native
  var AnonPages: String = js.native
  var Bounce: String = js.native
  var Buffers: String = js.native
  var Cached: String = js.native
  var CommitLimit: String = js.native
  var Committed_AS: String = js.native
  var DirectMap2M: String = js.native
  var DirectMap4k: String = js.native
  var Dirty: String = js.native
  var HugePages_Free: String = js.native
  var HugePages_Rsvd: String = js.native
  var HugePages_Surp: String = js.native
  var HugePages_Total: String = js.native
  var Hugepagesize: String = js.native
  var Inactive: `136524` = js.native
  @JSName("Inactive(anon)")
  var InactiveLeftparenthesisanonRightparenthesis: String = js.native
  @JSName("Inactive(file)")
  var InactiveLeftparenthesisfileRightparenthesis: String = js.native
  var KernelStack: String = js.native
  var Mapped: String = js.native
  var MemAvailable: String = js.native
  var MemFree: String = js.native
  var MemTotal: String = js.native
  var Mlocked: String = js.native
  var NFS_Unstable: String = js.native
  var PageTables: String = js.native
  var SReclaimable: String = js.native
  var SUnreclaim: String = js.native
  var Shmem: String = js.native
  var Slab: String = js.native
  var SwapCached: String = js.native
  var SwapFree: String = js.native
  var SwapTotal: String = js.native
  var Unevictable: String = js.native
  var VmallocChunk: String = js.native
  var VmallocTotal: String = js.native
  var VmallocUsed: String = js.native
  var Writeback: String = js.native
  var WritebackTmp: String = js.native
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
  @scala.inline
  implicit class MemoryInfoOps[Self <: MemoryInfo] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveLeftparenthesisanonRightparenthesis(value: String): Self = this.set("Active(anon)", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveLeftparenthesisfileRightparenthesis(value: String): Self = this.set("Active(file)", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnonHugePages(value: String): Self = this.set("AnonHugePages", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnonPages(value: String): Self = this.set("AnonPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounce(value: String): Self = this.set("Bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffers(value: String): Self = this.set("Buffers", value.asInstanceOf[js.Any])
    @scala.inline
    def setCached(value: String): Self = this.set("Cached", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitLimit(value: String): Self = this.set("CommitLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitted_AS(value: String): Self = this.set("Committed_AS", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectMap2M(value: String): Self = this.set("DirectMap2M", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectMap4k(value: String): Self = this.set("DirectMap4k", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirty(value: String): Self = this.set("Dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setHugePages_Free(value: String): Self = this.set("HugePages_Free", value.asInstanceOf[js.Any])
    @scala.inline
    def setHugePages_Rsvd(value: String): Self = this.set("HugePages_Rsvd", value.asInstanceOf[js.Any])
    @scala.inline
    def setHugePages_Surp(value: String): Self = this.set("HugePages_Surp", value.asInstanceOf[js.Any])
    @scala.inline
    def setHugePages_Total(value: String): Self = this.set("HugePages_Total", value.asInstanceOf[js.Any])
    @scala.inline
    def setHugepagesize(value: String): Self = this.set("Hugepagesize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactive(value: `136524`): Self = this.set("Inactive", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactiveLeftparenthesisanonRightparenthesis(value: String): Self = this.set("Inactive(anon)", value.asInstanceOf[js.Any])
    @scala.inline
    def setInactiveLeftparenthesisfileRightparenthesis(value: String): Self = this.set("Inactive(file)", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernelStack(value: String): Self = this.set("KernelStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapped(value: String): Self = this.set("Mapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemAvailable(value: String): Self = this.set("MemAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemFree(value: String): Self = this.set("MemFree", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemTotal(value: String): Self = this.set("MemTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setMlocked(value: String): Self = this.set("Mlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setNFS_Unstable(value: String): Self = this.set("NFS_Unstable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageTables(value: String): Self = this.set("PageTables", value.asInstanceOf[js.Any])
    @scala.inline
    def setSReclaimable(value: String): Self = this.set("SReclaimable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUnreclaim(value: String): Self = this.set("SUnreclaim", value.asInstanceOf[js.Any])
    @scala.inline
    def setShmem(value: String): Self = this.set("Shmem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlab(value: String): Self = this.set("Slab", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapCached(value: String): Self = this.set("SwapCached", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapFree(value: String): Self = this.set("SwapFree", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwapTotal(value: String): Self = this.set("SwapTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnevictable(value: String): Self = this.set("Unevictable", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmallocChunk(value: String): Self = this.set("VmallocChunk", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmallocTotal(value: String): Self = this.set("VmallocTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVmallocUsed(value: String): Self = this.set("VmallocUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteback(value: String): Self = this.set("Writeback", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritebackTmp(value: String): Self = this.set("WritebackTmp", value.asInstanceOf[js.Any])
  }
  
}

