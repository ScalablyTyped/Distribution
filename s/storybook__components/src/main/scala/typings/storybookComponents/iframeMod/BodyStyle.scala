package typings.storybookComponents.iframeMod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transformOrigin = transformOrigin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BodyStyle]
  }
}

