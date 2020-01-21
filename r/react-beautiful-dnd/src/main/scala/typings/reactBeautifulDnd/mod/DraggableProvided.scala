package typings.reactBeautifulDnd.mod

import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProvided extends js.Object {
  var dragHandleProps: DraggableProvidedDragHandleProps | Null = js.native
  var draggableProps: DraggableProvidedDraggableProps = js.native
  var placeholder: js.UndefOr[ReactElement | Null] = js.native
  // will be removed after move to react 16
  def innerRef(): js.Any = js.native
  def innerRef(element: HTMLElement): js.Any = js.native
}

