package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketObjectLockConfigurationRuleDefaultRetention extends StObject {
  
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  var mode: Input[String] = js.native
  
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var years: js.UndefOr[Input[Double]] = js.native
}
object BucketObjectLockConfigurationRuleDefaultRetention {
  
  @scala.inline
  def apply(mode: Input[String]): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationRuleDefaultRetentionMutableBuilder[Self <: BucketObjectLockConfigurationRuleDefaultRetention] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Input[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    @scala.inline
    def setMode(value: Input[String]): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYears(value: Input[Double]): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearsUndefined: Self = StObject.set(x, "years", js.undefined)
  }
}
