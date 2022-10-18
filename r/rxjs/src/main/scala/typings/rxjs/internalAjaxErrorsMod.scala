package typings.rxjs

import typings.rxjs.distTypesInternalAjaxErrorsMod.AjaxErrorCtor
import typings.rxjs.distTypesInternalAjaxErrorsMod.AjaxTimeoutErrorCtor
import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxRequest
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalAjaxErrorsMod {
  
  @JSImport("rxjs/internal/ajax/errors", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/ajax/errors", "AjaxError")
  @js.native
  open class AjaxErrorCls protected ()
    extends StObject
       with typings.rxjs.distTypesInternalAjaxErrorsMod.AjaxError {
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
  
  @JSImport("rxjs/internal/ajax/errors", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/internal/ajax/errors", "AjaxTimeoutError")
  @js.native
  open class AjaxTimeoutErrorCls protected ()
    extends StObject
       with typings.rxjs.distTypesInternalAjaxErrorsMod.AjaxError {
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
}
