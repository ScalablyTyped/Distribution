package typings.rxjs.ajaxObservableMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "ajaxPatch")
@js.native
object ajaxPatch extends js.Object {
  def apply(url: String): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def apply(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
}

