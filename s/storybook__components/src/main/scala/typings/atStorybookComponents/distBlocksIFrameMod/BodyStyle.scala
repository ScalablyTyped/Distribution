package typings.atStorybookComponents.distBlocksIFrameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyStyle extends js.Object {
  var height: String
  var transform: String
  var transformOrigin: String
  var width: String
}

object BodyStyle {
  @scala.inline
  def apply(height: String, transform: String, transformOrigin: String, width: String): BodyStyle = {
    val __obj = js.Dynamic.literal(height = height, transform = transform, transformOrigin = transformOrigin, width = width)
  
    __obj.asInstanceOf[BodyStyle]
  }
}

