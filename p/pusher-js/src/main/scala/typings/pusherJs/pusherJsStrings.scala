package typings.pusherJs

import typings.pusherJs.mod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pusherJsStrings {
  @js.native
  sealed trait ajax extends js.Object
  
  @js.native
  sealed trait jsonp extends js.Object
  
  @js.native
  sealed trait sockjs extends Transport
  
  @js.native
  sealed trait ws extends Transport
  
  @js.native
  sealed trait wss extends Transport
  
  @js.native
  sealed trait xhr_polling extends Transport
  
  @js.native
  sealed trait xhr_streaming extends Transport
  
  @scala.inline
  def ajax: ajax = "ajax".asInstanceOf[ajax]
  @scala.inline
  def jsonp: jsonp = "jsonp".asInstanceOf[jsonp]
  @scala.inline
  def sockjs: sockjs = "sockjs".asInstanceOf[sockjs]
  @scala.inline
  def ws: ws = "ws".asInstanceOf[ws]
  @scala.inline
  def wss: wss = "wss".asInstanceOf[wss]
  @scala.inline
  def xhr_polling: xhr_polling = "xhr_polling".asInstanceOf[xhr_polling]
  @scala.inline
  def xhr_streaming: xhr_streaming = "xhr_streaming".asInstanceOf[xhr_streaming]
}

