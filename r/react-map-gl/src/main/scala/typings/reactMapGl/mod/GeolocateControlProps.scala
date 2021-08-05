package typings.reactMapGl.mod

import typings.mapboxGl.mod.FitBoundsOptions
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocateControlProps
  extends StObject
     with BaseControlProps {
  
  var auto: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var onGeolocate: js.UndefOr[js.Function1[/* options */ PositionOptions, Unit]] = js.undefined
  
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.undefined
  
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.undefined
  
  var positionOptions: js.UndefOr[typings.mapboxGl.mod.PositionOptions] = js.undefined
  
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}
object GeolocateControlProps {
  
  inline def apply(): GeolocateControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocateControlProps]
  }
  
  extension [Self <: GeolocateControlProps](x: Self) {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFitBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    inline def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnGeolocate(value: /* options */ PositionOptions => Unit): Self = StObject.set(x, "onGeolocate", js.Any.fromFunction1(value))
    
    inline def setOnGeolocateUndefined: Self = StObject.set(x, "onGeolocate", js.undefined)
    
    inline def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    inline def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    inline def setOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1(value))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setPositionOptions(value: typings.mapboxGl.mod.PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
    
    inline def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
    
    inline def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
    
    inline def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
    
    inline def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
  }
}
