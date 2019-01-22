package typings
package samchonLib.templatesServiceUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service/User", "User")
@js.native
abstract class User protected ()
  extends ecolLib.ecolMod.HashMapCollection[scala.Double, samchonLib.templatesServiceClientMod.Client]
     with samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * Construct from its parent {@link Server}.
    *
    * @param server The parent {@link Server} object.
    */
  def this(server: samchonLib.templatesServiceServerMod.Server) = this()
  /**
    * @hidden
    */
  var _Handle_erase_client: js.Any = js.native
  /**
    * @hidden
    */
  var `account_id_`: js.Any = js.native
  /**
    * @hidden
    */
  var `authority_`: js.Any = js.native
  /**
    * @hidden
    */
  var `sequence_`: js.Any = js.native
  /**
    * @hidden
    */
  var `server_`: js.Any = js.native
  /**
    * @hidden
    */
  var `session_id_`: js.Any = js.native
  /**
    * Iterator to the first element.
    *
    * @return Iterator to the first element.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def begin(): tstlLib.baseIteratorMapIteratorMod.MapIterator[
    scala.Double, 
    samchonLib.templatesServiceClientMod.Client, 
    tstlLib.tstlLibNumbers.`true`, 
    tstlLib.containerHashMapMod.HashMap[scala.Double, samchonLib.templatesServiceClientMod.Client]
  ] = js.native
  /**
    * Count elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of elements with the specified key.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def count(key: scala.Double): scala.Double = js.native
  /**
    * Factory method creating a {@link Client} object.
    *
    * @param driver A web communicator for remote client.
    * @return A newly created {@link Client} object.
    */
  /* protected */ def createClient(driver: samchonLib.protocolCommunicatorClientUnderscoreDriverWebClientDriverMod.WebClientDriver): samchonLib.templatesServiceClientMod.Client = js.native
  /**
    * Default Destructor.
    *
    * This {@link destructor destructor()} method is called when the {@link User} object is destructed. The
    * {@link User} object is destructed when connections with the remote clients are all closed, that is all the
    * children {@link Client} objects are all removed, and 30 seconds has left. If some remote client connects
    * within the 30 seconds, then the {@link User} object doesn't be destructed.
    *
    * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
    * by those *destruction* cases. Also, if your derived {@link User} class has something to do on the
    * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
    * Overriding this {@link destructor destructor()}, don't forget to calling ```super.destructor();``` on tail.
    *
    * ```typescript
    * class MyUser extends service.User
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
  /* CompleteClass */
  /* InferMemberOverrides */
  override def end(): tstlLib.baseIteratorMapIteratorMod.MapIterator[
    scala.Double, 
    samchonLib.templatesServiceClientMod.Client, 
    tstlLib.tstlLibNumbers.`true`, 
    tstlLib.containerHashMapMod.HashMap[scala.Double, samchonLib.templatesServiceClientMod.Client]
  ] = js.native
  /**
    * Erase elements with a specified key.
    *
    * @param key Key to search for.
    * @return Number of erased elements.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def erase(key: scala.Double): scala.Double = js.native
  /**
    * Get iterator to element.
    *
    * @param key Key to search for.
    * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def find(key: scala.Double): tstlLib.baseIteratorMapIteratorMod.MapIterator[
    scala.Double, 
    samchonLib.templatesServiceClientMod.Client, 
    tstlLib.tstlLibNumbers.`true`, 
    tstlLib.containerHashMapMod.HashMap[scala.Double, samchonLib.templatesServiceClientMod.Client]
  ] = js.native
  /**
    * Get account id.
    *
    * @return Account ID.
    */
  def getAccountID(): java.lang.String = js.native
  /**
    * Get authority.
    *
    * @return Authority
    */
  def getAuthority(): scala.Double = js.native
  /**
    * Get parent {@lin Server} object.
    *
    * @return Parent {@link Server} object.
    */
  def getServer(): samchonLib.templatesServiceServerMod.Server = js.native
  /**
    * Test whether a key exists.
    *
    * @param key Key to search for.
    * @return Whether the specified key exists.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def has(key: scala.Double): scala.Boolean = js.native
  /**
    * Log-out.
    *
    * This {@link logout logout()} method configures {@link getAccountID account id} to empty string and
    * {@link getAuthority authority} to zero.
    *
    * The ordinary {@link getAccountID account id} will be also erased from the parent {@link Server} object. You
    * can't access this {@link User} object from {@link Server.has Server.has()} and {@link Server.get Server.get()}
    * with the ordinary {@link getAccountID account id} more.
    */
  def logout(): scala.Unit = js.native
  /**
    * Insert items at the end.
    *
    * @param items Items to insert.
    * @return Number of elements in the container after insertion.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def push(items: (tstlLib.utilityEntryMod.Entry[scala.Double, samchonLib.templatesServiceClientMod.Client])*): scala.Double = js.native
  /**
    * Reverse iterator to the first element in reverse.
    *
    * @return Reverse iterator to the first.
    */
  /* InferMemberOverrides */
  override def rbegin(): tstlLib.baseIteratorMapIteratorMod.MapReverseIterator[
    scala.Double, 
    samchonLib.templatesServiceClientMod.Client, 
    tstlLib.tstlLibNumbers.`true`, 
    tstlLib.containerHashMapMod.HashMap[scala.Double, samchonLib.templatesServiceClientMod.Client]
  ] = js.native
  /**
    * Reverse iterator to the reverse end.
    *
    * @return Reverse iterator to the end.
    */
  /* InferMemberOverrides */
  override def rend(): tstlLib.baseIteratorMapIteratorMod.MapReverseIterator[
    scala.Double, 
    samchonLib.templatesServiceClientMod.Client, 
    tstlLib.tstlLibNumbers.`true`, 
    tstlLib.containerHashMapMod.HashMap[scala.Double, samchonLib.templatesServiceClientMod.Client]
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
    * Set *account id* and *authority*.
    *
    * The {@link setAccount setAccount()} is a method configuring *account id* and *authority* of this {@link User}.
    *
    * After the configuring, the {@link getAccountID account id} is enrolled into the parent {@link Server} as a
    * **key** for this {@link User} object. You can test existence and access this {@link User} object from
    * {@link Server.has Server.has()} and {@link Server.get Server.get()} with the {@link getAccountID account id}.
    * Of course, if ordinary {@link getAccountID account id} had existed, then the ordinary **key** will be
    * replaced.
    *
    * As you suggest, this {@link setAccount setAccount()} is something like a **log-in** function. If what you want
    * is not **logging-in**, but **logging-out**, then configure the *account id* to empty string ``""```` or call
    * the {@link lgout logout()} method.
    *
    * @param id To be account id.
    * @param authority To be authority.
    */
  def setAccount(id: java.lang.String, authority: scala.Double): scala.Unit = js.native
  /**
    * Number of elements in the container.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def size(): scala.Double = js.native
}

