package typings.reactLeaflet

import typings.geojson.mod.Geometry
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.Control_.Attribution
import typings.leaflet.mod.Control_.AttributionOptions
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Control_.Scale
import typings.leaflet.mod.Control_.ScaleOptions
import typings.leaflet.mod.Control_.Zoom
import typings.leaflet.mod.Control_.ZoomOptions
import typings.leaflet.mod.DragEndEventHandlerFn
import typings.leaflet.mod.ErrorEventHandlerFn
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.GeoJSON__
import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.LayerEventHandlerFn
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LayersControlEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFnMap
import typings.leaflet.mod.LeafletKeyboardEventHandlerFn
import typings.leaflet.mod.LeafletMouseEventHandlerFn
import typings.leaflet.mod.LocationEventHandlerFn
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import typings.leaflet.mod.PopupEventHandlerFn
import typings.leaflet.mod.Popup_
import typings.leaflet.mod.Rectangle_
import typings.leaflet.mod.ResizeEventHandlerFn
import typings.leaflet.mod.SVGOverlay_
import typings.leaflet.mod.TileErrorEventHandlerFn
import typings.leaflet.mod.TileEventHandlerFn
import typings.leaflet.mod.TileLayer_
import typings.leaflet.mod.TileLayer_.WMS
import typings.leaflet.mod.TooltipEventHandlerFn
import typings.leaflet.mod.Tooltip_
import typings.leaflet.mod.VideoOverlay_
import typings.leaflet.mod.ZoomAnimEventHandlerFn
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactLeaflet.anon.PartialLayersControlProps
import typings.reactLeaflet.anon.WeakValidationMapLayersCo
import typings.reactLeaflet.libFeatureGroupMod.FeatureGroupProps
import typings.reactLeaflet.libGeoJSONMod.GeoJSONProps
import typings.reactLeaflet.libImageOverlayMod.ImageOverlayProps
import typings.reactLeaflet.libLayerGroupMod.LayerGroupProps
import typings.reactLeaflet.libLayersControlMod.ControlledLayerProps
import typings.reactLeaflet.libLayersControlMod.LayersControlProps
import typings.reactLeaflet.libMapContainerMod.MapContainerProps
import typings.reactLeaflet.libMarkerMod.MarkerProps
import typings.reactLeaflet.libPaneMod.PaneProps
import typings.reactLeaflet.libPolygonMod.PolygonProps
import typings.reactLeaflet.libPolylineMod.PolylineProps
import typings.reactLeaflet.libPopupMod.PopupProps
import typings.reactLeaflet.libRectangleMod.RectangleProps
import typings.reactLeaflet.libSvgoverlayMod.SVGOverlayProps
import typings.reactLeaflet.libTileLayerMod.TileLayerProps
import typings.reactLeaflet.libTooltipMod.TooltipProps
import typings.reactLeaflet.libVideoOverlayMod.VideoOverlayProps
import typings.reactLeaflet.libWmstilelayerMod.WMSTileLayerProps
import typings.reactLeaflet.reactLeafletStrings.add
import typings.reactLeaflet.reactLeafletStrings.autopanstart
import typings.reactLeaflet.reactLeafletStrings.baselayerchange
import typings.reactLeaflet.reactLeafletStrings.click
import typings.reactLeaflet.reactLeafletStrings.contextmenu
import typings.reactLeaflet.reactLeafletStrings.dblclick
import typings.reactLeaflet.reactLeafletStrings.down
import typings.reactLeaflet.reactLeafletStrings.drag
import typings.reactLeaflet.reactLeafletStrings.dragend
import typings.reactLeaflet.reactLeafletStrings.dragstart
import typings.reactLeaflet.reactLeafletStrings.error
import typings.reactLeaflet.reactLeafletStrings.keydown
import typings.reactLeaflet.reactLeafletStrings.keypress
import typings.reactLeaflet.reactLeafletStrings.keyup
import typings.reactLeaflet.reactLeafletStrings.layeradd
import typings.reactLeaflet.reactLeafletStrings.layerremove
import typings.reactLeaflet.reactLeafletStrings.load
import typings.reactLeaflet.reactLeafletStrings.loading
import typings.reactLeaflet.reactLeafletStrings.locationerror
import typings.reactLeaflet.reactLeafletStrings.locationfound
import typings.reactLeaflet.reactLeafletStrings.mousedown
import typings.reactLeaflet.reactLeafletStrings.mousemove
import typings.reactLeaflet.reactLeafletStrings.mouseout
import typings.reactLeaflet.reactLeafletStrings.mouseover
import typings.reactLeaflet.reactLeafletStrings.mouseup
import typings.reactLeaflet.reactLeafletStrings.move
import typings.reactLeaflet.reactLeafletStrings.moveend
import typings.reactLeaflet.reactLeafletStrings.movestart
import typings.reactLeaflet.reactLeafletStrings.overlayadd
import typings.reactLeaflet.reactLeafletStrings.overlayremove
import typings.reactLeaflet.reactLeafletStrings.popupclose
import typings.reactLeaflet.reactLeafletStrings.popupopen
import typings.reactLeaflet.reactLeafletStrings.preclick
import typings.reactLeaflet.reactLeafletStrings.predrag
import typings.reactLeaflet.reactLeafletStrings.remove
import typings.reactLeaflet.reactLeafletStrings.resize
import typings.reactLeaflet.reactLeafletStrings.tileabort
import typings.reactLeaflet.reactLeafletStrings.tileerror
import typings.reactLeaflet.reactLeafletStrings.tileload
import typings.reactLeaflet.reactLeafletStrings.tileloadstart
import typings.reactLeaflet.reactLeafletStrings.tileunload
import typings.reactLeaflet.reactLeafletStrings.tooltipclose
import typings.reactLeaflet.reactLeafletStrings.tooltipopen
import typings.reactLeaflet.reactLeafletStrings.unload
import typings.reactLeaflet.reactLeafletStrings.update
import typings.reactLeaflet.reactLeafletStrings.viewreset
import typings.reactLeaflet.reactLeafletStrings.zoom
import typings.reactLeaflet.reactLeafletStrings.zoomanim
import typings.reactLeaflet.reactLeafletStrings.zoomend
import typings.reactLeaflet.reactLeafletStrings.zoomlevelschange
import typings.reactLeaflet.reactLeafletStrings.zoomstart
import typings.reactLeafletCore.libCircleMod.CircleMarkerProps
import typings.reactLeafletCore.libCircleMod.CircleProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-leaflet", "AttributionControl")
  @js.native
  val AttributionControl: ForwardRefExoticComponent[AttributionOptions & RefAttributes[Attribution]] = js.native
  
  @JSImport("react-leaflet", "Circle")
  @js.native
  val Circle: ForwardRefExoticComponent[CircleProps & RefAttributes[Circle_[Any]]] = js.native
  
  @JSImport("react-leaflet", "CircleMarker")
  @js.native
  val CircleMarker: ForwardRefExoticComponent[CircleMarkerProps & RefAttributes[CircleMarker_[Any]]] = js.native
  
  @JSImport("react-leaflet", "FeatureGroup")
  @js.native
  val FeatureGroup: ForwardRefExoticComponent[FeatureGroupProps & RefAttributes[FeatureGroup_[Any]]] = js.native
  
  @JSImport("react-leaflet", "GeoJSON")
  @js.native
  val GeoJSON: ForwardRefExoticComponent[GeoJSONProps & (RefAttributes[GeoJSON__[Any, Geometry]])] = js.native
  
  @JSImport("react-leaflet", "ImageOverlay")
  @js.native
  val ImageOverlay: ForwardRefExoticComponent[ImageOverlayProps & RefAttributes[ImageOverlay_]] = js.native
  
  @JSImport("react-leaflet", "LayerGroup")
  @js.native
  val LayerGroup: ForwardRefExoticComponent[LayerGroupProps & RefAttributes[LayerGroup_[Any]]] = js.native
  
  /* Inlined react.react.ForwardRefExoticComponent<react-leaflet.react-leaflet/lib/LayersControl.LayersControlProps & react.react.RefAttributes<leaflet.leaflet.Control.Layers>> & {  BaseLayer :react.react.FunctionComponent<react-leaflet.react-leaflet/lib/LayersControl.ControlledLayerProps>,   Overlay :react.react.FunctionComponent<react-leaflet.react-leaflet/lib/LayersControl.ControlledLayerProps>} */
  object LayersControl {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: LayersControlProps & RefAttributes[Layers]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("react-leaflet", "LayersControl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-leaflet", "LayersControl.BaseLayer")
    @js.native
    def BaseLayer: FunctionComponent[ControlledLayerProps] = js.native
    inline def BaseLayer_=(x: FunctionComponent[ControlledLayerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet", "LayersControl.Overlay")
    @js.native
    def Overlay: FunctionComponent[ControlledLayerProps] = js.native
    inline def Overlay_=(x: FunctionComponent[ControlledLayerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet", "LayersControl.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLayersControlProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLayersControlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet", "LayersControl.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet", "LayersControl.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLayersCo] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayersCo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet", "LayersControl.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  @JSImport("react-leaflet", "MapContainer")
  @js.native
  val MapContainer: ForwardRefExoticComponent[MapContainerProps & RefAttributes[Map_]] = js.native
  
  @JSImport("react-leaflet", "Marker")
  @js.native
  val Marker: ForwardRefExoticComponent[MarkerProps & RefAttributes[Marker_[Any]]] = js.native
  
  @JSImport("react-leaflet", "Pane")
  @js.native
  val Pane: ForwardRefExoticComponent[PaneProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("react-leaflet", "Polygon")
  @js.native
  val Polygon: ForwardRefExoticComponent[PolygonProps & RefAttributes[Polygon_[Any]]] = js.native
  
  @JSImport("react-leaflet", "Polyline")
  @js.native
  val Polyline: ForwardRefExoticComponent[PolylineProps & (RefAttributes[Polyline_[LineString | MultiLineString, Any]])] = js.native
  
  @JSImport("react-leaflet", "Popup")
  @js.native
  val Popup: ForwardRefExoticComponent[PopupProps & RefAttributes[Popup_]] = js.native
  
  @JSImport("react-leaflet", "Rectangle")
  @js.native
  val Rectangle: ForwardRefExoticComponent[RectangleProps & RefAttributes[Rectangle_[Any]]] = js.native
  
  @JSImport("react-leaflet", "SVGOverlay")
  @js.native
  val SVGOverlay: ForwardRefExoticComponent[SVGOverlayProps & RefAttributes[SVGOverlay_]] = js.native
  
  @JSImport("react-leaflet", "ScaleControl")
  @js.native
  val ScaleControl: ForwardRefExoticComponent[ScaleOptions & RefAttributes[Scale]] = js.native
  
  @JSImport("react-leaflet", "TileLayer")
  @js.native
  val TileLayer: ForwardRefExoticComponent[TileLayerProps & RefAttributes[TileLayer_]] = js.native
  
  @JSImport("react-leaflet", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[Tooltip_]] = js.native
  
  @JSImport("react-leaflet", "VideoOverlay")
  @js.native
  val VideoOverlay: ForwardRefExoticComponent[VideoOverlayProps & RefAttributes[VideoOverlay_]] = js.native
  
  @JSImport("react-leaflet", "WMSTileLayer")
  @js.native
  val WMSTileLayer: ForwardRefExoticComponent[WMSTileLayerProps & RefAttributes[WMS]] = js.native
  
  @JSImport("react-leaflet", "ZoomControl")
  @js.native
  val ZoomControl: ForwardRefExoticComponent[ZoomOptions & RefAttributes[Zoom]] = js.native
  
  inline def useMap(): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMap")().asInstanceOf[Map_]
  
  inline def useMapEvent_add(`type`: add): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_add(`type`: add, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_autopanstart(`type`: autopanstart): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_autopanstart(`type`: autopanstart, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_baselayerchange(`type`: baselayerchange): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_baselayerchange(`type`: baselayerchange, handler: LayersControlEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_click(`type`: click): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_click(`type`: click, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_contextmenu(`type`: contextmenu): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_contextmenu(`type`: contextmenu, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_dblclick(`type`: dblclick): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_dblclick(`type`: dblclick, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_down(`type`: down): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_down(`type`: down, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_drag(`type`: drag): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_drag(`type`: drag, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_dragend(`type`: dragend): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_dragend(`type`: dragend, handler: DragEndEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_dragstart(`type`: dragstart): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_dragstart(`type`: dragstart, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_error(`type`: error): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_error(`type`: error, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_keydown(`type`: keydown): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_keydown(`type`: keydown, handler: LeafletKeyboardEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_keypress(`type`: keypress): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_keypress(`type`: keypress, handler: LeafletKeyboardEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_keyup(`type`: keyup): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_keyup(`type`: keyup, handler: LeafletKeyboardEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_layeradd(`type`: layeradd): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_layeradd(`type`: layeradd, handler: LayerEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_layerremove(`type`: layerremove): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_layerremove(`type`: layerremove, handler: LayerEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_load(`type`: load): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_load(`type`: load, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_loading(`type`: loading): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_loading(`type`: loading, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_locationerror(`type`: locationerror): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_locationerror(`type`: locationerror, handler: ErrorEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_locationfound(`type`: locationfound): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_locationfound(`type`: locationfound, handler: LocationEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_mousedown(`type`: mousedown): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_mousedown(`type`: mousedown, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_mousemove(`type`: mousemove): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_mousemove(`type`: mousemove, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_mouseout(`type`: mouseout): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_mouseout(`type`: mouseout, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_mouseover(`type`: mouseover): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_mouseover(`type`: mouseover, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_mouseup(`type`: mouseup): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_mouseup(`type`: mouseup, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_move(`type`: move): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_move(`type`: move, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_moveend(`type`: moveend): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_moveend(`type`: moveend, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_movestart(`type`: movestart): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_movestart(`type`: movestart, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_overlayadd(`type`: overlayadd): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_overlayadd(`type`: overlayadd, handler: LayersControlEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_overlayremove(`type`: overlayremove): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_overlayremove(`type`: overlayremove, handler: LayersControlEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_popupclose(`type`: popupclose): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_popupclose(`type`: popupclose, handler: PopupEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_popupopen(`type`: popupopen): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_popupopen(`type`: popupopen, handler: PopupEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_preclick(`type`: preclick): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_preclick(`type`: preclick, handler: LeafletMouseEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_predrag(`type`: predrag): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_predrag(`type`: predrag, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_remove(`type`: remove): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_remove(`type`: remove, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_resize(`type`: resize): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_resize(`type`: resize, handler: ResizeEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tileabort(`type`: tileabort): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tileabort(`type`: tileabort, handler: TileEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tileerror(`type`: tileerror): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tileerror(`type`: tileerror, handler: TileErrorEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tileload(`type`: tileload): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tileload(`type`: tileload, handler: TileEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tileloadstart(`type`: tileloadstart): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tileloadstart(`type`: tileloadstart, handler: TileEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tileunload(`type`: tileunload): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tileunload(`type`: tileunload, handler: TileEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tooltipclose(`type`: tooltipclose): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tooltipclose(`type`: tooltipclose, handler: TooltipEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_tooltipopen(`type`: tooltipopen): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_tooltipopen(`type`: tooltipopen, handler: TooltipEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_unload(`type`: unload): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_unload(`type`: unload, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_update(`type`: update): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_update(`type`: update, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_viewreset(`type`: viewreset): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_viewreset(`type`: viewreset, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_zoom(`type`: zoom): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_zoom(`type`: zoom, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_zoomanim(`type`: zoomanim): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_zoomanim(`type`: zoomanim, handler: ZoomAnimEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_zoomend(`type`: zoomend): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_zoomend(`type`: zoomend, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_zoomlevelschange(`type`: zoomlevelschange): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_zoomlevelschange(`type`: zoomlevelschange, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvent_zoomstart(`type`: zoomstart): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Map_]
  inline def useMapEvent_zoomstart(`type`: zoomstart, handler: LeafletEventHandlerFn): Map_ = (^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvent")(`type`.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Map_]
  
  inline def useMapEvents(handlers: LeafletEventHandlerFnMap): Map_ = ^.asInstanceOf[js.Dynamic].applyDynamic("useMapEvents")(handlers.asInstanceOf[js.Any]).asInstanceOf[Map_]
}
