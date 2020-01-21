package typings.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArchitecture extends js.Object {
  var architecture: String
  var availablePhysicalMemory: Double
  var cpu: AnonModel
  var osVersion: String
  var processorCount: js.UndefOr[Double] = js.undefined
  var totalPhysicalMemory: Double
  var utcOffset: Double
}

object AnonArchitecture {
  @scala.inline
  def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    cpu: AnonModel,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double,
    processorCount: Int | Double = null
  ): AnonArchitecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    if (processorCount != null) __obj.updateDynamic("processorCount")(processorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArchitecture]
  }
}

