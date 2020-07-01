package typings.reactWebcam.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotDimensions extends js.Object {
  var height: Double
  var width: Double
}

object ScreenshotDimensions {
  @scala.inline
  def apply(height: Double, width: Double): ScreenshotDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotDimensions]
  }
}

