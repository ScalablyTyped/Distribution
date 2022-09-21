package typings.rxJquery

import typings.jquery.JQueryAjaxSettings
import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def ajaxAsObservable[T](settings: JQueryAjaxSettings): Observable[RxJQueryAjaxResult[T]]
  
  def getAsObservable[T](url: String, data: Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
  
  def getJSONAsObservable[T](url: String, data: Any): Observable[RxJQueryAjaxResult[T]]
  
  def getScriptAsObservable[T](url: String, data: Any): Observable[RxJQueryAjaxResult[T]]
  
  def postAsObservable[T](url: String, data: Any, dataType: String): Observable[RxJQueryAjaxResult[T]]
}
object JQueryStatic {
  
  inline def apply(
    ajaxAsObservable: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[Any]],
    getAsObservable: (String, Any, String) => Observable[RxJQueryAjaxResult[Any]],
    getJSONAsObservable: (String, Any) => Observable[RxJQueryAjaxResult[Any]],
    getScriptAsObservable: (String, Any) => Observable[RxJQueryAjaxResult[Any]],
    postAsObservable: (String, Any, String) => Observable[RxJQueryAjaxResult[Any]]
  ): JQueryStatic = {
    val __obj = js.Dynamic.literal(ajaxAsObservable = js.Any.fromFunction1(ajaxAsObservable), getAsObservable = js.Any.fromFunction3(getAsObservable), getJSONAsObservable = js.Any.fromFunction2(getJSONAsObservable), getScriptAsObservable = js.Any.fromFunction2(getScriptAsObservable), postAsObservable = js.Any.fromFunction3(postAsObservable))
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setAjaxAsObservable(value: JQueryAjaxSettings => Observable[RxJQueryAjaxResult[Any]]): Self = StObject.set(x, "ajaxAsObservable", js.Any.fromFunction1(value))
    
    inline def setGetAsObservable(value: (String, Any, String) => Observable[RxJQueryAjaxResult[Any]]): Self = StObject.set(x, "getAsObservable", js.Any.fromFunction3(value))
    
    inline def setGetJSONAsObservable(value: (String, Any) => Observable[RxJQueryAjaxResult[Any]]): Self = StObject.set(x, "getJSONAsObservable", js.Any.fromFunction2(value))
    
    inline def setGetScriptAsObservable(value: (String, Any) => Observable[RxJQueryAjaxResult[Any]]): Self = StObject.set(x, "getScriptAsObservable", js.Any.fromFunction2(value))
    
    inline def setPostAsObservable(value: (String, Any, String) => Observable[RxJQueryAjaxResult[Any]]): Self = StObject.set(x, "postAsObservable", js.Any.fromFunction3(value))
  }
}
