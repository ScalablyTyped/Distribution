package typings.reactBeautifulDnd.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProvided extends js.Object {
  
  var dragHandleProps: js.UndefOr[DraggableProvidedDragHandleProps] = js.native
  
  var draggableProps: DraggableProvidedDraggableProps = js.native
  
  // will be removed after move to react 16
  def innerRef(): js.Any = js.native
  def innerRef(element: HTMLElement): js.Any = js.native
}
