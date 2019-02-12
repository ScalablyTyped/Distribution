package typings
package samchonLib.templatesExternalExternalSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystem", "ExternalSystem")
@js.native
abstract class ExternalSystem protected ()
  extends samchonLib.protocolEntityEntityCollectionMod.EntityDequeCollection[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
     with samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * Construct from parent {@link ExternalSystemArray}.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[ExternalSystem]) = this()
  /**
    * Constrct from parent {@link ExternalSystemArray} and communicator.
    *
    * @param systemArray The parent {@link ExternalSystemArray} object.
    * @param communicator Communicator with the remote, external system.
    */
  def this(systemArray: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[ExternalSystem], communicator: samchonLib.protocolCommunicatorIClientDriverMod.IClientDriver) = this()
  /**
    * @hidden
    */
  var _Handle_close: js.Any = js.native
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  var communicator: samchonLib.protocolCommunicatorICommunicatorMod.ICommunicator = js.native
  /**
    * @hidden
    */
  var `communicator_`: js.Any = js.native
  /**
    * The name represents external system have connected.
    */
  var name: java.lang.String = js.native
  /**
    * @hidden
    */
  var `system_array_`: js.Any = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorIteratorMod.Iterator[
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
    tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[
      samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
      tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
    ], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[
      samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
      tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
    ], 
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole
  ] = js.native
  /**
    * Close connection.
    */
  def close(): scala.Unit = js.native
  /**
    * Default Destructor.
    *
    * This {@link destructor destructor()} method is called when the {@link ExternalSystem} object is destructed and
    * the {@link ExternalSystem} object is destructed when connection with the remote system is closed or this
    * {@link ExternalSystem} object is {@link ExternalSystemArray.erase erased} from its parent
    * {@link ExternalSystemArray} object.
    *
    * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
    * by those *destruction* cases. Also, if your derived {@link ExternalSystem} class has something to do on the
    * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
    * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
    *
    * ```typescript
    * class SomeSystem extends templates.external.ExternalSystem
    * {
    *     protected destructor(): void
    *     {
    *         // DO SOMETHING
    *         this.do_something();
    *
    *         // CALL SUPER.DESTRUCTOR() ON TAIL. DON'T FORGET THIS
    *         super.destructor();
    *     }
    * }
    * ```
    */
  /* protected */ def destructor(): scala.Unit = js.native
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
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorIteratorMod.Iterator[
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
    tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayIterator[
      samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
      tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
    ], 
    tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[
      samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
      tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
    ], 
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole
  ] = js.native
  /**
    * Get {@link name}.
    */
  def getName(): java.lang.String = js.native
  /**
    * Get parent {@link ExternalSystemArray} object.
    */
  def getSystemArray(): samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[ExternalSystem] = js.native
  /**
    * Get parent {@link ExternalSystemArray} object.
    */
  @JSName("getSystemArray")
  def getSystemArray_SystemArrayExternalSystemArraySystemArray[SystemArray /* <: samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[ExternalSystem] */](): SystemArray = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* InferMemberOverrides */
  override def push(items: samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
    tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
  ] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): tstlLib.baseIteratorArrayIteratorMod.ArrayReverseIterator[
    samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole, 
    tstlLib.containerDequeMod.Deque[samchonLib.templatesExternalExternalSystemRoleMod.ExternalSystemRole]
  ] = js.native
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
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

