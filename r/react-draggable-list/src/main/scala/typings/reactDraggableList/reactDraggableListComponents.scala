package typings.reactDraggableList

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactDraggableList.mod.TemplateProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDraggableListComponents extends reactDraggableListProps {
  @scala.inline
  def ReactDraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, js.Any] */]: ComponentType[ReactDraggableListProps[I, C, T]] = js.constructorOf[typings.reactDraggableList.mod.default[I, C, T]].asInstanceOf[typings.react.mod.ComponentType[ReactDraggableListProps[I, C, T]]]
}

