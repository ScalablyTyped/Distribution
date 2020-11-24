package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackParameters extends js.Object {
  
  var ParameterKey: String = js.native
  
  var ParameterValue: String = js.native
}
object StackParameters {
  
  @scala.inline
  def apply(ParameterKey: String, ParameterValue: String): StackParameters = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackParameters]
  }
  
  @scala.inline
  implicit class StackParametersOps[Self <: StackParameters] (val x: Self) extends AnyVal {
    
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
    def setParameterKey(value: String): Self = this.set("ParameterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterValue(value: String): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
  }
}
