package typings.snazzyInfoWindow

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.googlemaps.google.maps.OverlayView
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snazzy-info-window", JSImport.Namespace)
  @js.native
  class ^ protected () extends SnazzyInfoWindow {
    def this(opts: InfoWindowOptions) = this()
  }
  
  @js.native
  trait Border extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var width: String = js.native
  }
  object Border {
    
    @scala.inline
    def apply(width: String): Border = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Callbacks extends StObject {
    
    /**
      * Called after the info window has closed.
      * This occurs at the end of the OverlayView onRemove() implementation.
      * At this point the info window should be removed from the DOM.
      */
    var afterClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
    
    /**
      * Called when the info window has opened.
      * This occurs at the end of the OverlayView draw() implementation.
      * At this point the info window is added to the DOM and should be visible.
      */
    var afterOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
    
    /**
      * Called before the info window attempts to close.
      * Return false to cancel the close.
      */
    var beforeClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
    
    /**
      * Called before the info window attempts to open.
      * Return false to cancel the open.
      */
    var beforeOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
    
    /**
      * Called when the info window is closing.
      * This occurs at the beginning of the OverlayView onRemove() implementation.
      * At this point the info window is still in the DOM.
      */
    var close: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
    
    /**
      * Called when the info window is opening.
      * This occurs at the end of the OverlayView onAdd() implementation.
      * At this point the info window is added to the DOM but is not drawn yet.
      */
    var open: js.UndefOr[js.Function0[Boolean | Unit]] = js.native
  }
  object Callbacks {
    
    @scala.inline
    def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit class CallbacksMutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterClose(value: () => Boolean | Unit): Self = StObject.set(x, "afterClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      @scala.inline
      def setAfterOpen(value: () => Boolean | Unit): Self = StObject.set(x, "afterOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterOpenUndefined: Self = StObject.set(x, "afterOpen", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: () => Boolean | Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: () => Boolean | Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setClose(value: () => Boolean | Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setOpen(value: () => Boolean | Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  @js.native
  trait EdgeOffset extends StObject {
    
    var bottom: js.UndefOr[Double] = js.native
    
    var left: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[Double] = js.native
  }
  object EdgeOffset {
    
    @scala.inline
    def apply(): EdgeOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EdgeOffset]
    }
    
    @scala.inline
    implicit class EdgeOffsetMutableBuilder[Self <: EdgeOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait InfoWindowOptions extends StObject {
    
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
    implicit class InfoWindowOptionsMutableBuilder[Self <: InfoWindowOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorder(value: Border | Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadius(value: String): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setCallbacks(value: Callbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      @scala.inline
      def setCloseButtonMarkup(value: Boolean): Self = StObject.set(x, "closeButtonMarkup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonMarkupUndefined: Self = StObject.set(x, "closeButtonMarkup", js.undefined)
      
      @scala.inline
      def setCloseOnMapClick(value: Boolean): Self = StObject.set(x, "closeOnMapClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnMapClickUndefined: Self = StObject.set(x, "closeOnMapClick", js.undefined)
      
      @scala.inline
      def setCloseWhenOthersOpen(value: Boolean): Self = StObject.set(x, "closeWhenOthersOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWhenOthersOpenUndefined: Self = StObject.set(x, "closeWhenOthersOpen", js.undefined)
      
      @scala.inline
      def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setEdgeOffset(value: EdgeOffset): Self = StObject.set(x, "edgeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeOffsetUndefined: Self = StObject.set(x, "edgeOffset", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setMap(value: Map[Element]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpenOnMarkerClick(value: Boolean): Self = StObject.set(x, "openOnMarkerClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnMarkerClickUndefined: Self = StObject.set(x, "openOnMarkerClick", js.undefined)
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPanOnOpen(value: Boolean): Self = StObject.set(x, "panOnOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanOnOpenUndefined: Self = StObject.set(x, "panOnOpen", js.undefined)
      
      @scala.inline
      def setPlacement(value: PlacementOptions): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPointer(value: String | Boolean): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      @scala.inline
      def setPosition(value: LatLng | LatLngLiteral): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShadow(value: Shadow | Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setWrapperClass(value: String): Self = StObject.set(x, "wrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassUndefined: Self = StObject.set(x, "wrapperClass", js.undefined)
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var bottom: js.UndefOr[String] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var right: js.UndefOr[String] = js.native
    
    var top: js.UndefOr[String] = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.snazzyInfoWindow.snazzyInfoWindowStrings.top
    - typings.snazzyInfoWindow.snazzyInfoWindowStrings.bottom
    - typings.snazzyInfoWindow.snazzyInfoWindowStrings.left
    - typings.snazzyInfoWindow.snazzyInfoWindowStrings.right
  */
  trait PlacementOptions extends StObject
  object PlacementOptions {
    
    @scala.inline
    def bottom: typings.snazzyInfoWindow.snazzyInfoWindowStrings.bottom = "bottom".asInstanceOf[typings.snazzyInfoWindow.snazzyInfoWindowStrings.bottom]
    
    @scala.inline
    def left: typings.snazzyInfoWindow.snazzyInfoWindowStrings.left = "left".asInstanceOf[typings.snazzyInfoWindow.snazzyInfoWindowStrings.left]
    
    @scala.inline
    def right: typings.snazzyInfoWindow.snazzyInfoWindowStrings.right = "right".asInstanceOf[typings.snazzyInfoWindow.snazzyInfoWindowStrings.right]
    
    @scala.inline
    def top: typings.snazzyInfoWindow.snazzyInfoWindowStrings.top = "top".asInstanceOf[typings.snazzyInfoWindow.snazzyInfoWindowStrings.top]
  }
  
  @js.native
  trait Shadow extends StObject {
    
    var blur: js.UndefOr[String] = js.native
    
    var color: String = js.native
    
    var h: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[String] = js.native
    
    var spread: js.UndefOr[String] = js.native
    
    var v: js.UndefOr[String] = js.native
  }
  object Shadow {
    
    @scala.inline
    def apply(color: String): Shadow = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shadow]
    }
    
    @scala.inline
    implicit class ShadowMutableBuilder[Self <: Shadow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSpread(value: String): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    }
  }
  
  @js.native
  trait SnazzyInfoWindow extends OverlayView {
    
    /**
      * Will attempt to close the info window.
      */
    def close(): Unit = js.native
    
    /**
      * Will destroy the info window.
      * If the info window is open it will be forced closed bypassing the regular beforeClose callback.
      * All Google Map event listeners associated to this info window will be removed.
      */
    def destroy(): Unit = js.native
    
    /**
      * Will return the DOM Element for the wrapper container of the info window.
      */
    def getWrapper(): HTMLElement = js.native
    
    /**
      * Determines if the info window is open.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Will attempt to open the info window.
      */
    def open(): Unit = js.native
    
    /**
      * Set the content in the info window.
      * This can be called at any time.
      * @param content string od DOM element
      */
    def setContent(content: String): Unit = js.native
    def setContent(content: HTMLElement): Unit = js.native
    
    /**
      * Set the position of the info window.
      * A valid Google Map instance must be associated to the info window.
      * This could be either through the marker or map option.
      */
    def setPosition(latLng: LatLng): Unit = js.native
    def setPosition(latLng: LatLngLiteral): Unit = js.native
  }
}
