package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.dndCore.interfacesMod.Identifier
import typings.reactDnd.optionsMod.DragPreviewOptions
import typings.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/SourceConnector", JSImport.Namespace)
@js.native
object sourceConnectorMod extends js.Object {
  @js.native
  trait Connector extends js.Object {
    var connectTarget: js.Any = js.native
    var hooks: js.Any = js.native
    def receiveHandlerId(): Unit = js.native
    def receiveHandlerId(handlerId: Identifier): Unit = js.native
    def reconnect(): Unit = js.native
  }
  
  @js.native
  class SourceConnector protected () extends Connector {
    def this(backend: Backend) = this()
    val backend: js.Any = js.native
    var clearDragPreview: js.Any = js.native
    var clearDragSource: js.Any = js.native
    var didConnectedDragPreviewChange: js.Any = js.native
    var didConnectedDragSourceChange: js.Any = js.native
    var didDragPreviewOptionsChange: js.Any = js.native
    var didDragSourceOptionsChange: js.Any = js.native
    var didHandlerIdChange: js.Any = js.native
    var disconnectDragPreview: js.Any = js.native
    var disconnectDragSource: js.Any = js.native
    var dragPreviewNode: js.Any = js.native
    var dragPreviewOptionsInternal: js.Any = js.native
    var dragPreviewRef: js.Any = js.native
    var dragPreviewUnsubscribe: js.Any = js.native
    var dragSourceNode: js.Any = js.native
    var dragSourceOptionsInternal: js.Any = js.native
    var dragSourceRef: js.Any = js.native
    var dragSourceUnsubscribe: js.Any = js.native
    var handlerId: js.Any = js.native
    var lastConnectedDragPreview: js.Any = js.native
    var lastConnectedDragPreviewOptions: js.Any = js.native
    var lastConnectedDragSource: js.Any = js.native
    var lastConnectedDragSourceOptions: js.Any = js.native
    var lastConnectedHandlerId: js.Any = js.native
    var reconnectDragPreview: js.Any = js.native
    var reconnectDragSource: js.Any = js.native
    @JSName("connectTarget")
    def connectTarget_MSourceConnector: js.Any = js.native
    /* private */ def dragPreview: js.Any = js.native
    def dragPreviewOptions(): js.Any = js.native
    def dragPreviewOptions(options: DragPreviewOptions): js.Any = js.native
    @JSName("dragPreviewOptions")
    def dragPreviewOptions_Union: DragPreviewOptions | Null = js.native
    /* private */ def dragSource: js.Any = js.native
    def dragSourceOptions(): js.Any = js.native
    def dragSourceOptions(options: DragSourceOptions): js.Any = js.native
    @JSName("dragSourceOptions")
    def dragSourceOptions_Union: DragSourceOptions | Null = js.native
  }
  
}

