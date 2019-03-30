package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The WebSocket object provides the API for creating and managing a WebSocket connection to a server, as well as for sending and receiving data on the connection. */
@js.native
trait WebSocket extends EventTarget {
  val CLOSED: scala.Double = js.native
  val CLOSING: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  var binaryType: BinaryType = js.native
  val bufferedAmount: scala.Double = js.native
  val extensions: java.lang.String = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val protocol: java.lang.String = js.native
  val readyState: scala.Double = js.native
  val url: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: stdLib.stdLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ CloseEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: stdLib.stdLibStrings.open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: ArrayBufferLike): scala.Unit = js.native
  def send(data: ArrayBufferView): scala.Unit = js.native
  def send(data: Blob): scala.Unit = js.native
}

@JSGlobal("WebSocket")
@js.native
class WebSocketCls protected () extends WebSocket {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, protocols: java.lang.String) = this()
  def this(url: java.lang.String, protocols: js.Array[java.lang.String]) = this()
}

@JSGlobal("WebSocket")
@js.native
object WebSocket
  extends org.scalablytyped.runtime.Instantiable2[
      /* url */ java.lang.String, 
      (/* protocols */ js.Array[java.lang.String]) | (/* protocols */ java.lang.String), 
      WebSocket
    ]
     with org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, WebSocket] {
  val CLOSED: scala.Double = js.native
  val CLOSING: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}

