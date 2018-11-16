package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod.SnazzyInfoWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InfoWindowOptions extends js.Object {
  /**
           * The color to use for the background of the info window.
           * Possible Values: Any valid CSS color value.
           * @example '#FF0000', 'blue'
           */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
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
  var border: js.UndefOr[Border | scala.Boolean] = js.undefined
  /**
           * A custom CSS border radius property to specify the rounded corners of the info window.
           * @example '2px 20px'
           */
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  /**
           * All callbacks are optional and can access the info window instance via this.
           */
  var callbacks: js.UndefOr[Callbacks] = js.undefined
  /**
           * The text or DOM Element to replace the default close button.
           * No click handler or positioning is added to your markup if you use this option.
           */
  var closeButtonMarkup: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Determines if the info window will close when the map is clicked.
           * An internal listener is added to the Google Maps click event which calls the close() method.
           * This will not activate on the Google Maps drag event when the user is panning the map.
           * @default true
           */
  var closeOnMapClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Determines if the info window will close when any other Snazzy Info Window is opened.
           * @default false
           */
  var closeWhenOthersOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The text or DOM Element to insert into the info window body.
           */
  var content: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
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
  var fontColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The font size to use for the content inside the body of the info window.
           * Possible Values: Any valid CSS font size value.
           */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The Google Map associated to this info window.
           * Only required if you are not using a marker.
           */
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  /**
           * The Google Maps marker associated to this info window.
           */
  var marker: js.UndefOr[googlemapsLib.googleNs.mapsNs.Marker] = js.undefined
  /**
           * The max height in pixels of the info window.
           * @example 200
           */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
           * The max width in pixels of the info window.
           * @example 200
           */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
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
  var openOnMarkerClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A custom padding size around the content of the info window.
           * Possible Values: Any valid CSS size value.
           * @example '10px', '2em', '5%'
           */
  var padding: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Determines if the info window will be panned into view when opened.
           * @default true
           */
  var panOnOpen: js.UndefOr[scala.Boolean] = js.undefined
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
  var pointer: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * The latitude and longitude where the info window is anchored.
           * The offset will default to 0px when using this option.
           * Only required if you are not using a marker.
           */
  var position: js.UndefOr[
    googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral
  ] = js.undefined
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
  var shadow: js.UndefOr[Shadow | scala.Boolean] = js.undefined
  /**
           * Determines if the info window will show a close button.
           * @default true
           */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An optional CSS class to assign to the wrapper container of the info window.
           * Can be used for applying custom CSS to the info window.
           */
  var wrapperClass: js.UndefOr[java.lang.String] = js.undefined
}

