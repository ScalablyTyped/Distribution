package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionRedirect extends StObject {
  
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  var port: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
    */
  var statusCode: String
}
object ListenerDefaultActionRedirect {
  
  @scala.inline
  def apply(statusCode: String): ListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionRedirect]
  }
  
  @scala.inline
  implicit class ListenerDefaultActionRedirectMutableBuilder[Self <: ListenerDefaultActionRedirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
