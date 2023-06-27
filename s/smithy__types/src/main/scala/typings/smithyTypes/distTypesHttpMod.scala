package typings.smithyTypes

import typings.smithyTypes.distTypesAbortMod.AbortSignal
import typings.smithyTypes.distTypesUriMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHttpMod {
  
  @js.native
  sealed trait FieldPosition extends StObject
  @JSImport("@smithy/types/dist-types/http", "FieldPosition")
  @js.native
  object FieldPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FieldPosition & Double] = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with FieldPosition
    /* 0 */ val HEADER: typings.smithyTypes.distTypesHttpMod.FieldPosition.HEADER & Double = js.native
    
    @js.native
    sealed trait TRAILER
      extends StObject
         with FieldPosition
    /* 1 */ val TRAILER: typings.smithyTypes.distTypesHttpMod.FieldPosition.TRAILER & Double = js.native
  }
  
  trait Endpoint extends StObject {
    
    var hostname: String
    
    var path: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
  }
  object Endpoint {
    
    inline def apply(hostname: String, path: String, protocol: String): Endpoint = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait FieldOptions extends StObject {
    
    var kind: js.UndefOr[FieldPosition] = js.undefined
    
    var name: String
    
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object FieldOptions {
    
    inline def apply(name: String): FieldOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldOptions] (val x: Self) extends AnyVal {
      
      inline def setKind(value: FieldPosition): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type HeaderBag = Record[String, String]
  
  trait HttpHandlerOptions extends StObject {
    
    var abortSignal: js.UndefOr[AbortSignal] = js.undefined
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object HttpHandlerOptions {
    
    inline def apply(): HttpHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpHandlerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpHandlerOptions] (val x: Self) extends AnyVal {
      
      inline def setAbortSignal(value: AbortSignal): Self = StObject.set(x, "abortSignal", value.asInstanceOf[js.Any])
      
      inline def setAbortSignalUndefined: Self = StObject.set(x, "abortSignal", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
  
  trait HttpMessage extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: HeaderBag
  }
  object HttpMessage {
    
    inline def apply(headers: HeaderBag): HttpMessage = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpMessage] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpRequest
    extends StObject
       with HttpMessage
       with URI {
    
    var method: String
  }
  object HttpRequest {
    
    inline def apply(headers: HeaderBag, hostname: String, method: String, path: String, protocol: String): HttpRequest = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpResponse
    extends StObject
       with HttpMessage {
    
    var statusCode: Double
  }
  object HttpResponse {
    
    inline def apply(headers: HeaderBag, statusCode: Double): HttpResponse = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryParameterBag = Record[String, String | js.Array[String] | Null]
}
