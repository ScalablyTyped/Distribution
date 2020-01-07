package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolServerIServerMod.IServer
import typings.samchon.templatesExternalExternalSystemArrayMod.ExternalSystemArray
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/interfaces/IExternalClientArray", JSImport.Namespace)
@js.native
object templatesExternalInterfacesIExternalClientArrayMod extends js.Object {
  @js.native
  trait IExternalClientArray[System /* <: ExternalSystem */]
    extends ExternalSystemArray[System]
       with IServer {
    /* InferMemberOverrides */
    override def addEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
  }
  
}

