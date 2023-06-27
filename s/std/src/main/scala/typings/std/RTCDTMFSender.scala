package typings.std

import typings.std.stdStrings.tonechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender) */
@js.native
trait RTCDTMFSender
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/canInsertDTMF) */
  /* standard dom */
  val canInsertDTMF: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/insertDTMF) */
  /* standard dom */
  def insertDTMF(tones: java.lang.String): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Double, interToneGap: Double): Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: Unit, interToneGap: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/tonechange_event) */
  /* standard dom */
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCDTMFSender/toneBuffer) */
  /* standard dom */
  val toneBuffer: java.lang.String = js.native
}
