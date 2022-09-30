package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a stream-like interface for playing raw audio data.
  */
@js.native
trait SoundStream extends StObject {
  
  /* Amount of audio currently buffered (and not yet played), in seconds. */
  val length: Double = js.native
  
  /** Pause playback of this audio stream. */
  def pause(): Unit = js.native
  
  /**
    * Play this audio stream on a given mixer. If the stream is paused and a mixer is not
    * specified, resume playback from the paused position.
    */
  def play(): Unit = js.native
  def play(mixer: Mixer): Unit = js.native
  
  /** Stop playback and discard any unplayed data in the stream buffer. */
  def stop(): Unit = js.native
  
  /**
    * Write new audio data to the end of the stream buffer. Can (and should!) be called during
    * active playback.
    * @param data Buffer containing audio data to feed into the stream.
    */
  def write(data: js.typedarray.ArrayBuffer): Unit = js.native
  def write(data: js.typedarray.ArrayBufferView): Unit = js.native
}
