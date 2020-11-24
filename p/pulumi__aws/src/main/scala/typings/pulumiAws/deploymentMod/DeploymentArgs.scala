package typings.pulumiAws.deploymentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentArgs extends js.Object {
  
  /**
    * The API identifier.
    */
  val apiId: Input[String] = js.native
  
  /**
    * The description for the deployment resource. Must be less than or equal to 1024 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
    */
  val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object DeploymentArgs {
  
  @scala.inline
  def apply(apiId: Input[String]): DeploymentArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentArgs]
  }
  
  @scala.inline
  implicit class DeploymentArgsOps[Self <: DeploymentArgs] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
  }
}
