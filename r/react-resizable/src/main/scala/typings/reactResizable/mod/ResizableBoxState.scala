package typings.reactResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizableBoxState extends js.Object {
  var height: Double
  var width: Double
}

object ResizableBoxState {
  @scala.inline
  def apply(height: Double, width: Double): ResizableBoxState = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResizableBoxState]
  }
}

