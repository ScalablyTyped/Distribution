package typings.pulumiAws.sagemakerModelMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.sagemaker.ModelContainer
import typings.pulumiAws.inputMod.sagemaker.ModelPrimaryContainer
import typings.pulumiAws.inputMod.sagemaker.ModelVpcConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this model.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies containers in the inference pipeline. If not specified, the `primaryContainer` argument is required. Fields are documented below.
    */
  val containers: js.UndefOr[Input[js.Array[Input[ModelContainer]]]] = js.native
  
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  val enableNetworkIsolation: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * A role that SageMaker can assume to access model artifacts and docker images for deployment.
    */
  val executionRoleArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the model (must be unique). If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The primary docker image containing inference code that is used when the model is deployed for predictions.  If not specified, the `container` argument is required. Fields are documented below.
    */
  val primaryContainer: js.UndefOr[Input[ModelPrimaryContainer]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Specifies the VPC that you want your model to connect to. VpcConfig is used in hosting services and in batch transform.
    */
  val vpcConfig: js.UndefOr[Input[ModelVpcConfig]] = js.native
}
object ModelState {
  
  @scala.inline
  def apply(): ModelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelState]
  }
  
  @scala.inline
  implicit class ModelStateOps[Self <: ModelState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: Input[ModelContainer]*): Self = this.set("containers", js.Array(value :_*))
    
    @scala.inline
    def setContainers(value: Input[js.Array[Input[ModelContainer]]]): Self = this.set("containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    
    @scala.inline
    def setEnableNetworkIsolation(value: Input[Boolean]): Self = this.set("enableNetworkIsolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableNetworkIsolation: Self = this.set("enableNetworkIsolation", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: Input[String]): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("executionRoleArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPrimaryContainer(value: Input[ModelPrimaryContainer]): Self = this.set("primaryContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryContainer: Self = this.set("primaryContainer", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: Input[ModelVpcConfig]): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
