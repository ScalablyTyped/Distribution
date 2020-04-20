package typings.reactRnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableDelta extends js.Object {
  var height: Double
  var width: Double
}

object ResizableDelta {
  @scala.inline
  def apply(height: Double, width: Double): ResizableDelta = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizableDelta]
  }
}

