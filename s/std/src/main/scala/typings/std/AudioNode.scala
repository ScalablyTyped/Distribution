package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic interface for representing an audio processing module. Examples include:
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode)
  */
@js.native
trait AudioNode
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCount) */
  /* standard dom */
  var channelCount: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelCountMode) */
  /* standard dom */
  var channelCountMode: ChannelCountMode = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/channelInterpretation) */
  /* standard dom */
  var channelInterpretation: ChannelInterpretation = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/connect) */
  /* standard dom */
  def connect(destinationNode: AudioNode): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Double, input: Double): AudioNode = js.native
  def connect(destinationNode: AudioNode, output: Unit, input: Double): AudioNode = js.native
  /* standard dom */
  def connect(destinationParam: AudioParam): Unit = js.native
  def connect(destinationParam: AudioParam, output: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/context) */
  /* standard dom */
  val context: BaseAudioContext = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/disconnect) */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfInputs) */
  /* standard dom */
  val numberOfInputs: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioNode/numberOfOutputs) */
  /* standard dom */
  val numberOfOutputs: Double = js.native
}
