package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The OfflineAudioContext interface is an AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer. */
@js.native
trait OfflineAudioContext extends BaseAudioContext {
  val length: scala.Double = js.native
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: stdLib.stdLibStrings.complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ OfflineAudioCompletionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def startRendering(): js.Promise[AudioBuffer] = js.native
  def suspend(suspendTime: scala.Double): js.Promise[scala.Unit] = js.native
}

@JSGlobal("OfflineAudioContext")
@js.native
class OfflineAudioContextCls protected () extends OfflineAudioContext {
  def this(contextOptions: OfflineAudioContextOptions) = this()
  def this(numberOfChannels: scala.Double, length: scala.Double, sampleRate: scala.Double) = this()
}

@JSGlobal("OfflineAudioContext")
@js.native
object OfflineAudioContext
  extends org.scalablytyped.runtime.Instantiable1[/* contextOptions */ OfflineAudioContextOptions, OfflineAudioContext]
     with org.scalablytyped.runtime.Instantiable3[
      /* numberOfChannels */ scala.Double, 
      /* length */ scala.Double, 
      /* sampleRate */ scala.Double, 
      OfflineAudioContext
    ]

