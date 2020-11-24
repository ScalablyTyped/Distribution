package typings.pulumiAws.provisionedConcurrencyConfigMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class ProvisionedConcurrencyConfigArgsOps[Self <: ProvisionedConcurrencyConfigArgs] (val x: Self) extends AnyVal {
    
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
    def setProvisionedConcurrentExecutions(value: Input[Double]): Self = this.set("provisionedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: Input[String]): Self = this.set("qualifier", value.asInstanceOf[js.Any])
  }
}
