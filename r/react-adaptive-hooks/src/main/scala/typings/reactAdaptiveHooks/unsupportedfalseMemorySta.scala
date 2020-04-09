package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.reactAdaptiveHooksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  unsupported  :false} & react-adaptive-hooks.react-adaptive-hooks/memory.MemoryStatus */
trait unsupportedfalseMemorySta extends js.Object {
  var deviceMemory: Double
  var jsHeapSizeLimit: Double | Null
  var totalJSHeapSize: Double | Null
  var unsupported: `false`
  var usedJSHeapSize: Double | Null
}

object unsupportedfalseMemorySta {
  @scala.inline
  def apply(
    deviceMemory: Double,
    unsupported: `false`,
    jsHeapSizeLimit: Int | Double = null,
    totalJSHeapSize: Int | Double = null,
    usedJSHeapSize: Int | Double = null
  ): unsupportedfalseMemorySta = {
    val __obj = js.Dynamic.literal(deviceMemory = deviceMemory.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    if (jsHeapSizeLimit != null) __obj.updateDynamic("jsHeapSizeLimit")(jsHeapSizeLimit.asInstanceOf[js.Any])
    if (totalJSHeapSize != null) __obj.updateDynamic("totalJSHeapSize")(totalJSHeapSize.asInstanceOf[js.Any])
    if (usedJSHeapSize != null) __obj.updateDynamic("usedJSHeapSize")(usedJSHeapSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[unsupportedfalseMemorySta]
  }
}

