package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var containerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the output format of the exposed resources, defaults to "1"
    */
  var divisor: js.UndefOr[Input[String]] = js.native
  
  /**
    * Required: resource to select
    */
  var resource: Input[String] = js.native
}
object ResourceFieldSelector {
  
  @scala.inline
  def apply(resource: Input[String]): ResourceFieldSelector = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
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
    def setResource(value: Input[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: Input[String]): Self = this.set("containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerName: Self = this.set("containerName", js.undefined)
    
    @scala.inline
    def setDivisor(value: Input[String]): Self = this.set("divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
  }
}
