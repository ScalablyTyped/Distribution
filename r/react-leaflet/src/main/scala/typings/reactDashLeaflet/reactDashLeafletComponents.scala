package typings.reactDashLeaflet

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.Control
import typings.leaflet.leafletMod.Control.Attribution
import typings.leaflet.leafletMod.Control.Layers
import typings.leaflet.leafletMod.Control.Scale
import typings.leaflet.leafletMod.Control.Zoom
import typings.leaflet.leafletMod.Evented
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.TileLayer.WMS
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ConsumerProps
import typings.react.reactMod.ProviderProps
import typings.reactDashLeaflet.reactDashLeafletMod.AttributionControlProps
import typings.reactDashLeaflet.reactDashLeafletMod.CircleMarkerProps
import typings.reactDashLeaflet.reactDashLeafletMod.CircleProps
import typings.reactDashLeaflet.reactDashLeafletMod.DivOverlayProps
import typings.reactDashLeaflet.reactDashLeafletMod.DivOverlayTypes
import typings.reactDashLeaflet.reactDashLeafletMod.FeatureGroupProps
import typings.reactDashLeaflet.reactDashLeafletMod.GeoJSONProps
import typings.reactDashLeaflet.reactDashLeafletMod.GridLayerProps
import typings.reactDashLeaflet.reactDashLeafletMod.ImageOverlayProps
import typings.reactDashLeaflet.reactDashLeafletMod.LayersControl.ControlledLayerProps
import typings.reactDashLeaflet.reactDashLeafletMod.LayersControlProps
import typings.reactDashLeaflet.reactDashLeafletMod.LeafletContext
import typings.reactDashLeaflet.reactDashLeafletMod.MapComponentProps
import typings.reactDashLeaflet.reactDashLeafletMod.MapControlProps
import typings.reactDashLeaflet.reactDashLeafletMod.MapLayerProps
import typings.reactDashLeaflet.reactDashLeafletMod.MapProps
import typings.reactDashLeaflet.reactDashLeafletMod.MarkerProps
import typings.reactDashLeaflet.reactDashLeafletMod.PaneProps
import typings.reactDashLeaflet.reactDashLeafletMod.PaneState
import typings.reactDashLeaflet.reactDashLeafletMod.PolygonProps
import typings.reactDashLeaflet.reactDashLeafletMod.PolylineProps
import typings.reactDashLeaflet.reactDashLeafletMod.PopupProps
import typings.reactDashLeaflet.reactDashLeafletMod.RectangleProps
import typings.reactDashLeaflet.reactDashLeafletMod.ScaleControlProps
import typings.reactDashLeaflet.reactDashLeafletMod.TileLayerProps
import typings.reactDashLeaflet.reactDashLeafletMod.TooltipProps
import typings.reactDashLeaflet.reactDashLeafletMod.VideoOverlayProps
import typings.reactDashLeaflet.reactDashLeafletMod.WMSTileLayerProps
import typings.reactDashLeaflet.reactDashLeafletMod.ZoomControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashLeafletComponents extends reactDashLeafletProps {
  @scala.inline
  def AttributionControl[P /* <: AttributionControlProps */, E /* <: Attribution */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.AttributionControl[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Circle[P /* <: CircleProps */, E /* <: typings.leaflet.leafletMod.Circle[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Circle[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def CircleMarker[P /* <: CircleMarkerProps */, E /* <: typings.leaflet.leafletMod.CircleMarker[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.CircleMarker[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def DivOverlay[P /* <: DivOverlayProps */, E /* <: DivOverlayTypes */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.DivOverlay[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def FeatureGroup[P /* <: FeatureGroupProps */, E /* <: typings.leaflet.leafletMod.FeatureGroup[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.FeatureGroup[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def GeoJSON[P /* <: GeoJSONProps */, E /* <: typings.leaflet.leafletMod.GeoJSON[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.GeoJSON[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def GridLayer[P /* <: GridLayerProps */, E /* <: typings.leaflet.leafletMod.GridLayer */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.GridLayer[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def ImageOverlay[P /* <: ImageOverlayProps */, E /* <: typings.leaflet.leafletMod.ImageOverlay */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.ImageOverlay[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LayerGroup[P /* <: MapLayerProps */, E /* <: typings.leaflet.leafletMod.LayerGroup[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.LayerGroup[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LayersControlBaseLayer[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.LayersControl.BaseLayer[P]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LayersControlControlledLayer[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.LayersControl.ControlledLayer[P]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LayersControlOverlay[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.LayersControl.Overlay[P]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LayersControl_[P /* <: LayersControlProps */, E /* <: Layers */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.LayersControl_[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def LeafletConsumer: ComponentType[ConsumerProps[LeafletContext]] = typings.reactDashLeaflet.reactDashLeafletMod.LeafletConsumer.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ConsumerProps[typings.reactDashLeaflet.reactDashLeafletMod.LeafletContext]]]
  @scala.inline
  def LeafletProvider: ComponentType[ProviderProps[LeafletContext]] = typings.reactDashLeaflet.reactDashLeafletMod.LeafletProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.reactDashLeaflet.reactDashLeafletMod.LeafletContext]]]
  @scala.inline
  def Map[P /* <: MapProps */, E /* <: typings.leaflet.leafletMod.Map */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Map[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def MapComponent[P /* <: MapComponentProps */, E /* <: Evented */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.MapComponent[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def MapControl[P /* <: MapControlProps */, E /* <: Control */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.MapControl[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def MapEvented[P, E /* <: Evented */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.MapEvented[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def MapLayer[P /* <: MapLayerProps */, E /* <: Layer */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.MapLayer[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Marker[P /* <: MarkerProps */, E /* <: typings.leaflet.leafletMod.Marker[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Marker[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Pane[P /* <: PaneProps */, S /* <: PaneState */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Pane[P, S]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Polygon[P /* <: PolygonProps */, E /* <: typings.leaflet.leafletMod.Polygon[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Polygon[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Polyline[P /* <: PolylineProps */, E /* <: typings.leaflet.leafletMod.Polyline[LineString | MultiLineString, _] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Polyline[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Popup[P /* <: PopupProps */, E /* <: typings.leaflet.leafletMod.Popup */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Popup[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Rectangle[P /* <: RectangleProps */, E /* <: typings.leaflet.leafletMod.Rectangle[_] */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Rectangle[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def ScaleControl[P /* <: ScaleControlProps */, E /* <: Scale */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.ScaleControl[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def TileLayer[P /* <: TileLayerProps */, E /* <: typings.leaflet.leafletMod.TileLayer */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.TileLayer[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def Tooltip[P /* <: TooltipProps */, E /* <: typings.leaflet.leafletMod.Tooltip */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.Tooltip[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def VideoOverlay[P /* <: VideoOverlayProps */, E /* <: typings.leaflet.leafletMod.VideoOverlay */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.VideoOverlay[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def WMSTileLayer[P /* <: WMSTileLayerProps */, E /* <: WMS */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.WMSTileLayer[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
  @scala.inline
  def ZoomControl[P /* <: ZoomControlProps */, E /* <: Zoom */]: ComponentType[P] = js.constructorOf[typings.reactDashLeaflet.reactDashLeafletMod.ZoomControl[P, E]].asInstanceOf[typings.react.reactMod.ComponentType[P]]
}

