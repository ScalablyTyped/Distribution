package typings.reactAdaptiveHooks.anon

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
    deviceMemory: js.UndefOr[Double] = js.undefined,
    jsHeapSizeLimit: js.UndefOr[Double] = js.undefined,
    totalJSHeapSize: js.UndefOr[Double] = js.undefined,
    usedJSHeapSize: js.UndefOr[Double] = js.undefined
  ): PartialMemoryStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deviceMemory)) __obj.updateDynamic("deviceMemory")(deviceMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jsHeapSizeLimit)) __obj.updateDynamic("jsHeapSizeLimit")(jsHeapSizeLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalJSHeapSize)) __obj.updateDynamic("totalJSHeapSize")(totalJSHeapSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usedJSHeapSize)) __obj.updateDynamic("usedJSHeapSize")(usedJSHeapSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMemoryStatus]
  }
}

