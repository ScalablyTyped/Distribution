package typings.raygun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: String
  var availablePhysicalMemory: Double
  var cpu: Anon_Model
  var osVersion: String
  var processorCount: js.UndefOr[Double] = js.undefined
  var totalPhysicalMemory: Double
  var utcOffset: Double
}

object Anon_Architecture {
  @scala.inline
  def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    cpu: Anon_Model,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double,
    processorCount: Int | Double = null
  ): Anon_Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    if (processorCount != null) __obj.updateDynamic("processorCount")(processorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Architecture]
  }
}

