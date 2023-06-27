package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponseMod {
  
  trait MetadataBearer extends StObject {
    
    /**
      * Metadata pertaining to this request.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
  }
  object MetadataBearer {
    
    inline def apply($metadata: ResponseMetadata): MetadataBearer = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataBearer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetadataBearer] (val x: Self) extends AnyVal {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseMetadata extends StObject {
    
    /**
      * The number of times this operation was attempted.
      */
    var attempts: js.UndefOr[Double] = js.undefined
    
    /**
      * A tertiary identifier for the last request sent. Used for debugging.
      */
    var cfId: js.UndefOr[String] = js.undefined
    
    /**
      * A secondary identifier for the last request sent. Used for debugging.
      */
    var extendedRequestId: js.UndefOr[String] = js.undefined
    
    /**
      * The status code of the last HTTP response received for this operation.
      */
    var httpStatusCode: js.UndefOr[Double] = js.undefined
    
    /**
      * A unique identifier for the last request sent for this operation. Often
      * requested by AWS service teams to aid in debugging.
      */
    var requestId: js.UndefOr[String] = js.undefined
    
    /**
      * The total amount of time (in milliseconds) that was spent waiting between
      * retry attempts.
      */
    var totalRetryDelay: js.UndefOr[Double] = js.undefined
  }
  object ResponseMetadata {
    
    inline def apply(): ResponseMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseMetadata] (val x: Self) extends AnyVal {
      
      inline def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      inline def setCfId(value: String): Self = StObject.set(x, "cfId", value.asInstanceOf[js.Any])
      
      inline def setCfIdUndefined: Self = StObject.set(x, "cfId", js.undefined)
      
      inline def setExtendedRequestId(value: String): Self = StObject.set(x, "extendedRequestId", value.asInstanceOf[js.Any])
      
      inline def setExtendedRequestIdUndefined: Self = StObject.set(x, "extendedRequestId", js.undefined)
      
      inline def setHttpStatusCode(value: Double): Self = StObject.set(x, "httpStatusCode", value.asInstanceOf[js.Any])
      
      inline def setHttpStatusCodeUndefined: Self = StObject.set(x, "httpStatusCode", js.undefined)
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      inline def setTotalRetryDelay(value: Double): Self = StObject.set(x, "totalRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setTotalRetryDelayUndefined: Self = StObject.set(x, "totalRetryDelay", js.undefined)
    }
  }
}
