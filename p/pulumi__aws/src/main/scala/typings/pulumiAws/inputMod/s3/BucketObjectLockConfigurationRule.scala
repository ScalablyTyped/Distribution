package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObjectLockConfigurationRule extends StObject {
  
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention]
}
object BucketObjectLockConfigurationRule {
  
  @scala.inline
  def apply(defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention]): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationRuleMutableBuilder[Self <: BucketObjectLockConfigurationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRetention(value: Input[BucketObjectLockConfigurationRuleDefaultRetention]): Self = StObject.set(x, "defaultRetention", value.asInstanceOf[js.Any])
  }
}
