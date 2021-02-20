package typings.reactMapGl.mod

import typings.mapboxGl.mod.Anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupProps extends BaseControlProps {
  
  var altitude: js.UndefOr[Double] = js.native
  
  var anchor: js.UndefOr[Anchor] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var dynamicPosition: js.UndefOr[Boolean] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var offsetLeft: js.UndefOr[Double] = js.native
  
  var offsetTop: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var sortByDepth: js.UndefOr[Boolean] = js.native
  
  var tipSize: js.UndefOr[Double] = js.native
}
object PopupProps {
  
  @scala.inline
  def apply(latitude: Double, longitude: Double): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  
  @scala.inline
  implicit class PopupPropsMutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setDynamicPosition(value: Boolean): Self = StObject.set(x, "dynamicPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicPositionUndefined: Self = StObject.set(x, "dynamicPosition", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setSortByDepth(value: Boolean): Self = StObject.set(x, "sortByDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByDepthUndefined: Self = StObject.set(x, "sortByDepth", js.undefined)
    
    @scala.inline
    def setTipSize(value: Double): Self = StObject.set(x, "tipSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipSizeUndefined: Self = StObject.set(x, "tipSize", js.undefined)
  }
}
