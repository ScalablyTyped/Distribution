package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBreadcrumbMod {
  
  trait Breadcrumb extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var event_id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[Severity | SeverityLevel] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Breadcrumb {
    
    inline def apply(): Breadcrumb = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Breadcrumb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEvent_id(value: String): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
      
      inline def setEvent_idUndefined: Self = StObject.set(x, "event_id", js.undefined)
      
      inline def setLevel(value: Severity | SeverityLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BreadcrumbHint = StringDictionary[Any]
  
  trait FetchBreadcrumbData extends StObject {
    
    var method: String
    
    var request_body_size: js.UndefOr[Double] = js.undefined
    
    var response_body_size: js.UndefOr[Double] = js.undefined
    
    var status_code: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object FetchBreadcrumbData {
    
    inline def apply(method: String, url: String): FetchBreadcrumbData = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchBreadcrumbData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchBreadcrumbData] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_size(value: Double): Self = StObject.set(x, "request_body_size", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_sizeUndefined: Self = StObject.set(x, "request_body_size", js.undefined)
      
      inline def setResponse_body_size(value: Double): Self = StObject.set(x, "response_body_size", value.asInstanceOf[js.Any])
      
      inline def setResponse_body_sizeUndefined: Self = StObject.set(x, "response_body_size", js.undefined)
      
      inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
      
      inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchBreadcrumbHint extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var endTimestamp: Double
    
    var input: js.Array[Any]
    
    var response: js.UndefOr[Any] = js.undefined
    
    var startTimestamp: Double
  }
  object FetchBreadcrumbHint {
    
    inline def apply(endTimestamp: Double, input: js.Array[Any], startTimestamp: Double): FetchBreadcrumbHint = {
      val __obj = js.Dynamic.literal(endTimestamp = endTimestamp.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchBreadcrumbHint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchBreadcrumbHint] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setInput(value: js.Array[Any]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputVarargs(value: Any*): Self = StObject.set(x, "input", js.Array(value*))
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait XhrBreadcrumbData extends StObject {
    
    var method: js.UndefOr[String] = js.undefined
    
    var request_body_size: js.UndefOr[Double] = js.undefined
    
    var response_body_size: js.UndefOr[Double] = js.undefined
    
    var status_code: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object XhrBreadcrumbData {
    
    inline def apply(): XhrBreadcrumbData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XhrBreadcrumbData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XhrBreadcrumbData] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRequest_body_size(value: Double): Self = StObject.set(x, "request_body_size", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_sizeUndefined: Self = StObject.set(x, "request_body_size", js.undefined)
      
      inline def setResponse_body_size(value: Double): Self = StObject.set(x, "response_body_size", value.asInstanceOf[js.Any])
      
      inline def setResponse_body_sizeUndefined: Self = StObject.set(x, "response_body_size", js.undefined)
      
      inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
      
      inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait XhrBreadcrumbHint extends StObject {
    
    var endTimestamp: Double
    
    var input: Any
    
    var startTimestamp: Double
    
    var xhr: Any
  }
  object XhrBreadcrumbHint {
    
    inline def apply(endTimestamp: Double, input: Any, startTimestamp: Double, xhr: Any): XhrBreadcrumbHint = {
      val __obj = js.Dynamic.literal(endTimestamp = endTimestamp.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[XhrBreadcrumbHint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XhrBreadcrumbHint] (val x: Self) extends AnyVal {
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
}
