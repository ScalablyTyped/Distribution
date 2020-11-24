package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceLambdaConfig extends js.Object {
  
  /**
    * The ARN for the Lambda function.
    */
  var functionArn: String = js.native
}
object DataSourceLambdaConfig {
  
  @scala.inline
  def apply(functionArn: String): DataSourceLambdaConfig = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceLambdaConfig]
  }
  
  @scala.inline
  implicit class DataSourceLambdaConfigOps[Self <: DataSourceLambdaConfig] (val x: Self) extends AnyVal {
    
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
    def setFunctionArn(value: String): Self = this.set("functionArn", value.asInstanceOf[js.Any])
  }
}
