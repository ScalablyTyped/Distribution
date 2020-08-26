package typings.reactNativeMaps.mod

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.anon.ActionId
import typings.reactNativeMaps.anon.Id
import typings.reactNativeMaps.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerProps extends ViewProps {
  var anchor: js.UndefOr[Point] = js.native
  var calloutAnchor: js.UndefOr[Point] = js.native
  var calloutOffset: js.UndefOr[Point] = js.native
  var centerOffset: js.UndefOr[Point] = js.native
  var coordinate: LatLng | AnimatedRegion = js.native
  var description: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var flat: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[ImageURISource | ImageRequireSource] = js.native
  var identifier: js.UndefOr[String] = js.native
  var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.native
  var onCalloutPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.native
  var onDeselect: js.UndefOr[js.Function1[/* event */ MapEvent[ActionId], Unit]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[Action], Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* event */ MapEvent[Id], Unit]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var pinColor: js.UndefOr[String] = js.native
  var reuseIdentifier: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var tracksInfoWindowChanges: js.UndefOr[Boolean] = js.native
  var tracksViewChanges: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MarkerProps {
  @scala.inline
  def apply(coordinate: LatLng | AnimatedRegion): MarkerProps = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
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
    def setCoordinate(value: LatLng | AnimatedRegion): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: Point): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setCalloutAnchor(value: Point): Self = this.set("calloutAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutAnchor: Self = this.set("calloutAnchor", js.undefined)
    @scala.inline
    def setCalloutOffset(value: Point): Self = this.set("calloutOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalloutOffset: Self = this.set("calloutOffset", js.undefined)
    @scala.inline
    def setCenterOffset(value: Point): Self = this.set("centerOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterOffset: Self = this.set("centerOffset", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setIcon(value: ImageURISource | ImageRequireSource): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setImage(value: ImageURISource | ImageRequireSource): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOnCalloutPress(value: /* event */ MapEvent[`0`] => Unit): Self = this.set("onCalloutPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCalloutPress: Self = this.set("onCalloutPress", js.undefined)
    @scala.inline
    def setOnDeselect(value: /* event */ MapEvent[ActionId] => Unit): Self = this.set("onDeselect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDeselect: Self = this.set("onDeselect", js.undefined)
    @scala.inline
    def setOnDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrag: Self = this.set("onDrag", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* event */ MapEvent[js.Object] => Unit): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ MapEvent[Action] => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setOnSelect(value: /* event */ MapEvent[Id] => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPinColor(value: String): Self = this.set("pinColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinColor: Self = this.set("pinColor", js.undefined)
    @scala.inline
    def setReuseIdentifier(value: String): Self = this.set("reuseIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReuseIdentifier: Self = this.set("reuseIdentifier", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTracksInfoWindowChanges(value: Boolean): Self = this.set("tracksInfoWindowChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracksInfoWindowChanges: Self = this.set("tracksInfoWindowChanges", js.undefined)
    @scala.inline
    def setTracksViewChanges(value: Boolean): Self = this.set("tracksViewChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracksViewChanges: Self = this.set("tracksViewChanges", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

