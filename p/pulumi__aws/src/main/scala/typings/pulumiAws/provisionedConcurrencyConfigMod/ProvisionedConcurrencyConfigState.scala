package typings.pulumiAws.provisionedConcurrencyConfigMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisionedConcurrencyConfigState extends js.Object {
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * Amount of capacity to allocate. Must be greater than or equal to `1`.
    */
  val provisionedConcurrentExecutions: js.UndefOr[Input[Double]] = js.native
  /**
    * Lambda Function version or Lambda Alias name.
    */
  val qualifier: js.UndefOr[Input[String]] = js.native
}

object ProvisionedConcurrencyConfigState {
  @scala.inline
  def apply(
    functionName: Input[String] = null,
    provisionedConcurrentExecutions: Input[Double] = null,
    qualifier: Input[String] = null
  ): ProvisionedConcurrencyConfigState = {
    val __obj = js.Dynamic.literal()
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (provisionedConcurrentExecutions != null) __obj.updateDynamic("provisionedConcurrentExecutions")(provisionedConcurrentExecutions.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedConcurrencyConfigState]
  }
}

