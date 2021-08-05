package typings.procfsStats.mod

import typings.procfsStats.procfsStatsStrings.`136524`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], AnonHugePages = AnonHugePages.asInstanceOf[js.Any], AnonPages = AnonPages.asInstanceOf[js.Any], Bounce = Bounce.asInstanceOf[js.Any], Buffers = Buffers.asInstanceOf[js.Any], Cached = Cached.asInstanceOf[js.Any], CommitLimit = CommitLimit.asInstanceOf[js.Any], Committed_AS = Committed_AS.asInstanceOf[js.Any], DirectMap2M = DirectMap2M.asInstanceOf[js.Any], DirectMap4k = DirectMap4k.asInstanceOf[js.Any], Dirty = Dirty.asInstanceOf[js.Any], HugePages_Free = HugePages_Free.asInstanceOf[js.Any], HugePages_Rsvd = HugePages_Rsvd.asInstanceOf[js.Any], HugePages_Surp = HugePages_Surp.asInstanceOf[js.Any], HugePages_Total = HugePages_Total.asInstanceOf[js.Any], Hugepagesize = Hugepagesize.asInstanceOf[js.Any], Inactive = "136524", KernelStack = KernelStack.asInstanceOf[js.Any], Mapped = Mapped.asInstanceOf[js.Any], MemAvailable = MemAvailable.asInstanceOf[js.Any], MemFree = MemFree.asInstanceOf[js.Any], MemTotal = MemTotal.asInstanceOf[js.Any], Mlocked = Mlocked.asInstanceOf[js.Any], NFS_Unstable = NFS_Unstable.asInstanceOf[js.Any], PageTables = PageTables.asInstanceOf[js.Any], SReclaimable = SReclaimable.asInstanceOf[js.Any], SUnreclaim = SUnreclaim.asInstanceOf[js.Any], Shmem = Shmem.asInstanceOf[js.Any], Slab = Slab.asInstanceOf[js.Any], SwapCached = SwapCached.asInstanceOf[js.Any], SwapFree = SwapFree.asInstanceOf[js.Any], SwapTotal = SwapTotal.asInstanceOf[js.Any], Unevictable = Unevictable.asInstanceOf[js.Any], VmallocChunk = VmallocChunk.asInstanceOf[js.Any], VmallocTotal = VmallocTotal.asInstanceOf[js.Any], VmallocUsed = VmallocUsed.asInstanceOf[js.Any], Writeback = Writeback.asInstanceOf[js.Any], WritebackTmp = WritebackTmp.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(anon)")(ActiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Active(file)")(ActiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(anon)")(InactiveLeftparenthesisanonRightparenthesis.asInstanceOf[js.Any])
    __obj.updateDynamic("Inactive(file)")(InactiveLeftparenthesisfileRightparenthesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
  
  extension [Self <: MemoryInfo](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    inline def setActiveLeftparenthesisanonRightparenthesis(value: String): Self = StObject.set(x, "Active(anon)", value.asInstanceOf[js.Any])
    
    inline def setActiveLeftparenthesisfileRightparenthesis(value: String): Self = StObject.set(x, "Active(file)", value.asInstanceOf[js.Any])
    
    inline def setAnonHugePages(value: String): Self = StObject.set(x, "AnonHugePages", value.asInstanceOf[js.Any])
    
    inline def setAnonPages(value: String): Self = StObject.set(x, "AnonPages", value.asInstanceOf[js.Any])
    
    inline def setBounce(value: String): Self = StObject.set(x, "Bounce", value.asInstanceOf[js.Any])
    
    inline def setBuffers(value: String): Self = StObject.set(x, "Buffers", value.asInstanceOf[js.Any])
    
    inline def setCached(value: String): Self = StObject.set(x, "Cached", value.asInstanceOf[js.Any])
    
    inline def setCommitLimit(value: String): Self = StObject.set(x, "CommitLimit", value.asInstanceOf[js.Any])
    
    inline def setCommitted_AS(value: String): Self = StObject.set(x, "Committed_AS", value.asInstanceOf[js.Any])
    
    inline def setDirectMap2M(value: String): Self = StObject.set(x, "DirectMap2M", value.asInstanceOf[js.Any])
    
    inline def setDirectMap4k(value: String): Self = StObject.set(x, "DirectMap4k", value.asInstanceOf[js.Any])
    
    inline def setDirty(value: String): Self = StObject.set(x, "Dirty", value.asInstanceOf[js.Any])
    
    inline def setHugePages_Free(value: String): Self = StObject.set(x, "HugePages_Free", value.asInstanceOf[js.Any])
    
    inline def setHugePages_Rsvd(value: String): Self = StObject.set(x, "HugePages_Rsvd", value.asInstanceOf[js.Any])
    
    inline def setHugePages_Surp(value: String): Self = StObject.set(x, "HugePages_Surp", value.asInstanceOf[js.Any])
    
    inline def setHugePages_Total(value: String): Self = StObject.set(x, "HugePages_Total", value.asInstanceOf[js.Any])
    
    inline def setHugepagesize(value: String): Self = StObject.set(x, "Hugepagesize", value.asInstanceOf[js.Any])
    
    inline def setInactive(value: `136524`): Self = StObject.set(x, "Inactive", value.asInstanceOf[js.Any])
    
    inline def setInactiveLeftparenthesisanonRightparenthesis(value: String): Self = StObject.set(x, "Inactive(anon)", value.asInstanceOf[js.Any])
    
    inline def setInactiveLeftparenthesisfileRightparenthesis(value: String): Self = StObject.set(x, "Inactive(file)", value.asInstanceOf[js.Any])
    
    inline def setKernelStack(value: String): Self = StObject.set(x, "KernelStack", value.asInstanceOf[js.Any])
    
    inline def setMapped(value: String): Self = StObject.set(x, "Mapped", value.asInstanceOf[js.Any])
    
    inline def setMemAvailable(value: String): Self = StObject.set(x, "MemAvailable", value.asInstanceOf[js.Any])
    
    inline def setMemFree(value: String): Self = StObject.set(x, "MemFree", value.asInstanceOf[js.Any])
    
    inline def setMemTotal(value: String): Self = StObject.set(x, "MemTotal", value.asInstanceOf[js.Any])
    
    inline def setMlocked(value: String): Self = StObject.set(x, "Mlocked", value.asInstanceOf[js.Any])
    
    inline def setNFS_Unstable(value: String): Self = StObject.set(x, "NFS_Unstable", value.asInstanceOf[js.Any])
    
    inline def setPageTables(value: String): Self = StObject.set(x, "PageTables", value.asInstanceOf[js.Any])
    
    inline def setSReclaimable(value: String): Self = StObject.set(x, "SReclaimable", value.asInstanceOf[js.Any])
    
    inline def setSUnreclaim(value: String): Self = StObject.set(x, "SUnreclaim", value.asInstanceOf[js.Any])
    
    inline def setShmem(value: String): Self = StObject.set(x, "Shmem", value.asInstanceOf[js.Any])
    
    inline def setSlab(value: String): Self = StObject.set(x, "Slab", value.asInstanceOf[js.Any])
    
    inline def setSwapCached(value: String): Self = StObject.set(x, "SwapCached", value.asInstanceOf[js.Any])
    
    inline def setSwapFree(value: String): Self = StObject.set(x, "SwapFree", value.asInstanceOf[js.Any])
    
    inline def setSwapTotal(value: String): Self = StObject.set(x, "SwapTotal", value.asInstanceOf[js.Any])
    
    inline def setUnevictable(value: String): Self = StObject.set(x, "Unevictable", value.asInstanceOf[js.Any])
    
    inline def setVmallocChunk(value: String): Self = StObject.set(x, "VmallocChunk", value.asInstanceOf[js.Any])
    
    inline def setVmallocTotal(value: String): Self = StObject.set(x, "VmallocTotal", value.asInstanceOf[js.Any])
    
    inline def setVmallocUsed(value: String): Self = StObject.set(x, "VmallocUsed", value.asInstanceOf[js.Any])
    
    inline def setWriteback(value: String): Self = StObject.set(x, "Writeback", value.asInstanceOf[js.Any])
    
    inline def setWritebackTmp(value: String): Self = StObject.set(x, "WritebackTmp", value.asInstanceOf[js.Any])
  }
}
