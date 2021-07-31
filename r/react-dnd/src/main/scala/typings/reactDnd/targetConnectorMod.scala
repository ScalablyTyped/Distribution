package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.reactDnd.sourceConnectorMod.Connector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetConnectorMod {
  
  @JSImport("react-dnd/lib/common/TargetConnector", "TargetConnector")
  @js.native
  class TargetConnector protected ()
    extends StObject
       with Connector {
    def this(backend: Backend) = this()
    
    val backend: js.Any = js.native
    
    var clearDropTarget: js.Any = js.native
    
    @JSName("connectTarget")
    def connectTarget_MTargetConnector: js.Any = js.native
    
    var didDropTargetChange: js.Any = js.native
    
    var didHandlerIdChange: js.Any = js.native
    
    var didOptionsChange: js.Any = js.native
    
    var disconnectDropTarget: js.Any = js.native
    
    /* private */ def dropTarget: js.Any = js.native
    
    var dropTargetNode: js.Any = js.native
    
    def dropTargetOptions: js.Any = js.native
    
    var dropTargetOptionsInternal: js.Any = js.native
    
    def dropTargetOptions_=(options: js.Any): Unit = js.native
    
    var dropTargetRef: js.Any = js.native
    
    var handlerId: js.Any = js.native
    
    var lastConnectedDropTarget: js.Any = js.native
    
    var lastConnectedDropTargetOptions: js.Any = js.native
    
    var lastConnectedHandlerId: js.Any = js.native
    
    var unsubscribeDropTarget: js.Any = js.native
  }
}
