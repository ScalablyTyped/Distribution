package typings.samchon

import typings.ecol.libBasicCollectionEventMod.CollectionEvent
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Listener
import typings.ecol.libBasicCollectionEventMod.CollectionEvent.Type
import typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.samchon.templatesExternalExternalSystemRoleMod.ExternalSystemRole
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.Deque.Iterator
import typings.tstl.containerDequeMod.Deque.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemArray", JSImport.Namespace)
@js.native
object templatesExternalExternalSystemArrayMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ExternalSystemArray[System /* <: ExternalSystem */] ()
    extends EntityDequeCollection[System]
       with IProtocol {
    /**
      * @hidden
      */
    var _Handle_system_erase: js.Any = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Get a role.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return The specified role.
      */
    def getRole(name: String): ExternalSystemRole = js.native
    /* InferMemberOverrides */
    override def hasEventListener(`type`: Type): Boolean = js.native
    /**
      * Test whether the role exists.
      *
      * @param name Name, identifier of target {@link ExternalSystemRole role}.
      *
      * @return Whether the role has or not.
      */
    def hasRole(name: String): Boolean = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Sending message.
      *
      * Sends message to related system or shifts the responsibility to chain.
      *
      * @param invoke Invoke message to send
      */
    /* CompleteClass */
    override def replyData(invoke: Invoke): Unit = js.native
    /**
      * Handling replied message.
      *
      * Handles replied message or shifts the responsibility to chain.
      *
      * @param invoke An {@link Invoke} message has received.
      */
    /* CompleteClass */
    override def sendData(invoke: Invoke): Unit = js.native
  }
  
}

