package typings.reactNative.anon

import typings.reactNative.mod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  var screen: ScaledSize
  var window: ScaledSize
}

object Screen {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
}

