package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var containerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  var divisor: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Required: resource to select
    */
  var resource: Input[String]
}
object ResourceFieldSelector {
  
  @scala.inline
  def apply(resource: Input[String]): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFieldSelector]
  }
  
  @scala.inline
  implicit class ResourceFieldSelectorMutableBuilder[Self <: ResourceFieldSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: Input[String]): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNameUndefined: Self = StObject.set(x, "containerName", js.undefined)
    
    @scala.inline
    def setDivisor(value: Input[String]): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    @scala.inline
    def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
