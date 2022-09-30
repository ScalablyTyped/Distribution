package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an audio clip optimized for streaming playback.
  */
@js.native
trait Sound extends StObject {
  
  /** SphereFS path of the audio file used to construct the `Sound`. */
  val fileName: String = js.native
  
  /** Duration of this sound, in seconds. */
  val length: Double = js.native
  
  /**
    * L/R stereo balance. 0.0 is centered, +/- 1.0 is full right/left respectively.
    * @default 0.0
    */
  var pan: Double = js.native
  
  /**
    * Pause playback of this sound. It can be resumed later by calling `play()` without a mixer.
    */
  def pause(): Unit = js.native
  
  /**
    * Play the sound on a given mixer. If the sound is paused and a mixer is not specified, resume
    * playback from the paused position.
    * @param mixer The mixer used to play back the sound.
    */
  def play(): Unit = js.native
  def play(mixer: Mixer): Unit = js.native
  
  /** `true` if the sound is currently playing; `false` otherwise. */
  val playing: Boolean = js.native
  
  /** Playback position within the sound, in seconds. */
  var position: Double = js.native
  
  /**
    * Set to `true` to have the sound repeat over and over.
    * @default true
    */
  var repeat: Boolean = js.native
  
  /**
    * Playback speed. 1.0 is normal speed.
    * @default 1.0
    */
  var speed: Double = js.native
  
  /** Stop playback of this sound. */
  def stop(): Unit = js.native
  
  /**
    * Volume, as a percentage of the mixer's master volume. Sometimes called "gain".
    * @default 1.0
    */
  var volume: Double = js.native
}
