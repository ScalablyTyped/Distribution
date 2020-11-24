package typings.qRetry.mod.qAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRetryOptions extends js.Object {
  
  var interval: js.UndefOr[Double] = js.native
  
  var intervalMultiplier: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var maxInterval: js.UndefOr[Double] = js.native
}
object IRetryOptions {
  
  @scala.inline
  def apply(): IRetryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRetryOptions]
  }
  
  @scala.inline
  implicit class IRetryOptionsOps[Self <: IRetryOptions] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIntervalMultiplier(value: Double): Self = this.set("intervalMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalMultiplier: Self = this.set("intervalMultiplier", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMaxInterval(value: Double): Self = this.set("maxInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInterval: Self = this.set("maxInterval", js.undefined)
  }
}
