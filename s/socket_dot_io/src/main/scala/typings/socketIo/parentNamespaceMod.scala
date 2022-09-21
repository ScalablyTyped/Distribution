package typings.socketIo

import typings.socketIo.mod.Server
import typings.socketIo.namespaceMod.Namespace
import typings.socketIo.typedEventsMod.EventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentNamespaceMod {
  
  @JSImport("socket.io/dist/parent-namespace", "ParentNamespace")
  @js.native
  open class ParentNamespace[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */, ServerSideEvents /* <: EventsMap */, SocketData] protected () extends Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] {
    def this(server: Server[ListenEvents, EmitEvents, ServerSideEvents, SocketData]) = this()
    
    /* private */ var children: Any = js.native
    
    def createChild(name: String): Namespace[ListenEvents, EmitEvents, ServerSideEvents, SocketData] = js.native
  }
  /* static members */
  object ParentNamespace {
    
    @JSImport("socket.io/dist/parent-namespace", "ParentNamespace")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("socket.io/dist/parent-namespace", "ParentNamespace.count")
    @js.native
    def count: Any = js.native
    inline def count_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
  }
}
