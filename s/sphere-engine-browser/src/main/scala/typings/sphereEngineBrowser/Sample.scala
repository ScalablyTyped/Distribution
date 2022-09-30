package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an audio clip optimized for regular, repeated playback.
  */
@js.native
trait Sample extends StObject {
  
  /** Full, canonical SphereFS path of the audio file used for this sample. */
  val fileName: String = js.native
  
  /**
    * Play a new instance of this sample on a given mixer.
    * @param mixer   The mixer used to play back the sample.
    * @param options Playback options.
    */
  def play(mixer: Mixer): Unit = js.native
  def play(mixer: Mixer, options: SoundOptions): Unit = js.native
  
  /** Stop playback of all currently playing instances of this sample. */
  def stopAll(): Unit = js.native
}
