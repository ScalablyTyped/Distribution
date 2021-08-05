package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObjectLockConfigurationRuleDefaultRetention extends StObject {
  
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.undefined
  
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  var mode: String
  
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var years: js.UndefOr[Double] = js.undefined
}
object BucketObjectLockConfigurationRuleDefaultRetention {
  
  inline def apply(mode: String): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
  
  extension [Self <: BucketObjectLockConfigurationRuleDefaultRetention](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    inline def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
