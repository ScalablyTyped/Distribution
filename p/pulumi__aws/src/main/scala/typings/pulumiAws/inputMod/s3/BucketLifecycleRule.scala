package typings.pulumiAws.inputMod.s3

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketLifecycleRule extends StObject {
  
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Specifies lifecycle rule status.
    */
  var enabled: Input[Boolean]
  
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[Input[BucketLifecycleRuleExpiration]] = js.undefined
  
  /**
    * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[Input[BucketLifecycleRuleNoncurrentVersionExpiration]] = js.undefined
  
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]] = js.undefined
  
  /**
    * Object key prefix identifying one or more objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Specifies object tags key and value.
    */
  var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleTransition]]]] = js.undefined
}
object BucketLifecycleRule {
  
  inline def apply(enabled: Input[Boolean]): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
  
  extension [Self <: BucketLifecycleRule](x: Self) {
    
    inline def setAbortIncompleteMultipartUploadDays(value: Input[Double]): Self = StObject.set(x, "abortIncompleteMultipartUploadDays", value.asInstanceOf[js.Any])
    
    inline def setAbortIncompleteMultipartUploadDaysUndefined: Self = StObject.set(x, "abortIncompleteMultipartUploadDays", js.undefined)
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: Input[BucketLifecycleRuleExpiration]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setNoncurrentVersionExpiration(value: Input[BucketLifecycleRuleNoncurrentVersionExpiration]): Self = StObject.set(x, "noncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "noncurrentVersionExpiration", js.undefined)
    
    inline def setNoncurrentVersionTransitions(value: Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]): Self = StObject.set(x, "noncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "noncurrentVersionTransitions", js.undefined)
    
    inline def setNoncurrentVersionTransitionsVarargs(value: Input[BucketLifecycleRuleNoncurrentVersionTransition]*): Self = StObject.set(x, "noncurrentVersionTransitions", js.Array(value :_*))
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTransitions(value: Input[js.Array[Input[BucketLifecycleRuleTransition]]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    inline def setTransitionsVarargs(value: Input[BucketLifecycleRuleTransition]*): Self = StObject.set(x, "transitions", js.Array(value :_*))
  }
}
