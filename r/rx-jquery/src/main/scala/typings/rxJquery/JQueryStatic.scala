package typings.rxJquery

import typings.jquery.JQueryAjaxSettings
import typings.rx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
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
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAjaxAsObservable(value: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[js.Any]]): Self = StObject.set(x, "ajaxAsObservable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = StObject.set(x, "getAsObservable", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetJSONAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = StObject.set(x, "getJSONAsObservable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetScriptAsObservable(value: (String, js.Any) => Observable[RxJQueryAjaxResult[js.Any]]): Self = StObject.set(x, "getScriptAsObservable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPostAsObservable(value: (String, js.Any, String) => Observable[RxJQueryAjaxResult[js.Any]]): Self = StObject.set(x, "postAsObservable", js.Any.fromFunction3(value))
  }
}
