package typings.sentryTypes

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInstrumentMod {
  
  trait HandlerDataFetch extends StObject {
    
    var args: js.Array[Any]
    
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    var fetchData: SentryFetchData
    
    var response: js.UndefOr[Any] = js.undefined
    
    var startTimestamp: Double
  }
  object HandlerDataFetch {
    
    inline def apply(args: js.Array[Any], fetchData: SentryFetchData, startTimestamp: Double): HandlerDataFetch = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], fetchData = fetchData.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerDataFetch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerDataFetch] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setFetchData(value: SentryFetchData): Self = StObject.set(x, "fetchData", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandlerDataXhr extends StObject {
    
    var args: js.Tuple2[String, String]
    
    var endTimestamp: js.UndefOr[Double] = js.undefined
    
    var startTimestamp: js.UndefOr[Double] = js.undefined
    
    var xhr: SentryWrappedXMLHttpRequest
  }
  object HandlerDataXhr {
    
    inline def apply(args: js.Tuple2[String, String], xhr: SentryWrappedXMLHttpRequest): HandlerDataXhr = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerDataXhr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandlerDataXhr] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Tuple2[String, String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      inline def setXhr(value: SentryWrappedXMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryFetchData extends StObject {
    
    var method: String
    
    var request_body_size: js.UndefOr[Double] = js.undefined
    
    var response_body_size: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object SentryFetchData {
    
    inline def apply(method: String, url: String): SentryFetchData = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryFetchData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentryFetchData] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_size(value: Double): Self = StObject.set(x, "request_body_size", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_sizeUndefined: Self = StObject.set(x, "request_body_size", js.undefined)
      
      inline def setResponse_body_size(value: Double): Self = StObject.set(x, "response_body_size", value.asInstanceOf[js.Any])
      
      inline def setResponse_body_sizeUndefined: Self = StObject.set(x, "response_body_size", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SentryWrappedXMLHttpRequest extends StObject {
    
    var __sentry_own_request__ : js.UndefOr[Boolean] = js.undefined
    
    var __sentry_xhr_v2__ : js.UndefOr[SentryXhrData] = js.undefined
  }
  object SentryWrappedXMLHttpRequest {
    
    inline def apply(): SentryWrappedXMLHttpRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentryWrappedXMLHttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentryWrappedXMLHttpRequest] (val x: Self) extends AnyVal {
      
      inline def set__sentry_own_request__(value: Boolean): Self = StObject.set(x, "__sentry_own_request__", value.asInstanceOf[js.Any])
      
      inline def set__sentry_own_request__Undefined: Self = StObject.set(x, "__sentry_own_request__", js.undefined)
      
      inline def set__sentry_xhr_v2__(value: SentryXhrData): Self = StObject.set(x, "__sentry_xhr_v2__", value.asInstanceOf[js.Any])
      
      inline def set__sentry_xhr_v2__Undefined: Self = StObject.set(x, "__sentry_xhr_v2__", js.undefined)
    }
  }
  
  trait SentryXhrData extends StObject {
    
    var body: js.UndefOr[XHRSendInput] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var request_body_size: js.UndefOr[Double] = js.undefined
    
    var request_headers: Record[String, String]
    
    var response_body_size: js.UndefOr[Double] = js.undefined
    
    var status_code: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object SentryXhrData {
    
    inline def apply(request_headers: Record[String, String]): SentryXhrData = {
      val __obj = js.Dynamic.literal(request_headers = request_headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SentryXhrData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentryXhrData] (val x: Self) extends AnyVal {
      
      inline def setBody(value: XHRSendInput): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRequest_body_size(value: Double): Self = StObject.set(x, "request_body_size", value.asInstanceOf[js.Any])
      
      inline def setRequest_body_sizeUndefined: Self = StObject.set(x, "request_body_size", js.undefined)
      
      inline def setRequest_headers(value: Record[String, String]): Self = StObject.set(x, "request_headers", value.asInstanceOf[js.Any])
      
      inline def setResponse_body_size(value: Double): Self = StObject.set(x, "response_body_size", value.asInstanceOf[js.Any])
      
      inline def setResponse_body_sizeUndefined: Self = StObject.set(x, "response_body_size", js.undefined)
      
      inline def setStatus_code(value: Double): Self = StObject.set(x, "status_code", value.asInstanceOf[js.Any])
      
      inline def setStatus_codeUndefined: Self = StObject.set(x, "status_code", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type XHRSendInput = Any
}
