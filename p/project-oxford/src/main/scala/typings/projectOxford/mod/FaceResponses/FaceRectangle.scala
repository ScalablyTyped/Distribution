package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceRectangle extends js.Object {
  var height: Double
  var left: Double
  var top: Double
  var width: Double
}

object FaceRectangle {
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): FaceRectangle = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceRectangle]
  }
}

