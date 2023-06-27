package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam)
  */
/////////////////////////////
/// Window Iterable APIs
/////////////////////////////
@js.native
trait AudioParam extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/automationRate) */
  /* standard dom */
  var automationRate: AutomationRate = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelAndHoldAtTime) */
  /* standard dom */
  def cancelAndHoldAtTime(cancelTime: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/cancelScheduledValues) */
  /* standard dom */
  def cancelScheduledValues(cancelTime: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/defaultValue) */
  /* standard dom */
  val defaultValue: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/exponentialRampToValueAtTime) */
  /* standard dom */
  def exponentialRampToValueAtTime(value: Double, endTime: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/linearRampToValueAtTime) */
  /* standard dom */
  def linearRampToValueAtTime(value: Double, endTime: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/maxValue) */
  /* standard dom */
  val maxValue: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/minValue) */
  /* standard dom */
  val minValue: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setTargetAtTime) */
  /* standard dom */
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueAtTime) */
  /* standard dom */
  def setValueAtTime(value: Double, startTime: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime) */
  /* standard dom */
  def setValueCurveAtTime(values: js.Array[Double], startTime: Double, duration: Double): AudioParam = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/setValueCurveAtTime) */
  /* standard dom.iterable */
  def setValueCurveAtTime(values: js.Iterable[Double], startTime: Double, duration: Double): AudioParam = js.native
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime: Double, duration: Double): AudioParam = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioParam/value) */
  /* standard dom */
  var value: Double = js.native
}
