package typings.storybookAddonViewport.viewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportStyles extends js.Object {
  var height: String
  var width: String
}

object ViewportStyles {
  @scala.inline
  def apply(height: String, width: String): ViewportStyles = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewportStyles]
  }
}

