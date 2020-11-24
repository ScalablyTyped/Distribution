package typings.speedtestNet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsScalingEnabled extends js.Object {
  
  var isScalingEnabled: Boolean = js.native
  
  var maxThreadCount: Double = js.native
}
object IsScalingEnabled {
  
  @scala.inline
  def apply(isScalingEnabled: Boolean, maxThreadCount: Double): IsScalingEnabled = {
    val __obj = js.Dynamic.literal(isScalingEnabled = isScalingEnabled.asInstanceOf[js.Any], maxThreadCount = maxThreadCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsScalingEnabled]
  }
  
  @scala.inline
  implicit class IsScalingEnabledOps[Self <: IsScalingEnabled] (val x: Self) extends AnyVal {
    
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
    def setIsScalingEnabled(value: Boolean): Self = this.set("isScalingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxThreadCount(value: Double): Self = this.set("maxThreadCount", value.asInstanceOf[js.Any])
  }
}
