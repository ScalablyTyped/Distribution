package typings.simpleDashCwDashNode.simpleDashCwDashNodeMod

import typings.simpleDashCwDashNode.simpleDashCwDashNodeStrings.contacts
import typings.simpleDashCwDashNode.simpleDashCwDashNodeStrings.me
import typings.simpleDashCwDashNode.simpleDashCwDashNodeStrings.mySlashstatus
import typings.simpleDashCwDashNode.simpleDashCwDashNodeStrings.mySlashtasks
import typings.simpleDashCwDashNode.simpleDashCwDashNodeStrings.rooms
import typings.std.Error
import typings.superagent.superagentMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatWork extends js.Object {
  var Deferred: js.Any = js.native
  var apiVersion: String = js.native
  var sdkVersion: String = js.native
  var token: String = js.native
   // _.Deferred
  var when: js.Any = js.native
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
  def api(method: String, api: String): js.Any = js.native
  def api(
    method: String,
    api: String,
    args: js.Any,
    callback: js.Function2[/* err */ Error, /* res */ Response, Unit]
  ): Unit = js.native
   // return same type as _.Deferred()
  def api(method: String, api: String, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  def del(api: String): js.Any = js.native
  def del(api: String, args: js.Any, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
   // return same type as _.Deferred()
  def del(api: String, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  def get(api: String): js.Any = js.native
  def get(api: String, args: js.Any, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
   // return same type as _.Deferred()
  def get(api: String, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_contacts.html
  @JSName("get")
  def get_contacts(api: contacts, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_me.html
  @JSName("get")
  def get_me(api: me, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_my.html
  @JSName("get")
  def get_mystatus(api: mySlashstatus, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  @JSName("get")
  def get_mytasks(api: mySlashtasks, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_rooms.html
  @JSName("get")
  def get_rooms(api: rooms, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
   // _.when
  def init(options: ChatWorkInitOptions): Unit = js.native
  def post(api: String): js.Any = js.native
  def post(api: String, args: js.Any, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
   // return same type as _.Deferred()
  def post(api: String, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  @JSName("post")
  def post_rooms(api: rooms, args: js.Any, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  def put(api: String): js.Any = js.native
  def put(api: String, args: js.Any, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
   // return same type as _.Deferred()
  def put(api: String, callback: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
}

