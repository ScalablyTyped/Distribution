package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.sphereEngineBrowserInts.`16`
import typings.sphereEngineBrowser.sphereEngineBrowserInts.`24`
import typings.sphereEngineBrowser.sphereEngineBrowserInts.`32`
import typings.sphereEngineBrowser.sphereEngineBrowserInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mixes audio from different sources and allows them all to be controlled as a unit.
  */
@JSGlobal("Mixer")
@js.native
open class Mixer protected ()
  extends StObject
     with typings.sphereEngineBrowser.Mixer {
  /**
    * Construct a new mixer with the given parameters.
    * @param sampleRate    The sample rate of the audio produced by the mixer, in Hz.
    * @param bitsPerSample Number of bits per sample.
    * @param numChannels   Number of independent sound channels in the mixer output.
    */
  def this(sampleRate: Double, bitsPerSample: `8` | `16` | `24` | `32`) = this()
  def this(sampleRate: Double, bitsPerSample: `8` | `16` | `24` | `32`, numChannels: Double) = this()
  
  /** The output volume of the mixer. 0.0 is silent, 1.0 is full volume. */
  /* CompleteClass */
  var volume: Double = js.native
}
object Mixer {
  
  /** The default CD-quality mixer provided by the engine. */
  /* static member */
  @JSGlobal("Mixer.Default")
  @js.native
  val Default: typings.sphereEngineBrowser.Mixer = js.native
}
