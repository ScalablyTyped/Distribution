package typings.std

import typings.std.stdStrings.boundary
import typings.std.stdStrings.end
import typings.std.stdStrings.error
import typings.std.stdStrings.mark
import typings.std.stdStrings.pause
import typings.std.stdStrings.resume
import typings.std.stdStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Speech API interface represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.) */
@js.native
trait SpeechSynthesisUtterance extends EventTarget {
  var lang: java.lang.String = js.native
  var onboundary: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]) | Null = js.native
  var onmark: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | Null = js.native
  var pitch: Double = js.native
  var rate: Double = js.native
  var text: java.lang.String = js.native
  var voice: SpeechSynthesisVoice | Null = js.native
  var volume: Double = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(`type`: resume, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(`type`: pause, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(`type`: resume, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

