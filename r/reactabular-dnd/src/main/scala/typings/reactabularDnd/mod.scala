package typings.reactabularDnd

import typings.react.mod.global.JSX.Element
import typings.reactabularTable.mod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactabular-dnd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Header(props: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Header")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def moveLabels(columns: js.Array[Column], event: DndMoveEvent): js.Array[Column] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveLabels")(columns.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.Array[Column]]
  
  trait DndMoveEvent extends StObject {
    
    var sourceLabel: String
    
    var targetLabel: String
  }
  object DndMoveEvent {
    
    inline def apply(sourceLabel: String, targetLabel: String): DndMoveEvent = {
      val __obj = js.Dynamic.literal(sourceLabel = sourceLabel.asInstanceOf[js.Any], targetLabel = targetLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DndMoveEvent]
    }
    
    extension [Self <: DndMoveEvent](x: Self) {
      
      inline def setSourceLabel(value: String): Self = StObject.set(x, "sourceLabel", value.asInstanceOf[js.Any])
      
      inline def setTargetLabel(value: String): Self = StObject.set(x, "targetLabel", value.asInstanceOf[js.Any])
    }
  }
}
