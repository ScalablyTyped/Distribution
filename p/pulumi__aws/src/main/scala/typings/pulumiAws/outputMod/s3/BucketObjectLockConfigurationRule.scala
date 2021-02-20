package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketObjectLockConfigurationRule extends StObject {
  
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention = js.native
}
object BucketObjectLockConfigurationRule {
  
  @scala.inline
  def apply(defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationRuleMutableBuilder[Self <: BucketObjectLockConfigurationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRetention(value: BucketObjectLockConfigurationRuleDefaultRetention): Self = StObject.set(x, "defaultRetention", value.asInstanceOf[js.Any])
  }
}
