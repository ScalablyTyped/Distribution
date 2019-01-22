package typings
package samchonLib.templatesExternalExternalSystemRoleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/external/ExternalSystemRole", "ExternalSystemRole")
@js.native
abstract class ExternalSystemRole protected ()
  extends samchonLib.protocolEntityEntityMod.Entity
     with samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * Constructor from a system.
    *
    * @param system An external system containing this role.
    */
  def this(system: samchonLib.templatesExternalExternalSystemMod.ExternalSystem) = this()
  /**
    * A name, represents and identifies this {@link ExternalSystemRole role}.
    *
    * This {@link name} is an identifier represents this {@link ExternalSystemRole role}. This {@link name} is
    * used in {@link ExternalSystemArray.getRole} and {@link ExternalSystem.get}, as a key elements. Thus, this
    * {@link name} should be unique in an {@link ExternalSystemArray}.
    */
  var name: java.lang.String = js.native
  /**
    * @hidden
    */
  var system: js.Any = js.native
  /**
    * Get name, who represents and identifies this role.
    */
  def getName(): java.lang.String = js.native
  /**
    * Get parent {@link ExternalSystemRole} object.
    */
  def getSystem(): samchonLib.templatesExternalExternalSystemMod.ExternalSystem = js.native
  /**
    * Get grandparent {@link ExternalSystemArray}.
    *
    * Get the grandparent {@link ExternalSystemArray} object through this parent {@link ExternalSystem},
    * {@link ExternalSystem.getSystemArray ExternalSystem.getSystemArray()}.
    *
    * @return The grandparent {@link ExternalSystemArray} object.
    */
  def getSystemArray(): samchonLib.templatesExternalExternalSystemArrayMod.ExternalSystemArray[samchonLib.templatesExternalExternalSystemMod.ExternalSystem] = js.native
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
}

