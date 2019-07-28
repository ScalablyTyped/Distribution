package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPreview extends js.Object {
  var height: Double
  var source: String
  var width: Double
}

object SketchMSPreview {
  @scala.inline
  def apply(height: Double, source: String, width: Double): SketchMSPreview = {
    val __obj = js.Dynamic.literal(height = height, source = source, width = width)
  
    __obj.asInstanceOf[SketchMSPreview]
  }
}

