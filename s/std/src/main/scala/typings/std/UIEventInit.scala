package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIEventInit
  extends StObject
     with EventInit {
  
  var detail: js.UndefOr[Double] = js.undefined
  
  var view: js.UndefOr[Window | Null] = js.undefined
}
object UIEventInit {
  
  @scala.inline
  def apply(): UIEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIEventInit]
  }
  
  @scala.inline
  implicit class UIEventInitMutableBuilder[Self <: UIEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    @scala.inline
    def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewNull: Self = StObject.set(x, "view", null)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
