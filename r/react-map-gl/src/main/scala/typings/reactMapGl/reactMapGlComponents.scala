package typings.reactMapGl

import typings.react.mod.ComponentType
import typings.reactMapGl.mod.BaseControlProps
import typings.reactMapGl.mod.DraggableControlProps
import typings.reactMapGl.mod.default
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactMapGlComponents extends reactMapGlProps {
  @scala.inline
  def BaseControl[T /* <: BaseControlProps */, S /* <: Element */]: ComponentType[T] = (js.constructorOf[typings.reactMapGl.mod.BaseControl[T, S]]).asInstanceOf[ComponentType[T]]
  @scala.inline
  def CanvasOverlay: ComponentType[CanvasOverlayProps] = js.constructorOf[typings.reactMapGl.mod.CanvasOverlay].asInstanceOf[ComponentType[CanvasOverlayProps]]
  @scala.inline
  def DraggableControl[T /* <: DraggableControlProps */]: ComponentType[T] = js.constructorOf[typings.reactMapGl.mod.DraggableControl[T]].asInstanceOf[ComponentType[T]]
  @scala.inline
  def FullscreenControl: ComponentType[FullscreenControlProps] = js.constructorOf[typings.reactMapGl.mod.FullscreenControl].asInstanceOf[ComponentType[FullscreenControlProps]]
  @scala.inline
  def GeolocateControl: ComponentType[GeolocateControlProps] = js.constructorOf[typings.reactMapGl.mod.GeolocateControl].asInstanceOf[ComponentType[GeolocateControlProps]]
  @scala.inline
  def HTMLOverlay: ComponentType[HTMLOverlayProps] = js.constructorOf[typings.reactMapGl.mod.HTMLOverlay].asInstanceOf[ComponentType[HTMLOverlayProps]]
  @scala.inline
  def InteractiveMap: ComponentType[InteractiveMapProps] = js.constructorOf[typings.reactMapGl.mod.InteractiveMap].asInstanceOf[ComponentType[InteractiveMapProps]]
  @scala.inline
  def Layer: ComponentType[LayerProps] = js.constructorOf[typings.reactMapGl.mod.Layer].asInstanceOf[ComponentType[LayerProps]]
  @scala.inline
  def Marker: ComponentType[MarkerProps] = js.constructorOf[typings.reactMapGl.mod.Marker].asInstanceOf[ComponentType[MarkerProps]]
  @scala.inline
  def NavigationControl: ComponentType[NavigationControlProps] = js.constructorOf[typings.reactMapGl.mod.NavigationControl].asInstanceOf[ComponentType[NavigationControlProps]]
  @scala.inline
  def Popup: ComponentType[PopupProps] = js.constructorOf[typings.reactMapGl.mod.Popup].asInstanceOf[ComponentType[PopupProps]]
  @scala.inline
  def ReactMapGl: ComponentType[ReactMapGlProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactMapGlProps]]
  @scala.inline
  def SVGOverlay: ComponentType[SVGOverlayProps] = js.constructorOf[typings.reactMapGl.mod.SVGOverlay].asInstanceOf[ComponentType[SVGOverlayProps]]
  @scala.inline
  def ScaleControl: ComponentType[ScaleControlProps] = js.constructorOf[typings.reactMapGl.mod.ScaleControl].asInstanceOf[ComponentType[ScaleControlProps]]
  @scala.inline
  def Source: ComponentType[SourceProps] = js.constructorOf[typings.reactMapGl.mod.Source].asInstanceOf[ComponentType[SourceProps]]
  @scala.inline
  def StaticMap: ComponentType[StaticMapProps] = js.constructorOf[typings.reactMapGl.mod.StaticMap].asInstanceOf[ComponentType[StaticMapProps]]
}

