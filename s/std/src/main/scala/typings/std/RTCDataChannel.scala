package typings.std

import typings.std.stdStrings.bufferedamountlow
import typings.std.stdStrings.close
import typings.std.stdStrings.closing
import typings.std.stdStrings.error
import typings.std.stdStrings.message
import typings.std.stdStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel) */
@js.native
trait RTCDataChannel
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(`type`: bufferedamountlow, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closing(`type`: closing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closing(
    `type`: closing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_closing(
    `type`: closing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/binaryType) */
  /* standard dom */
  var binaryType: BinaryType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmount) */
  /* standard dom */
  val bufferedAmount: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedAmountLowThreshold) */
  /* standard dom */
  var bufferedAmountLowThreshold: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/id) */
  /* standard dom */
  val id: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/label) */
  /* standard dom */
  val label: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxPacketLifeTime) */
  /* standard dom */
  val maxPacketLifeTime: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/maxRetransmits) */
  /* standard dom */
  val maxRetransmits: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/negotiated) */
  /* standard dom */
  val negotiated: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/bufferedamountlow_event) */
  /* standard dom */
  var onbufferedamountlow: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/close_event) */
  /* standard dom */
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/closing_event) */
  /* standard dom */
  var onclosing: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/message_event) */
  /* standard dom */
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/open_event) */
  /* standard dom */
  var onopen: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/ordered) */
  /* standard dom */
  val ordered: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/protocol) */
  /* standard dom */
  val protocol: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/readyState) */
  /* standard dom */
  val readyState: RTCDataChannelState = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(`type`: bufferedamountlow, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bufferedamountlow(
    `type`: bufferedamountlow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(`type`: close, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closing(`type`: closing, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closing(
    `type`: closing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_closing(
    `type`: closing,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(`type`: message, listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent[Any], Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(`type`: open, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_open(
    `type`: open,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDataChannel/send) */
  /* standard dom */
  def send(data: java.lang.String): Unit = js.native
  /* standard dom */
  def send(data: js.typedarray.ArrayBuffer): Unit = js.native
  /* standard dom */
  def send(data: js.typedarray.ArrayBufferView): Unit = js.native
  /* standard dom */
  def send(data: Blob): Unit = js.native
}
