package typings.requestDebug

import typings.request.mod.CoreOptions
import typings.request.mod.Headers
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.requestDebug.requestDebugStrings.auth
import typings.requestDebug.requestDebugStrings.redirect
import typings.requestDebug.requestDebugStrings.request
import typings.requestDebug.requestDebugStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](request: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = ^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */](
    request: RequestAPI[TRequest, TOptions, TUriUrlOptions],
    cb: LogCallback[TRequest, TOptions, TUriUrlOptions]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(request.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("request-debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("request-debug", "log")
  @js.native
  val log: LogCallback[Request, CoreOptions, RequiredUriUrl] = js.native
  
  @js.native
  trait LogCallback[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions /* <: RequiredUriUrl */] extends StObject {
    
    def apply(`type`: redirect | auth, data: RedirectData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: LogPhase, data: LogData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: request, data: RequestData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
    def apply(`type`: response, data: ResponseData, r: RequestAPI[TRequest, TOptions, TUriUrlOptions]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.requestDebug.mod.RequestData
    - typings.requestDebug.mod.ResponseData
    - typings.requestDebug.mod.RedirectData
  */
  trait LogData extends StObject
  object LogData {
    
    inline def RedirectData(debugId: Double, headers: Headers, statusCode: Double, uri: String): typings.requestDebug.mod.RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.requestDebug.mod.RedirectData]
    }
    
    inline def RequestData(debugId: Double, headers: Headers, method: String, uri: String): typings.requestDebug.mod.RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.requestDebug.mod.RequestData]
    }
    
    inline def ResponseData(debugId: Double, headers: Headers, statusCode: Double): typings.requestDebug.mod.ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.requestDebug.mod.ResponseData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.requestDebug.requestDebugStrings.request
    - typings.requestDebug.requestDebugStrings.response
    - typings.requestDebug.requestDebugStrings.redirect
    - typings.requestDebug.requestDebugStrings.auth
  */
  trait LogPhase extends StObject
  object LogPhase {
    
    inline def auth: typings.requestDebug.requestDebugStrings.auth = "auth".asInstanceOf[typings.requestDebug.requestDebugStrings.auth]
    
    inline def redirect: typings.requestDebug.requestDebugStrings.redirect = "redirect".asInstanceOf[typings.requestDebug.requestDebugStrings.redirect]
    
    inline def request: typings.requestDebug.requestDebugStrings.request = "request".asInstanceOf[typings.requestDebug.requestDebugStrings.request]
    
    inline def response: typings.requestDebug.requestDebugStrings.response = "response".asInstanceOf[typings.requestDebug.requestDebugStrings.response]
  }
  
  trait RedirectData
    extends StObject
       with LogData {
    
    var debugId: Double
    
    var headers: Headers
    
    var statusCode: Double
    
    var uri: String
  }
  object RedirectData {
    
    inline def apply(debugId: Double, headers: Headers, statusCode: Double, uri: String): RedirectData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RedirectData]
    }
    
    extension [Self <: RedirectData](x: Self) {
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestData
    extends StObject
       with LogData {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var debugId: Double
    
    var headers: Headers
    
    var method: String
    
    var uri: String
  }
  object RequestData {
    
    inline def apply(debugId: Double, headers: Headers, method: String, uri: String): RequestData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseData
    extends StObject
       with LogData {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var debugId: Double
    
    var headers: Headers
    
    var statusCode: Double
  }
  object ResponseData {
    
    inline def apply(debugId: Double, headers: Headers, statusCode: Double): ResponseData = {
      val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseData]
    }
    
    extension [Self <: ResponseData](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDebugId(value: Double): Self = StObject.set(x, "debugId", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
