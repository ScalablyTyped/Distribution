package typings.reactDnd

import typings.dndCore.interfacesMod.Backend
import typings.reactDnd.sourceConnectorMod.Connector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/TargetConnector", JSImport.Namespace)
@js.native
object targetConnectorMod extends js.Object {
  @js.native
  class TargetConnector protected () extends Connector {
    def this(backend: Backend) = this()
    val backend: js.Any = js.native
    var clearDropTarget: js.Any = js.native
    var didDropTargetChange: js.Any = js.native
    var didHandlerIdChange: js.Any = js.native
    var didOptionsChange: js.Any = js.native
    var disconnectDropTarget: js.Any = js.native
    var dropTargetNode: js.Any = js.native
    var dropTargetOptionsInternal: js.Any = js.native
    var dropTargetRef: js.Any = js.native
    var handlerId: js.Any = js.native
    var lastConnectedDropTarget: js.Any = js.native
    var lastConnectedDropTargetOptions: js.Any = js.native
    var lastConnectedHandlerId: js.Any = js.native
    var unsubscribeDropTarget: js.Any = js.native
    @JSName("connectTarget")
    def connectTarget_MTargetConnector: js.Any = js.native
    /* private */ def dropTarget: js.Any = js.native
    def dropTargetOptions: js.Any = js.native
    def dropTargetOptions(options: js.Any): js.Any = js.native
  }
  
}

