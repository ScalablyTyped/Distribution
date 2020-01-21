package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VibrationStatic extends js.Object {
  /**
    * Stop vibration
    */
  def cancel(): Unit = js.native
  def vibrate(pattern: js.Array[Double]): Unit = js.native
  def vibrate(pattern: js.Array[Double], repeat: Boolean): Unit = js.native
  def vibrate(pattern: Double): Unit = js.native
  def vibrate(pattern: Double, repeat: Boolean): Unit = js.native
}

