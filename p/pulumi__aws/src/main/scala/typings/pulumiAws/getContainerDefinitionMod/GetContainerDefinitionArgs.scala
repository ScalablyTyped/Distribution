package typings.pulumiAws.getContainerDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerDefinitionArgs extends js.Object {
  
  /**
    * The name of the container definition
    */
  val containerName: String = js.native
  
  /**
    * The ARN of the task definition which contains the container
    */
  val taskDefinition: String = js.native
}
object GetContainerDefinitionArgs {
  
  @scala.inline
  def apply(containerName: String, taskDefinition: String): GetContainerDefinitionArgs = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContainerDefinitionArgs]
  }
  
  @scala.inline
  implicit class GetContainerDefinitionArgsOps[Self <: GetContainerDefinitionArgs] (val x: Self) extends AnyVal {
    
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
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
  }
}
