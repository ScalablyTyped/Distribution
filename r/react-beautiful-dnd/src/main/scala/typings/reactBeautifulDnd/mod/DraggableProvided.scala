package typings.reactBeautifulDnd.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DraggableProvided extends StObject {
  
  var dragHandleProps: js.UndefOr[DraggableProvidedDragHandleProps | Null] = js.native
  
  var draggableProps: DraggableProvidedDraggableProps = js.native
  
  // will be removed after move to react 16
  def innerRef(): Unit = js.native
  def innerRef(element: HTMLElement): Unit = js.native
}
