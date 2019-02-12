package typings
package samchonLib.templatesExternalExternalSystemArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemArray", "ExternalSystemArray")
@js.native
/**
  * Default Constructor.
  */
abstract class ExternalSystemArray[System /* <: samchonLib.templatesExternalExternalSystemMod.ExternalSystem */] ()
  extends samchonLib.protocolEntityEntityCollectionMod.EntityDequeCollection[System]
     with samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * @hidden
    */
  var _Handle_system_erase: js.Any = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[
    System, 
    tstlLib.containerDequeMod.Deque[System], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    System
  ] = js.native
  /**
    * Test whether container is empty.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def empty(): scala.Boolean = js.native
  /**
    * Iterator to the end.
    *
    * @return Iterator to the end.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[
    System, 
    tstlLib.containerDequeMod.Deque[System], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]], 
    System
  ] = js.native
  /**
    * Get a role.
    *
    * @param name Name, identifier of target {@link ExternalSystemRole role}.
    *
    * @return The specified role.
    */
  def getRole(name: java.lang.String): samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole = js.native
  /**
    * Test whether the role exists.
    *
    * @param name Name, identifier of target {@link ExternalSystemRole role}.
    *
    * @return Whether the role has or not.
    */
  def hasRole(name: java.lang.String): scala.Boolean = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: System*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[System, tstlLib.containerDequeMod.Deque[System]] = js.native
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  /* CompleteClass */
  override def replyData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  /* CompleteClass */
  override def sendData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

