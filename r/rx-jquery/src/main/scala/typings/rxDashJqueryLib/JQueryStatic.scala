package typings
package rxDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def ajaxAsObservable[T](settings: jqueryLib.JQueryAjaxSettings): rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[T]]
  def getAsObservable[T](url: java.lang.String, data: js.Any, dataType: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[T]]
  def getJSONAsObservable[T](url: java.lang.String, data: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[T]]
  def getScriptAsObservable[T](url: java.lang.String, data: js.Any): rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[T]]
  def postAsObservable[T](url: java.lang.String, data: js.Any, dataType: java.lang.String): rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[T]]
}

object JQueryStatic {
  @scala.inline
  def apply(
    ajaxAsObservable: jqueryLib.JQueryAjaxSettings => rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]],
    getAsObservable: (java.lang.String, js.Any, java.lang.String) => rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]],
    getJSONAsObservable: (java.lang.String, js.Any) => rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]],
    getScriptAsObservable: (java.lang.String, js.Any) => rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]],
    postAsObservable: (java.lang.String, js.Any, java.lang.String) => rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(ajaxAsObservable = js.Any.fromFunction1(ajaxAsObservable), getAsObservable = js.Any.fromFunction3(getAsObservable), getJSONAsObservable = js.Any.fromFunction2(getJSONAsObservable), getScriptAsObservable = js.Any.fromFunction2(getScriptAsObservable), postAsObservable = js.Any.fromFunction3(postAsObservable))
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

