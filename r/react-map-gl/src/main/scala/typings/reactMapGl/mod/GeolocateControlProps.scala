package typings.reactMapGl.mod

import typings.mapboxGl.mod.FitBoundsOptions
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocateControlProps extends BaseControlProps {
  
  var auto: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var onGeolocate: js.UndefOr[js.Function1[/* options */ PositionOptions, Unit]] = js.native
  
  var onViewStateChange: js.UndefOr[ViewStateChangeHandler] = js.native
  
  var onViewportChange: js.UndefOr[ViewportChangeHandler] = js.native
  
  var positionOptions: js.UndefOr[typings.mapboxGl.mod.PositionOptions] = js.native
  
  var showUserLocation: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var trackUserLocation: js.UndefOr[Boolean] = js.native
}
object GeolocateControlProps {
  
  @scala.inline
  def apply(): GeolocateControlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocateControlProps]
  }
  
  @scala.inline
  implicit class GeolocateControlPropsMutableBuilder[Self <: GeolocateControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setFitBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitBoundsOptionsUndefined: Self = StObject.set(x, "fitBoundsOptions", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOnGeolocate(value: /* options */ PositionOptions => Unit): Self = StObject.set(x, "onGeolocate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGeolocateUndefined: Self = StObject.set(x, "onGeolocate", js.undefined)
    
    @scala.inline
    def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = StObject.set(x, "onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewStateChangeUndefined: Self = StObject.set(x, "onViewStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    @scala.inline
    def setPositionOptions(value: typings.mapboxGl.mod.PositionOptions): Self = StObject.set(x, "positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionOptionsUndefined: Self = StObject.set(x, "positionOptions", js.undefined)
    
    @scala.inline
    def setShowUserLocation(value: Boolean): Self = StObject.set(x, "showUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUserLocationUndefined: Self = StObject.set(x, "showUserLocation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTrackUserLocation(value: Boolean): Self = StObject.set(x, "trackUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUserLocationUndefined: Self = StObject.set(x, "trackUserLocation", js.undefined)
  }
}
