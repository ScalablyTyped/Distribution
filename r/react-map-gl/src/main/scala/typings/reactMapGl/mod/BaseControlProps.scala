package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseControlProps extends StObject {
  
  var captureClick: js.UndefOr[Boolean] = js.undefined
  
  var captureDoubleClick: js.UndefOr[Boolean] = js.undefined
  
  var captureDrag: js.UndefOr[Boolean] = js.undefined
  
  var captureScroll: js.UndefOr[Boolean] = js.undefined
}
object BaseControlProps {
  
  inline def apply(): BaseControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseControlProps]
  }
  
  extension [Self <: BaseControlProps](x: Self) {
    
    inline def setCaptureClick(value: Boolean): Self = StObject.set(x, "captureClick", value.asInstanceOf[js.Any])
    
    inline def setCaptureClickUndefined: Self = StObject.set(x, "captureClick", js.undefined)
    
    inline def setCaptureDoubleClick(value: Boolean): Self = StObject.set(x, "captureDoubleClick", value.asInstanceOf[js.Any])
    
    inline def setCaptureDoubleClickUndefined: Self = StObject.set(x, "captureDoubleClick", js.undefined)
    
    inline def setCaptureDrag(value: Boolean): Self = StObject.set(x, "captureDrag", value.asInstanceOf[js.Any])
    
    inline def setCaptureDragUndefined: Self = StObject.set(x, "captureDrag", js.undefined)
    
    inline def setCaptureScroll(value: Boolean): Self = StObject.set(x, "captureScroll", value.asInstanceOf[js.Any])
    
    inline def setCaptureScrollUndefined: Self = StObject.set(x, "captureScroll", js.undefined)
  }
}
