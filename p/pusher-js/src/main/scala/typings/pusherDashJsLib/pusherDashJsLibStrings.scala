package typings
package pusherDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pusherDashJsLibStrings {
  @js.native
  sealed trait ajax extends js.Object
  
  @js.native
  sealed trait jsonp extends js.Object
  
  @js.native
  sealed trait sockjs
    extends pusherDashJsLib.pusherDashJsMod.Transport
  
  @js.native
  sealed trait ws
    extends pusherDashJsLib.pusherDashJsMod.Transport
  
  @js.native
  sealed trait wss
    extends pusherDashJsLib.pusherDashJsMod.Transport
  
  @js.native
  sealed trait xhr_polling
    extends pusherDashJsLib.pusherDashJsMod.Transport
  
  @js.native
  sealed trait xhr_streaming
    extends pusherDashJsLib.pusherDashJsMod.Transport
  
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

