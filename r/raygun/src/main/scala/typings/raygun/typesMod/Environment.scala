package typings.raygun.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Environment extends StObject {
  
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
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePhysicalMemory(value: Double): Self = StObject.set(x, "availablePhysicalMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    @scala.inline
    def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorCount(value: Double): Self = StObject.set(x, "processorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorCountUndefined: Self = StObject.set(x, "processorCount", js.undefined)
    
    @scala.inline
    def setTotalPhysicalMemory(value: Double): Self = StObject.set(x, "totalPhysicalMemory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
  }
}
