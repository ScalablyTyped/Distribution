package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCDTMFSender extends EventTarget {
  val canInsertDTMF: scala.Boolean = js.native
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]) | scala.Null = js.native
  val toneBuffer: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: scala.Double): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: scala.Double, interToneGap: scala.Double): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@js.native
trait RTCDtmfSender extends EventTarget {
  val canInsertDTMF: scala.Boolean = js.native
  val duration: scala.Double = js.native
  val interToneGap: scala.Double = js.native
  var ontonechange: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]) | scala.Null = js.native
  val sender: RTCRtpSender = js.native
  val toneBuffer: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: scala.Double): scala.Unit = js.native
  def insertDTMF(tones: java.lang.String, duration: scala.Double, interToneGap: scala.Double): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_tonechange(
    `type`: stdLib.stdLibStrings.tonechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDTMFToneChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("RTCDTMFSender")
@js.native
object RTCDTMFSender
  extends org.scalablytyped.runtime.Instantiable0[RTCDTMFSender]

@JSGlobal("RTCDtmfSender")
@js.native
object RTCDtmfSender
  extends org.scalablytyped.runtime.Instantiable1[/* sender */ RTCRtpSender, RTCDtmfSender]

