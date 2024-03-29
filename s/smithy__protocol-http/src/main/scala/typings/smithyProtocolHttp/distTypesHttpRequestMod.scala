package typings.smithyProtocolHttp

import typings.smithyTypes.distTypesHttpMod.HeaderBag
import typings.smithyTypes.distTypesHttpMod.QueryParameterBag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHttpRequestMod {
  
  @JSImport("@smithy/protocol-http/dist-types/httpRequest", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends StObject
       with typings.smithyTypes.distTypesHttpMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
    
    /* CompleteClass */
    var headers: HeaderBag = js.native
    
    /* CompleteClass */
    var hostname: String = js.native
    
    /* CompleteClass */
    var method: String = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var protocol: String = js.native
  }
  /* static members */
  object HttpRequest {
    
    @JSImport("@smithy/protocol-http/dist-types/httpRequest", "HttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(request: Any): /* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(request.asInstanceOf[js.Any]).asInstanceOf[/* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean]
  }
  
  /* Inlined std.Partial<@smithy/types.@smithy/types.HttpMessage> & std.Partial<@smithy/types.@smithy/types.URI> & {  method :string | undefined} */
  trait HttpRequestOptions extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[HeaderBag] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[QueryParameterBag] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object HttpRequestOptions {
    
    inline def apply(): HttpRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
