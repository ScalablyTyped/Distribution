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
  def apply(): ProvisionedConcurrencyConfigState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedConcurrencyConfigState]
  }
  @scala.inline
  implicit class ProvisionedConcurrencyConfigStateOps[Self <: ProvisionedConcurrencyConfigState] (val x: Self) extends AnyVal {
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
    def deleteFunctionName: Self = this.set("functionName", js.undefined)
    @scala.inline
    def setProvisionedConcurrentExecutions(value: Input[Double]): Self = this.set("provisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedConcurrentExecutions: Self = this.set("provisionedConcurrentExecutions", js.undefined)
    @scala.inline
    def setQualifier(value: Input[String]): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
  
}

