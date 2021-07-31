package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControlProps
  extends StObject
     with BaseControlProps {
  
  var className: js.UndefOr[String] = js.undefined
  
  var compassLabel: js.UndefOr[String] = js.undefined
  
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  
  var showCompass: js.UndefOr[Boolean] = js.undefined
  
  var showZoom: js.UndefOr[Boolean] = js.undefined
  
  var zoomInLabel: js.UndefOr[String] = js.undefined
  
  var zoomOutLabel: js.UndefOr[String] = js.undefined
}
object NavigationControlProps {
  
  @scala.inline
  def apply(): NavigationControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlProps]
  }
  
  @scala.inline
  implicit class NavigationControlPropsMutableBuilder[Self <: NavigationControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompassLabel(value: String): Self = StObject.set(x, "compassLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompassLabelUndefined: Self = StObject.set(x, "compassLabel", js.undefined)
    
    @scala.inline
    def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setShowCompass(value: Boolean): Self = StObject.set(x, "showCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCompassUndefined: Self = StObject.set(x, "showCompass", js.undefined)
    
    @scala.inline
    def setShowZoom(value: Boolean): Self = StObject.set(x, "showZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZoomUndefined: Self = StObject.set(x, "showZoom", js.undefined)
    
    @scala.inline
    def setZoomInLabel(value: String): Self = StObject.set(x, "zoomInLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomInLabelUndefined: Self = StObject.set(x, "zoomInLabel", js.undefined)
    
    @scala.inline
    def setZoomOutLabel(value: String): Self = StObject.set(x, "zoomOutLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomOutLabelUndefined: Self = StObject.set(x, "zoomOutLabel", js.undefined)
  }
}
