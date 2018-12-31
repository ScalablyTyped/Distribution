package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VibrationStatic extends js.Object {
  /**
    * Stop vibration
    */
  def cancel(): scala.Unit = js.native
  def vibrate(pattern: js.Array[scala.Double], repeat: scala.Boolean): scala.Unit = js.native
  def vibrate(pattern: scala.Double, repeat: scala.Boolean): scala.Unit = js.native
}

