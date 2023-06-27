package typings.std

import typings.std.stdStrings.boundary
import typings.std.stdStrings.end
import typings.std.stdStrings.error
import typings.std.stdStrings.mark
import typings.std.stdStrings.pause
import typings.std.stdStrings.resume
import typings.std.stdStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Speech API interface represents a speech request. It contains the content the speech service should read and information about how to read it (e.g. language, pitch and volume.)
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance)
  */
@js.native
trait SpeechSynthesisUtterance
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/lang) */
  /* standard dom */
  var lang: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/boundary_event) */
  /* standard dom */
  var onboundary: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/end_event) */
  /* standard dom */
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/error_event) */
  /* standard dom */
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/mark_event) */
  /* standard dom */
  var onmark: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pause_event) */
  /* standard dom */
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/resume_event) */
  /* standard dom */
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/start_event) */
  /* standard dom */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/pitch) */
  /* standard dom */
  var pitch: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/rate) */
  /* standard dom */
  var rate: Double = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(`type`: end, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(`type`: mark, listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/text) */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/voice) */
  /* standard dom */
  var voice: SpeechSynthesisVoice | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisUtterance/volume) */
  /* standard dom */
  var volume: Double = js.native
}
