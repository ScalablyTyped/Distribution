package typings.stormReactDiagrams

import typings.react.mod.ComponentType
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stormReactDiagramsComponents extends stormReactDiagramsProps {
  @scala.inline
  def BaseWidget[P /* <: BaseWidgetProps */, S]: ComponentType[P] = (js.constructorOf[typings.stormReactDiagrams.mod.BaseWidget[P, S]]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def DefaultLabelWidget: ComponentType[DefaultLabelWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.DefaultLabelWidget].asInstanceOf[ComponentType[DefaultLabelWidgetProps]]
  @scala.inline
  def DefaultLinkWidget: ComponentType[DefaultLinkWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.DefaultLinkWidget].asInstanceOf[ComponentType[DefaultLinkWidgetProps]]
  @scala.inline
  def DefaultNodeWidget: ComponentType[DefaultNodeWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.DefaultNodeWidget].asInstanceOf[ComponentType[DefaultNodeWidgetProps]]
  @scala.inline
  def DefaultPortLabel: ComponentType[DefaultPortLabelProps] = js.constructorOf[typings.stormReactDiagrams.mod.DefaultPortLabel].asInstanceOf[ComponentType[DefaultPortLabelProps]]
  @scala.inline
  def DiagramWidget: ComponentType[DiagramWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.DiagramWidget].asInstanceOf[ComponentType[DiagramWidgetProps]]
  @scala.inline
  def LinkLayerWidget: ComponentType[LinkLayerWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.LinkLayerWidget].asInstanceOf[ComponentType[LinkLayerWidgetProps]]
  @scala.inline
  def LinkWidget: ComponentType[LinkWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.LinkWidget].asInstanceOf[ComponentType[LinkWidgetProps]]
  @scala.inline
  def NodeLayerWidget: ComponentType[NodeLayerWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.NodeLayerWidget].asInstanceOf[ComponentType[NodeLayerWidgetProps]]
  @scala.inline
  def NodeWidget: ComponentType[NodeWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.NodeWidget].asInstanceOf[ComponentType[NodeWidgetProps]]
  @scala.inline
  def PortWidget: ComponentType[PortWidgetProps] = js.constructorOf[typings.stormReactDiagrams.mod.PortWidget].asInstanceOf[ComponentType[PortWidgetProps]]
}

