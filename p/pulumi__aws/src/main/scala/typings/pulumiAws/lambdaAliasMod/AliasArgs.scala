package typings.pulumiAws.lambdaAliasMod

import typings.pulumiAws.inputMod.lambda.AliasRoutingConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The function ARN of the Lambda function for which you want to create an alias.
    */
  val functionName: Input[String] = js.native
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: Input[String] = js.native
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: js.UndefOr[Input[AliasRoutingConfig]] = js.native
}

object AliasArgs {
  @scala.inline
  def apply(functionName: Input[String], functionVersion: Input[String]): AliasArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
  @scala.inline
  implicit class AliasArgsOps[Self <: AliasArgs] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: Input[String]): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionVersion(value: Input[String]): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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

