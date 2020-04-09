package typings.reactAdaptiveHooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus> */
trait PartialMemoryStatus extends js.Object {
  var deviceMemory: js.UndefOr[Double] = js.undefined
  var jsHeapSizeLimit: js.UndefOr[Double] = js.undefined
  var totalJSHeapSize: js.UndefOr[Double] = js.undefined
  var usedJSHeapSize: js.UndefOr[Double] = js.undefined
}

object PartialMemoryStatus {
  @scala.inline
  def apply(
    deviceMemory: Int | Double = null,
    jsHeapSizeLimit: Int | Double = null,
    totalJSHeapSize: Int | Double = null,
    usedJSHeapSize: Int | Double = null
  ): PartialMemoryStatus = {
    val __obj = js.Dynamic.literal()
    if (deviceMemory != null) __obj.updateDynamic("deviceMemory")(deviceMemory.asInstanceOf[js.Any])
    if (jsHeapSizeLimit != null) __obj.updateDynamic("jsHeapSizeLimit")(jsHeapSizeLimit.asInstanceOf[js.Any])
    if (totalJSHeapSize != null) __obj.updateDynamic("totalJSHeapSize")(totalJSHeapSize.asInstanceOf[js.Any])
    if (usedJSHeapSize != null) __obj.updateDynamic("usedJSHeapSize")(usedJSHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMemoryStatus]
  }
}

