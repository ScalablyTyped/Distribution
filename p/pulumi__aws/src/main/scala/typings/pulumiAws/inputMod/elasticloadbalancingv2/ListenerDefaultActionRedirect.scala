package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDefaultActionRedirect extends StObject {
  
  /**
    * The hostname. This component is not percent-encoded. The hostname can contain `#{host}`. Defaults to `#{host}`.
    */
  var host: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The absolute path, starting with the leading "/". This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}. Defaults to `/#{path}`.
    */
  var path: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The port. Specify a value from `1` to `65535` or `#{port}`. Defaults to `#{port}`.
    */
  var port: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The protocol. Valid values are `HTTP`, `HTTPS`, or `#{protocol}`. Defaults to `#{protocol}`.
    */
  var protocol: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The query parameters, URL-encoded when necessary, but not percent-encoded. Do not include the leading "?". Defaults to `#{query}`.
    */
  var query: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The HTTP redirect code. The redirect is either permanent (`HTTP_301`) or temporary (`HTTP_302`).
    */
  var statusCode: Input[String]
}
object ListenerDefaultActionRedirect {
  
  inline def apply(statusCode: Input[String]): ListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionRedirect]
  }
  
  extension [Self <: ListenerDefaultActionRedirect](x: Self) {
    
    inline def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Input[String]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQuery(value: Input[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setStatusCode(value: Input[String]): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
