package typings.snazzyInfoWindow.mod

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindowOptions extends js.Object {
  
  /**
    * The color to use for the background of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * A custom border around the info window.
    * Set to false to completely remove the border.
    * The units used for border should be the same as pointer.
    * @example
    * border: {
    *   width: '10px',
    *   color: '#FF0000'
    * }
    */
  var border: js.UndefOr[Border | Boolean] = js.native
  
  /**
    * A custom CSS border radius property to specify the rounded corners of the info window.
    * @example '2px 20px'
    */
  var borderRadius: js.UndefOr[String] = js.native
  
  /**
    * All callbacks are optional and can access the info window instance via this.
    */
  var callbacks: js.UndefOr[Callbacks] = js.native
  
  /**
    * The text or DOM Element to replace the default close button.
    * No click handler or positioning is added to your markup if you use this option.
    */
  var closeButtonMarkup: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if the info window will close when the map is clicked.
    * An internal listener is added to the Google Maps click event which calls the close() method.
    * This will not activate on the Google Maps drag event when the user is panning the map.
    * @default true
    */
  var closeOnMapClick: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines if the info window will close when any other Snazzy Info Window is opened.
    * @default false
    */
  var closeWhenOthersOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * The text or DOM Element to insert into the info window body.
    */
  var content: js.UndefOr[String | HTMLElement] = js.native
  
  /**
    * The offset from the map edge in pixels which is used when panning an info window into view.
    *
    * @example
    * edgeOffset: {
    *   top: 20,
    *   right: 20,
    *   bottom: 20,
    *   left: 20
    * }
    */
  var edgeOffset: js.UndefOr[EdgeOffset] = js.native
  
  /**
    * The font color to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /**
    * The font size to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS font size value.
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * The Google Map associated to this info window.
    * Only required if you are not using a marker.
    */
  var map: js.UndefOr[Map[Element]] = js.native
  
  /**
    * The Google Maps marker associated to this info window.
    */
  var marker: js.UndefOr[Marker] = js.native
  
  /**
    * The max height in pixels of the info window.
    * @example 200
    */
  var maxHeight: js.UndefOr[Double] = js.native
  
  /**
    * The max width in pixels of the info window.
    * @example 200
    */
  var maxWidth: js.UndefOr[Double] = js.native
  
  /**
    * The offset from the marker.
    * This value should be different for each placement.
    * By default the offset is configured for the default Google Maps marker.
    *
    * @example
    * offset: {
    *   top: '10px',
    *   left: '20px'
    * }
    *
    */
  var offset: js.UndefOr[Offset] = js.native
  
  /**
    * Determines if the info window will open when the marker is clicked.
    * An internal listener is added to the Google Maps click event which calls the open() method.
    * @default true
    */
  var openOnMarkerClick: js.UndefOr[Boolean] = js.native
  
  /**
    * A custom padding size around the content of the info window.
    * Possible Values: Any valid CSS size value.
    * @example '10px', '2em', '5%'
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * Determines if the info window will be panned into view when opened.
    * @default true
    */
  var panOnOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Choose where you want the info window to be displayed, relative to the marker.
    */
  var placement: js.UndefOr[PlacementOptions] = js.native
  
  /**
    * The height of the pointer from the info window to the marker.
    * Set to false to completely remove the pointer.
    * The units used for pointer should be the same as border.
    * Possible Values: Any valid CSS size value.
    * @example '10px'
    */
  var pointer: js.UndefOr[String | Boolean] = js.native
  
  /**
    * The latitude and longitude where the info window is anchored.
    * The offset will default to 0px when using this option.
    * Only required if you are not using a marker.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  /**
    * The CSS properties for the shadow of the info window.
    * Set to false to completely remove the shadow.
    * @default
    * shadow: {
    *   h: '0px',
    *   v: '3px',
    *   blur: '6px',
    *   spread: '0px',
    *   opacity: 0.5,
    *   color: '#000'
    * }
    */
  var shadow: js.UndefOr[Shadow | Boolean] = js.native
  
  /**
    * Determines if the info window will show a close button.
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional CSS class to assign to the wrapper container of the info window.
    * Can be used for applying custom CSS to the info window.
    */
  var wrapperClass: js.UndefOr[String] = js.native
}
object InfoWindowOptions {
  
  @scala.inline
  def apply(): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfoWindowOptions]
  }
  
  @scala.inline
  implicit class InfoWindowOptionsOps[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: Border | Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setCallbacks(value: Callbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setCloseButtonMarkup(value: Boolean): Self = this.set("closeButtonMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButtonMarkup: Self = this.set("closeButtonMarkup", js.undefined)
    
    @scala.inline
    def setCloseOnMapClick(value: Boolean): Self = this.set("closeOnMapClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnMapClick: Self = this.set("closeOnMapClick", js.undefined)
    
    @scala.inline
    def setCloseWhenOthersOpen(value: Boolean): Self = this.set("closeWhenOthersOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseWhenOthersOpen: Self = this.set("closeWhenOthersOpen", js.undefined)
    
    @scala.inline
    def setContent(value: String | HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setEdgeOffset(value: EdgeOffset): Self = this.set("edgeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeOffset: Self = this.set("edgeOffset", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpenOnMarkerClick(value: Boolean): Self = this.set("openOnMarkerClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenOnMarkerClick: Self = this.set("openOnMarkerClick", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPanOnOpen(value: Boolean): Self = this.set("panOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanOnOpen: Self = this.set("panOnOpen", js.undefined)
    
    @scala.inline
    def setPlacement(value: PlacementOptions): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setPointer(value: String | Boolean): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShadow(value: Shadow | Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setWrapperClass(value: String): Self = this.set("wrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapperClass: Self = this.set("wrapperClass", js.undefined)
  }
}
