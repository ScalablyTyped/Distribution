package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceFieldSelector represents container resources (cpu, memory) and their output format
  */
@js.native
trait ResourceFieldSelector extends js.Object {
  
  /**
    * Container name: required for volumes, optional for env vars
    */
  var containerName: String = js.native
  
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  var divisor: String = js.native
  
  /**
    * Required: resource to select
    */
  var resource: String = js.native
}
object ResourceFieldSelector {
  
  @scala.inline
  def apply(containerName: String, divisor: String, resource: String): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], divisor = divisor.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFieldSelector]
  }
  
  @scala.inline
  implicit class ResourceFieldSelectorOps[Self <: ResourceFieldSelector] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: String): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisor(value: String): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
}
