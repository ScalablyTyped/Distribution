package typings.reactMapGl.mod

import typings.mapboxGl.mod.Anchor
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupProps
  extends StObject
     with BaseControlProps {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var anchor: js.UndefOr[Anchor] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var dynamicPosition: js.UndefOr[Boolean] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
  
  var offsetLeft: js.UndefOr[Double] = js.undefined
  
  var offsetTop: js.UndefOr[Double] = js.undefined
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var sortByDepth: js.UndefOr[Boolean] = js.undefined
  
  var tipSize: js.UndefOr[Double] = js.undefined
}
object PopupProps {
  
  inline def apply(latitude: Double, longitude: Double): PopupProps = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setDynamicPosition(value: Boolean): Self = StObject.set(x, "dynamicPosition", value.asInstanceOf[js.Any])
    
    inline def setDynamicPositionUndefined: Self = StObject.set(x, "dynamicPosition", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setSortByDepth(value: Boolean): Self = StObject.set(x, "sortByDepth", value.asInstanceOf[js.Any])
    
    inline def setSortByDepthUndefined: Self = StObject.set(x, "sortByDepth", js.undefined)
    
    inline def setTipSize(value: Double): Self = StObject.set(x, "tipSize", value.asInstanceOf[js.Any])
    
    inline def setTipSizeUndefined: Self = StObject.set(x, "tipSize", js.undefined)
  }
}
