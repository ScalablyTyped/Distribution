package typings.reactabularDnd

import typings.react.mod.global.JSX.Element
import typings.reactabularTable.mod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactabular-dnd", "Header")
  @js.native
  def Header(props: js.Any): Element = js.native
  
  @JSImport("reactabular-dnd", "moveLabels")
  @js.native
  def moveLabels(columns: js.Array[Column], event: DndMoveEvent): js.Array[Column] = js.native
  
  @js.native
  trait DndMoveEvent extends StObject {
    
    var sourceLabel: String = js.native
    
    var targetLabel: String = js.native
  }
  object DndMoveEvent {
    
    @scala.inline
    def apply(sourceLabel: String, targetLabel: String): DndMoveEvent = {
      val __obj = js.Dynamic.literal(sourceLabel = sourceLabel.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DndMoveEvent]
    }
    
    @scala.inline
    implicit class DndMoveEventMutableBuilder[Self <: DndMoveEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceLabel(value: String): Self = StObject.set(x, "sourceLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetLabel(value: String): Self = StObject.set(x, "targetLabel", value.asInstanceOf[js.Any])
    }
  }
}
