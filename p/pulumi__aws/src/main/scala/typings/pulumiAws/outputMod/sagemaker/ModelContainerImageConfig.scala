package typings.pulumiAws.outputMod.sagemaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelContainerImageConfig extends js.Object {
  
  /**
    * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). Allowed values are: `Platform` and `Vpc`.
    */
  var repositoryAccessMode: String = js.native
}
object ModelContainerImageConfig {
  
  @scala.inline
  def apply(repositoryAccessMode: String): ModelContainerImageConfig = {
    val __obj = js.Dynamic.literal(repositoryAccessMode = repositoryAccessMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelContainerImageConfig]
  }
  
  @scala.inline
  implicit class ModelContainerImageConfigOps[Self <: ModelContainerImageConfig] (val x: Self) extends AnyVal {
    
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
    def setRepositoryAccessMode(value: String): Self = this.set("repositoryAccessMode", value.asInstanceOf[js.Any])
  }
}
