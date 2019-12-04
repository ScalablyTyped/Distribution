package typings.rxjs.internalObservableDomAjaxObservableMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "ajaxGetJSON")
@js.native
object ajaxGetJSON extends js.Object {
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, headers: js.Object): Observable[T] = js.native
}

