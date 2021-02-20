package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountThresholds extends StObject {
  
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
  implicit class AccountThresholdsMutableBuilder[Self <: AccountThresholds] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh_threshold(value: Double): Self = StObject.set(x, "high_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow_threshold(value: Double): Self = StObject.set(x, "low_threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMed_threshold(value: Double): Self = StObject.set(x, "med_threshold", value.asInstanceOf[js.Any])
  }
}
