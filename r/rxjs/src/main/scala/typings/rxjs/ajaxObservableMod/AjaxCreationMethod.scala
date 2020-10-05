package typings.rxjs.ajaxObservableMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxCreationMethod extends js.Object {
  def apply(urlOrRequest: String): Observable[AjaxResponse] = js.native
  def apply(urlOrRequest: AjaxRequest): Observable[AjaxResponse] = js.native
  def delete(url: String): Observable[AjaxResponse] = js.native
  def delete(url: String, headers: js.Object): Observable[AjaxResponse] = js.native
  def get(url: String): Observable[AjaxResponse] = js.native
  def get(url: String, headers: js.Object): Observable[AjaxResponse] = js.native
  def getJSON[T](url: String): Observable[T] = js.native
  def getJSON[T](url: String, headers: js.Object): Observable[T] = js.native
  def patch(url: String): Observable[AjaxResponse] = js.native
  def patch(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[AjaxResponse] = js.native
  def patch(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def patch(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
  def post(url: String): Observable[AjaxResponse] = js.native
  def post(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[AjaxResponse] = js.native
  def post(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def post(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
  def put(url: String): Observable[AjaxResponse] = js.native
  def put(url: String, body: js.UndefOr[scala.Nothing], headers: js.Object): Observable[AjaxResponse] = js.native
  def put(url: String, body: js.Any): Observable[AjaxResponse] = js.native
  def put(url: String, body: js.Any, headers: js.Object): Observable[AjaxResponse] = js.native
}

