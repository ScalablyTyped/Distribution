package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSPreview extends js.Object {
  var height: scala.Double
  var source: java.lang.String
  var width: scala.Double
}

object SketchMSPreview {
  @scala.inline
  def apply(height: scala.Double, source: java.lang.String, width: scala.Double): SketchMSPreview = {
    val __obj = js.Dynamic.literal(height = height, source = source, width = width)
  
    __obj.asInstanceOf[SketchMSPreview]
  }
}

