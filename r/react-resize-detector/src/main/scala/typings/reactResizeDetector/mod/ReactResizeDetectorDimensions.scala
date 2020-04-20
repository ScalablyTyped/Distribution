package typings.reactResizeDetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactResizeDetectorDimensions extends js.Object {
  var height: Double
  var width: Double
}

object ReactResizeDetectorDimensions {
  @scala.inline
  def apply(height: Double, width: Double): ReactResizeDetectorDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactResizeDetectorDimensions]
  }
}

