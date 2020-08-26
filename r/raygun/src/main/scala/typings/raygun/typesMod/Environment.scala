package typings.raygun.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  var architecture: String = js.native
  var availablePhysicalMemory: Double = js.native
  var cpu: js.UndefOr[String] = js.native
  var osVersion: String = js.native
  var processorCount: js.UndefOr[Double] = js.native
  var totalPhysicalMemory: Double = js.native
  var utcOffset: Double = js.native
}

object Environment {
  @scala.inline
  def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double
  ): Environment = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchitecture(value: String): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailablePhysicalMemory(value: Double): Self = this.set("availablePhysicalMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setOsVersion(value: String): Self = this.set("osVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPhysicalMemory(value: Double): Self = this.set("totalPhysicalMemory", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtcOffset(value: Double): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setProcessorCount(value: Double): Self = this.set("processorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessorCount: Self = this.set("processorCount", js.undefined)
  }
  
}

