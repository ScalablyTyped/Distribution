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

