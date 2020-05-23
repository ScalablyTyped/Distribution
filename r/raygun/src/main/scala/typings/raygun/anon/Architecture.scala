package typings.raygun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Architecture extends js.Object {
  var architecture: String
  var availablePhysicalMemory: Double
  var cpu: Model
  var osVersion: String
  var processorCount: js.UndefOr[Double] = js.undefined
  var totalPhysicalMemory: Double
  var utcOffset: Double
}

object Architecture {
  @scala.inline
  def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    cpu: Model,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double,
    processorCount: js.UndefOr[Double] = js.undefined
  ): Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(processorCount)) __obj.updateDynamic("processorCount")(processorCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
}

