package typings.reactDraggable

import typings.react.mod.ComponentType
import typings.reactDraggable.mod.DraggableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDraggableComponents extends reactDraggableProps {
  @scala.inline
  def DraggableCore: ComponentType[DraggableCoreProps[typings.reactDraggable.mod.DraggableCoreProps]] = js.constructorOf[typings.reactDraggable.mod.DraggableCore].asInstanceOf[typings.react.mod.ComponentType[DraggableCoreProps[typings.reactDraggable.mod.DraggableCoreProps]]]
  @scala.inline
  def ReactDraggable: ComponentType[ReactDraggableProps[DraggableProps]] = js.constructorOf[typings.reactDraggable.mod.default].asInstanceOf[typings.react.mod.ComponentType[ReactDraggableProps[typings.reactDraggable.mod.DraggableProps]]]
}

