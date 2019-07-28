package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** AudioDestinationNode has no output (as it is the output, no more AudioNode can be linked after it in the audio graph) and one input. The number of channels in the input must be between 0 and the maxChannelCount value or an exception is raised. */
@js.native
trait AudioDestinationNode extends AudioNode {
  val maxChannelCount: Double = js.native
}

@JSGlobal("AudioDestinationNode")
@js.native
class AudioDestinationNodeCls () extends AudioDestinationNode

@JSGlobal("AudioDestinationNode")
@js.native
object AudioDestinationNode extends Instantiable0[AudioDestinationNode]

