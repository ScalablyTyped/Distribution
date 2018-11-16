package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapViewProps extends ViewProps {
  /**
       * Map annotations with title/subtitle.
       */
  var annotations: js.UndefOr[js.Array[MapViewAnnotation]] = js.undefined
  /**
       * If true the map will follow the user's location whenever it changes.
       * Note that this has no effect unless showsUserLocation is enabled.
       * Default value is true.
       */
  var followUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Insets for the map's legal label, originally at bottom left of the map. See EdgeInsetsPropType.js for more information.
       */
  var legalLabelInsets: js.UndefOr[Insets] = js.undefined
  /**
       * The map type to be displayed.
       *     standard: standard road map (default)
       *     satellite: satellite view
       *     hybrid: satellite view with roads and points of interest overlayed
       *
       * enum('standard', 'satellite', 'hybrid')
       */
  var mapType: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.standard | reactDashNativeLib.reactDashNativeLibStrings.satellite | reactDashNativeLib.reactDashNativeLibStrings.hybrid
  ] = js.undefined
  /**
       * Maximum size of area that can be displayed.
       */
  var maxDelta: js.UndefOr[scala.Double] = js.undefined
  /**
       * Minimum size of area that can be displayed.
       */
  var minDelta: js.UndefOr[scala.Double] = js.undefined
  /**
       * Callback that is called once, when the user taps an annotation.
       */
  var onAnnotationPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback that is called continuously when the user is dragging the map.
       */
  var onRegionChange: js.UndefOr[js.Function1[/* region */ MapViewRegion, scala.Unit]] = js.undefined
  /**
       * Callback that is called once, when the user is done moving the map.
       */
  var onRegionChangeComplete: js.UndefOr[js.Function1[/* region */ MapViewRegion, scala.Unit]] = js.undefined
  /**
       * Map overlays
       */
  var overlays: js.UndefOr[js.Array[MapViewOverlay]] = js.undefined
  /**
       * When this property is set to true and a valid camera is associated with the map,
       * the camera’s pitch angle is used to tilt the plane of the map.
       *
       * When this property is set to false, the camera’s pitch angle is ignored and
       * the map is always displayed as if the user is looking straight down onto it.
       */
  var pitchEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The region to be displayed by the map.
       * The region is defined by the center coordinates and the span of coordinates to display.
       */
  var region: js.UndefOr[MapViewRegion] = js.undefined
  /**
       * When this property is set to true and a valid camera is associated with the map,
       * the camera’s heading angle is used to rotate the plane of the map around its center point.
       *
       * When this property is set to false, the camera’s heading angle is ignored and the map is always oriented
       * so that true north is situated at the top of the map view
       */
  var rotateEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If false the user won't be able to change the map region being displayed.
       * Default value is true.
       */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If false compass won't be displayed on the map.
       * Default value is true.
       */
  var showsCompass: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If false points of interest won't be displayed on the map.
       * Default value is true.
       */
  var showsPointsOfInterest: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true the app will ask for the user's location and focus on it.
       * Default value is false.
       *
       * NOTE: You need to add NSLocationWhenInUseUsageDescription key in Info.plist to enable geolocation,
       * otherwise it is going to fail silently!
       */
  var showsUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If false the user won't be able to pinch/zoom the map.
       * Default value is true.
       */
  var zoomEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

