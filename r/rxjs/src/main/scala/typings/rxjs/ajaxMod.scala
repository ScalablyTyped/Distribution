package typings.rxjs

import typings.rxjs.ajaxObservableMod.AjaxCreationMethod
import typings.rxjs.ajaxObservableMod.AjaxErrorCtor
import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.rxjs.ajaxObservableMod.AjaxTimeoutErrorCtor
import typings.std.Event
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajaxMod {
  
  @JSImport("rxjs/ajax", "AjaxError")
  @js.native
  val AjaxError: AjaxErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/ajax", "AjaxError")
  @js.native
  class AjaxErrorCls protected ()
    extends StObject
       with typings.rxjs.ajaxObservableMod.AjaxError {
    def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/ajax", "AjaxResponse")
  @js.native
  class AjaxResponse protected ()
    extends typings.rxjs.ajaxObservableMod.AjaxResponse {
    def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  }
  
  @JSImport("rxjs/ajax", "AjaxTimeoutError")
  @js.native
  val AjaxTimeoutError: AjaxTimeoutErrorCtor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rxjs/ajax", "AjaxTimeoutError")
  @js.native
  class AjaxTimeoutErrorCls protected ()
    extends StObject
       with typings.rxjs.ajaxObservableMod.AjaxError {
    def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /** @type {AjaxRequest} The AjaxRequest associated with the error */
    /* CompleteClass */
    var request: AjaxRequest = js.native
    
    /** @type {string|ArrayBuffer|Document|object|any} The response data */
    /* CompleteClass */
    var response: js.Any = js.native
    
    /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
    /* CompleteClass */
    var responseType: String = js.native
    
    /** @type {number} The HTTP status code */
    /* CompleteClass */
    var status: Double = js.native
    
    /** @type {XMLHttpRequest} The XHR instance associated with the error */
    /* CompleteClass */
    var xhr: XMLHttpRequest = js.native
  }
  
  @JSImport("rxjs/ajax", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
}
