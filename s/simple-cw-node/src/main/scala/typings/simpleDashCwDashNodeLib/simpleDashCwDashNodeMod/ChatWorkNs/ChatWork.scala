package typings
package simpleDashCwDashNodeLib.simpleDashCwDashNodeMod.ChatWorkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChatWork extends js.Object {
  var Deferred: js.Any = js.native
  var apiVersion: java.lang.String = js.native
  var sdkVersion: java.lang.String = js.native
  var token: java.lang.String = js.native
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
  def api(method: java.lang.String, api: java.lang.String): js.Any = js.native
  def api(
    method: java.lang.String,
    api: java.lang.String,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // return same type as _.Deferred()
  def api(
    method: java.lang.String,
    api: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def del(api: java.lang.String): js.Any = js.native
  def del(
    api: java.lang.String,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // return same type as _.Deferred()
  def del(
    api: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def get(api: java.lang.String): js.Any = js.native
  def get(
    api: java.lang.String,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // return same type as _.Deferred()
  def get(
    api: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_contacts.html
  @JSName("get")
  def get_contacts(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.contacts,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_me.html
  @JSName("get")
  def get_me(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.me,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_my.html
  @JSName("get")
  def `get_my/status`(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.`my/status`,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("get")
  def `get_my/tasks`(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.`my/tasks`,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  // http://developer.chatwork.com/ja/endpoint_rooms.html
  @JSName("get")
  def get_rooms(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.rooms,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // _.when
  def init(options: ChatWorkInitOptions): scala.Unit = js.native
  def post(api: java.lang.String): js.Any = js.native
  def post(
    api: java.lang.String,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // return same type as _.Deferred()
  def post(
    api: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("post")
  def post_rooms(
    api: simpleDashCwDashNodeLib.simpleDashCwDashNodeLibStrings.rooms,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def put(api: java.lang.String): js.Any = js.native
  def put(
    api: java.lang.String,
    args: js.Any,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
   // return same type as _.Deferred()
  def put(
    api: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ superagentLib.superagentMod.requestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

