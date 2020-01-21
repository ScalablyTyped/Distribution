package typings.ssUtils.ssutils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventSourceStatic
  extends EventTarget
     with Instantiable1[/* url */ String, IEventSourceStatic]
     with Instantiable2[/* url */ String, /* eventSourceInitDict */ IEventSourceInit, IEventSourceStatic] {
   // constant, always 1
  var CLOSED: ReadyState = js.native
  var CONNECTING: ReadyState = js.native
   // constant, always 0
  var OPEN: ReadyState = js.native
  var onerror: js.Function = js.native
  var onopen: js.Function = js.native
   // constant, always 2
  var readyState: ReadyState = js.native
  var url: String = js.native
  var withCredentials: Boolean = js.native
  def close(): Unit = js.native
  def onmessage(event: IOnMessageEvent): Unit = js.native
}

