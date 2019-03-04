package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Screen extends js.Object {
  var screen: reactDashNativeLib.reactDashNativeMod.ScaledSize
  var window: reactDashNativeLib.reactDashNativeMod.ScaledSize
}

object Anon_Screen {
  @scala.inline
  def apply(
    screen: reactDashNativeLib.reactDashNativeMod.ScaledSize,
    window: reactDashNativeLib.reactDashNativeMod.ScaledSize
  ): Anon_Screen = {
    val __obj = js.Dynamic.literal(screen = screen, window = window)
  
    __obj.asInstanceOf[Anon_Screen]
  }
}

