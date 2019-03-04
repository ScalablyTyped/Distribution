package typings
package raygunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: java.lang.String
  var availablePhysicalMemory: scala.Double
  var cpu: Anon_Model
  var osVersion: java.lang.String
  var processorCount: js.UndefOr[scala.Double] = js.undefined
  var totalPhysicalMemory: scala.Double
  var utcOffset: scala.Double
}

object Anon_Architecture {
  @scala.inline
  def apply(
    architecture: java.lang.String,
    availablePhysicalMemory: scala.Double,
    cpu: Anon_Model,
    osVersion: java.lang.String,
    totalPhysicalMemory: scala.Double,
    utcOffset: scala.Double,
    processorCount: scala.Int | scala.Double = null
  ): Anon_Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture, availablePhysicalMemory = availablePhysicalMemory, cpu = cpu, osVersion = osVersion, totalPhysicalMemory = totalPhysicalMemory, utcOffset = utcOffset)
    if (processorCount != null) __obj.updateDynamic("processorCount")(processorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Architecture]
  }
}

