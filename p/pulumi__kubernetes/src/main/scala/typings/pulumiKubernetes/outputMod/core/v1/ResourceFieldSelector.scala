package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceFieldSelector represents container resources (cpu, memory) and their output format
  */
trait ResourceFieldSelector extends StObject {
  
  /**
    * Container name: required for volumes, optional for env vars
    */
  var containerName: String
  
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  var divisor: String
  
  /**
    * Required: resource to select
    */
  var resource: String
}
object ResourceFieldSelector {
  
  inline def apply(containerName: String, divisor: String, resource: String): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], divisor = divisor.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFieldSelector]
  }
  
  extension [Self <: ResourceFieldSelector](x: Self) {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setDivisor(value: String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
