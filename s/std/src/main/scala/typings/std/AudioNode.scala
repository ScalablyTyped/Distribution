package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic interface for representing an audio processing module. Examples include: */
@js.native
trait AudioNode
  extends StObject
     with EventTarget {
  
  /* standard dom */
  var channelCount: Double = js.native
  
  /* standard dom */
  var channelCountMode: ChannelCountMode = js.native
  
  /* standard dom */
  var channelInterpretation: ChannelInterpretation = js.native
  
  /* standard dom */
  def connect(destinationNode: AudioNode): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double, input: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Unit, input: Double): AudioNode = js.native
  /* standard dom */
  def connect(destinationParam: AudioParam): Unit = js.native
  def connect(destinationParam: AudioParam, output: Double): Unit = js.native
  
  /* standard dom */
  val context: BaseAudioContext = js.native
  
  /* standard dom */
  def disconnect(): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: AudioNode): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: AudioNode, output: Double): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: AudioNode, output: Double, input: Double): Unit = js.native
  /* standard dom */
  def disconnect(destinationParam: AudioParam): Unit = js.native
  /* standard dom */
  def disconnect(destinationParam: AudioParam, output: Double): Unit = js.native
  /* standard dom */
  def disconnect(output: Double): Unit = js.native
  
  /* standard dom */
  val numberOfInputs: Double = js.native
  
  /* standard dom */
  val numberOfOutputs: Double = js.native
}
