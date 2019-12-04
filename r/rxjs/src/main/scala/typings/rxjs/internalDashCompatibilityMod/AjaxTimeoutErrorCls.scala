package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxTimeoutError")
@js.native
class AjaxTimeoutErrorCls protected ()
  extends typings.rxjs.internalObservableDomAjaxObservableMod.AjaxError {
  def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /** @type {AjaxRequest} The AjaxRequest associated with the error */
  /* CompleteClass */
  override var request: AjaxRequest = js.native
  /** @type {string|ArrayBuffer|Document|object|any} The response data */
  /* CompleteClass */
  override var response: js.Any = js.native
  /** @type {string} The responseType (e.g. 'json', 'arraybuffer', or 'xml') */
  /* CompleteClass */
  override var responseType: String = js.native
  /** @type {number} The HTTP status code */
  /* CompleteClass */
  override var status: Double = js.native
  /** @type {XMLHttpRequest} The XHR instance associated with the error */
  /* CompleteClass */
  override var xhr: XMLHttpRequest = js.native
}

