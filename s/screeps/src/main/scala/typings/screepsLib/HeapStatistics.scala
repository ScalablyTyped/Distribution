package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeapStatistics extends js.Object {
  var does_zap_garbage: screepsLib.screepsLibNumbers.`0` | screepsLib.screepsLibNumbers.`1`
  var externally_allocated_size: scala.Double
  var heap_size_limit: scala.Double
  var malloced_memory: scala.Double
  var peak_malloced_memory: scala.Double
  var total_available_size: scala.Double
  var total_heap_size: scala.Double
  var total_heap_size_executable: scala.Double
  var total_physical_size: scala.Double
  var used_heap_size: scala.Double
}

object HeapStatistics {
  @scala.inline
  def apply(
    does_zap_garbage: screepsLib.screepsLibNumbers.`0` | screepsLib.screepsLibNumbers.`1`,
    externally_allocated_size: scala.Double,
    heap_size_limit: scala.Double,
    malloced_memory: scala.Double,
    peak_malloced_memory: scala.Double,
    total_available_size: scala.Double,
    total_heap_size: scala.Double,
    total_heap_size_executable: scala.Double,
    total_physical_size: scala.Double,
    used_heap_size: scala.Double
  ): HeapStatistics = {
    val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], externally_allocated_size = externally_allocated_size, heap_size_limit = heap_size_limit, malloced_memory = malloced_memory, peak_malloced_memory = peak_malloced_memory, total_available_size = total_available_size, total_heap_size = total_heap_size, total_heap_size_executable = total_heap_size_executable, total_physical_size = total_physical_size, used_heap_size = used_heap_size)
  
    __obj.asInstanceOf[HeapStatistics]
  }
}

