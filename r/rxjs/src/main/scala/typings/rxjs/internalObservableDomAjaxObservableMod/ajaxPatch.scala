package typings.rxjs.internalObservableDomAjaxObservableMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "ajaxPatch")
@js.native
object ajaxPatch extends js.Object {
  def apply(url: String): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
}

