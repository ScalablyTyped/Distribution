package typings.rxjs.ajaxObservableMod

import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxResponse")
@js.native
class AjaxResponse protected () extends js.Object {
  def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
  var originalEvent: Event = js.native
  var request: AjaxRequest = js.native
  /** @type {string|ArrayBuffer|Document|object|any} The response data */
  var response: js.Any = js.native
  /** @type {string} The raw responseText */
  var responseText: String = js.native
  /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
  var responseType: String = js.native
  /** @type {number} The HTTP status code */
  var status: Double = js.native
  var xhr: XMLHttpRequest = js.native
}

