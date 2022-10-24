package typings.reactTypesShared.srcDndMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetDelegate extends StObject {
  
  /**
    * Returns a drop target within a collection for the given x and y coordinates.
    * The point is provided relative to the top left corner of the collection container.
    * A drop target can be checked to see if it is valid using the provided `isValidDropTarget` function.
    */
  def getDropTargetFromPoint(x: Double, y: Double, isValidDropTarget: js.Function1[/* target */ DropTarget, Boolean]): DropTarget | Null
}
object DropTargetDelegate {
  
  inline def apply(
    getDropTargetFromPoint: (Double, Double, js.Function1[/* target */ DropTarget, Boolean]) => DropTarget | Null
  ): DropTargetDelegate = {
    val __obj = js.Dynamic.literal(getDropTargetFromPoint = js.Any.fromFunction3(getDropTargetFromPoint))
    __obj.asInstanceOf[DropTargetDelegate]
  }
  
  extension [Self <: DropTargetDelegate](x: Self) {
    
    inline def setGetDropTargetFromPoint(value: (Double, Double, js.Function1[/* target */ DropTarget, Boolean]) => DropTarget | Null): Self = StObject.set(x, "getDropTargetFromPoint", js.Any.fromFunction3(value))
  }
}
