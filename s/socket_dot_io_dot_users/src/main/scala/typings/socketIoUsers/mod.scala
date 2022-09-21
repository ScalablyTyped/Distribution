package typings.socketIoUsers

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.expressSession.mod.SessionOptions
import typings.node.eventsMod.EventEmitter
import typings.socketIo.mod.Socket
import typings.socketIo.typedEventsMod.DefaultEventsMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io.users", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("socket.io.users", "CONNECTION_EVENTS")
  @js.native
  def CONNECTION_EVENTS: js.Array[String] = js.native
  inline def CONNECTION_EVENTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_EVENTS")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "Middleware")
  @js.native
  def Middleware: js.Function0[
    js.Function2[
      /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
      /* next */ js.Function0[Any], 
      Unit
    ]
  ] = js.native
  inline def Middleware_=(
    x: js.Function0[
      js.Function2[
        /* socket */ Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any], 
        /* next */ js.Function0[Any], 
        Unit
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Middleware")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "Namespaces")
  @js.native
  open class Namespaces () extends StObject
  object Namespaces {
    
    @JSImport("socket.io.users", "Namespaces")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def attach(namespace: String, socketUsersObj: Users): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(namespace.asInstanceOf[js.Any], socketUsersObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def get(namespace: String): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(namespace.asInstanceOf[js.Any]).asInstanceOf[Users]
    
    /* static member */
    @JSImport("socket.io.users", "Namespaces.socketUsersList")
    @js.native
    def socketUsersList: Any = js.native
    inline def socketUsersList_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("socketUsersList")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("socket.io.users", "Session")
  @js.native
  def Session: js.Function2[/* app */ Application_, /* options */ js.UndefOr[SessionOptions], Unit] = js.native
  inline def Session_=(x: js.Function2[/* app */ Application_, /* options */ js.UndefOr[SessionOptions], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Session")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "User")
  @js.native
  open class User () extends StObject {
    
    def attach(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): Unit = js.native
    
    /** same as in, checks if this user is inside a room */
    def belong(room: String): Boolean = js.native
    
    def detach(): Unit = js.native
    
    def detachSocket(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): Unit = js.native
    
    def emit(args: Any*): Unit = js.native
    
    def get(key: String): Any = js.native
    
    var id: String | Double = js.native
    
    /** same as belong, checks if this user is inside a room  */
    def in(room: String): Boolean = js.native
    
    var ip: String = js.native
    
    def join(room: String): Boolean = js.native
    
    def leave(room: String): Unit = js.native
    
    def leaveAll(): Unit = js.native
    
    var remoteAddresses: js.Array[String] = js.native
    
    var rooms: js.Array[String] = js.native
    
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, callback: js.Function0[Unit]): Unit = js.native
    
    var socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any] = js.native
    
    var sockets: js.Array[Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]] = js.native
    
    var store: Any = js.native
    
    def to(room: String): Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any] = js.native
  }
  
  @JSImport("socket.io.users", "Users")
  @js.native
  open class Users () extends EventEmitter {
    def this(namespace: String) = this()
    
    def add(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): User = js.native
    
    def create(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): User = js.native
    
    def emitAll(args: Any*): Unit = js.native
    
    def from(room: String): js.Array[User] = js.native
    
    def get(socket: Socket[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any]): User = js.native
    
    def getById(id: String): User = js.native
    def getById(id: Double): User = js.native
    
    def in(room: String): js.Array[User] = js.native
    
    def indexOf(user: User): Double = js.native
    
    def list(): js.Array[User] = js.native
    
    var namespace: String = js.native
    
    def push(_user: User): Unit = js.native
    
    def registerSocketEvents(currentUser: User): Unit = js.native
    
    def remove(user: User): Unit = js.native
    
    def room(room: String): js.Array[User] = js.native
    
    def size(): Double = js.native
    
    def takeId(request: Any): String | Double = js.native
    
    def update(user: User): Unit = js.native
    
    var users: js.Array[User] = js.native
  }
  object Users {
    
    @JSImport("socket.io.users", "Users")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def of(): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Users]
    inline def of(namespace: String): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(namespace.asInstanceOf[js.Any]).asInstanceOf[Users]
  }
  
  type SocketUserList = StringDictionary[Users]
}
