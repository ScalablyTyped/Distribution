package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
  var active_defrag_running: Flag
  
  var allocator_active: String
  
  var allocator_allocated: String
  
  var allocator_frag_bytes: String
  
  var allocator_frag_ratio: String
  
  var allocator_resident: String
  
  var allocator_rss_bytes: String
  
  var allocator_rss_ratio: String
  
  var lazyfree_pending_objects: String
  
  var maxmemory: String
  
  var maxmemory_human: String
  
  var maxmemory_policy: String
  
  var mem_allocator: String
  
  var mem_fragmentation_bytes: String
  
  var mem_fragmentation_ratio: String
  
  var rss_overhead_bytes: String
  
  var rss_overhead_ratio: String
  
  var total_system_memory: String
  
  var total_system_memory_human: String
  
  var used_memory: String
  
  var used_memory_dataset: String
  
  var used_memory_dataset_perc: String
  
  var used_memory_human: String
  
  var used_memory_lua: String
  
  var used_memory_lua_human: String
  
  var used_memory_overhead: String
  
  var used_memory_peak: String
  
  var used_memory_peak_human: String
  
  var used_memory_peak_perc: String
  
  var used_memory_rss: String
  
  var used_memory_rss_human: String
  
  var used_memory_startup: String
}
object MemoryInfo {
  
  inline def apply(
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
  
  extension [Self <: MemoryInfo](x: Self) {
    
    inline def setActive_defrag_running(value: Flag): Self = StObject.set(x, "active_defrag_running", value.asInstanceOf[js.Any])
    
    inline def setAllocator_active(value: String): Self = StObject.set(x, "allocator_active", value.asInstanceOf[js.Any])
    
    inline def setAllocator_allocated(value: String): Self = StObject.set(x, "allocator_allocated", value.asInstanceOf[js.Any])
    
    inline def setAllocator_frag_bytes(value: String): Self = StObject.set(x, "allocator_frag_bytes", value.asInstanceOf[js.Any])
    
    inline def setAllocator_frag_ratio(value: String): Self = StObject.set(x, "allocator_frag_ratio", value.asInstanceOf[js.Any])
    
    inline def setAllocator_resident(value: String): Self = StObject.set(x, "allocator_resident", value.asInstanceOf[js.Any])
    
    inline def setAllocator_rss_bytes(value: String): Self = StObject.set(x, "allocator_rss_bytes", value.asInstanceOf[js.Any])
    
    inline def setAllocator_rss_ratio(value: String): Self = StObject.set(x, "allocator_rss_ratio", value.asInstanceOf[js.Any])
    
    inline def setLazyfree_pending_objects(value: String): Self = StObject.set(x, "lazyfree_pending_objects", value.asInstanceOf[js.Any])
    
    inline def setMaxmemory(value: String): Self = StObject.set(x, "maxmemory", value.asInstanceOf[js.Any])
    
    inline def setMaxmemory_human(value: String): Self = StObject.set(x, "maxmemory_human", value.asInstanceOf[js.Any])
    
    inline def setMaxmemory_policy(value: String): Self = StObject.set(x, "maxmemory_policy", value.asInstanceOf[js.Any])
    
    inline def setMem_allocator(value: String): Self = StObject.set(x, "mem_allocator", value.asInstanceOf[js.Any])
    
    inline def setMem_fragmentation_bytes(value: String): Self = StObject.set(x, "mem_fragmentation_bytes", value.asInstanceOf[js.Any])
    
    inline def setMem_fragmentation_ratio(value: String): Self = StObject.set(x, "mem_fragmentation_ratio", value.asInstanceOf[js.Any])
    
    inline def setRss_overhead_bytes(value: String): Self = StObject.set(x, "rss_overhead_bytes", value.asInstanceOf[js.Any])
    
    inline def setRss_overhead_ratio(value: String): Self = StObject.set(x, "rss_overhead_ratio", value.asInstanceOf[js.Any])
    
    inline def setTotal_system_memory(value: String): Self = StObject.set(x, "total_system_memory", value.asInstanceOf[js.Any])
    
    inline def setTotal_system_memory_human(value: String): Self = StObject.set(x, "total_system_memory_human", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory(value: String): Self = StObject.set(x, "used_memory", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_dataset(value: String): Self = StObject.set(x, "used_memory_dataset", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_dataset_perc(value: String): Self = StObject.set(x, "used_memory_dataset_perc", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_human(value: String): Self = StObject.set(x, "used_memory_human", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_lua(value: String): Self = StObject.set(x, "used_memory_lua", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_lua_human(value: String): Self = StObject.set(x, "used_memory_lua_human", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_overhead(value: String): Self = StObject.set(x, "used_memory_overhead", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_peak(value: String): Self = StObject.set(x, "used_memory_peak", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_peak_human(value: String): Self = StObject.set(x, "used_memory_peak_human", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_peak_perc(value: String): Self = StObject.set(x, "used_memory_peak_perc", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_rss(value: String): Self = StObject.set(x, "used_memory_rss", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_rss_human(value: String): Self = StObject.set(x, "used_memory_rss_human", value.asInstanceOf[js.Any])
    
    inline def setUsed_memory_startup(value: String): Self = StObject.set(x, "used_memory_startup", value.asInstanceOf[js.Any])
  }
}
