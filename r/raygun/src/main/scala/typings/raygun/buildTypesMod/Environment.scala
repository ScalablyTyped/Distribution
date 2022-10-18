package typings.raygun.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  var architecture: String
  
  var availablePhysicalMemory: Double
  
  var cpu: js.UndefOr[String] = js.undefined
  
  var osVersion: String
  
  var processorCount: js.UndefOr[Double] = js.undefined
  
  var totalPhysicalMemory: Double
  
  var utcOffset: Double
}
object Environment {
  
  inline def apply(
    architecture: String,
    availablePhysicalMemory: Double,
    osVersion: String,
    totalPhysicalMemory: Double,
    utcOffset: Double
  ): Environment = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], availablePhysicalMemory = availablePhysicalMemory.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], totalPhysicalMemory = totalPhysicalMemory.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setAvailablePhysicalMemory(value: Double): Self = StObject.set(x, "availablePhysicalMemory", value.asInstanceOf[js.Any])
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
    
    inline def setProcessorCount(value: Double): Self = StObject.set(x, "processorCount", value.asInstanceOf[js.Any])
    
    inline def setProcessorCountUndefined: Self = StObject.set(x, "processorCount", js.undefined)
    
    inline def setTotalPhysicalMemory(value: Double): Self = StObject.set(x, "totalPhysicalMemory", value.asInstanceOf[js.Any])
    
    inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
  }
}
