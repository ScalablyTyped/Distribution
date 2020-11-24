package typings.pulumiAws.apigatewayDeploymentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentArgs extends js.Object {
  
  /**
    * The description of the deployment
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  
  /**
    * The description of the stage
    */
  val stageDescription: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
    */
  val stageName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
    */
  val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map that defines variables for the stage
    */
  val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object DeploymentArgs {
  
  @scala.inline
  def apply(restApi: Input[String | RestApi]): DeploymentArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any])
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
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setStageDescription(value: Input[String]): Self = this.set("stageDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageDescription: Self = this.set("stageDescription", js.undefined)
    
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    
    @scala.inline
    def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    
    @scala.inline
    def setVariables(value: Input[StringDictionary[Input[String]]]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
}
