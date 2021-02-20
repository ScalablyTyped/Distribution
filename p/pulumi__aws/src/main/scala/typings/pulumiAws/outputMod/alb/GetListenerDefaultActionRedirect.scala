package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetListenerDefaultActionRedirect extends StObject {
  
  var host: String = js.native
  
  var path: String = js.native
  
  /**
    * The port of the listener. Required if `arn` is not set.
    */
  var port: String = js.native
  
  var protocol: String = js.native
  
  var query: String = js.native
  
  var statusCode: String = js.native
}
object GetListenerDefaultActionRedirect {
  
  @scala.inline
  def apply(host: String, path: String, port: String, protocol: String, query: String, statusCode: String): GetListenerDefaultActionRedirect = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListenerDefaultActionRedirect]
  }
  
  @scala.inline
  implicit class GetListenerDefaultActionRedirectMutableBuilder[Self <: GetListenerDefaultActionRedirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
