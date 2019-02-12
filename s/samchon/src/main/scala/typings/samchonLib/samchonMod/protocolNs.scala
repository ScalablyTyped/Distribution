package typings
package samchonLib.samchonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon", "protocol")
@js.native
object protocolNs extends js.Object {
  @js.native
  class ClientDriver protected ()
    extends samchonLib.protocolMod.ClientDriver {
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
    extends samchonLib.protocolMod.DedicatedWorkerClientDriver
  
  @js.native
  abstract class DedicatedWorkerServer ()
    extends samchonLib.protocolMod.DedicatedWorkerServer
  
  @js.native
  class DedicatedWorkerServerBase protected ()
    extends samchonLib.protocolMod.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  }
  
  @js.native
  class DedicatedWorkerServerConnector protected ()
    extends samchonLib.protocolMod.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends samchonLib.protocolMod.Entity
  
  @js.native
  abstract class EntityArray[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityArray[T]
  
  @js.native
  abstract class EntityArrayCollection[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityArrayCollection[T]
  
  @js.native
  abstract class EntityDeque[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityDeque[T]
  
  @js.native
  abstract class EntityDequeCollection[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityDequeCollection[T]
  
  @js.native
  abstract class EntityList[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityList[T]
  
  @js.native
  abstract class EntityListCollection[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
    extends samchonLib.protocolMod.EntityListCollection[T]
  
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke ()
    extends samchonLib.protocolMod.Invoke {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: samchonLib.protocolInvokeInvokeMod.Invoke) = this()
    def this(listener: java.lang.String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: java.lang.String, parameters: (scala.Boolean | scala.Double | java.lang.String | sxmlLib.sxmlMod.XML | stdLib.Uint8Array)*) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter ()
    extends samchonLib.protocolMod.InvokeParameter {
    def this(`val`: java.lang.String) = this()
    def this(`val`: scala.Boolean) = this()
    def this(`val`: scala.Double) = this()
    def this(`val`: stdLib.Uint8Array) = this()
    def this(`val`: sxmlLib.sxmlMod.XML) = this()
    def this(name: java.lang.String, `val`: java.lang.String) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: java.lang.String, `val`: scala.Boolean) = this()
    def this(name: java.lang.String, `val`: scala.Double) = this()
    def this(name: java.lang.String, `val`: stdLib.Uint8Array) = this()
    def this(name: java.lang.String, `val`: sxmlLib.sxmlMod.XML) = this()
  }
  
  @js.native
  abstract class Server ()
    extends samchonLib.protocolMod.Server
  
  @js.native
  class ServerBase protected ()
    extends samchonLib.protocolMod.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  }
  
  @js.native
  class ServerConnector protected ()
    extends samchonLib.protocolMod.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  }
  
  @js.native
  class SharedWorkerClientDriver protected ()
    extends samchonLib.protocolMod.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: stdLib.MessagePort) = this()
  }
  
  @js.native
  abstract class SharedWorkerServer ()
    extends samchonLib.protocolMod.SharedWorkerServer
  
  @js.native
  class SharedWorkerServerBase protected ()
    extends samchonLib.protocolMod.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  }
  
  @js.native
  class SharedWorkerServerConnector protected ()
    extends samchonLib.protocolMod.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  }
  
  @js.native
  class WebClientDriver protected ()
    extends samchonLib.protocolMod.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: java.lang.String, session_id: java.lang.String) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer ()
    extends samchonLib.protocolMod.WebServer
  
  @js.native
  class WebServerBase protected ()
    extends samchonLib.protocolMod.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: samchonLib.protocolServerIServerMod.IServer) = this()
  }
  
  @js.native
  class WebServerConnector protected ()
    extends samchonLib.protocolMod.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  }
  
  @JSName("IEntityGroup")
  @js.native
  object IEntityGroupNs extends js.Object {
    /**
      * @hidden
      */
    def construct[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
      entityGroup: samchonLib.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: sxmlLib.sxmlMod.XML,
      prohibited_names: java.lang.String*
    ): scala.Unit = js.native
    def count[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
      entityGroup: samchonLib.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): scala.Double = js.native
    def get[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
      entityGroup: samchonLib.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): T = js.native
    def has[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
      entityGroup: samchonLib.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): scala.Boolean = js.native
    /**
      * @hidden
      */
    def toXML[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */, SourceT /* <: tstlLib.tstlMod.baseNs.Container[T, SourceT, IteratorT, ReverseT, T] */, IteratorT /* <: tstlLib.baseIteratorIteratorMod.Iterator[T, SourceT, IteratorT, ReverseT, T] */, ReverseT /* <: tstlLib.tstlMod.baseNs.ReverseIterator[T, SourceT, IteratorT, ReverseT, T] */](
      group: samchonLib.protocolEntityIEntityGroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: java.lang.String*
    ): sxmlLib.sxmlMod.XML = js.native
  }
  
  @JSName("IEntity")
  @js.native
  object IEntityNs extends js.Object {
    def construct(
      entity: samchonLib.protocolEntityIEntityMod.IEntity,
      xml: sxmlLib.sxmlMod.XML,
      prohibited_names: java.lang.String*
    ): scala.Unit = js.native
    def toXML(entity: samchonLib.protocolEntityIEntityMod.IEntity, prohibited_names: java.lang.String*): sxmlLib.sxmlMod.XML = js.native
  }
  
}

