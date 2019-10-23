package typings.reactDashEasyDashCrop.reactDashEasyDashCropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSize extends js.Object {
  var height: Double
  var naturalHeight: Double
  var naturalWidth: Double
  var width: Double
}

object ImageSize {
  @scala.inline
  def apply(height: Double, naturalHeight: Double, naturalWidth: Double, width: Double): ImageSize = {
    val __obj = js.Dynamic.literal(height = height, naturalHeight = naturalHeight, naturalWidth = naturalWidth, width = width)
  
    __obj.asInstanceOf[ImageSize]
  }
}

