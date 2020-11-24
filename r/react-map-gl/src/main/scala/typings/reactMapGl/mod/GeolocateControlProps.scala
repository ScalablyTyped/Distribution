package typings.reactMapGl.mod

import typings.mapboxGl.mod.FitBoundsOptions
import typings.react.mod.CSSProperties
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
  implicit class GeolocateControlPropsOps[Self <: GeolocateControlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFitBoundsOptions(value: FitBoundsOptions): Self = this.set("fitBoundsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitBoundsOptions: Self = this.set("fitBoundsOptions", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnGeolocate(value: /* options */ PositionOptions => Unit): Self = this.set("onGeolocate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGeolocate: Self = this.set("onGeolocate", js.undefined)
    
    @scala.inline
    def setOnViewStateChange(value: /* info */ ViewStateChangeInfo => Unit): Self = this.set("onViewStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewStateChange: Self = this.set("onViewStateChange", js.undefined)
    
    @scala.inline
    def setOnViewportChange(value: /* viewState */ ViewportProps => Unit): Self = this.set("onViewportChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewportChange: Self = this.set("onViewportChange", js.undefined)
    
    @scala.inline
    def setPositionOptions(value: typings.mapboxGl.mod.PositionOptions): Self = this.set("positionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionOptions: Self = this.set("positionOptions", js.undefined)
    
    @scala.inline
    def setShowUserLocation(value: Boolean): Self = this.set("showUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowUserLocation: Self = this.set("showUserLocation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTrackUserLocation(value: Boolean): Self = this.set("trackUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackUserLocation: Self = this.set("trackUserLocation", js.undefined)
  }
}
