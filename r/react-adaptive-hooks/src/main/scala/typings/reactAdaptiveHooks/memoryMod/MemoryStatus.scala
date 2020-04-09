package typings.reactAdaptiveHooks.memoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStatus extends js.Object {
  var deviceMemory: Double
  var jsHeapSizeLimit: Double | Null
  var totalJSHeapSize: Double | Null
  var usedJSHeapSize: Double | Null
}

object MemoryStatus {
  @scala.inline
  def apply(
    deviceMemory: Double,
    jsHeapSizeLimit: Int | Double = null,
    totalJSHeapSize: Int | Double = null,
    usedJSHeapSize: Int | Double = null
  ): MemoryStatus = {
    val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any])
    if (jsHeapSizeLimit != null) __obj.updateDynamic("jsHeapSizeLimit")(jsHeapSizeLimit.asInstanceOf[js.Any])
    if (totalJSHeapSize != null) __obj.updateDynamic("totalJSHeapSize")(totalJSHeapSize.asInstanceOf[js.Any])
    if (usedJSHeapSize != null) __obj.updateDynamic("usedJSHeapSize")(usedJSHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatus]
  }
}

