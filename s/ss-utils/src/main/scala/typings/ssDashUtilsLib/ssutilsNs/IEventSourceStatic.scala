package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventSourceStatic
  extends stdLib.EventTarget
     with ScalablyTyped.runtime.Instantiable1[/* url */ java.lang.String, IEventSourceStatic]
     with ScalablyTyped.runtime.Instantiable2[
      /* url */ java.lang.String, 
      /* eventSourceInitDict */ IEventSourceInit, 
      IEventSourceStatic
    ] {
   // constant, always 1
  var CLOSED: ReadyState = js.native
  var CONNECTING: ReadyState = js.native
   // constant, always 0
  var OPEN: ReadyState = js.native
  var onerror: js.Function = js.native
  var onopen: js.Function = js.native
   // constant, always 2
  var readyState: ReadyState = js.native
  var url: java.lang.String = js.native
  var withCredentials: scala.Boolean = js.native
  def close(): scala.Unit = js.native
  def onmessage(event: IOnMessageEvent): scala.Unit = js.native
}

