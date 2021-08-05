package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObjectLockConfiguration extends StObject {
  
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
    */
  var objectLockEnabled: String
  
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: js.UndefOr[BucketObjectLockConfigurationRule] = js.undefined
}
object BucketObjectLockConfiguration {
  
  inline def apply(objectLockEnabled: String): BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfiguration]
  }
  
  extension [Self <: BucketObjectLockConfiguration](x: Self) {
    
    inline def setObjectLockEnabled(value: String): Self = StObject.set(x, "objectLockEnabled", value.asInstanceOf[js.Any])
    
    inline def setRule(value: BucketObjectLockConfigurationRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
