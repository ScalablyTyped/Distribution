package typings.sendgridRest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sendgrid-rest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sendgrid-rest", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(globalRequest: Request_) = this()
    
    /**
      * API is the main interface to the API.
      */
    def API(endpointRequest: Request_, callback: js.Function1[/* response */ Response, Unit]): Unit = js.native
    
    /**
      *  utility function to create an empty request object
      */
    def emptyRequest(): Request_ = js.native
  }
  
  @JSImport("sendgrid-rest", "emptyRequest")
  @js.native
  def emptyRequest: Request_ = js.native
  @scala.inline
  def emptyRequest_=(x: Request_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyRequest")(x.asInstanceOf[js.Any])
  
  @JSImport("sendgrid-rest", "request")
  @js.native
  def request: Request_ = js.native
  @scala.inline
  def request_=(x: Request_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  trait Request_ extends StObject {
    
    var body: js.Object | String
    
    var headers: StringDictionary[js.Any]
    
    var host: String
    
    var method: String
    
    var path: String
    
    var port: String
    
    var queryParams: StringDictionary[js.Any]
    
    var test: Boolean
  }
  object Request_ {
    
    @scala.inline
    def apply(
      body: js.Object | String,
      headers: StringDictionary[js.Any],
      host: String,
      method: String,
      path: String,
      port: String,
      queryParams: StringDictionary[js.Any],
      test: Boolean
    ): Request_ = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request_]
    }
    
    @scala.inline
    implicit class Request_MutableBuilder[Self <: Request_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var body: js.Object | String
    
    var headers: StringDictionary[js.Any]
    
    var statusCode: String
  }
  object Response {
    
    @scala.inline
    def apply(body: js.Object | String, headers: StringDictionary[js.Any], statusCode: String): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Object | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
