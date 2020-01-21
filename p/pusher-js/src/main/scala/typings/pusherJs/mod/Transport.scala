package typings.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pusherJs.pusherJsStrings.ws
  - typings.pusherJs.pusherJsStrings.wss
  - typings.pusherJs.pusherJsStrings.xhr_streaming
  - typings.pusherJs.pusherJsStrings.xhr_polling
  - typings.pusherJs.pusherJsStrings.sockjs
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sockjs: typings.pusherJs.pusherJsStrings.sockjs = this.cast("sockjs")
  @scala.inline
  def ws: typings.pusherJs.pusherJsStrings.ws = this.cast("ws")
  @scala.inline
  def wss: typings.pusherJs.pusherJsStrings.wss = this.cast("wss")
  @scala.inline
  def xhr_polling: typings.pusherJs.pusherJsStrings.xhr_polling = this.cast("xhr_polling")
  @scala.inline
  def xhr_streaming: typings.pusherJs.pusherJsStrings.xhr_streaming = this.cast("xhr_streaming")
}

