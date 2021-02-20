package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleRule extends StObject {
  
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Double] = js.native
  
  /**
    * Specifies lifecycle rule status.
    */
  var enabled: Boolean = js.native
  
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[BucketLifecycleRuleExpiration] = js.native
  
  /**
    * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
    */
  var id: String = js.native
  
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[BucketLifecycleRuleNoncurrentVersionExpiration] = js.native
  
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[js.Array[BucketLifecycleRuleNoncurrentVersionTransition]] = js.native
  
  /**
    * Object key prefix identifying one or more objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * Specifies object tags key and value.
    */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[js.Array[BucketLifecycleRuleTransition]] = js.native
}
object BucketLifecycleRule {
  
  @scala.inline
  def apply(enabled: Boolean, id: String): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
  
  @scala.inline
  implicit class BucketLifecycleRuleMutableBuilder[Self <: BucketLifecycleRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortIncompleteMultipartUploadDays(value: Double): Self = StObject.set(x, "abortIncompleteMultipartUploadDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUploadDaysUndefined: Self = StObject.set(x, "abortIncompleteMultipartUploadDays", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiration(value: BucketLifecycleRuleExpiration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionExpiration(value: BucketLifecycleRuleNoncurrentVersionExpiration): Self = StObject.set(x, "noncurrentVersionExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionExpirationUndefined: Self = StObject.set(x, "noncurrentVersionExpiration", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitions(value: js.Array[BucketLifecycleRuleNoncurrentVersionTransition]): Self = StObject.set(x, "noncurrentVersionTransitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoncurrentVersionTransitionsUndefined: Self = StObject.set(x, "noncurrentVersionTransitions", js.undefined)
    
    @scala.inline
    def setNoncurrentVersionTransitionsVarargs(value: BucketLifecycleRuleNoncurrentVersionTransition*): Self = StObject.set(x, "noncurrentVersionTransitions", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTransitions(value: js.Array[BucketLifecycleRuleTransition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: BucketLifecycleRuleTransition*): Self = StObject.set(x, "transitions", js.Array(value :_*))
  }
}
