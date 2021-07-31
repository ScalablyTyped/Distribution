package typings.std

import typings.std.stdStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer. */
@js.native
trait OfflineAudioContext
  extends StObject
     with BaseAudioContext {
  
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val length: Double = js.native
  
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  def resume(): js.Promise[Unit] = js.native
  
  def startRendering(): js.Promise[AudioBuffer] = js.native
  
  def suspend(suspendTime: Double): js.Promise[Unit] = js.native
}
