package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryInfo extends js.Object {
  var Active: java.lang.String
  var `Active(anon)`: java.lang.String
  var `Active(file)`: java.lang.String
  var AnonHugePages: java.lang.String
  var AnonPages: java.lang.String
  var Bounce: java.lang.String
  var Buffers: java.lang.String
  var Cached: java.lang.String
  var CommitLimit: java.lang.String
  var Committed_AS: java.lang.String
  var DirectMap2M: java.lang.String
  var DirectMap4k: java.lang.String
  var Dirty: java.lang.String
  var HugePages_Free: java.lang.String
  var HugePages_Rsvd: java.lang.String
  var HugePages_Surp: java.lang.String
  var HugePages_Total: java.lang.String
  var Hugepagesize: java.lang.String
  var Inactive: procfsDashStatsLib.procfsDashStatsLibStrings.`136524`
  var `Inactive(anon)`: java.lang.String
  var `Inactive(file)`: java.lang.String
  var KernelStack: java.lang.String
  var Mapped: java.lang.String
  var MemAvailable: java.lang.String
  var MemFree: java.lang.String
  var MemTotal: java.lang.String
  var Mlocked: java.lang.String
  var NFS_Unstable: java.lang.String
  var PageTables: java.lang.String
  var SReclaimable: java.lang.String
  var SUnreclaim: java.lang.String
  var Shmem: java.lang.String
  var Slab: java.lang.String
  var SwapCached: java.lang.String
  var SwapFree: java.lang.String
  var SwapTotal: java.lang.String
  var Unevictable: java.lang.String
  var VmallocChunk: java.lang.String
  var VmallocTotal: java.lang.String
  var VmallocUsed: java.lang.String
  var Writeback: java.lang.String
  var WritebackTmp: java.lang.String
}

object MemoryInfo {
  @scala.inline
  def apply(
    Active: java.lang.String,
    `Active(anon)`: java.lang.String,
    `Active(file)`: java.lang.String,
    AnonHugePages: java.lang.String,
    AnonPages: java.lang.String,
    Bounce: java.lang.String,
    Buffers: java.lang.String,
    Cached: java.lang.String,
    CommitLimit: java.lang.String,
    Committed_AS: java.lang.String,
    DirectMap2M: java.lang.String,
    DirectMap4k: java.lang.String,
    Dirty: java.lang.String,
    HugePages_Free: java.lang.String,
    HugePages_Rsvd: java.lang.String,
    HugePages_Surp: java.lang.String,
    HugePages_Total: java.lang.String,
    Hugepagesize: java.lang.String,
    Inactive: procfsDashStatsLib.procfsDashStatsLibStrings.`136524`,
    `Inactive(anon)`: java.lang.String,
    `Inactive(file)`: java.lang.String,
    KernelStack: java.lang.String,
    Mapped: java.lang.String,
    MemAvailable: java.lang.String,
    MemFree: java.lang.String,
    MemTotal: java.lang.String,
    Mlocked: java.lang.String,
    NFS_Unstable: java.lang.String,
    PageTables: java.lang.String,
    SReclaimable: java.lang.String,
    SUnreclaim: java.lang.String,
    Shmem: java.lang.String,
    Slab: java.lang.String,
    SwapCached: java.lang.String,
    SwapFree: java.lang.String,
    SwapTotal: java.lang.String,
    Unevictable: java.lang.String,
    VmallocChunk: java.lang.String,
    VmallocTotal: java.lang.String,
    VmallocUsed: java.lang.String,
    Writeback: java.lang.String,
    WritebackTmp: java.lang.String
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(`Active(anon)` = `Active(anon)`, `Active(file)` = `Active(file)`, `Inactive(anon)` = `Inactive(anon)`, `Inactive(file)` = `Inactive(file)`)
    __obj.updateDynamic("Active")(Active)
    __obj.updateDynamic("AnonHugePages")(AnonHugePages)
    __obj.updateDynamic("AnonPages")(AnonPages)
    __obj.updateDynamic("Bounce")(Bounce)
    __obj.updateDynamic("Buffers")(Buffers)
    __obj.updateDynamic("Cached")(Cached)
    __obj.updateDynamic("CommitLimit")(CommitLimit)
    __obj.updateDynamic("Committed_AS")(Committed_AS)
    __obj.updateDynamic("DirectMap2M")(DirectMap2M)
    __obj.updateDynamic("DirectMap4k")(DirectMap4k)
    __obj.updateDynamic("Dirty")(Dirty)
    __obj.updateDynamic("HugePages_Free")(HugePages_Free)
    __obj.updateDynamic("HugePages_Rsvd")(HugePages_Rsvd)
    __obj.updateDynamic("HugePages_Surp")(HugePages_Surp)
    __obj.updateDynamic("HugePages_Total")(HugePages_Total)
    __obj.updateDynamic("Hugepagesize")(Hugepagesize)
    __obj.updateDynamic("Inactive")(Inactive)
    __obj.updateDynamic("KernelStack")(KernelStack)
    __obj.updateDynamic("Mapped")(Mapped)
    __obj.updateDynamic("MemAvailable")(MemAvailable)
    __obj.updateDynamic("MemFree")(MemFree)
    __obj.updateDynamic("MemTotal")(MemTotal)
    __obj.updateDynamic("Mlocked")(Mlocked)
    __obj.updateDynamic("NFS_Unstable")(NFS_Unstable)
    __obj.updateDynamic("PageTables")(PageTables)
    __obj.updateDynamic("SReclaimable")(SReclaimable)
    __obj.updateDynamic("SUnreclaim")(SUnreclaim)
    __obj.updateDynamic("Shmem")(Shmem)
    __obj.updateDynamic("Slab")(Slab)
    __obj.updateDynamic("SwapCached")(SwapCached)
    __obj.updateDynamic("SwapFree")(SwapFree)
    __obj.updateDynamic("SwapTotal")(SwapTotal)
    __obj.updateDynamic("Unevictable")(Unevictable)
    __obj.updateDynamic("VmallocChunk")(VmallocChunk)
    __obj.updateDynamic("VmallocTotal")(VmallocTotal)
    __obj.updateDynamic("VmallocUsed")(VmallocUsed)
    __obj.updateDynamic("Writeback")(Writeback)
    __obj.updateDynamic("WritebackTmp")(WritebackTmp)
    __obj.asInstanceOf[MemoryInfo]
  }
}

