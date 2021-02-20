package typings.qIo

import org.scalablytyped.runtime.StringDictionary
import typings.q.mod.Promise
import typings.qIo.Qio.Reader
import typings.qIo.Qio.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QioHTTP {
  
  type Application = js.Function1[/* req */ Request, Promise[js.Any]]
  
  type Body = Stream
  
  type Headers = StringDictionary[js.Any]
  
  @js.native
  trait Request extends StObject {
    
    var agent: js.Any = js.native
    
    var body: js.Any = js.native
    
    var headers: Headers = js.native
    
    var host: String = js.native
    
    var method: String = js.native
    
    var node: js.Any = js.native
    
    var path: String = js.native
    
    var pathInfo: String = js.native
    
    var port: Double = js.native
    
    var remoteHost: String = js.native
    
    var remotePort: Double = js.native
    
    var scheme: String = js.native
    
    var scriptName: String = js.native
    
    var url: String = js.native
    
    var version: js.Array[String] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(
      agent: js.Any,
      body: js.Any,
      headers: Headers,
      host: String,
      method: String,
      node: js.Any,
      path: String,
      pathInfo: String,
      port: Double,
      remoteHost: String,
      remotePort: Double,
      scheme: String,
      scriptName: String,
      url: String,
      version: js.Array[String]
    ): Request = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathInfo = pathInfo.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathInfo(value: String): Self = StObject.set(x, "pathInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteHost(value: String): Self = StObject.set(x, "remoteHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var body: Reader = js.native
    
    var headers: Headers = js.native
    
    var node: js.Any = js.native
    
    def onclose(): Unit = js.native
    
    var status: Double = js.native
  }
  object Response {
    
    @scala.inline
    def apply(body: Reader, headers: Headers, node: js.Any, onclose: () => Unit, status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onclose = js.Any.fromFunction0(onclose), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Reader): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnclose(value: () => Unit): Self = StObject.set(x, "onclose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
