package typings.samchonFramework.mod

import typings.samchon.ientityMod.IEntity
import typings.samchon.iprotocolMod.IProtocol
import typings.samchon.iserverMod.IServer
import typings.std.MessagePort
import typings.std.Uint8Array
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocol {
  
  @JSImport("samchon-framework", "protocol.ClientDriver")
  @js.native
  class ClientDriver protected ()
    extends typings.samchon.mod.protocol.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: js.Any) = this()
  }
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  class DedicatedWorkerClientDriver ()
    extends typings.samchon.mod.protocol.DedicatedWorkerClientDriver
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerServer")
  @js.native
  abstract class DedicatedWorkerServer ()
    extends typings.samchon.mod.protocol.DedicatedWorkerServer
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerServerBase")
  @js.native
  class DedicatedWorkerServerBase protected ()
    extends typings.samchon.mod.protocol.DedicatedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerServerConnector")
  @js.native
  class DedicatedWorkerServerConnector protected ()
    extends typings.samchon.mod.protocol.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon-framework", "protocol.Entity")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends typings.samchon.mod.protocol.Entity
  
  @JSImport("samchon-framework", "protocol.EntityArray")
  @js.native
  abstract class EntityArray[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityArray[T]
  
  @JSImport("samchon-framework", "protocol.EntityArrayCollection")
  @js.native
  abstract class EntityArrayCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityArrayCollection[T]
  
  @JSImport("samchon-framework", "protocol.EntityDeque")
  @js.native
  abstract class EntityDeque[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityDeque[T]
  
  @JSImport("samchon-framework", "protocol.EntityDequeCollection")
  @js.native
  abstract class EntityDequeCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityDequeCollection[T]
  
  @JSImport("samchon-framework", "protocol.EntityList")
  @js.native
  abstract class EntityList[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityList[T]
  
  @JSImport("samchon-framework", "protocol.EntityListCollection")
  @js.native
  abstract class EntityListCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityListCollection[T]
  
  object IEntity {
    
    @JSImport("samchon-framework", "protocol.IEntity")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def construct(entity: typings.samchon.ientityMod.IEntity, xml: XML, prohibited_names: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(entity.asInstanceOf[js.Any], xml.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def toXML(entity: typings.samchon.ientityMod.IEntity, prohibited_names: String*): XML = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(entity.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[XML]
  }
  
  object IEntityGroup {
    
    @JSImport("samchon-framework", "protocol.IEntityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @scala.inline
    def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: XML,
      prohibited_names: String*
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(entityGroup.asInstanceOf[js.Any], xml.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    @scala.inline
    def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      entityGroup: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @hidden
      */
    @scala.inline
    def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ js.Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ js.Any */](
      group: typings.samchon.ientitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: String*
    ): XML = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(group.asInstanceOf[js.Any], prohibited_names.asInstanceOf[js.Any])).asInstanceOf[XML]
  }
  
  @JSImport("samchon-framework", "protocol.Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  class Invoke ()
    extends typings.samchon.mod.protocol.Invoke {
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
  
  @JSImport("samchon-framework", "protocol.InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter ()
    extends typings.samchon.mod.protocol.InvokeParameter {
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
  
  @JSImport("samchon-framework", "protocol.Server")
  @js.native
  abstract class Server ()
    extends typings.samchon.mod.protocol.Server
  
  @JSImport("samchon-framework", "protocol.ServerBase")
  @js.native
  class ServerBase protected ()
    extends typings.samchon.mod.protocol.ServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon-framework", "protocol.ServerConnector")
  @js.native
  class ServerConnector protected ()
    extends typings.samchon.mod.protocol.ServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon-framework", "protocol.SharedWorkerClientDriver")
  @js.native
  class SharedWorkerClientDriver protected ()
    extends typings.samchon.mod.protocol.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  @JSImport("samchon-framework", "protocol.SharedWorkerServer")
  @js.native
  abstract class SharedWorkerServer ()
    extends typings.samchon.mod.protocol.SharedWorkerServer
  
  @JSImport("samchon-framework", "protocol.SharedWorkerServerBase")
  @js.native
  class SharedWorkerServerBase protected ()
    extends typings.samchon.mod.protocol.SharedWorkerServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon-framework", "protocol.SharedWorkerServerConnector")
  @js.native
  class SharedWorkerServerConnector protected ()
    extends typings.samchon.mod.protocol.SharedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  @JSImport("samchon-framework", "protocol.WebClientDriver")
  @js.native
  class WebClientDriver protected ()
    extends typings.samchon.mod.protocol.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: js.Any, path: String, session_id: String) = this()
  }
  
  @JSImport("samchon-framework", "protocol.WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class WebServer ()
    extends typings.samchon.mod.protocol.WebServer
  
  @JSImport("samchon-framework", "protocol.WebServerBase")
  @js.native
  class WebServerBase protected ()
    extends typings.samchon.mod.protocol.WebServerBase {
    /**
      * Construct from a *hooker*.
      *
      * @param hooker A hooker throwing responsibility of server's role.
      */
    def this(hooker: IServer) = this()
  }
  
  @JSImport("samchon-framework", "protocol.WebServerConnector")
  @js.native
  class WebServerConnector protected ()
    extends typings.samchon.mod.protocol.WebServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
}
