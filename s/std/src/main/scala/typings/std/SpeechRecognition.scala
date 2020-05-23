package typings.std

import typings.std.stdStrings.audioend
import typings.std.stdStrings.audiostart
import typings.std.stdStrings.end
import typings.std.stdStrings.error
import typings.std.stdStrings.nomatch
import typings.std.stdStrings.result
import typings.std.stdStrings.soundend
import typings.std.stdStrings.soundstart
import typings.std.stdStrings.speechend
import typings.std.stdStrings.speechstart
import typings.std.stdStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognition extends EventTarget {
  var continuous: scala.Boolean = js.native
  var grammars: SpeechGrammarList = js.native
  var interimResults: scala.Boolean = js.native
  var lang: java.lang.String = js.native
  var maxAlternatives: Double = js.native
  var onaudioend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onaudiostart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onnomatch: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | Null = js.native
  var onresult: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | Null = js.native
  var onsoundend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onsoundstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onspeechend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onspeechstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  def abort(): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(`type`: audioend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(`type`: audiostart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(`type`: soundend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(`type`: soundstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(`type`: speechend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(`type`: speechstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(`type`: audioend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(`type`: audiostart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(`type`: soundend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(`type`: soundstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(`type`: speechend, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(`type`: speechstart, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

