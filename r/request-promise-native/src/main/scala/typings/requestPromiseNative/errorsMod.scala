package typings.requestPromiseNative

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.requestPromiseNative.mod.FullResponse
import typings.requestPromiseNative.mod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  trait RequestError
    extends StObject
       with Error {
    
    var cause: js.Any
    
    var error: js.Any
    
    var options: Options
    
    var response: FullResponse
  }
  object RequestError {
    
    @JSImport("request-promise-native/errors", "RequestError")
    @js.native
    val ^ : RequestErrorConstructor = js.native
    
    extension [Self <: RequestError](x: Self) {
      
      inline def setCause(value: js.Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "RequestError")
  @js.native
  class RequestErrorCls protected ()
    extends StObject
       with RequestError {
    def this(cause: js.Any, options: Options, response: FullResponse) = this()
    
    /* CompleteClass */
    var cause: js.Any = js.native
    
    /* CompleteClass */
    var error: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: FullResponse = js.native
  }
  
  trait StatusCodeError
    extends StObject
       with Error {
    
    var error: js.Any
    
    var options: Options
    
    var response: FullResponse
    
    var statusCode: Double
  }
  object StatusCodeError {
    
    @JSImport("request-promise-native/errors", "StatusCodeError")
    @js.native
    val ^ : StatusCodeErrorConstructor = js.native
    
    extension [Self <: StatusCodeError](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "StatusCodeError")
  @js.native
  class StatusCodeErrorCls protected ()
    extends StObject
       with StatusCodeError {
    def this(statusCode: Double, body: js.Any, options: Options, response: FullResponse) = this()
    
    /* CompleteClass */
    var error: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: FullResponse = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait TransformError
    extends StObject
       with Error {
    
    var cause: js.Any
    
    var error: js.Any
    
    var options: Options
    
    var response: FullResponse
  }
  object TransformError {
    
    @JSImport("request-promise-native/errors", "TransformError")
    @js.native
    val ^ : TransformErrorConstructor = js.native
    
    extension [Self <: TransformError](x: Self) {
      
      inline def setCause(value: js.Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: FullResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise-native/errors", "TransformError")
  @js.native
  class TransformErrorCls protected ()
    extends StObject
       with TransformError {
    def this(cause: js.Any, options: Options, response: FullResponse) = this()
    
    /* CompleteClass */
    var cause: js.Any = js.native
    
    /* CompleteClass */
    var error: js.Any = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: FullResponse = js.native
  }
  
  @js.native
  trait RequestErrorConstructor
    extends StObject
       with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, RequestError] {
    
    def apply(cause: js.Any, options: Options, response: FullResponse): RequestError = js.native
  }
  
  @js.native
  trait StatusCodeErrorConstructor
    extends StObject
       with Error
       with Instantiable4[
          /* statusCode */ Double, 
          /* body */ js.Any, 
          /* options */ Options, 
          /* response */ FullResponse, 
          StatusCodeError
        ] {
    
    def apply(statusCode: Double, body: js.Any, options: Options, response: FullResponse): StatusCodeError = js.native
  }
  
  @js.native
  trait TransformErrorConstructor
    extends StObject
       with Error
       with Instantiable3[/* cause */ js.Any, /* options */ Options, /* response */ FullResponse, TransformError] {
    
    def apply(cause: js.Any, options: Options, response: FullResponse): TransformError = js.native
  }
}
