package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic interface for representing an audio processing module. Examples include: */
@js.native
trait AudioNode
  extends StObject
     with EventTarget {
  
  var channelCount: Double = js.native
  
  var channelCountMode: ChannelCountMode = js.native
  
  var channelInterpretation: ChannelInterpretation = js.native
  
  def connect(destinationNode: AudioNode): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double, input: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Unit, input: Double): AudioNode = js.native
  def connect(destinationParam: AudioParam): Unit = js.native
  def connect(destinationParam: AudioParam, output: Double): Unit = js.native
  
  val context: BaseAudioContext = js.native
  
  def disconnect(): Unit = js.native
  def disconnect(destinationNode: AudioNode): Unit = js.native
  def disconnect(destinationNode: AudioNode, output: Double): Unit = js.native
  def disconnect(destinationNode: AudioNode, output: Double, input: Double): Unit = js.native
  def disconnect(destinationParam: AudioParam): Unit = js.native
  def disconnect(destinationParam: AudioParam, output: Double): Unit = js.native
  def disconnect(output: Double): Unit = js.native
  
  val numberOfInputs: Double = js.native
  
  val numberOfOutputs: Double = js.native
}
