package typings.snazzyInfoWindow.mod

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoWindowOptions extends js.Object {
  /**
    * The color to use for the background of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
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
  var border: js.UndefOr[Border | Boolean] = js.undefined
  /**
    * A custom CSS border radius property to specify the rounded corners of the info window.
    * @example '2px 20px'
    */
  var borderRadius: js.UndefOr[String] = js.undefined
  /**
    * All callbacks are optional and can access the info window instance via this.
    */
  var callbacks: js.UndefOr[Callbacks] = js.undefined
  /**
    * The text or DOM Element to replace the default close button.
    * No click handler or positioning is added to your markup if you use this option.
    */
  var closeButtonMarkup: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the info window will close when the map is clicked.
    * An internal listener is added to the Google Maps click event which calls the close() method.
    * This will not activate on the Google Maps drag event when the user is panning the map.
    * @default true
    */
  var closeOnMapClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if the info window will close when any other Snazzy Info Window is opened.
    * @default false
    */
  var closeWhenOthersOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * The text or DOM Element to insert into the info window body.
    */
  var content: js.UndefOr[String | HTMLElement] = js.undefined
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
  var edgeOffset: js.UndefOr[EdgeOffset] = js.undefined
  /**
    * The font color to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS color value.
    * @example '#FF0000', 'blue'
    */
  var fontColor: js.UndefOr[String] = js.undefined
  /**
    * The font size to use for the content inside the body of the info window.
    * Possible Values: Any valid CSS font size value.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  /**
    * The Google Map associated to this info window.
    * Only required if you are not using a marker.
    */
  var map: js.UndefOr[Map[Element]] = js.undefined
  /**
    * The Google Maps marker associated to this info window.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The max height in pixels of the info window.
    * @example 200
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * The max width in pixels of the info window.
    * @example 200
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
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
  var offset: js.UndefOr[Offset] = js.undefined
  /**
    * Determines if the info window will open when the marker is clicked.
    * An internal listener is added to the Google Maps click event which calls the open() method.
    * @default true
    */
  var openOnMarkerClick: js.UndefOr[Boolean] = js.undefined
  /**
    * A custom padding size around the content of the info window.
    * Possible Values: Any valid CSS size value.
    * @example '10px', '2em', '5%'
    */
  var padding: js.UndefOr[String] = js.undefined
  /**
    * Determines if the info window will be panned into view when opened.
    * @default true
    */
  var panOnOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose where you want the info window to be displayed, relative to the marker.
    */
  var placement: js.UndefOr[PlacementOptions] = js.undefined
  /**
    * The height of the pointer from the info window to the marker.
    * Set to false to completely remove the pointer.
    * The units used for pointer should be the same as border.
    * Possible Values: Any valid CSS size value.
    * @example '10px'
    */
  var pointer: js.UndefOr[String | Boolean] = js.undefined
  /**
    * The latitude and longitude where the info window is anchored.
    * The offset will default to 0px when using this option.
    * Only required if you are not using a marker.
    */
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
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
  var shadow: js.UndefOr[Shadow | Boolean] = js.undefined
  /**
    * Determines if the info window will show a close button.
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional CSS class to assign to the wrapper container of the info window.
    * Can be used for applying custom CSS to the info window.
    */
  var wrapperClass: js.UndefOr[String] = js.undefined
}

object InfoWindowOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: Border | Boolean = null,
    borderRadius: String = null,
    callbacks: Callbacks = null,
    closeButtonMarkup: js.UndefOr[Boolean] = js.undefined,
    closeOnMapClick: js.UndefOr[Boolean] = js.undefined,
    closeWhenOthersOpen: js.UndefOr[Boolean] = js.undefined,
    content: String | HTMLElement = null,
    edgeOffset: EdgeOffset = null,
    fontColor: String = null,
    fontSize: String = null,
    map: Map[Element] = null,
    marker: Marker = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    offset: Offset = null,
    openOnMarkerClick: js.UndefOr[Boolean] = js.undefined,
    padding: String = null,
    panOnOpen: js.UndefOr[Boolean] = js.undefined,
    placement: PlacementOptions = null,
    pointer: String | Boolean = null,
    position: LatLng | LatLngLiteral = null,
    shadow: Shadow | Boolean = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    wrapperClass: String = null
  ): InfoWindowOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButtonMarkup)) __obj.updateDynamic("closeButtonMarkup")(closeButtonMarkup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnMapClick)) __obj.updateDynamic("closeOnMapClick")(closeOnMapClick.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWhenOthersOpen)) __obj.updateDynamic("closeWhenOthersOpen")(closeWhenOthersOpen.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (edgeOffset != null) __obj.updateDynamic("edgeOffset")(edgeOffset.asInstanceOf[js.Any])
    if (fontColor != null) __obj.updateDynamic("fontColor")(fontColor.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(openOnMarkerClick)) __obj.updateDynamic("openOnMarkerClick")(openOnMarkerClick.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(panOnOpen)) __obj.updateDynamic("panOnOpen")(panOnOpen.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (wrapperClass != null) __obj.updateDynamic("wrapperClass")(wrapperClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoWindowOptions]
  }
}

