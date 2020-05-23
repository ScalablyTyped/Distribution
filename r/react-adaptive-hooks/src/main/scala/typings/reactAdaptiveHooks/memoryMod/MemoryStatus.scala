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
    jsHeapSizeLimit: Double = null.asInstanceOf[Double],
    totalJSHeapSize: Double = null.asInstanceOf[Double],
    usedJSHeapSize: Double = null.asInstanceOf[Double]
  ): MemoryStatus = {
    val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any], jsHeapSizeLimit = jsHeapSizeLimit.asInstanceOf[js.Any], totalJSHeapSize = totalJSHeapSize.asInstanceOf[js.Any], usedJSHeapSize = usedJSHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStatus]
  }
}

