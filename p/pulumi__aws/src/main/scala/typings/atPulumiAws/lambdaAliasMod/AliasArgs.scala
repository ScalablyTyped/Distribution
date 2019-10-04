package typings.atPulumiAws.lambdaAliasMod

import typings.atPulumiAws.typesInputMod.lambdaNs.AliasRoutingConfig
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasArgs extends js.Object {
  /**
    * Description of the alias.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The function ARN of the Lambda function for which you want to create an alias.
    */
  val functionName: Input[String]
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: Input[String]
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: js.UndefOr[Input[AliasRoutingConfig]] = js.undefined
}

object AliasArgs {
  @scala.inline
  def apply(
    functionName: Input[String],
    functionVersion: Input[String],
    description: Input[String] = null,
    name: Input[String] = null,
    routingConfig: Input[AliasRoutingConfig] = null
  ): AliasArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (routingConfig != null) __obj.updateDynamic("routingConfig")(routingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasArgs]
  }
}

