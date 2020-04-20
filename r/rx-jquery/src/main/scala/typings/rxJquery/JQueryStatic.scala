package typings.rxJquery

import typings.jquery.JQueryAjaxSettings
import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def ajaxAsObservable[T](settings: JQueryAjaxSettings): Observable[RxJQueryAjaxResult[T]]
  def getAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
  def getJSONAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]]
  def getScriptAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]]
  def postAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
}

object JQueryStatic {
  @scala.inline
  def apply(
    ajaxAsObservable: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[js.Any]],
    getAsObservable: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]],
    getJSONAsObservable: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]],
    getScriptAsObservable: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]],
    postAsObservable: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(ajaxAsObservable = js.Any.fromFunction1(ajaxAsObservable), getAsObservable = js.Any.fromFunction3(getAsObservable), getJSONAsObservable = js.Any.fromFunction2(getJSONAsObservable), getScriptAsObservable = js.Any.fromFunction2(getScriptAsObservable), postAsObservable = js.Any.fromFunction3(postAsObservable))
    __obj.asInstanceOf[JQueryStatic]
  }
}

