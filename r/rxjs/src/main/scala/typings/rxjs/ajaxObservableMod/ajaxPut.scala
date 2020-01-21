package typings.rxjs.ajaxObservableMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "ajaxPut")
@js.native
object ajaxPut extends js.Object {
  def apply(url: String): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
}

