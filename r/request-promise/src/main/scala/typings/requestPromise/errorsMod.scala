package typings.requestPromise

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.node.httpMod.IncomingMessage
import typings.requestPromise.mod.Options
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  trait RequestError
    extends StObject
       with Error {
    
    var error: Any
    
    @JSName("name")
    var name_RequestError: typings.requestPromise.requestPromiseStrings.RequestError
    
    var options: Options
    
    var response: IncomingMessage
  }
  object RequestError {
    
    @JSImport("request-promise/errors", "RequestError")
    @js.native
    val ^ : RequestErrorConstructor = js.native
    
    extension [Self <: RequestError](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: typings.requestPromise.requestPromiseStrings.RequestError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise/errors", "RequestError")
  @js.native
  open class RequestErrorCls protected ()
    extends StObject
       with RequestError {
    def this(cause: Any, options: Options, response: IncomingMessage) = this()
    
    /* CompleteClass */
    var error: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_RequestError: typings.requestPromise.requestPromiseStrings.RequestError = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: IncomingMessage = js.native
  }
  
  trait StatusCodeError
    extends StObject
       with Error {
    
    var error: Any
    
    @JSName("name")
    var name_StatusCodeError: typings.requestPromise.requestPromiseStrings.StatusCodeError
    
    var options: Options
    
    var response: IncomingMessage
    
    var statusCode: Double
  }
  object StatusCodeError {
    
    @JSImport("request-promise/errors", "StatusCodeError")
    @js.native
    val ^ : StatusCodeErrorConstructor = js.native
    
    extension [Self <: StatusCodeError](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: typings.requestPromise.requestPromiseStrings.StatusCodeError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise/errors", "StatusCodeError")
  @js.native
  open class StatusCodeErrorCls protected ()
    extends StObject
       with StatusCodeError {
    def this(statusCode: Double, body: Any, options: Options, response: IncomingMessage) = this()
    
    /* CompleteClass */
    var error: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_StatusCodeError: typings.requestPromise.requestPromiseStrings.StatusCodeError = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: IncomingMessage = js.native
    
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  trait TransformError
    extends StObject
       with Error {
    
    var error: Any
    
    @JSName("name")
    var name_TransformError: typings.requestPromise.requestPromiseStrings.TransformError
    
    var options: Options
    
    var response: IncomingMessage
  }
  object TransformError {
    
    @JSImport("request-promise/errors", "TransformError")
    @js.native
    val ^ : TransformErrorConstructor = js.native
    
    extension [Self <: TransformError](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setName(value: typings.requestPromise.requestPromiseStrings.TransformError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: IncomingMessage): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("request-promise/errors", "TransformError")
  @js.native
  open class TransformErrorCls protected ()
    extends StObject
       with TransformError {
    def this(cause: Any, options: Options, response: IncomingMessage) = this()
    
    /* CompleteClass */
    var error: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_TransformError: typings.requestPromise.requestPromiseStrings.TransformError = js.native
    
    /* CompleteClass */
    var options: Options = js.native
    
    /* CompleteClass */
    var response: IncomingMessage = js.native
  }
  
  @js.native
  trait RequestErrorConstructor
    extends StObject
       with Instantiable3[/* cause */ Any, /* options */ Options, /* response */ IncomingMessage, RequestError] {
    
    def apply(cause: Any, options: Options, response: IncomingMessage): RequestError = js.native
  }
  
  @js.native
  trait StatusCodeErrorConstructor
    extends StObject
       with Error
       with Instantiable4[
          /* statusCode */ Double, 
          /* body */ Any, 
          /* options */ Options, 
          /* response */ IncomingMessage, 
          StatusCodeError
        ] {
    
    def apply(statusCode: Double, body: Any, options: Options, response: IncomingMessage): StatusCodeError = js.native
  }
  
  @js.native
  trait TransformErrorConstructor
    extends StObject
       with Error
       with Instantiable3[/* cause */ Any, /* options */ Options, /* response */ IncomingMessage, TransformError] {
    
    def apply(cause: Any, options: Options, response: IncomingMessage): TransformError = js.native
  }
}
