package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConnectorMod {
  
  @JSImport("react-dnd/lib/common/SourceConnector", "SourceConnector")
  @js.native
  class SourceConnector protected ()
    extends StObject
       with Connector {
    def this(backend: Backend) = this()
    
    /* private */ val backend: js.Any = js.native
    
    /* private */ var clearDragPreview: js.Any = js.native
    
    /* private */ var clearDragSource: js.Any = js.native
    
    @JSName("connectTarget")
    def connectTarget_MSourceConnector: js.Any = js.native
    
    /* private */ var didConnectedDragPreviewChange: js.Any = js.native
    
    /* private */ var didConnectedDragSourceChange: js.Any = js.native
    
    /* private */ var didDragPreviewOptionsChange: js.Any = js.native
    
    /* private */ var didDragSourceOptionsChange: js.Any = js.native
    
    /* private */ var didHandlerIdChange: js.Any = js.native
    
    /* private */ var disconnectDragPreview: js.Any = js.native
    
    /* private */ var disconnectDragSource: js.Any = js.native
    
    /* private */ def dragPreview: js.Any = js.native
    
    /* private */ var dragPreviewNode: js.Any = js.native
    
    def dragPreviewOptions: DragPreviewOptions | Null = js.native
    
    /* private */ var dragPreviewOptionsInternal: js.Any = js.native
    
    def dragPreviewOptions_=(options: DragPreviewOptions | Null): Unit = js.native
    
    /* private */ var dragPreviewRef: js.Any = js.native
    
    /* private */ var dragPreviewUnsubscribe: js.Any = js.native
    
    /* private */ def dragSource: js.Any = js.native
    
    /* private */ var dragSourceNode: js.Any = js.native
    
    def dragSourceOptions: DragSourceOptions | Null = js.native
    
    /* private */ var dragSourceOptionsInternal: js.Any = js.native
    
    def dragSourceOptions_=(options: DragSourceOptions | Null): Unit = js.native
    
    /* private */ var dragSourceRef: js.Any = js.native
    
    /* private */ var dragSourceUnsubscribe: js.Any = js.native
    
    /* private */ var handlerId: js.Any = js.native
    
    /* private */ var lastConnectedDragPreview: js.Any = js.native
    
    /* private */ var lastConnectedDragPreviewOptions: js.Any = js.native
    
    /* private */ var lastConnectedDragSource: js.Any = js.native
    
    /* private */ var lastConnectedDragSourceOptions: js.Any = js.native
    
    /* private */ var lastConnectedHandlerId: js.Any = js.native
    
    /* private */ var reconnectDragPreview: js.Any = js.native
    
    /* private */ var reconnectDragSource: js.Any = js.native
  }
  
  @js.native
  trait Connector extends StObject {
    
    var connectTarget: js.Any = js.native
    
    var hooks: js.Any = js.native
    
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
    
    def reconnect(): Unit = js.native
  }
}
