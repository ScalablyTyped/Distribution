package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioProcessingEvent extends Event {
  val inputBuffer: AudioBuffer = js.native
  val outputBuffer: AudioBuffer = js.native
  val playbackTime: scala.Double = js.native
}

@JSGlobal("AudioProcessingEvent")
@js.native
object AudioProcessingEvent
  extends org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ AudioProcessingEventInit, 
      AudioProcessingEvent
    ]

