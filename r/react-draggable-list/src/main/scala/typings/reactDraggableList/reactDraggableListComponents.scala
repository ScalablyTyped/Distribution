package typings.reactDraggableList

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reactDraggableList.mod.TemplateProps
import typings.reactDraggableList.mod.default
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDraggableListComponents extends reactDraggableListProps {
  @scala.inline
  def ReactDraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, js.Any] */]: ComponentType[ReactDraggableListProps[I, C, T]] = (js.constructorOf[default[I, C, T]]).asInstanceOf[ComponentType[ReactDraggableListProps[I, C, T]]]
}

