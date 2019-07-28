package typings.reactDashNative

import typings.reactDashNative.reactDashNativeMod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Screen extends js.Object {
  var screen: ScaledSize
  var window: ScaledSize
}

object Anon_Screen {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): Anon_Screen = {
    val __obj = js.Dynamic.literal(screen = screen, window = window)
  
    __obj.asInstanceOf[Anon_Screen]
  }
}

