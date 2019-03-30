package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SpeechSynthesisUtterance interface of the Web Speech API represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.) */
@js.native
trait SpeechSynthesisUtterance extends EventTarget {
  var lang: java.lang.String = js.native
  var onboundary: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]) | scala.Null = js.native
  var onmark: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var pitch: scala.Double = js.native
  var rate: scala.Double = js.native
  var text: java.lang.String = js.native
  var voice: SpeechSynthesisVoice = js.native
  var volume: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: stdLib.stdLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: stdLib.stdLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: stdLib.stdLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: stdLib.stdLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("SpeechSynthesisUtterance")
@js.native
class SpeechSynthesisUtteranceCls () extends SpeechSynthesisUtterance {
  def this(text: java.lang.String) = this()
}

@JSGlobal("SpeechSynthesisUtterance")
@js.native
object SpeechSynthesisUtterance
  extends org.scalablytyped.runtime.Instantiable0[SpeechSynthesisUtterance]
     with org.scalablytyped.runtime.Instantiable1[/* text */ java.lang.String, SpeechSynthesisUtterance]

