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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("does_zap_garbage")(does_zap_garbage.asInstanceOf[js.Any])
    __obj.updateDynamic("externally_allocated_size")(externally_allocated_size)
    __obj.updateDynamic("heap_size_limit")(heap_size_limit)
    __obj.updateDynamic("malloced_memory")(malloced_memory)
    __obj.updateDynamic("peak_malloced_memory")(peak_malloced_memory)
    __obj.updateDynamic("total_available_size")(total_available_size)
    __obj.updateDynamic("total_heap_size")(total_heap_size)
    __obj.updateDynamic("total_heap_size_executable")(total_heap_size_executable)
    __obj.updateDynamic("total_physical_size")(total_physical_size)
    __obj.updateDynamic("used_heap_size")(used_heap_size)
    __obj.asInstanceOf[HeapStatistics]
  }
}

