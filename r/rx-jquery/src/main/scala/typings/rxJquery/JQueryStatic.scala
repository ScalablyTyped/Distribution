package typings.rxJquery

import typings.jquery.JQueryAjaxSettings
import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  
  def ajaxAsObservable[T](settings: JQueryAjaxSettings): Observable[RxJQueryAjaxResult[T]] = js.native
  
  def getAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]] = js.native
  
  def getJSONAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]] = js.native
  
  def getScriptAsObservable[T](url: String, data: js.Any): Observable[RxJQueryAjaxResult[T]] = js.native
  
  def postAsObservable[T](url: String, data: js.Any, dataType: String): Observable[RxJQueryAjaxResult[T]] = js.native
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
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAjaxAsObservable(value: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[js.Any]]): Self = this.set("ajaxAsObservable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = this.set("getAsObservable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetJSONAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = this.set("getJSONAsObservable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScriptAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = this.set("getScriptAsObservable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = this.set("postAsObservable", js.Any.fromFunction3(value))
  }
}
