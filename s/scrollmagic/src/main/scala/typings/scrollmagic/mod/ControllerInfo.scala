package typings.scrollmagic.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerInfo extends js.Object {
  var container: Element | Null
  var isDocument: Boolean
  var scrollDirection: String
  var scrollPos: Double
  var size: Double
  var vertical: Boolean
}

object ControllerInfo {
  @scala.inline
  def apply(
    isDocument: Boolean,
    scrollDirection: String,
    scrollPos: Double,
    size: Double,
    vertical: Boolean,
    container: Element = null
  ): ControllerInfo = {
    val __obj = js.Dynamic.literal(isDocument = isDocument.asInstanceOf[js.Any], scrollDirection = scrollDirection.asInstanceOf[js.Any], scrollPos = scrollPos.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerInfo]
  }
}

