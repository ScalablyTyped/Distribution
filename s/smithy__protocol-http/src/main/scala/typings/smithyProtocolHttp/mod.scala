package typings.smithyProtocolHttp

import typings.smithyProtocolHttp.distTypesFieldsMod.FieldsOptions
import typings.smithyProtocolHttp.distTypesHttpRequestMod.HttpRequestOptions
import typings.smithyProtocolHttp.distTypesHttpResponseMod.HttpResponseOptions
import typings.smithyTypes.distTypesHttpMod.FieldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@smithy/protocol-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@smithy/protocol-http", "Field")
  @js.native
  open class Field protected ()
    extends typings.smithyProtocolHttp.distTypesFieldMod.Field {
    def this(param0: FieldOptions) = this()
  }
  
  @JSImport("@smithy/protocol-http", "Fields")
  @js.native
  open class Fields protected ()
    extends typings.smithyProtocolHttp.distTypesFieldsMod.Fields {
    def this(param0: FieldsOptions) = this()
  }
  
  @JSImport("@smithy/protocol-http", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.smithyProtocolHttp.distTypesHttpRequestMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
  }
  /* static members */
  object HttpRequest {
    
    @JSImport("@smithy/protocol-http", "HttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(request: Any): /* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(request.asInstanceOf[js.Any]).asInstanceOf[/* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean]
  }
  
  @JSImport("@smithy/protocol-http", "HttpResponse")
  @js.native
  open class HttpResponse protected ()
    extends typings.smithyProtocolHttp.distTypesHttpResponseMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  object HttpResponse {
    
    @JSImport("@smithy/protocol-http", "HttpResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(response: Any): /* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @smithy/protocol-http.@smithy/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean]
  }
  
  inline def isValidHostname(hostname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
