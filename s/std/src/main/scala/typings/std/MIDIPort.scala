package typings.std

import typings.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort)
  */
@js.native
trait MIDIPort
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/close) */
  /* standard dom */
  def close(): js.Promise[MIDIPort] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/connection) */
  /* standard dom */
  val connection: MIDIPortConnectionState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/id) */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/manufacturer) */
  /* standard dom */
  val manufacturer: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/name) */
  /* standard dom */
  val name: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/statechange_event) */
  /* standard dom */
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/open) */
  /* standard dom */
  def open(): js.Promise[MIDIPort] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_statechange(`type`: statechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechange(
    `type`: statechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/state) */
  /* standard dom */
  val state: MIDIPortDeviceState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/type) */
  /* standard dom */
  val `type`: MIDIPortType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIPort/version) */
  /* standard dom */
  val version: java.lang.String | Null = js.native
}
