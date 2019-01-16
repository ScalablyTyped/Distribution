package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioNode extends EventTarget {
  var channelCount: scala.Double = js.native
  var channelCountMode: ChannelCountMode = js.native
  var channelInterpretation: ChannelInterpretation = js.native
  val context: BaseAudioContext = js.native
  val numberOfInputs: scala.Double = js.native
  val numberOfOutputs: scala.Double = js.native
  def connect(destinationNode: AudioNode): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: scala.Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: scala.Double, input: scala.Double): AudioNode = js.native
  def connect(destinationParam: AudioParam): scala.Unit = js.native
  def connect(destinationParam: AudioParam, output: scala.Double): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(destinationNode: AudioNode): scala.Unit = js.native
  def disconnect(destinationNode: AudioNode, output: scala.Double): scala.Unit = js.native
  def disconnect(destinationNode: AudioNode, output: scala.Double, input: scala.Double): scala.Unit = js.native
  def disconnect(destinationParam: AudioParam): scala.Unit = js.native
  def disconnect(destinationParam: AudioParam, output: scala.Double): scala.Unit = js.native
  def disconnect(output: scala.Double): scala.Unit = js.native
}

@JSGlobal("AudioNode")
@js.native
object AudioNode
  extends org.scalablytyped.runtime.Instantiable0[AudioNode]

