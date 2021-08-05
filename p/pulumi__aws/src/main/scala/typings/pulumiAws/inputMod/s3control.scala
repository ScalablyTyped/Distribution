package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3control {
  
  trait BucketLifecycleConfigurationRule extends StObject {
    
    /**
      * Configuration block containing settings for abort incomplete multipart upload.
      */
    var abortIncompleteMultipartUpload: js.UndefOr[Input[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]] = js.undefined
    
    /**
      * Configuration block containing settings for expiration of objects.
      */
    var expiration: js.UndefOr[Input[BucketLifecycleConfigurationRuleExpiration]] = js.undefined
    
    /**
      * Configuration block containing settings for filtering.
      */
    var filter: js.UndefOr[Input[BucketLifecycleConfigurationRuleFilter]] = js.undefined
    
    /**
      * Unique identifier for the rule.
      */
    var id: Input[String]
    
    /**
      * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
      */
    var status: js.UndefOr[Input[String]] = js.undefined
  }
  object BucketLifecycleConfigurationRule {
    
    inline def apply(id: Input[String]): BucketLifecycleConfigurationRule = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationRule]
    }
    
    extension [Self <: BucketLifecycleConfigurationRule](x: Self) {
      
      inline def setAbortIncompleteMultipartUpload(value: Input[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]): Self = StObject.set(x, "abortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
      
      inline def setAbortIncompleteMultipartUploadUndefined: Self = StObject.set(x, "abortIncompleteMultipartUpload", js.undefined)
      
      inline def setExpiration(value: Input[BucketLifecycleConfigurationRuleExpiration]): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
      
      inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
      
      inline def setFilter(value: Input[BucketLifecycleConfigurationRuleFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload extends StObject {
    
    /**
      * Number of days after which Amazon S3 aborts an incomplete multipart upload.
      */
    var daysAfterInitiation: Input[Double]
  }
  object BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload {
    
    inline def apply(daysAfterInitiation: Input[Double]): BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload = {
      val __obj = js.Dynamic.literal(daysAfterInitiation = daysAfterInitiation.asInstanceOf[js.Any])
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]
    }
    
    extension [Self <: BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload](x: Self) {
      
      inline def setDaysAfterInitiation(value: Input[Double]): Self = StObject.set(x, "daysAfterInitiation", value.asInstanceOf[js.Any])
    }
  }
  
  trait BucketLifecycleConfigurationRuleExpiration extends StObject {
    
    /**
      * Date the object is to be deleted. Should be in `YYYY-MM-DD` date format, e.g. `2020-09-30`.
      */
    var date: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of days before the object is to be deleted.
      */
    var days: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Enable to remove a delete marker with no noncurrent versions. Cannot be specified with `date` or `days`.
      */
    var expiredObjectDeleteMarker: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object BucketLifecycleConfigurationRuleExpiration {
    
    inline def apply(): BucketLifecycleConfigurationRuleExpiration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleExpiration]
    }
    
    extension [Self <: BucketLifecycleConfigurationRuleExpiration](x: Self) {
      
      inline def setDate(value: Input[String]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDays(value: Input[Double]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setExpiredObjectDeleteMarker(value: Input[Boolean]): Self = StObject.set(x, "expiredObjectDeleteMarker", value.asInstanceOf[js.Any])
      
      inline def setExpiredObjectDeleteMarkerUndefined: Self = StObject.set(x, "expiredObjectDeleteMarker", js.undefined)
    }
  }
  
  trait BucketLifecycleConfigurationRuleFilter extends StObject {
    
    /**
      * Object prefix for rule filtering.
      */
    var prefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of object tags for rule filtering.
      */
    var tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object BucketLifecycleConfigurationRuleFilter {
    
    inline def apply(): BucketLifecycleConfigurationRuleFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BucketLifecycleConfigurationRuleFilter]
    }
    
    extension [Self <: BucketLifecycleConfigurationRuleFilter](x: Self) {
      
      inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
