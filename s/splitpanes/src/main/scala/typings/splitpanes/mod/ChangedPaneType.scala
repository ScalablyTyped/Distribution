package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedPaneType extends StObject {
  
  var addedPane: js.UndefOr[Pane] = js.undefined
  
  var removedPane: js.UndefOr[RemovedPaneType] = js.undefined
}
object ChangedPaneType {
  
  inline def apply(): ChangedPaneType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedPaneType]
  }
  
  extension [Self <: ChangedPaneType](x: Self) {
    
    inline def setAddedPane(value: Pane): Self = StObject.set(x, "addedPane", value.asInstanceOf[js.Any])
    
    inline def setAddedPaneUndefined: Self = StObject.set(x, "addedPane", js.undefined)
    
    inline def setRemovedPane(value: RemovedPaneType): Self = StObject.set(x, "removedPane", value.asInstanceOf[js.Any])
    
    inline def setRemovedPaneUndefined: Self = StObject.set(x, "removedPane", js.undefined)
  }
}
