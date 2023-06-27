package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A node able to provide real-time frequency and time-domain analysis information. It is an AudioNode that passes the audio stream unchanged from the input to the output, but allows you to take the generated data, process it, and create audio visualizations.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode)
  */
@js.native
trait AnalyserNode
  extends StObject
     with AudioNode {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/fftSize) */
  /* standard dom */
  var fftSize: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/frequencyBinCount) */
  /* standard dom */
  val frequencyBinCount: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteFrequencyData) */
  /* standard dom */
  def getByteFrequencyData(array: js.typedarray.Uint8Array): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getByteTimeDomainData) */
  /* standard dom */
  def getByteTimeDomainData(array: js.typedarray.Uint8Array): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatFrequencyData) */
  /* standard dom */
  def getFloatFrequencyData(array: js.typedarray.Float32Array): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/getFloatTimeDomainData) */
  /* standard dom */
  def getFloatTimeDomainData(array: js.typedarray.Float32Array): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/maxDecibels) */
  /* standard dom */
  var maxDecibels: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/minDecibels) */
  /* standard dom */
  var minDecibels: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnalyserNode/smoothingTimeConstant) */
  /* standard dom */
  var smoothingTimeConstant: Double = js.native
}
