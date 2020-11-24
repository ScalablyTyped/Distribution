package typings.rollingRateLimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneralOptions extends js.Object {
  
  var interval: Double = js.native
  
  var maxInInterval: Double = js.native
  
  var minDifference: js.UndefOr[Double] = js.native
}
object GeneralOptions {
  
  @scala.inline
  def apply(interval: Double, maxInInterval: Double): GeneralOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralOptions]
  }
  
  @scala.inline
  implicit class GeneralOptionsOps[Self <: GeneralOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxInInterval(value: Double): Self = this.set("maxInInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDifference(value: Double): Self = this.set("minDifference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDifference: Self = this.set("minDifference", js.undefined)
  }
}
