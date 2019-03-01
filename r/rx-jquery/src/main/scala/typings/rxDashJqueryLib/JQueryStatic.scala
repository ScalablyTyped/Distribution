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
    ajaxAsObservable: js.Function1[
      jqueryLib.JQueryAjaxSettings, 
      rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
    ],
    getAsObservable: js.Function3[
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
    ],
    getJSONAsObservable: js.Function2[
      java.lang.String, 
      js.Any, 
      rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
    ],
    getScriptAsObservable: js.Function2[
      java.lang.String, 
      js.Any, 
      rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
    ],
    postAsObservable: js.Function3[
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      rxDashLiteDashAggregatesLib.RxNs.Observable[RxJQueryAjaxResult[js.Any]]
    ]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxAsObservable")(ajaxAsObservable)
    __obj.updateDynamic("getAsObservable")(getAsObservable)
    __obj.updateDynamic("getJSONAsObservable")(getJSONAsObservable)
    __obj.updateDynamic("getScriptAsObservable")(getScriptAsObservable)
    __obj.updateDynamic("postAsObservable")(postAsObservable)
    __obj.asInstanceOf[JQueryStatic]
  }
}

