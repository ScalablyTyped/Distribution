package typings.samchon.templatesExternalExternalSystemArrayMod

import typings.samchon.protocolEntityEntityCollectionMod.EntityDequeCollection
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolInvokeInvokeMod.Invoke
import typings.samchon.templatesExternalExternalSystemMod.ExternalSystem
import typings.samchon.templatesExternalExternalSystemRoleMod.ExternalSystemRole
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.containerDequeMod.Deque
import typings.tstl.containerDequeMod.DequeNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemArray", "ExternalSystemArray")
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
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): Iterator[
    System, 
    Deque[System], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[System], 
    ReverseIterator[System], 
    System
  ] = js.native
  /**
    * Test whether container is empty.
    */
  /* InferMemberOverrides */
  override def empty(): Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* InferMemberOverrides */
  override def end(): Iterator[
    System, 
    Deque[System], 
    typings.tstl.containerDequeMod.DequeNs.Iterator[System], 
    ReverseIterator[System], 
    System
  ] = js.native
  /**
    * Get a role.
    *
    * @param name Name, identifier of target {@link ExternalSystemRole role}.
    *
    * @return The specified role.
    */
  def getRole(name: String): ExternalSystemRole = js.native
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
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): ReverseIterator[System] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
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
  /* InferMemberOverrides */
  override def size(): Double = js.native
}

