package typings.reactLeaflet

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.CircleMarker_
import typings.leaflet.mod.Circle_
import typings.leaflet.mod.Control_
import typings.leaflet.mod.Control_.Attribution
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Control_.Scale
import typings.leaflet.mod.Control_.Zoom
import typings.leaflet.mod.Evented
import typings.leaflet.mod.FeatureGroup_
import typings.leaflet.mod.GeoJSON_
import typings.leaflet.mod.GridLayer_
import typings.leaflet.mod.ImageOverlay_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Marker_
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import typings.leaflet.mod.Popup_
import typings.leaflet.mod.Rectangle_
import typings.leaflet.mod.SVGOverlay_
import typings.leaflet.mod.TileLayer_
import typings.leaflet.mod.TileLayer_.WMS
import typings.leaflet.mod.Tooltip_
import typings.leaflet.mod.VideoOverlay_
import typings.react.mod.ComponentType
import typings.reactLeaflet.mod.AttributionControlProps
import typings.reactLeaflet.mod.CircleMarkerProps
import typings.reactLeaflet.mod.CircleProps
import typings.reactLeaflet.mod.DivOverlayProps
import typings.reactLeaflet.mod.DivOverlayTypes
import typings.reactLeaflet.mod.FeatureGroupProps
import typings.reactLeaflet.mod.GeoJSONProps
import typings.reactLeaflet.mod.GridLayerProps
import typings.reactLeaflet.mod.ImageOverlayProps
import typings.reactLeaflet.mod.LayersControl.ControlledLayerProps
import typings.reactLeaflet.mod.LayersControlProps
import typings.reactLeaflet.mod.LeafletContext
import typings.reactLeaflet.mod.MapComponentProps
import typings.reactLeaflet.mod.MapControlProps
import typings.reactLeaflet.mod.MapLayerProps
import typings.reactLeaflet.mod.MapProps
import typings.reactLeaflet.mod.MarkerProps
import typings.reactLeaflet.mod.PaneProps
import typings.reactLeaflet.mod.PaneState
import typings.reactLeaflet.mod.PolygonProps
import typings.reactLeaflet.mod.PolylineProps
import typings.reactLeaflet.mod.PopupProps
import typings.reactLeaflet.mod.RectangleProps
import typings.reactLeaflet.mod.SVGOverlayProps
import typings.reactLeaflet.mod.ScaleControlProps
import typings.reactLeaflet.mod.TileLayerProps
import typings.reactLeaflet.mod.TooltipProps
import typings.reactLeaflet.mod.VideoOverlayProps
import typings.reactLeaflet.mod.WMSTileLayerProps
import typings.reactLeaflet.mod.ZoomControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactLeafletComponents extends reactLeafletProps {
  @scala.inline
  def AttributionControl[P /* <: AttributionControlProps */, E /* <: Attribution */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.AttributionControl[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Circle[P /* <: CircleProps */, E /* <: Circle_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Circle[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def CircleMarker[P /* <: CircleMarkerProps */, E /* <: CircleMarker_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.CircleMarker[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def DivOverlay[P /* <: DivOverlayProps */, E /* <: DivOverlayTypes */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.DivOverlay[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def FeatureGroup[P /* <: FeatureGroupProps */, E /* <: FeatureGroup_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.FeatureGroup[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def GeoJSON[P /* <: GeoJSONProps */, E /* <: GeoJSON_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.GeoJSON[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def GridLayer[P /* <: GridLayerProps */, E /* <: GridLayer_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.GridLayer[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def ImageOverlay[P /* <: ImageOverlayProps */, E /* <: ImageOverlay_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.ImageOverlay[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LayerGroup[P /* <: MapLayerProps */, E /* <: LayerGroup_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.LayerGroup[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LayersControl[P /* <: LayersControlProps */, E /* <: Layers */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.LayersControl_[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LayersControlBaseLayer[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.LayersControl.BaseLayer[P]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LayersControlControlledLayer[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.LayersControl.ControlledLayer[P]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LayersControlOverlay[P /* <: ControlledLayerProps */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.LayersControl.Overlay[P]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def LeafletConsumer: ComponentType[LeafletConsumerProps[LeafletContext]] = typings.reactLeaflet.mod.LeafletConsumer.asInstanceOf[typings.react.mod.ComponentType[LeafletConsumerProps[typings.reactLeaflet.mod.LeafletContext]]]
  @scala.inline
  def LeafletProvider: ComponentType[LeafletProviderProps[LeafletContext]] = typings.reactLeaflet.mod.LeafletProvider.asInstanceOf[typings.react.mod.ComponentType[LeafletProviderProps[typings.reactLeaflet.mod.LeafletContext]]]
  @scala.inline
  def Map[P /* <: MapProps */, E /* <: Map_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Map[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def MapComponent[P /* <: MapComponentProps */, E /* <: Evented */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.MapComponent[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def MapControl[P /* <: MapControlProps */, E /* <: Control_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.MapControl[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def MapEvented[P, E /* <: Evented */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.MapEvented[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def MapLayer[P /* <: MapLayerProps */, E /* <: Layer */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.MapLayer[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Marker[P /* <: MarkerProps */, E /* <: Marker_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Marker[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Pane[P /* <: PaneProps */, S /* <: PaneState */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Pane[P, S]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Polygon[P /* <: PolygonProps */, E /* <: Polygon_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Polygon[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Polyline[P /* <: PolylineProps */, E /* <: Polyline_[LineString | MultiLineString, js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Polyline[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Popup[P /* <: PopupProps */, E /* <: Popup_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Popup[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Rectangle[P /* <: RectangleProps */, E /* <: Rectangle_[js.Any] */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Rectangle[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def SVGOverlay[P /* <: SVGOverlayProps */, E /* <: SVGOverlay_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.SVGOverlay[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def ScaleControl[P /* <: ScaleControlProps */, E /* <: Scale */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.ScaleControl[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def TileLayer[P /* <: TileLayerProps */, E /* <: TileLayer_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.TileLayer[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def Tooltip[P /* <: TooltipProps */, E /* <: Tooltip_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.Tooltip[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def VideoOverlay[P /* <: VideoOverlayProps */, E /* <: VideoOverlay_ */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.VideoOverlay[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def WMSTileLayer[P /* <: WMSTileLayerProps */, E /* <: WMS */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.WMSTileLayer[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
  @scala.inline
  def ZoomControl[P /* <: ZoomControlProps */, E /* <: Zoom */]: ComponentType[P] = js.constructorOf[typings.reactLeaflet.mod.ZoomControl[P, E]].asInstanceOf[typings.react.mod.ComponentType[P]]
}

