package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  var active_defrag_running: Flag = js.native
  var allocator_active: String = js.native
  var allocator_allocated: String = js.native
  var allocator_frag_bytes: String = js.native
  var allocator_frag_ratio: String = js.native
  var allocator_resident: String = js.native
  var allocator_rss_bytes: String = js.native
  var allocator_rss_ratio: String = js.native
  var lazyfree_pending_objects: String = js.native
  var maxmemory: String = js.native
  var maxmemory_human: String = js.native
  var maxmemory_policy: String = js.native
  var mem_allocator: String = js.native
  var mem_fragmentation_bytes: String = js.native
  var mem_fragmentation_ratio: String = js.native
  var rss_overhead_bytes: String = js.native
  var rss_overhead_ratio: String = js.native
  var total_system_memory: String = js.native
  var total_system_memory_human: String = js.native
  var used_memory: String = js.native
  var used_memory_dataset: String = js.native
  var used_memory_dataset_perc: String = js.native
  var used_memory_human: String = js.native
  var used_memory_lua: String = js.native
  var used_memory_lua_human: String = js.native
  var used_memory_overhead: String = js.native
  var used_memory_peak: String = js.native
  var used_memory_peak_human: String = js.native
  var used_memory_peak_perc: String = js.native
  var used_memory_rss: String = js.native
  var used_memory_rss_human: String = js.native
  var used_memory_startup: String = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(
    active_defrag_running: Flag,
    allocator_active: String,
    allocator_allocated: String,
    allocator_frag_bytes: String,
    allocator_frag_ratio: String,
    allocator_resident: String,
    allocator_rss_bytes: String,
    allocator_rss_ratio: String,
    lazyfree_pending_objects: String,
    maxmemory: String,
    maxmemory_human: String,
    maxmemory_policy: String,
    mem_allocator: String,
    mem_fragmentation_bytes: String,
    mem_fragmentation_ratio: String,
    rss_overhead_bytes: String,
    rss_overhead_ratio: String,
    total_system_memory: String,
    total_system_memory_human: String,
    used_memory: String,
    used_memory_dataset: String,
    used_memory_dataset_perc: String,
    used_memory_human: String,
    used_memory_lua: String,
    used_memory_lua_human: String,
    used_memory_overhead: String,
    used_memory_peak: String,
    used_memory_peak_human: String,
    used_memory_peak_perc: String,
    used_memory_rss: String,
    used_memory_rss_human: String,
    used_memory_startup: String
  ): MemoryInfo = {
    val __obj = js.Dynamic.literal(active_defrag_running = active_defrag_running.asInstanceOf[js.Any], allocator_active = allocator_active.asInstanceOf[js.Any], allocator_allocated = allocator_allocated.asInstanceOf[js.Any], allocator_frag_bytes = allocator_frag_bytes.asInstanceOf[js.Any], allocator_frag_ratio = allocator_frag_ratio.asInstanceOf[js.Any], allocator_resident = allocator_resident.asInstanceOf[js.Any], allocator_rss_bytes = allocator_rss_bytes.asInstanceOf[js.Any], allocator_rss_ratio = allocator_rss_ratio.asInstanceOf[js.Any], lazyfree_pending_objects = lazyfree_pending_objects.asInstanceOf[js.Any], maxmemory = maxmemory.asInstanceOf[js.Any], maxmemory_human = maxmemory_human.asInstanceOf[js.Any], maxmemory_policy = maxmemory_policy.asInstanceOf[js.Any], mem_allocator = mem_allocator.asInstanceOf[js.Any], mem_fragmentation_bytes = mem_fragmentation_bytes.asInstanceOf[js.Any], mem_fragmentation_ratio = mem_fragmentation_ratio.asInstanceOf[js.Any], rss_overhead_bytes = rss_overhead_bytes.asInstanceOf[js.Any], rss_overhead_ratio = rss_overhead_ratio.asInstanceOf[js.Any], total_system_memory = total_system_memory.asInstanceOf[js.Any], total_system_memory_human = total_system_memory_human.asInstanceOf[js.Any], used_memory = used_memory.asInstanceOf[js.Any], used_memory_dataset = used_memory_dataset.asInstanceOf[js.Any], used_memory_dataset_perc = used_memory_dataset_perc.asInstanceOf[js.Any], used_memory_human = used_memory_human.asInstanceOf[js.Any], used_memory_lua = used_memory_lua.asInstanceOf[js.Any], used_memory_lua_human = used_memory_lua_human.asInstanceOf[js.Any], used_memory_overhead = used_memory_overhead.asInstanceOf[js.Any], used_memory_peak = used_memory_peak.asInstanceOf[js.Any], used_memory_peak_human = used_memory_peak_human.asInstanceOf[js.Any], used_memory_peak_perc = used_memory_peak_perc.asInstanceOf[js.Any], used_memory_rss = used_memory_rss.asInstanceOf[js.Any], used_memory_rss_human = used_memory_rss_human.asInstanceOf[js.Any], used_memory_startup = used_memory_startup.asInstanceOf[js.Any])
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
    def setActive_defrag_running(value: Flag): Self = this.set("active_defrag_running", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_active(value: String): Self = this.set("allocator_active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_allocated(value: String): Self = this.set("allocator_allocated", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_frag_bytes(value: String): Self = this.set("allocator_frag_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_frag_ratio(value: String): Self = this.set("allocator_frag_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_resident(value: String): Self = this.set("allocator_resident", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_rss_bytes(value: String): Self = this.set("allocator_rss_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllocator_rss_ratio(value: String): Self = this.set("allocator_rss_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setLazyfree_pending_objects(value: String): Self = this.set("lazyfree_pending_objects", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxmemory(value: String): Self = this.set("maxmemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxmemory_human(value: String): Self = this.set("maxmemory_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxmemory_policy(value: String): Self = this.set("maxmemory_policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_allocator(value: String): Self = this.set("mem_allocator", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_fragmentation_bytes(value: String): Self = this.set("mem_fragmentation_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMem_fragmentation_ratio(value: String): Self = this.set("mem_fragmentation_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setRss_overhead_bytes(value: String): Self = this.set("rss_overhead_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRss_overhead_ratio(value: String): Self = this.set("rss_overhead_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_system_memory(value: String): Self = this.set("total_system_memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_system_memory_human(value: String): Self = this.set("total_system_memory_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory(value: String): Self = this.set("used_memory", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_dataset(value: String): Self = this.set("used_memory_dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_dataset_perc(value: String): Self = this.set("used_memory_dataset_perc", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_human(value: String): Self = this.set("used_memory_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_lua(value: String): Self = this.set("used_memory_lua", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_lua_human(value: String): Self = this.set("used_memory_lua_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_overhead(value: String): Self = this.set("used_memory_overhead", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_peak(value: String): Self = this.set("used_memory_peak", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_peak_human(value: String): Self = this.set("used_memory_peak_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_peak_perc(value: String): Self = this.set("used_memory_peak_perc", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_rss(value: String): Self = this.set("used_memory_rss", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_rss_human(value: String): Self = this.set("used_memory_rss_human", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_memory_startup(value: String): Self = this.set("used_memory_startup", value.asInstanceOf[js.Any])
  }
  
}

