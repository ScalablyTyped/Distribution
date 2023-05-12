package typings.reactLeaflet

import typings.leaflet.mod.DragEndEventHandlerFn
import typings.leaflet.mod.ErrorEventHandlerFn
import typings.leaflet.mod.LayerEventHandlerFn
import typings.leaflet.mod.LayersControlEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFn
import typings.leaflet.mod.LeafletEventHandlerFnMap
import typings.leaflet.mod.LeafletKeyboardEventHandlerFn
import typings.leaflet.mod.LeafletMouseEventHandlerFn
import typings.leaflet.mod.LocationEventHandlerFn
import typings.leaflet.mod.Map_
import typings.leaflet.mod.PopupEventHandlerFn
import typings.leaflet.mod.ResizeEventHandlerFn
import typings.leaflet.mod.TileErrorEventHandlerFn
import typings.leaflet.mod.TileEventHandlerFn
import typings.leaflet.mod.TooltipEventHandlerFn
import typings.leaflet.mod.ZoomAnimEventHandlerFn
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksMod {
  
  @JSImport("react-leaflet/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
