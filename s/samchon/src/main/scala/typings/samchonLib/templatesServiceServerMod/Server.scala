package typings
package samchonLib.templatesServiceServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service/Server", "Server")
@js.native
/**
  * Default Constructor.
  */
abstract class Server ()
  extends samchonLib.protocolServerWebServerMod.WebServer
     with samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * @hidden
    */
  var _Erase_user: js.Any = js.native
  /**
    * @hidden
    */
  var `account_map_`: js.Any = js.native
  /**
    * @hidden
    */
  var `session_map_`: js.Any = js.native
  /**
    * Factory method creating {@link User} object.
    *
    * @return A newly created {@link User} object.
    */
  /* protected */ def createUser(): samchonLib.templatesServiceUserMod.User = js.native
  /**
    * Get an {@link User} object by its *accountID*.
    *
    * @param accountID Account id of {@link User} to get.
    * @return An {@link User} object.
    */
  def get(accountID: java.lang.String): samchonLib.templatesServiceUserMod.User = js.native
  /**
    * Test wheter an {@link User} exists with the *accountID*.
    *
    * @param accountID Account id of {@link User} to find.
    * @return Exists or not.
    */
  def has(accountID: java.lang.String): scala.Boolean = js.native
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

