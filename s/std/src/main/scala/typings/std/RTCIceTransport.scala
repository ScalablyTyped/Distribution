package typings.std

import typings.std.stdStrings.gatheringstatechange
import typings.std.stdStrings.selectedcandidatepairchange
import typings.std.stdStrings.statechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to information about the ICE transport layer over which the data is being sent and received.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport)
  */
@js.native
trait RTCIceTransport
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringState) */
  /* standard dom */
  val gatheringState: RTCIceGathererState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/getSelectedCandidatePair) */
  /* standard dom */
  def getSelectedCandidatePair(): RTCIceCandidatePair | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event) */
  /* standard dom */
  var ongatheringstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event) */
  /* standard dom */
  var onselectedcandidatepairchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event) */
  /* standard dom */
  var onstatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_gatheringstatechange(
    `type`: gatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectedcandidatepairchange(
    `type`: selectedcandidatepairchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/state) */
  /* standard dom */
  val state: RTCIceTransportState = js.native
}
