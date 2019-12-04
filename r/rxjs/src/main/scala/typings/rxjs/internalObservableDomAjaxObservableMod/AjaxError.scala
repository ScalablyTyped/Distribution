package typings.rxjs.internalObservableDomAjaxObservableMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxError extends Error {
  /** @type {AjaxRequest} The AjaxRequest associated with the error */
  var request: AjaxRequest
  /** @type {string|ArrayBuffer|Document|object|any} The response data */
  var response: js.Any
  /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
  var responseType: String
  /** @type {number} The HTTP status code */
  var status: Double
  /** @type {XMLHttpRequest} The XHR instance associated with the error */
  var xhr: XMLHttpRequest
}

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
@js.native
object AjaxError extends TopLevel[AjaxErrorCtor]

