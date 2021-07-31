package typings.sendgrid.mod.SendGrid

import org.scalablytyped.runtime.StringDictionary
import typings.sendgrid.sendgridStrings.DELETE
import typings.sendgrid.sendgridStrings.GET
import typings.sendgrid.sendgridStrings.PATCH
import typings.sendgrid.sendgridStrings.POST
import typings.sendgrid.sendgridStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rest {
  
  trait Request extends StObject {
    
    var body: js.UndefOr[String | js.Object] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String | Double]] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var method: GET | PATCH | POST | PUT | DELETE
    
    var path: String
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
  }
  object Request {
    
    @scala.inline
    def apply(method: GET | PATCH | POST | PUT | DELETE, path: String): Request = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String | Double]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setMethod(value: GET | PATCH | POST | PUT | DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var body: String
    
    var headers: String
    
    var statusCode: Double
  }
  object Response {
    
    @scala.inline
    def apply(body: String, headers: String, statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
