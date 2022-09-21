package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Web Audio API's AudioParam interface represents an audio-related parameter, usually a parameter of an AudioNode (such as GainNode.gain). */
/////////////////////////////
/// Window Iterable APIs
/////////////////////////////
@js.native
trait AudioParam extends StObject {
  
  /* standard dom */
  var automationRate: AutomationRate = js.native
  
  /* standard dom */
  def cancelAndHoldAtTime(cancelTime: Double): AudioParam = js.native
  
  /* standard dom */
  def cancelScheduledValues(cancelTime: Double): AudioParam = js.native
  
  /* standard dom */
  val defaultValue: Double = js.native
  
  /* standard dom */
  def exponentialRampToValueAtTime(value: Double, endTime: Double): AudioParam = js.native
  
  /* standard dom */
  def linearRampToValueAtTime(value: Double, endTime: Double): AudioParam = js.native
  
  /* standard dom */
  val maxValue: Double = js.native
  
  /* standard dom */
  val minValue: Double = js.native
  
  /* standard dom */
  def setTargetAtTime(target: Double, startTime: Double, timeConstant: Double): AudioParam = js.native
  
  /* standard dom */
  def setValueAtTime(value: Double, startTime: Double): AudioParam = js.native
  
  /* standard dom */
  def setValueCurveAtTime(values: js.Array[Double], startTime: Double, duration: Double): AudioParam = js.native
  /* standard dom.iterable */
  def setValueCurveAtTime(values: js.Iterable[Double], startTime: Double, duration: Double): AudioParam = js.native
  def setValueCurveAtTime(values: js.typedarray.Float32Array, startTime: Double, duration: Double): AudioParam = js.native
  
  /* standard dom */
  var value: Double = js.native
}
