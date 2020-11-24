package typings.rxjs.ajaxObservableMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxError extends Error {
  
  /** @type {AjaxRequest} The AjaxRequest associated with the error */
  var request: AjaxRequest = js.native
  
  /** @type {string|ArrayBuffer|Document|object|any} The response data */
  var response: js.Any = js.native
  
  /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
  var responseType: String = js.native
  
  /** @type {number} The HTTP status code */
  var status: Double = js.native
  
  /** @type {XMLHttpRequest} The XHR instance associated with the error */
  var xhr: XMLHttpRequest = js.native
}
@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
@js.native
object AjaxError extends TopLevel[AjaxErrorCtor]
