package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An AudioScheduledSourceNode which represents an audio source consisting of in-memory audio data, stored in an AudioBuffer. It's especially useful for playing back audio which has particularly stringent timing accuracy requirements, such as for sounds that must match a specific rhythm and can be kept in memory rather than being played from disk or the network. */
@js.native
trait AudioBufferSourceNode
  extends StObject
     with AudioScheduledSourceNode {
  
  /* standard dom */
  var buffer: AudioBuffer | Null = js.native
  
  /* standard dom */
  val detune: AudioParam = js.native
  
  /* standard dom */
  var loop: scala.Boolean = js.native
  
  /* standard dom */
  var loopEnd: Double = js.native
  
  /* standard dom */
  var loopStart: Double = js.native
  
  /* standard dom */
  val playbackRate: AudioParam = js.native
  
  def start(when: Double, offset: Double): Unit = js.native
  def start(when: Double, offset: Double, duration: Double): Unit = js.native
  def start(when: Double, offset: Unit, duration: Double): Unit = js.native
  def start(when: Unit, offset: Double): Unit = js.native
  def start(when: Unit, offset: Double, duration: Double): Unit = js.native
  def start(when: Unit, offset: Unit, duration: Double): Unit = js.native
}
