package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A screen, usually the one on which the current window is being rendered, and is obtained using window.screen. */
trait Screen extends js.Object {
  val availHeight: Double
  val availWidth: Double
  val colorDepth: Double
  val height: Double
  val orientation: ScreenOrientation
  val pixelDepth: Double
  val width: Double
}

object Screen {
  @scala.inline
  def apply(
    availHeight: Double,
    availWidth: Double,
    colorDepth: Double,
    height: Double,
    orientation: ScreenOrientation,
    pixelDepth: Double,
    width: Double
  ): Screen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Screen]
  }
}

