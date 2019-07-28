package typings.samchonDashFramework.samchonDashFrameworkMod

import typings.samchon.protocolEntityIEntityGroupMod.IEntityGroup
import typings.samchon.protocolEntityIEntityMod.IEntity
import typings.samchon.protocolInvokeIProtocolMod.IProtocol
import typings.samchon.protocolServerIServerMod.IServer
import typings.std.MessagePort
import typings.std.Uint8Array
import typings.sxml.sxmlMod.XML
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.tstlMod.baseNs.Container
import typings.tstl.tstlMod.baseNs.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon-framework", "protocol")
@js.native
object protocolNs extends js.Object {
  @js.native
  class ClientDriver protected ()
    extends typings.samchon.samchonMod.protocolNs.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: js.Any) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class DedicatedWorkerClientDriver ()
    extends typings.samchon.samchonMod.protocolNs.DedicatedWorkerClientDriver
  
  @js.native
  abstract class DedicatedWorkerServer ()
    extends typings.samchon.samchonMod.protocolNs.DedicatedWorkerServer
  
  @js.native
  class DedicatedWorkerServerBase protected ()
    extends typings.samchon.samchonMod.protocolNs.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @js.native
  class DedicatedWorkerServerConnector protected ()
    extends typings.samchon.samchonMod.protocolNs.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends typings.samchon.samchonMod.protocolNs.Entity
  
  @js.native
  abstract class EntityArray[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityArray[T]
  
  @js.native
  abstract class EntityArrayCollection[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityArrayCollection[T]
  
  @js.native
  abstract class EntityDeque[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityDeque[T]
  
  @js.native
  abstract class EntityDequeCollection[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityDequeCollection[T]
  
  @js.native
  abstract class EntityList[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityList[T]
  
  @js.native
  abstract class EntityListCollection[T /* <: IEntity */] ()
    extends typings.samchon.samchonMod.protocolNs.EntityListCollection[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke ()
    extends typings.samchon.samchonMod.protocolNs.Invoke {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: typings.samchon.protocolInvokeInvokeMod.Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter ()
    extends typings.samchon.samchonMod.protocolNs.InvokeParameter {
    def this(`val`: String) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: Uint8Array) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: Uint8Array) = this()
    def this(name: String, `val`: XML) = this()
  }
  
  @js.native
  abstract class Server ()
    extends typings.samchon.samchonMod.protocolNs.Server
  
  @js.native
  class ServerBase protected ()
    extends typings.samchon.samchonMod.protocolNs.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @js.native
  class ServerConnector protected ()
    extends typings.samchon.samchonMod.protocolNs.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @js.native
  class SharedWorkerClientDriver protected ()
    extends typings.samchon.samchonMod.protocolNs.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  @js.native
  abstract class SharedWorkerServer ()
    extends typings.samchon.samchonMod.protocolNs.SharedWorkerServer
  
  @js.native
  class SharedWorkerServerBase protected ()
    extends typings.samchon.samchonMod.protocolNs.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @js.native
  class SharedWorkerServerConnector protected ()
    extends typings.samchon.samchonMod.protocolNs.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @js.native
  class WebClientDriver protected ()
    extends typings.samchon.samchonMod.protocolNs.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: String, session_id: String) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer ()
    extends typings.samchon.samchonMod.protocolNs.WebServer
  
  @js.native
  class WebServerBase protected ()
    extends typings.samchon.samchonMod.protocolNs.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @js.native
  class WebServerConnector protected ()
    extends typings.samchon.samchonMod.protocolNs.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSName("IEntityGroup")
  @js.native
  object IEntityGroupNs extends js.Object {
    /**
      * @hidden
      */
    def construct[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], xml: XML, prohibited_names: String*): Unit = js.native
    def count[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Double = js.native
    def get[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): T = js.native
    def has[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](entityGroup: IEntityGroup[T, SourceT, IteratorT, ReverseT], key: js.Any): Boolean = js.native
    /**
      * @hidden
      */
    def toXML[T /* <: IEntity */, SourceT /* <: Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](group: IEntityGroup[T, SourceT, IteratorT, ReverseT], prohibited_names: String*): XML = js.native
  }
  
  @JSName("IEntity")
  @js.native
  object IEntityNs extends js.Object {
    def construct(entity: IEntity, xml: XML, prohibited_names: String*): Unit = js.native
    def toXML(entity: IEntity, prohibited_names: String*): XML = js.native
  }
  
}

