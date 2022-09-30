package typings.sphereEngineBrowser.global

import typings.sphereEngineBrowser.sphereEngineBrowserInts.`16`
import typings.sphereEngineBrowser.sphereEngineBrowserInts.`32`
import typings.sphereEngineBrowser.sphereEngineBrowserInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a stream-like interface for playing raw audio data.
  */
@JSGlobal("SoundStream")
@js.native
/**
  * Construct a new audio stream with the given parameters.
  * @param sampleRate The sample rate of the audio data, in Hz.
  * @param bitsPerSample The number of bits per sample.
  * @param numChannels Number of independent audio channels in the audio data.
  */
open class SoundStream ()
  extends StObject
     with typings.sphereEngineBrowser.SoundStream {
  def this(sampleRate: Double) = this()
  def this(sampleRate: Double, bitsPerSample: `8` | `16` | `32`) = this()
  def this(sampleRate: Unit, bitsPerSample: `8` | `16` | `32`) = this()
  def this(sampleRate: Double, bitsPerSample: `8` | `16` | `32`, numChannels: Double) = this()
  def this(sampleRate: Double, bitsPerSample: Unit, numChannels: Double) = this()
  def this(sampleRate: Unit, bitsPerSample: `8` | `16` | `32`, numChannels: Double) = this()
  def this(sampleRate: Unit, bitsPerSample: Unit, numChannels: Double) = this()
}
