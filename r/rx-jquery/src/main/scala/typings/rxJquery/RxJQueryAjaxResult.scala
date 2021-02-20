package typings.rxJquery

import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RxJQueryAjaxResult[T] extends StObject {
  
  var data: T = js.native
  
  var jqXHR: JQueryXHR = js.native
  
  var textStatus: String = js.native
}
object RxJQueryAjaxResult {
  
  @scala.inline
  def apply[T](data: T, jqXHR: JQueryXHR, textStatus: String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
  
  @scala.inline
  implicit class RxJQueryAjaxResultMutableBuilder[Self <: RxJQueryAjaxResult[_], T] (val x: Self with RxJQueryAjaxResult[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = StObject.set(x, "jqXHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStatus(value: String): Self = StObject.set(x, "textStatus", value.asInstanceOf[js.Any])
  }
}
