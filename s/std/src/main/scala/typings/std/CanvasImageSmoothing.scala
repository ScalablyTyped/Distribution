package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasImageSmoothing extends js.Object {
  var imageSmoothingEnabled: scala.Boolean
  var imageSmoothingQuality: ImageSmoothingQuality
}

object CanvasImageSmoothing {
  @scala.inline
  def apply(imageSmoothingEnabled: scala.Boolean, imageSmoothingQuality: ImageSmoothingQuality): CanvasImageSmoothing = {
    val __obj = js.Dynamic.literal(imageSmoothingEnabled = imageSmoothingEnabled.asInstanceOf[js.Any], imageSmoothingQuality = imageSmoothingQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageSmoothing]
  }
}

