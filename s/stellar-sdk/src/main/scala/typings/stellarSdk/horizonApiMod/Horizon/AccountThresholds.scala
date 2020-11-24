package typings.stellarSdk.horizonApiMod.Horizon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountThresholds extends js.Object {
  
  var high_threshold: Double = js.native
  
  var low_threshold: Double = js.native
  
  var med_threshold: Double = js.native
}
object AccountThresholds {
  
  @scala.inline
  def apply(high_threshold: Double, low_threshold: Double, med_threshold: Double): AccountThresholds = {
    val __obj = js.Dynamic.literal(high_threshold = high_threshold.asInstanceOf[js.Any], low_threshold = low_threshold.asInstanceOf[js.Any], med_threshold = med_threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountThresholds]
  }
  
  @scala.inline
  implicit class AccountThresholdsOps[Self <: AccountThresholds] (val x: Self) extends AnyVal {
    
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
    def setHigh_threshold(value: Double): Self = this.set("high_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow_threshold(value: Double): Self = this.set("low_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMed_threshold(value: Double): Self = this.set("med_threshold", value.asInstanceOf[js.Any])
  }
}
