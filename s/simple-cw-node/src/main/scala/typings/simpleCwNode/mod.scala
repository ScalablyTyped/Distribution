package typings.simpleCwNode

import typings.simpleCwNode.simpleCwNodeStrings.contacts
import typings.simpleCwNode.simpleCwNodeStrings.me
import typings.simpleCwNode.simpleCwNodeStrings.mySlashstatus
import typings.simpleCwNode.simpleCwNodeStrings.mySlashtasks
import typings.simpleCwNode.simpleCwNodeStrings.rooms
import typings.superagent.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // TODO 1. update superagent with generics
  // TODO 2. create underscore.deffered .d.ts file
  // TODO 3. refactor & improve specialized parameter methods
  // Merged declaration, ChatWork is both a callable function and a namespace
  inline def apply(): ChatWork = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ChatWork]
  
  @JSImport("simple-cw-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ChatWork extends StObject {
    
    var Deferred: Any = js.native
    
    // can't create specialized parameter
    // specialized parameter required compile-time constant string literal
    // GET      /rooms/{room_id}
    // PUT      /rooms/{room_id}
    // DELETE   /rooms/{room_id}
    // GET      /rooms/{room_id}/members
    // PUT      /rooms/{room_id}/members
    // GET      /rooms/{room_id}/messages <- not implemented yet
    // POST     /rooms/{room_id}/messages
    // GET      /rooms/{room_id}/messages/{message_id}
    // GET      /rooms/{room_id}/tasks
    // POST     /rooms/{room_id}/tasks
    // GET      /rooms/{room_id}/tasks/{task_id}
    // GET      /rooms/{room_id}/files
    // GET      /rooms/{room_id}/files/{file_id}
    // General functions
    def api(method: String, api: String): Any = js.native
    def api(
      method: String,
      api: String,
      args: Any,
      callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]
    ): Unit = js.native
    // return same type as _.Deferred()
    def api(method: String, api: String, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    
    var apiVersion: String = js.native
    
    def del(api: String): Any = js.native
    def del(api: String, args: Any, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // return same type as _.Deferred()
    def del(api: String, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    
    def get(api: String): Any = js.native
    def get(api: String, args: Any, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // return same type as _.Deferred()
    def get(api: String, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // http://developer.chatwork.com/ja/endpoint_contacts.html
    @JSName("get")
    def get_contacts(api: contacts, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // http://developer.chatwork.com/ja/endpoint_me.html
    @JSName("get")
    def get_me(api: me, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // http://developer.chatwork.com/ja/endpoint_my.html
    @JSName("get")
    def get_mystatus(api: mySlashstatus, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    @JSName("get")
    def get_mytasks(api: mySlashtasks, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // http://developer.chatwork.com/ja/endpoint_rooms.html
    @JSName("get")
    def get_rooms(api: rooms, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    
    // _.when
    def init(options: ChatWorkInitOptions): Unit = js.native
    
    def post(api: String): Any = js.native
    def post(api: String, args: Any, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // return same type as _.Deferred()
    def post(api: String, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    @JSName("post")
    def post_rooms(api: rooms, args: Any, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    
    def put(api: String): Any = js.native
    def put(api: String, args: Any, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    // return same type as _.Deferred()
    def put(api: String, callback: js.Function2[/* err */ js.Error, /* res */ Response, Unit]): Unit = js.native
    
    var sdkVersion: String = js.native
    
    var token: String = js.native
    
    // _.Deferred
    var when: Any = js.native
  }
  
  trait ChatWorkInitOptions extends StObject {
    
    var token: String
  }
  object ChatWorkInitOptions {
    
    inline def apply(token: String): ChatWorkInitOptions = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChatWorkInitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChatWorkInitOptions] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
