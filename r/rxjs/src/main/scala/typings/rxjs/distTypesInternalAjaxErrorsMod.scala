package typings.rxjs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxRequest
import typings.std.Error
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalAjaxErrorsMod {
  
  trait AjaxError
    extends StObject
       with Error {
    
    /**
      * The AjaxRequest associated with the error.
      */
    var request: AjaxRequest
    
    /**
      * The response data.
      */
    var response: Any
    
    /**
      * The responseType (e.g. 'json', 'arraybuffer', or 'xml').
      */
    var responseType: XMLHttpRequestResponseType
    
    /**
      * The HTTP status code, if the request has completed. If not,
      * it is set to `0`.
      */
    var status: Double
    
    /**
      * The XHR instance associated with the error.
      */
    var xhr: XMLHttpRequest
  }
  object AjaxError {
    
    @JSImport("rxjs/dist/types/internal/ajax/errors", "AjaxError")
    @js.native
    val ^ : AjaxErrorCtor = js.native
    
    extension [Self <: AjaxError](x: Self) {
      
      inline def setRequest(value: AjaxRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/ajax/errors", "AjaxError")
  @js.native
  open class AjaxErrorCls protected ()
    extends StObject
       with AjaxError {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The AjaxRequest associated with the error.
      */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /**
      * The response data.
      */
    /* CompleteClass */
    var response: Any = js.native
    
    /**
      * The responseType (e.g. 'json', 'arraybuffer', or 'xml').
      */
    /* CompleteClass */
    var responseType: XMLHttpRequestResponseType = js.native
    
    /**
      * The HTTP status code, if the request has completed. If not,
      * it is set to `0`.
      */
    /* CompleteClass */
    var status: Double = js.native
    
    /**
      * The XHR instance associated with the error.
      */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/dist/types/internal/ajax/errors", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  type AjaxTimeoutError = AjaxError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/dist/types/internal/ajax/errors", "AjaxTimeoutError")
  @js.native
  open class AjaxTimeoutErrorCls protected ()
    extends StObject
       with AjaxError {
    /**
      * @deprecated Internal implementation detail. Do not construct error instances.
      * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
      */
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * The AjaxRequest associated with the error.
      */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /**
      * The response data.
      */
    /* CompleteClass */
    var response: Any = js.native
    
    /**
      * The responseType (e.g. 'json', 'arraybuffer', or 'xml').
      */
    /* CompleteClass */
    var responseType: XMLHttpRequestResponseType = js.native
    
    /**
      * The HTTP status code, if the request has completed. If not,
      * it is set to `0`.
      */
    /* CompleteClass */
    var status: Double = js.native
    
    /**
      * The XHR instance associated with the error.
      */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @js.native
  trait AjaxErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable3[/* message */ String, /* xhr */ XMLHttpRequest, /* request */ AjaxRequest, AjaxError]
  
  @js.native
  trait AjaxTimeoutErrorCtor
    extends StObject
       with /**
    * @deprecated Internal implementation detail. Do not construct error instances.
    * Cannot be tagged as internal: https://github.com/ReactiveX/rxjs/issues/6269
    */
  Instantiable2[
          /* xhr */ XMLHttpRequest, 
          /* request */ AjaxRequest, 
          typings.rxjs.distTypesInternalAjaxErrorsMod.AjaxTimeoutError
        ]
}
