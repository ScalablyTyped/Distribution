package typings.samchonFramework.mod

import typings.samchon.protocolEntityIentityMod.IEntity
import typings.samchon.protocolInvokeIprotocolMod.IProtocol
import typings.samchon.protocolServerIserverMod.IServer
import typings.std.MessagePort
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocol {
  
  @JSImport("samchon-framework", "protocol.ClientDriver")
  @js.native
  open class ClientDriver protected ()
    extends typings.samchon.mod.protocol.ClientDriver {
    /**
      * Construct from a socket.
      */
    def this(socket: Any) = this()
  }
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerClientDriver")
  @js.native
  /**
    * Default Constructor.
    */
  open class DedicatedWorkerClientDriver ()
    extends typings.samchon.mod.protocol.DedicatedWorkerClientDriver
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.DedicatedWorkerServer")
  @js.native
  open class DedicatedWorkerServer ()
    extends typings.samchon.mod.protocol.DedicatedWorkerServer
  
  @JSImport("samchon-framework", "protocol.DedicatedWorkerServerBase")
  @js.native
  open class DedicatedWorkerServerBase protected ()
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
  open class DedicatedWorkerServerConnector protected ()
    extends typings.samchon.mod.protocol.DedicatedWorkerServerConnector {
    /**
      * Construct from *listener*.
      *
      * @param listener A listener object to listen replied message from newly connected client in
      *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
      */
    def this(listener: IProtocol) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.Entity")
  @js.native
  /**
    * Default Constructor.
    */
  open class Entity ()
    extends typings.samchon.mod.protocol.Entity
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityArray")
  @js.native
  open class EntityArray[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityArray[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityArrayCollection")
  @js.native
  open class EntityArrayCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityArrayCollection[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityDeque")
  @js.native
  open class EntityDeque[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityDeque[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityDequeCollection")
  @js.native
  open class EntityDequeCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityDequeCollection[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityList")
  @js.native
  open class EntityList[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityList[T]
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.EntityListCollection")
  @js.native
  open class EntityListCollection[T /* <: IEntity */] ()
    extends typings.samchon.mod.protocol.EntityListCollection[T]
  
  object IEntity {
    
    @JSImport("samchon-framework", "protocol.IEntity")
    @js.native
    val ^ : js.Any = js.native
    
    inline def construct(entity: typings.samchon.protocolEntityIentityMod.IEntity, xml: XML, prohibited_names: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entity.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def toXML(entity: typings.samchon.protocolEntityIentityMod.IEntity, prohibited_names: String*): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(entity.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
  }
  
  object IEntityGroup {
    
    @JSImport("samchon-framework", "protocol.IEntityGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    inline def construct[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typings.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      xml: XML,
      prohibited_names: String*
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")((scala.List(entityGroup.asInstanceOf[js.Any], xml.asInstanceOf[js.Any])).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
    
    inline def count[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typings.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def get[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typings.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def has[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      entityGroup: typings.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      key: Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(entityGroup.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * @hidden
      */
    inline def toXML[T /* <: IEntity */, SourceT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Container<T, SourceT, IteratorT, ReverseT> */ Any */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.Iterator<T, SourceT, IteratorT, ReverseT> */ Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify std.base.ReverseIterator<T, SourceT, IteratorT, ReverseT> */ Any */](
      group: typings.samchon.protocolEntityIentitygroupMod.IEntityGroup[T, SourceT, IteratorT, ReverseT],
      prohibited_names: String*
    ): XML = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(scala.List(group.asInstanceOf[js.Any]).`++`(prohibited_names.asInstanceOf[Seq[js.Any]])*).asInstanceOf[XML]
  }
  
  @JSImport("samchon-framework", "protocol.Invoke")
  @js.native
  /**
    * Default Constructor.
    */
  open class Invoke ()
    extends typings.samchon.mod.protocol.Invoke {
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
    def this(listener: String, parameters: (Boolean | Double | String | XML | js.typedarray.Uint8Array)*) = this()
  }
  
  @JSImport("samchon-framework", "protocol.InvokeParameter")
  @js.native
  /**
    * Default Constructor.
    */
  open class InvokeParameter ()
    extends typings.samchon.mod.protocol.InvokeParameter {
    def this(`val`: String) = this()
    def this(`val`: js.typedarray.Uint8Array) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    def this(name: String, `val`: js.typedarray.Uint8Array) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: XML) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.Server")
  @js.native
  open class Server ()
    extends typings.samchon.mod.protocol.Server
  
  @JSImport("samchon-framework", "protocol.ServerBase")
  @js.native
  open class ServerBase protected ()
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
  open class ServerConnector protected ()
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
  open class SharedWorkerClientDriver protected ()
    extends typings.samchon.mod.protocol.SharedWorkerClientDriver {
    /**
      * Construct from a MessagePort object.
      */
    def this(port: MessagePort) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.SharedWorkerServer")
  @js.native
  open class SharedWorkerServer ()
    extends typings.samchon.mod.protocol.SharedWorkerServer
  
  @JSImport("samchon-framework", "protocol.SharedWorkerServerBase")
  @js.native
  open class SharedWorkerServerBase protected ()
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
  open class SharedWorkerServerConnector protected ()
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
  open class WebClientDriver protected ()
    extends typings.samchon.mod.protocol.WebClientDriver {
    /**
      * Initialization Constructor.
      *
      * @param connection Connection driver, a socket for web-socket.
      * @param path Requested path.
      * @param session_id Session ID, an identifier of the remote client.
      */
    def this(connection: Any, path: String, session_id: String) = this()
  }
  
  /* note: abstract class */ @JSImport("samchon-framework", "protocol.WebServer")
  @js.native
  /**
    * Default Constructor.
    */
  open class WebServer ()
    extends typings.samchon.mod.protocol.WebServer
  
  @JSImport("samchon-framework", "protocol.WebServerBase")
  @js.native
  open class WebServerBase protected ()
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
  open class WebServerConnector protected ()
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
