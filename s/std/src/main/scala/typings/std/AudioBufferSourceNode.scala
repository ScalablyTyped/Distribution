package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode)
  */
@js.native
trait AudioBufferSourceNode
  extends StObject
     with AudioScheduledSourceNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/buffer) */
  /* standard dom */
  var buffer: AudioBuffer | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/detune) */
  /* standard dom */
  val detune: AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loop) */
  /* standard dom */
  var loop: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopEnd) */
  /* standard dom */
  var loopEnd: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/loopStart) */
  /* standard dom */
  var loopStart: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioBufferSourceNode/playbackRate) */
  /* standard dom */
  val playbackRate: AudioParam = js.native
  
  def start(when: Double, offset: Double): Unit = js.native
  def start(when: Double, offset: Double, duration: Double): Unit = js.native
  def start(when: Double, offset: Unit, duration: Double): Unit = js.native
  def start(when: Unit, offset: Double): Unit = js.native
  def start(when: Unit, offset: Double, duration: Double): Unit = js.native
  def start(when: Unit, offset: Unit, duration: Double): Unit = js.native
}
