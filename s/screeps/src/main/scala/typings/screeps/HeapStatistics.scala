package typings.screeps

import typings.screeps.screepsNumbers.`0`
import typings.screeps.screepsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapStatistics extends js.Object {
  var does_zap_garbage: `0` | `1`
  var externally_allocated_size: Double
  var heap_size_limit: Double
  var malloced_memory: Double
  var peak_malloced_memory: Double
  var total_available_size: Double
  var total_heap_size: Double
  var total_heap_size_executable: Double
  var total_physical_size: Double
  var used_heap_size: Double
}

object HeapStatistics {
  @scala.inline
  def apply(
    does_zap_garbage: `0` | `1`,
    externally_allocated_size: Double,
    heap_size_limit: Double,
    malloced_memory: Double,
    peak_malloced_memory: Double,
    total_available_size: Double,
    total_heap_size: Double,
    total_heap_size_executable: Double,
    total_physical_size: Double,
    used_heap_size: Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], externally_allocated_size = externally_allocated_size.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeapStatistics]
  }
}

