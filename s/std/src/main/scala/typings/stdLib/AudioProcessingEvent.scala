package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Web Audio API AudioProcessingEvent represents events that occur when a ScriptProcessorNode input buffer is ready to be processed. */
@js.native
trait AudioProcessingEvent extends Event {
  val inputBuffer: AudioBuffer = js.native
  val outputBuffer: AudioBuffer = js.native
  val playbackTime: scala.Double = js.native
}

@JSGlobal("AudioProcessingEvent")
@js.native
class AudioProcessingEventCls protected () extends AudioProcessingEvent {
  def this(`type`: java.lang.String, eventInitDict: AudioProcessingEventInit) = this()
}

@JSGlobal("AudioProcessingEvent")
@js.native
object AudioProcessingEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AudioProcessingEventInit, 
      AudioProcessingEvent
    ]

