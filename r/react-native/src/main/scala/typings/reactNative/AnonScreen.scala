package typings.reactNative

import typings.reactNative.mod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreen extends js.Object {
  var screen: ScaledSize
  var window: ScaledSize
}

object AnonScreen {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): AnonScreen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScreen]
  }
}

