package typings.atPulumiAws.lambdaProvisionedConcurrencyConfigMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedConcurrencyConfigArgs extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function.
    */
  val functionName: Input[String] = js.native
  /**
    * Amount of capacity to allocate. Must be greater than or equal to `1`.
    */
  val provisionedConcurrentExecutions: Input[Double] = js.native
  /**
    * Lambda Function version or Lambda Alias name.
    */
  val qualifier: Input[String] = js.native
}

object ProvisionedConcurrencyConfigArgs {
  @scala.inline
  def apply(
    functionName: Input[String],
    provisionedConcurrentExecutions: Input[Double],
    qualifier: Input[String]
  ): ProvisionedConcurrencyConfigArgs = {
    val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], provisionedConcurrentExecutions = provisionedConcurrentExecutions.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProvisionedConcurrencyConfigArgs]
  }
}

