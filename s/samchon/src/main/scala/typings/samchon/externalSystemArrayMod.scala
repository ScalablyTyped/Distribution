package typings.samchon

import typings.ecol.collectionEventMod.CollectionEvent
import typings.ecol.collectionEventMod.CollectionEvent.Listener
import typings.ecol.collectionEventMod.CollectionEvent.Type
import typings.samchon.entityCollectionMod.EntityDequeCollection
import typings.samchon.externalSystemMod.ExternalSystem
import typings.samchon.externalSystemRoleMod.ExternalSystemRole
import typings.samchon.invokeMod.Invoke
import typings.samchon.iprotocolMod.IProtocol
import typings.tstl.dequeMod.Deque
import typings.tstl.dequeMod.Deque.Iterator
import typings.tstl.dequeMod.Deque.ReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemArray", JSImport.Namespace)
@js.native
object externalSystemArrayMod extends js.Object {
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
    /**
      * Range Assigner.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def assign[InputIterator /* <: IForwardIterator[System, InputIterator] */](first: InputIterator, last: InputIterator): Unit = js.native
    /**
      * Iterator to the first element.
      *
      * @return Iterator to the first element.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def begin(): typings.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def clear(): Unit = js.native
    /* InferMemberOverrides */
    override def dispatchEvent(event: CollectionEvent[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Test whether container is empty.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def empty(): Boolean = js.native
    /**
      * Iterator to the end.
      *
      * @return Iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def end(): typings.tstl.icontainerMod.IContainer.Iterator[System, Deque[System], Iterator[System], ReverseIterator[System], System] = js.native
    /**
      * Erase elements in range.
      *
      * @param first Range of the first position to erase.
      * @param last Rangee of the last position to erase.
      * @return Iterator following the last removed element, strained by the erasing.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def erase(first: Iterator[System], last: Iterator[System]): Iterator[System] = js.native
    /**
      * Erase an element.
      *
      * @param pos Position to erase.
      * @return Iterator following the *pos*, strained by the erasing.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def erase(pos: Iterator[System]): Iterator[System] = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(): System = js.native
    /**
      * @inheritDoc
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def front(`val`: System): Unit = js.native
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
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* InferMemberOverrides */
    override def push(items: System*): Double = js.native
    /**
      * Insert an element at the end.
      *
      * @param val Value to insert.
      */
    /* InferMemberOverrides */
    override def push_back(`val`: System): Unit = js.native
    /**
      * Reverse iterator to the first element in reverse.
      *
      * @return Reverse iterator to the first.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rbegin(): ReverseIterator[System] = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: Type, listener: Listener[System, Deque[System], Iterator[System], ReverseIterator[System]]): Unit = js.native
    /**
      * Reverse iterator to the reverse end.
      *
      * @return Reverse iterator to the end.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def rend(): ReverseIterator[System] = js.native
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
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def swap(obj: Deque[System]): Unit = js.native
    /**
      * Native function for `JSON.stringify()`.
      *
      * @return An array containing children elements.
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def toJSON(): js.Array[System] = js.native
  }
  
}

