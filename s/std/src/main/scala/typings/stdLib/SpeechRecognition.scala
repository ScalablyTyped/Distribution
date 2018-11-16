package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognition extends EventTarget {
  var continuous: scala.Boolean = js.native
  var grammars: SpeechGrammarList = js.native
  var interimResults: scala.Boolean = js.native
  var lang: java.lang.String = js.native
  var maxAlternatives: scala.Double = js.native
  var onaudioend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onaudiostart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]) | scala.Null = js.native
  var onnomatch: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | scala.Null = js.native
  var onresult: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]) | scala.Null = js.native
  var onsoundend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onsoundstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onspeechend: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onspeechstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var serviceURI: java.lang.String = js.native
  def abort(): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audioend(
    `type`: stdLib.stdLibStrings.audioend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_audiostart(
    `type`: stdLib.stdLibStrings.audiostart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: stdLib.stdLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionError, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_nomatch(
    `type`: stdLib.stdLibStrings.nomatch,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_result(
    `type`: stdLib.stdLibStrings.result,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechRecognitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundend(
    `type`: stdLib.stdLibStrings.soundend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_soundstart(
    `type`: stdLib.stdLibStrings.soundstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechend(
    `type`: stdLib.stdLibStrings.speechend,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_speechstart(
    `type`: stdLib.stdLibStrings.speechstart,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: stdLib.stdLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

@JSGlobal("SpeechRecognition")
@js.native
object SpeechRecognition
  extends ScalablyTyped.runtime.Instantiable0[SpeechRecognition]

