package typings.pulumiAws.lambdaAliasMod

import typings.pulumiAws.inputMod.lambda.AliasRoutingConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AliasState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda function alias.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * Lambda Function name or ARN.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
    */
  val invokeArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: js.UndefOr[Input[AliasRoutingConfig]] = js.native
}
object AliasState {
  
  @scala.inline
  def apply(): AliasState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasState]
  }
  
  @scala.inline
  implicit class AliasStateOps[Self <: AliasState] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFunctionName(value: Input[String]): Self = this.set("functionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: Input[String]): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    
    @scala.inline
    def setInvokeArn(value: Input[String]): Self = this.set("invokeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvokeArn: Self = this.set("invokeArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRoutingConfig(value: Input[AliasRoutingConfig]): Self = this.set("routingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingConfig: Self = this.set("routingConfig", js.undefined)
  }
}
