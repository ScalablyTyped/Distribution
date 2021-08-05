package typings.rxJquery

import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RxJQueryAjaxResult[T] extends StObject {
  
  var data: T
  
  var jqXHR: JQueryXHR
  
  var textStatus: String
}
object RxJQueryAjaxResult {
  
  inline def apply[T](data: T, jqXHR: JQueryXHR, textStatus: String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
  
  extension [Self <: RxJQueryAjaxResult[?], T](x: Self & RxJQueryAjaxResult[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    inline def setTextStatus(value: String): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
  }
}
