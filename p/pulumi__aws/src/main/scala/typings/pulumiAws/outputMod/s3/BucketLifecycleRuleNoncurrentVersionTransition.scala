package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLifecycleRuleNoncurrentVersionTransition extends StObject {
  
  /**
    * Specifies the number of days noncurrent object versions transition.
    */
  var days: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the Amazon S3 storage class to which you want the noncurrent object versions to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: String
}
object BucketLifecycleRuleNoncurrentVersionTransition {
  
  inline def apply(storageClass: String): BucketLifecycleRuleNoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionTransition]
  }
  
  extension [Self <: BucketLifecycleRuleNoncurrentVersionTransition](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
  }
}
