package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConnectorMod {
  
  @JSImport("react-dnd/dist/internals/SourceConnector", "SourceConnector")
  @js.native
  open class SourceConnector protected ()
    extends StObject
       with Connector {
    def this(backend: Backend) = this()
    
    /* private */ val backend: Any = js.native
    
    /* private */ var clearDragPreview: Any = js.native
    
    /* private */ var clearDragSource: Any = js.native
    
    @JSName("connectTarget")
    def connectTarget_MSourceConnector: Any = js.native
    
    /* private */ var didConnectedDragPreviewChange: Any = js.native
    
    /* private */ var didConnectedDragSourceChange: Any = js.native
    
    /* private */ var didDragPreviewOptionsChange: Any = js.native
    
    /* private */ var didDragSourceOptionsChange: Any = js.native
    
    /* private */ var didHandlerIdChange: Any = js.native
    
    def disconnectDragPreview(): Unit = js.native
    
    def disconnectDragSource(): Unit = js.native
    
    /* private */ def dragPreview: Any = js.native
    
    /* private */ var dragPreviewNode: Any = js.native
    
    def dragPreviewOptions: DragPreviewOptions | Null = js.native
    
    /* private */ var dragPreviewOptionsInternal: Any = js.native
    
    def dragPreviewOptions_=(options: DragPreviewOptions | Null): Unit = js.native
    
    /* private */ var dragPreviewRef: Any = js.native
    
    /* private */ var dragPreviewUnsubscribe: Any = js.native
    
    /* private */ def dragSource: Any = js.native
    
    /* private */ var dragSourceNode: Any = js.native
    
    def dragSourceOptions: DragSourceOptions | Null = js.native
    
    /* private */ var dragSourceOptionsInternal: Any = js.native
    
    def dragSourceOptions_=(options: DragSourceOptions | Null): Unit = js.native
    
    /* private */ var dragSourceRef: Any = js.native
    
    /* private */ var dragSourceUnsubscribe: Any = js.native
    
    /* private */ var handlerId: Any = js.native
    
    /* private */ var lastConnectedDragPreview: Any = js.native
    
    /* private */ var lastConnectedDragPreviewOptions: Any = js.native
    
    /* private */ var lastConnectedDragSource: Any = js.native
    
    /* private */ var lastConnectedDragSourceOptions: Any = js.native
    
    /* private */ var lastConnectedHandlerId: Any = js.native
    
    /* private */ var reconnectDragPreview: Any = js.native
    
    /* private */ var reconnectDragSource: Any = js.native
  }
  
  @js.native
  trait Connector extends StObject {
    
    var connectTarget: Any = js.native
    
    var hooks: Any = js.native
    
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
    
    def reconnect(): Unit = js.native
  }
}
