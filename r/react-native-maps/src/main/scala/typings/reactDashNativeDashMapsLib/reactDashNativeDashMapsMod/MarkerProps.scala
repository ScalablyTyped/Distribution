package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MarkerProps extends js.Object {
  var anchor: js.UndefOr[Point] = js.undefined
  var calloutAnchor: js.UndefOr[Point] = js.undefined
  var calloutOffset: js.UndefOr[Point] = js.undefined
  var centerOffset: js.UndefOr[Point] = js.undefined
  var coordinate: LatLng | AnimatedRegion
  var description: js.UndefOr[java.lang.String] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  ] = js.undefined
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  ] = js.undefined
  var onCalloutPress: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress], 
      scala.Unit
    ]
  ] = js.undefined
  var onDeselect: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionIdMarkerdeselect], 
      scala.Unit
    ]
  ] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], scala.Unit]] = js.undefined
  var onPress: js.UndefOr[
    js.Function1[/* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Action], scala.Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[
    js.Function1[/* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionId], scala.Unit]
  ] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var pinColor: js.UndefOr[java.lang.String] = js.undefined
  var reuseIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var stopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tracksInfoWindowChanges: js.UndefOr[scala.Boolean] = js.undefined
  var tracksViewChanges: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    coordinate: LatLng | AnimatedRegion,
    anchor: Point = null,
    calloutAnchor: Point = null,
    calloutOffset: Point = null,
    centerOffset: Point = null,
    description: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource = null,
    identifier: java.lang.String = null,
    image: reactDashNativeLib.reactDashNativeMod.ImageURISource | reactDashNativeLib.reactDashNativeMod.ImageRequireSource = null,
    onCalloutPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress] => scala.Unit = null,
    onDeselect: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionIdMarkerdeselect] => scala.Unit = null,
    onDrag: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onDragEnd: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onDragStart: /* event */ MapEvent[js.Object] => scala.Unit = null,
    onPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_Action] => scala.Unit = null,
    onSelect: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionId] => scala.Unit = null,
    opacity: scala.Int | scala.Double = null,
    pinColor: java.lang.String = null,
    reuseIdentifier: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    stopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    tracksInfoWindowChanges: js.UndefOr[scala.Boolean] = js.undefined,
    tracksViewChanges: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (calloutAnchor != null) __obj.updateDynamic("calloutAnchor")(calloutAnchor)
    if (calloutOffset != null) __obj.updateDynamic("calloutOffset")(calloutOffset)
    if (centerOffset != null) __obj.updateDynamic("centerOffset")(centerOffset)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onCalloutPress != null) __obj.updateDynamic("onCalloutPress")(js.Any.fromFunction1(onCalloutPress))
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(js.Any.fromFunction1(onDeselect))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pinColor != null) __obj.updateDynamic("pinColor")(pinColor)
    if (reuseIdentifier != null) __obj.updateDynamic("reuseIdentifier")(reuseIdentifier)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(stopPropagation)) __obj.updateDynamic("stopPropagation")(stopPropagation)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(tracksInfoWindowChanges)) __obj.updateDynamic("tracksInfoWindowChanges")(tracksInfoWindowChanges)
    if (!js.isUndefined(tracksViewChanges)) __obj.updateDynamic("tracksViewChanges")(tracksViewChanges)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

