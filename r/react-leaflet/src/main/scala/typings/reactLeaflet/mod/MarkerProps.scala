package typings.reactLeaflet.mod

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PointExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because var conflicts: attribution, pane. Inlined 
- typings.leaflet.mod.InteractiveLayerOptions because var conflicts: attribution, pane. Inlined bubblingMouseEvents, interactive
- typings.leaflet.mod.MarkerOptions because var conflicts: attribution, pane. Inlined alt, autoPanOnFocus, autoPanSpeed, autoPanPadding, shadowPane, riseOffset, draggable, zIndexOffset, icon, keyboard, autoPan, opacity, riseOnHover, title */ trait MarkerProps
  extends StObject
     with MapLayerProps
     with MarkerEvents {
  
  /** Text for the `alt` attribute of the icon image (useful for accessibility). */
  var alt: js.UndefOr[String] = js.undefined
  
  /** Whether to pan the map when dragging this marker near its edge or not. */
  var autoPan: js.UndefOr[Boolean] = js.undefined
  
  var autoPanOnFocus: js.UndefOr[Boolean] = js.undefined
  
  /** Distance (in pixels to the left/right and to the top/bottom) of the map edge to start panning the map. */
  var autoPanPadding: js.UndefOr[PointExpression] = js.undefined
  
  /** Number of pixels the map should pan by. */
  var autoPanSpeed: js.UndefOr[Double] = js.undefined
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the marker is draggable with mouse/touch or not. */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the marker can be tabbed to with a keyboard and clicked by pressing enter. */
  var keyboard: js.UndefOr[Boolean] = js.undefined
  
  /** The opacity of the marker. */
  var opacity: js.UndefOr[Double] = js.undefined
  
  var position: LatLngExpression
  
  /** The z-index offset used for the `riseOnHover` feature. */
  var riseOffset: js.UndefOr[Double] = js.undefined
  
  /** If `true`, the marker will get on top of others when you hover the mouse over it. */
  var riseOnHover: js.UndefOr[Boolean] = js.undefined
  
  /** `Map pane` where the markers shadow will be added. */
  var shadowPane: js.UndefOr[String] = js.undefined
  
  /** Text for the browser tooltip that appear on marker hover (no tooltip by default). */
  var title: js.UndefOr[String] = js.undefined
  
  /** Option for putting the marker on top of all others (or below). */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object MarkerProps {
  
  inline def apply(position: LatLngExpression): MarkerProps = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    inline def setAutoPanOnFocus(value: Boolean): Self = StObject.set(x, "autoPanOnFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoPanOnFocusUndefined: Self = StObject.set(x, "autoPanOnFocus", js.undefined)
    
    inline def setAutoPanPadding(value: PointExpression): Self = StObject.set(x, "autoPanPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPanPaddingUndefined: Self = StObject.set(x, "autoPanPadding", js.undefined)
    
    inline def setAutoPanSpeed(value: Double): Self = StObject.set(x, "autoPanSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoPanSpeedUndefined: Self = StObject.set(x, "autoPanSpeed", js.undefined)
    
    inline def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setIcon(value: Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
    
    inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRiseOffset(value: Double): Self = StObject.set(x, "riseOffset", value.asInstanceOf[js.Any])
    
    inline def setRiseOffsetUndefined: Self = StObject.set(x, "riseOffset", js.undefined)
    
    inline def setRiseOnHover(value: Boolean): Self = StObject.set(x, "riseOnHover", value.asInstanceOf[js.Any])
    
    inline def setRiseOnHoverUndefined: Self = StObject.set(x, "riseOnHover", js.undefined)
    
    inline def setShadowPane(value: String): Self = StObject.set(x, "shadowPane", value.asInstanceOf[js.Any])
    
    inline def setShadowPaneUndefined: Self = StObject.set(x, "shadowPane", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    inline def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
