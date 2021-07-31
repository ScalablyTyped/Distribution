package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusNavigationEventInit
  extends StObject
     with EventInit {
  
  var navigationReason: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var originHeight: js.UndefOr[Double] = js.undefined
  
  var originLeft: js.UndefOr[Double] = js.undefined
  
  var originTop: js.UndefOr[Double] = js.undefined
  
  var originWidth: js.UndefOr[Double] = js.undefined
}
object FocusNavigationEventInit {
  
  @scala.inline
  def apply(): FocusNavigationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusNavigationEventInit]
  }
  
  @scala.inline
  implicit class FocusNavigationEventInitMutableBuilder[Self <: FocusNavigationEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigationReason(value: java.lang.String): Self = StObject.set(x, "navigationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationReasonNull: Self = StObject.set(x, "navigationReason", null)
    
    @scala.inline
    def setNavigationReasonUndefined: Self = StObject.set(x, "navigationReason", js.undefined)
    
    @scala.inline
    def setOriginHeight(value: Double): Self = StObject.set(x, "originHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginHeightUndefined: Self = StObject.set(x, "originHeight", js.undefined)
    
    @scala.inline
    def setOriginLeft(value: Double): Self = StObject.set(x, "originLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginLeftUndefined: Self = StObject.set(x, "originLeft", js.undefined)
    
    @scala.inline
    def setOriginTop(value: Double): Self = StObject.set(x, "originTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginTopUndefined: Self = StObject.set(x, "originTop", js.undefined)
    
    @scala.inline
    def setOriginWidth(value: Double): Self = StObject.set(x, "originWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginWidthUndefined: Self = StObject.set(x, "originWidth", js.undefined)
  }
}
