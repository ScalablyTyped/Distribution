package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsClientPrimaryMeasureMethod extends js.Object {
  
  var isClientPrimaryMeasureMethod: Boolean = js.native
  
  var isServerUploadEnabled: Boolean = js.native
}
object IsClientPrimaryMeasureMethod {
  
  @scala.inline
  def apply(isClientPrimaryMeasureMethod: Boolean, isServerUploadEnabled: Boolean): IsClientPrimaryMeasureMethod = {
    val __obj = js.Dynamic.literal(isClientPrimaryMeasureMethod = isClientPrimaryMeasureMethod.asInstanceOf[js.Any], isServerUploadEnabled = isServerUploadEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsClientPrimaryMeasureMethod]
  }
  
  @scala.inline
  implicit class IsClientPrimaryMeasureMethodOps[Self <: IsClientPrimaryMeasureMethod] (val x: Self) extends AnyVal {
    
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
    def setIsClientPrimaryMeasureMethod(value: Boolean): Self = this.set("isClientPrimaryMeasureMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsServerUploadEnabled(value: Boolean): Self = this.set("isServerUploadEnabled", value.asInstanceOf[js.Any])
  }
}
