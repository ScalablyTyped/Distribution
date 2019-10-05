package typings.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Web Audio API events that occur when a ScriptProcessorNode input buffer is ready to be processed. */
@js.native
trait AudioProcessingEvent extends Event {
  val inputBuffer: AudioBuffer = js.native
  val outputBuffer: AudioBuffer = js.native
  val playbackTime: Double = js.native
}

@JSGlobal("AudioProcessingEvent")
@js.native
object AudioProcessingEvent
  extends Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AudioProcessingEventInit, 
      AudioProcessingEvent
    ]

