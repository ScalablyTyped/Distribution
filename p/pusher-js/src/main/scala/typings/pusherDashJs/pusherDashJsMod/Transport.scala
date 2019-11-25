package typings.pusherDashJs.pusherDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pusherDashJs.pusherDashJsStrings.ws
  - typings.pusherDashJs.pusherDashJsStrings.wss
  - typings.pusherDashJs.pusherDashJsStrings.xhr_streaming
  - typings.pusherDashJs.pusherDashJsStrings.xhr_polling
  - typings.pusherDashJs.pusherDashJsStrings.sockjs
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sockjs: typings.pusherDashJs.pusherDashJsStrings.sockjs = this.cast("sockjs")
  @scala.inline
  def ws: typings.pusherDashJs.pusherDashJsStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typings.pusherDashJs.pusherDashJsStrings.wss = this.cast("wss")
  @scala.inline
  def xhr_polling: typings.pusherDashJs.pusherDashJsStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typings.pusherDashJs.pusherDashJsStrings.xhr_streaming = this.cast("xhr_streaming")
}

