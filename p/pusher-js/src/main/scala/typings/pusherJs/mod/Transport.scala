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
  def sockjs: typings.pusherJs.pusherJsStrings.sockjs = "sockjs".asInstanceOf[typings.pusherJs.pusherJsStrings.sockjs]
  @scala.inline
  def ws: typings.pusherJs.pusherJsStrings.ws = "ws".asInstanceOf[typings.pusherJs.pusherJsStrings.ws]
  @scala.inline
  def wss: typings.pusherJs.pusherJsStrings.wss = "wss".asInstanceOf[typings.pusherJs.pusherJsStrings.wss]
  @scala.inline
  def xhr_polling: typings.pusherJs.pusherJsStrings.xhr_polling = "xhr_polling".asInstanceOf[typings.pusherJs.pusherJsStrings.xhr_polling]
  @scala.inline
  def xhr_streaming: typings.pusherJs.pusherJsStrings.xhr_streaming = "xhr_streaming".asInstanceOf[typings.pusherJs.pusherJsStrings.xhr_streaming]
}

