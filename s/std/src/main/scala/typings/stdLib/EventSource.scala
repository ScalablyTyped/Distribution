package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends EventTarget {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Returns the state of this EventSource object's connection. It can have the
    * values described below.
    */
  val readyState: scala.Double = js.native
  /**
    * Returns the URL providing the event stream.
    */
  val url: java.lang.String = js.native
  /**
    * Returns true if the credentials mode
    * for connection requests to the URL providing the
    * event stream is set to "include", and false otherwise.
    */
  val withCredentials: scala.Boolean = js.native
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
}

@JSGlobal("EventSource")
@js.native
class EventSourceCls protected () extends EventSource {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, eventSourceInitDict: EventSourceInit) = this()
}

@JSGlobal("EventSource")
@js.native
object EventSource
  extends org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, EventSource]
     with org.scalablytyped.runtime.Instantiable2[/* url */ java.lang.String, /* eventSourceInitDict */ EventSourceInit, EventSource] {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
}

