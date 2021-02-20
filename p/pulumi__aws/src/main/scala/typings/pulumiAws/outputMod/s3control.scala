package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3control {
  
  @js.native
  trait BucketLifecycleConfigurationRule extends StObject {
    
    /**
      * Configuration block containing settings for abort incomplete multipart upload.
      */
    var abortIncompleteMultipartUpload: js.UndefOr[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload] = js.native
    
    /**
      * Configuration block containing settings for expiration of objects.
      */
    var expiration: js.UndefOr[BucketLifecycleConfigurationRuleExpiration] = js.native
    
    /**
      * Configuration block containing settings for filtering.
      */
    var filter: js.UndefOr[BucketLifecycleConfigurationRuleFilter] = js.native
    
    /**
      * Unique identifier for the rule.
      */
    var id: String = js.native
    
    /**
      * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
      */
    var status: js.UndefOr[String] = js.native
  }
  object BucketLifecycleConfigurationRule {
    
    @scala.inline
    def apply(id: String): BucketLifecycleConfigurationRule = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationRule]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationRuleMutableBuilder[Self <: BucketLifecycleConfigurationRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortIncompleteMultipartUpload(value: BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload): Self = StObject.set(x, "abortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "abortIncompleteMultipartUpload", js.undefined)
      
      @scala.inline
      def setExpiration(value: BucketLifecycleConfigurationRuleExpiration): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      @scala.inline
      def setFilter(value: BucketLifecycleConfigurationRuleFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload extends StObject {
    
    /**
      * Number of days after which Amazon S3 aborts an incomplete multipart upload.
      */
    var daysAfterInitiation: Double = js.native
  }
  object BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload {
    
    @scala.inline
    def apply(daysAfterInitiation: Double): BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload = {
      val __obj = js.Dynamic.literal(daysAfterInitiation = daysAfterInitiation.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadMutableBuilder[Self <: BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDaysAfterInitiation(value: Double): Self = StObject.set(x, "daysAfterInitiation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BucketLifecycleConfigurationRuleExpiration extends StObject {
    
    /**
      * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g. `2020-09-30`.
      */
    var date: js.UndefOr[String] = js.native
    
    /**
      * Number of days before the object is to be deleted.
      */
    var days: js.UndefOr[Double] = js.native
    
    /**
      * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
      */
    var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
  }
  object BucketLifecycleConfigurationRuleExpiration {
    
    @scala.inline
    def apply(): BucketLifecycleConfigurationRuleExpiration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleExpiration]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationRuleExpirationMutableBuilder[Self <: BucketLifecycleConfigurationRuleExpiration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setExpiredObjectDeleteMarker(value: Boolean): Self = StObject.set(x, "expiredObjectDeleteMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "expiredObjectDeleteMarker", js.undefined)
    }
  }
  
  @js.native
  trait BucketLifecycleConfigurationRuleFilter extends StObject {
    
    /**
      * Object prefix for rule filtering.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * Key-value map of object tags for rule filtering.
      */
    var tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object BucketLifecycleConfigurationRuleFilter {
    
    @scala.inline
    def apply(): BucketLifecycleConfigurationRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleFilter]
    }
    
    @scala.inline
    implicit class BucketLifecycleConfigurationRuleFilterMutableBuilder[Self <: BucketLifecycleConfigurationRuleFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
