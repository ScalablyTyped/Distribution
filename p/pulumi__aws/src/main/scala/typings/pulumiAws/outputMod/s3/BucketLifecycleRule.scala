package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLifecycleRule extends StObject {
  
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies lifecycle rule status.
    */
  var enabled: Boolean
  
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[BucketLifecycleRuleExpiration] = js.undefined
  
  /**
    * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
    */
  var id: String
  
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[BucketLifecycleRuleNoncurrentVersionExpiration] = js.undefined
  
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[js.Array[BucketLifecycleRuleNoncurrentVersionTransition]] = js.undefined
  
  /**
    * Object key prefix identifying one or more objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies object tags key and value.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[js.Array[BucketLifecycleRuleTransition]] = js.undefined
}
object BucketLifecycleRule {
  
  inline def apply(enabled: Boolean, id: String): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
  
  extension [Self <: BucketLifecycleRule](x: Self) {
    
    inline def setAbortIncompleteMultipartUploadDays(value: Double): Self = StObject.set(x, "abortIncompleteMultipartUploadDays", value.asInstanceOf[js.Any])
    
    inline def setAbortIncompleteMultipartUploadDaysUndefined: Self = StObject.set(x, "abortIncompleteMultipartUploadDays", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: BucketLifecycleRuleExpiration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionExpiration(value: BucketLifecycleRuleNoncurrentVersionExpiration): Self = StObject.set(x, "noncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "noncurrentVersionExpiration", js.undefined)
    
    inline def setNoncurrentVersionTransitions(value: js.Array[BucketLifecycleRuleNoncurrentVersionTransition]): Self = StObject.set(x, "noncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "noncurrentVersionTransitions", js.undefined)
    
    inline def setNoncurrentVersionTransitionsVarargs(value: BucketLifecycleRuleNoncurrentVersionTransition*): Self = StObject.set(x, "noncurrentVersionTransitions", js.Array(value :_*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTransitions(value: js.Array[BucketLifecycleRuleTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: BucketLifecycleRuleTransition*): Self = StObject.set(x, "transitions", js.Array(value :_*))
  }
}
