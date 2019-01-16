package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioParam extends js.Object {
  var automationRate: AutomationRate = js.native
  val defaultValue: scala.Double = js.native
  val maxValue: scala.Double = js.native
  val minValue: scala.Double = js.native
  var value: scala.Double = js.native
  def cancelAndHoldAtTime(cancelTime: scala.Double): AudioParam = js.native
  def cancelScheduledValues(cancelTime: scala.Double): AudioParam = js.native
  def exponentialRampToValueAtTime(value: scala.Double, endTime: scala.Double): AudioParam = js.native
  def linearRampToValueAtTime(value: scala.Double, endTime: scala.Double): AudioParam = js.native
  def setTargetAtTime(target: scala.Double, startTime: scala.Double, timeConstant: scala.Double): AudioParam = js.native
  def setValueAtTime(value: scala.Double, startTime: scala.Double): AudioParam = js.native
  def setValueCurveAtTime(values: Array[scala.Double], startTime: scala.Double, duration: scala.Double): AudioParam = js.native
  def setValueCurveAtTime(values: Float32Array, startTime: scala.Double, duration: scala.Double): AudioParam = js.native
}

@JSGlobal("AudioParam")
@js.native
object AudioParam
  extends org.scalablytyped.runtime.Instantiable0[AudioParam]

