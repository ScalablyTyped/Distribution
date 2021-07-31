package typings.reactNativeMaps.mod

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.anon.ActionId
import typings.reactNativeMaps.anon.Id
import typings.reactNativeMaps.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerProps
  extends StObject
     with ViewProps {
  
  var anchor: js.UndefOr[Point] = js.undefined
  
  var calloutAnchor: js.UndefOr[Point] = js.undefined
  
  var calloutOffset: js.UndefOr[Point] = js.undefined
  
  var centerOffset: js.UndefOr[Point] = js.undefined
  
  var coordinate: LatLng | AnimatedRegion
  
  var description: js.UndefOr[String] = js.undefined
  
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var flat: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[ImageURISource | ImageRequireSource] = js.undefined
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.undefined
  
  var onCalloutPress: js.UndefOr[js.Function1[/* event */ MapEvent[`0`], Unit]] = js.undefined
  
  var onDeselect: js.UndefOr[js.Function1[/* event */ MapEvent[ActionId], Unit]] = js.undefined
  
  var onDrag: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* event */ MapEvent[js.Object], Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[Action], Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* event */ MapEvent[Id], Unit]] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var pinColor: js.UndefOr[String] = js.undefined
  
  var reuseIdentifier: js.UndefOr[String] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var tracksInfoWindowChanges: js.UndefOr[Boolean] = js.undefined
  
  var tracksViewChanges: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object MarkerProps {
  
  @scala.inline
  def apply(coordinate: LatLng | AnimatedRegion): MarkerProps = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit class MarkerPropsMutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    @scala.inline
    def setCalloutAnchor(value: Point): Self = StObject.set(x, "calloutAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutAnchorUndefined: Self = StObject.set(x, "calloutAnchor", js.undefined)
    
    @scala.inline
    def setCalloutOffset(value: Point): Self = StObject.set(x, "calloutOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutOffsetUndefined: Self = StObject.set(x, "calloutOffset", js.undefined)
    
    @scala.inline
    def setCenterOffset(value: Point): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
    
    @scala.inline
    def setCoordinate(value: LatLng | AnimatedRegion): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setIcon(value: ImageURISource | ImageRequireSource): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setImage(value: ImageURISource | ImageRequireSource): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOnCalloutPress(value: /* event */ MapEvent[`0`] => Unit): Self = StObject.set(x, "onCalloutPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCalloutPressUndefined: Self = StObject.set(x, "onCalloutPress", js.undefined)
    
    @scala.inline
    def setOnDeselect(value: /* event */ MapEvent[ActionId] => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
    
    @scala.inline
    def setOnDrag(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEnd(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    @scala.inline
    def setOnDragStart(value: /* event */ MapEvent[js.Object] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    @scala.inline
    def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ MapEvent[Action] => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* event */ MapEvent[Id] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPinColor(value: String): Self = StObject.set(x, "pinColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinColorUndefined: Self = StObject.set(x, "pinColor", js.undefined)
    
    @scala.inline
    def setReuseIdentifier(value: String): Self = StObject.set(x, "reuseIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReuseIdentifierUndefined: Self = StObject.set(x, "reuseIdentifier", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTracksInfoWindowChanges(value: Boolean): Self = StObject.set(x, "tracksInfoWindowChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksInfoWindowChangesUndefined: Self = StObject.set(x, "tracksInfoWindowChanges", js.undefined)
    
    @scala.inline
    def setTracksViewChanges(value: Boolean): Self = StObject.set(x, "tracksViewChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksViewChangesUndefined: Self = StObject.set(x, "tracksViewChanges", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
