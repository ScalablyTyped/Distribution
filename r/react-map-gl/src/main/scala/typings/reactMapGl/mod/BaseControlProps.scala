package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseControlProps extends StObject {
  
  var captureClick: js.UndefOr[Boolean] = js.native
  
  var captureDoubleClick: js.UndefOr[Boolean] = js.native
  
  var captureDrag: js.UndefOr[Boolean] = js.native
  
  var captureScroll: js.UndefOr[Boolean] = js.native
}
object BaseControlProps {
  
  @scala.inline
  def apply(): BaseControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseControlProps]
  }
  
  @scala.inline
  implicit class BaseControlPropsMutableBuilder[Self <: BaseControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureClick(value: Boolean): Self = StObject.set(x, "captureClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureClickUndefined: Self = StObject.set(x, "captureClick", js.undefined)
    
    @scala.inline
    def setCaptureDoubleClick(value: Boolean): Self = StObject.set(x, "captureDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureDoubleClickUndefined: Self = StObject.set(x, "captureDoubleClick", js.undefined)
    
    @scala.inline
    def setCaptureDrag(value: Boolean): Self = StObject.set(x, "captureDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureDragUndefined: Self = StObject.set(x, "captureDrag", js.undefined)
    
    @scala.inline
    def setCaptureScroll(value: Boolean): Self = StObject.set(x, "captureScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureScrollUndefined: Self = StObject.set(x, "captureScroll", js.undefined)
  }
}
