package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VibrationIOSStatic extends js.Object {
  /**
    * @deprecated
    */
  def vibrate(): scala.Unit
}

object VibrationIOSStatic {
  @scala.inline
  def apply(vibrate: js.Function0[scala.Unit]): VibrationIOSStatic = {
    val __obj = js.Dynamic.literal(vibrate = vibrate)
  
    __obj.asInstanceOf[VibrationIOSStatic]
  }
}

