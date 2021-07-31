package typings.socketIoUsers

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Application_
import typings.expressSession.mod.SessionOptions
import typings.node.eventsMod.EventEmitter
import typings.socketIo.mod.Socket
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
  @scala.inline
  def CONNECTION_EVENTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_EVENTS")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "Middleware")
  @js.native
  def Middleware: js.Function0[js.Function2[/* socket */ Socket, /* next */ js.Function0[js.Any], Unit]] = js.native
  @scala.inline
  def Middleware_=(x: js.Function0[js.Function2[/* socket */ Socket, /* next */ js.Function0[js.Any], Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Middleware")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "Namespaces")
  @js.native
  class Namespaces () extends StObject
  object Namespaces {
    
    @JSImport("socket.io.users", "Namespaces")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def attach(namespace: String, socketUsersObj: Users): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(namespace.asInstanceOf[js.Any], socketUsersObj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    @scala.inline
    def get(namespace: String): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(namespace.asInstanceOf[js.Any]).asInstanceOf[Users]
    
    /* static member */
    @JSImport("socket.io.users", "Namespaces.socketUsersList")
    @js.native
    def socketUsersList: js.Any = js.native
    @scala.inline
    def socketUsersList_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("socketUsersList")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("socket.io.users", "Session")
  @js.native
  def Session: js.Function2[/* app */ Application_, /* options */ js.UndefOr[SessionOptions], Unit] = js.native
  @scala.inline
  def Session_=(x: js.Function2[/* app */ Application_, /* options */ js.UndefOr[SessionOptions], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Session")(x.asInstanceOf[js.Any])
  
  @JSImport("socket.io.users", "User")
  @js.native
  class User () extends StObject {
    
    def attach(socket: Socket): Unit = js.native
    
    /** same as in, checks if this user is inside a room */
    def belong(room: String): Boolean = js.native
    
    def detach(): Unit = js.native
    
    def detachSocket(socket: Socket): Unit = js.native
    
    def emit(args: js.Any*): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    var id: String | Double = js.native
    
    /** same as belong, checks if this user is inside a room  */
    def in(room: String): Boolean = js.native
    
    var ip: String = js.native
    
    def join(room: String): Boolean = js.native
    
    def leave(room: String): Unit = js.native
    
    def leaveAll(): Unit = js.native
    
    var remoteAddresses: js.Array[String] = js.native
    
    var rooms: js.Array[String] = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, callback: js.Function0[Unit]): Unit = js.native
    
    var socket: Socket = js.native
    
    var sockets: js.Array[Socket] = js.native
    
    var store: js.Any = js.native
    
    def to(room: String): Socket = js.native
  }
  
  @JSImport("socket.io.users", "Users")
  @js.native
  class Users () extends EventEmitter {
    def this(namespace: String) = this()
    
    def add(socket: Socket): User = js.native
    
    def create(socket: Socket): User = js.native
    
    def emitAll(args: js.Any*): Unit = js.native
    
    def from(room: String): js.Array[User] = js.native
    
    def get(socket: Socket): User = js.native
    
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
    
    def takeId(request: js.Any): String | Double = js.native
    
    def update(user: User): Unit = js.native
    
    var users: js.Array[User] = js.native
  }
  object Users {
    
    @JSImport("socket.io.users", "Users")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def of(): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("of")().asInstanceOf[Users]
    @scala.inline
    def of(namespace: String): Users = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(namespace.asInstanceOf[js.Any]).asInstanceOf[Users]
  }
  
  type SocketUserList = StringDictionary[Users]
}
