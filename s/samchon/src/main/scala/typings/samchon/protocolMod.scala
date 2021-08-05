package typings.samchon

import typings.samchon.ientityMod.IEntity
import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.iserverMod.IServer
import typings.std.MessagePort
import typings.std.Uint8Array
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolMod {
  
  @JSImport("samchon/protocol", "ClientDriver")
  @js.native
  class ClientDriver protected ()
    extends typings.samchon.clientDriverMod.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: js.Any) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  class DedicatedWorkerClientDriver ()
    extends typings.samchon.dedicatedWorkerClientDriverMod.DedicatedWorkerClientDriver
  
  @JSImport("samchon/protocol", "DedicatedWorkerServer")
  @js.native
  abstract class DedicatedWorkerServer ()
    extends typings.samchon.dedicatedWorkerServerMod.DedicatedWorkerServer
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerBase")
  @js.native
  class DedicatedWorkerServerBase protected ()
    extends typings.samchon.dedicatedWorkerServerBaseMod.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "DedicatedWorkerServerConnector")
  @js.native
  class DedicatedWorkerServerConnector protected ()
    extends typings.samchon.dedicatedWorkerServerConnectorMod.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "Entity")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends typings.samchon.entityMod.Entity
  
  @JSImport("samchon/protocol", "EntityArray")
  @js.native
  abstract class EntityArray[T /* <: IEntity */] ()
    extends typings.samchon.entityArrayMod.EntityArray[T]
  
  @JSImport("samchon/protocol", "EntityArrayCollection")
  @js.native
  abstract class EntityArrayCollection[T /* <: IEntity */] ()
    extends typings.samchon.entityCollectionMod.EntityArrayCollection[T]
  
  @JSImport("samchon/protocol", "EntityDeque")
  @js.native
  abstract class EntityDeque[T /* <: IEntity */] ()
    extends typings.samchon.entityArrayMod.EntityDeque[T]
  
  @JSImport("samchon/protocol", "EntityDequeCollection")
  @js.native
  abstract class EntityDequeCollection[T /* <: IEntity */] ()
    extends typings.samchon.entityCollectionMod.EntityDequeCollection[T]
  
  @JSImport("samchon/protocol", "EntityList")
  @js.native
  abstract class EntityList[T /* <: IEntity */] ()
    extends typings.samchon.entityArrayMod.EntityList[T]
  
  @JSImport("samchon/protocol", "EntityListCollection")
  @js.native
  abstract class EntityListCollection[T /* <: IEntity */] ()
    extends typings.samchon.entityCollectionMod.EntityListCollection[T]
  
  object IEntity {
    
    @JSImport("samchon/protocol", "IEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def construct(entity: typings.samchon.ientityMod.IEntity, xml: XML, prohibited_names: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(entity.asInstanceOf[js.Any], xml.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toXML(entity: typings.samchon.ientityMod.IEntity, prohibited_names: String*): XML = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(entity.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[XML]
  }
  
  object IEntityGroup {
    
    @JSImport("samchon/protocol", "IEntityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    inline def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: XML,
      prohibited_names: String*
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(entityGroup.asInstanceOf[js.Any], xml.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @hidden
      */
    inline def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      group: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: String*
    ): XML = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(group.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[XML]
  }
  
  @JSImport("samchon/protocol", "Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke ()
    extends typings.samchon.invokeMod.Invoke {
    /**
      * Copy Constructor.
      *
      * @param invoke
      */
    def this(invoke: typings.samchon.invokeMod.Invoke) = this()
    def this(listener: String) = this()
    /**
      * Construct from listener and parametric values.
      *
      * @param listener
      * @param parameters
      */
    def this(listener: String, parameters: (Boolean | Double | String | XML | Uint8Array)*) = this()
  }
  
  @JSImport("samchon/protocol", "InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter ()
    extends typings.samchon.invokeParameterMod.InvokeParameter {
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
  
  @JSImport("samchon/protocol", "Server")
  @js.native
  abstract class Server ()
    extends typings.samchon.serverMod.Server
  
  @JSImport("samchon/protocol", "ServerBase")
  @js.native
  class ServerBase protected ()
    extends typings.samchon.serverBaseMod.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "ServerConnector")
  @js.native
  class ServerConnector protected ()
    extends typings.samchon.serverConnectorMod.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerClientDriver")
  @js.native
  class SharedWorkerClientDriver protected ()
    extends typings.samchon.sharedWorkerClientDriverMod.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerServer")
  @js.native
  abstract class SharedWorkerServer ()
    extends typings.samchon.sharedWorkerServerMod.SharedWorkerServer
  
  @JSImport("samchon/protocol", "SharedWorkerServerBase")
  @js.native
  class SharedWorkerServerBase protected ()
    extends typings.samchon.sharedWorkerServerBaseMod.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "SharedWorkerServerConnector")
  @js.native
  class SharedWorkerServerConnector protected ()
    extends typings.samchon.sharedWorkerServerConnectorMod.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon/protocol", "WebClientDriver")
  @js.native
  class WebClientDriver protected ()
    extends typings.samchon.webClientDriverMod.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: String, session_id: String) = this()
  }
  
  @JSImport("samchon/protocol", "WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer ()
    extends typings.samchon.webServerMod.WebServer
  
  @JSImport("samchon/protocol", "WebServerBase")
  @js.native
  class WebServerBase protected ()
    extends typings.samchon.webServerBaseMod.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon/protocol", "WebServerConnector")
  @js.native
  class WebServerConnector protected ()
    extends typings.samchon.webServerConnectorMod.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
}
