package typings.scalewayFunctions

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | String | Null], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  
  trait Context extends StObject {
    
    var functionName: String
    
    var functionVersion: String
    
    var memoryLimitInMb: Double
  }
  object Context {
    
    inline def apply(functionName: String, functionVersion: String, memoryLimitInMb: Double): Context = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], memoryLimitInMb = memoryLimitInMb.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersion(value: String): Self = StObject.set(x, "functionVersion", value.asInstanceOf[js.Any])
      
      inline def setMemoryLimitInMb(value: Double): Self = StObject.set(x, "memoryLimitInMb", value.asInstanceOf[js.Any])
    }
  }
  
  trait Event extends StObject {
    
    var body: String
    
    var headers: Record[String, String]
    
    var httpMethod: String
    
    var isBase64Encoded: Boolean
    
    var path: String
    
    var queryStringParameters: Record[String, String]
    
    var requestContext: RequestContext
    
    var stageVariables: Record[String, String]
  }
  object Event {
    
    inline def apply(
      body: String,
      headers: Record[String, String],
      httpMethod: String,
      isBase64Encoded: Boolean,
      path: String,
      queryStringParameters: Record[String, String],
      requestContext: RequestContext,
      stageVariables: Record[String, String]
    ): Event = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], isBase64Encoded = isBase64Encoded.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryStringParameters = queryStringParameters.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], stageVariables = stageVariables.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQueryStringParameters(value: Record[String, String]): Self = StObject.set(x, "queryStringParameters", value.asInstanceOf[js.Any])
      
      inline def setRequestContext(value: RequestContext): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
      
      inline def setStageVariables(value: Record[String, String]): Self = StObject.set(x, "stageVariables", value.asInstanceOf[js.Any])
    }
  }
  
  type Handler[TResult] = js.Function3[
    /* event */ Event, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | TResult | js.Promise[TResult]
  ]
  
  trait RequestContext extends StObject {
    
    var httpMethod: String
    
    var stage: String
  }
  object RequestContext {
    
    inline def apply(httpMethod: String, stage: String): RequestContext = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestContext] (val x: Self) extends AnyVal {
      
      inline def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Response extends StObject {
    
    var body: js.UndefOr[String | js.Object] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var isBase64Encoded: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: Double
  }
  object Response {
    
    inline def apply(statusCode: Double): Response = {
      val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String | js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsBase64Encoded(value: Boolean): Self = StObject.set(x, "isBase64Encoded", value.asInstanceOf[js.Any])
      
      inline def setIsBase64EncodedUndefined: Self = StObject.set(x, "isBase64Encoded", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
