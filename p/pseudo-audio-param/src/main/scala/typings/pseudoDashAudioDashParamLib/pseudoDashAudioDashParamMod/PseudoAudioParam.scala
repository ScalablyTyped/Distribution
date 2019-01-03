package typings
package pseudoDashAudioDashParamLib.pseudoDashAudioDashParamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Simulate scheduled AudioParam values */
@js.native
trait PseudoAudioParam extends js.Object {
  var events: js.Array[PseudoAudioParamEvent] = js.native
  /**
    * Apply scheduled methods to the provided audioParam. If reset is `true`,
    * cancel all events of AudioParam before applying
    */
  def applyTo(audioParam: stdLib.AudioParam): PseudoAudioParam = js.native
  def applyTo(audioParam: stdLib.AudioParam, reset: scala.Boolean): PseudoAudioParam = js.native
  def cancelAndHoldAtTime(time: scala.Double): PseudoAudioParam = js.native
  def cancelScheduledValues(time: scala.Double): PseudoAudioParam = js.native
  def exponentialRampToValueAtTime(value: scala.Double, time: scala.Double): PseudoAudioParam = js.native
  /**
    * Return scheduled value at time
    */
  def getValueAtTime(time: scala.Double): scala.Double = js.native
  def linearRampToValueAtTime(value: scala.Double, time: scala.Double): PseudoAudioParam = js.native
  def setTargetAtTime(value: scala.Double, time: scala.Double, timeConstant: scala.Double): PseudoAudioParam = js.native
  def setValueAtTime(value: scala.Double, time: scala.Double): PseudoAudioParam = js.native
  def setValueCurveAtTime(values: js.Array[scala.Double], time: scala.Double, duration: scala.Double): PseudoAudioParam = js.native
}

