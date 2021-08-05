package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObjectLockConfigurationRule extends StObject {
  
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention
}
object BucketObjectLockConfigurationRule {
  
  inline def apply(defaultRetention: BucketObjectLockConfigurationRuleDefaultRetention): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
  
  extension [Self <: BucketObjectLockConfigurationRule](x: Self) {
    
    inline def setDefaultRetention(value: BucketObjectLockConfigurationRuleDefaultRetention): Self = StObject.set(x, "defaultRetention", value.asInstanceOf[js.Any])
  }
}
