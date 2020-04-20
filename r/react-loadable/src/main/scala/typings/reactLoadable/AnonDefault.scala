package typings.reactLoadable

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefault[Props] extends js.Object {
  var default: ComponentType[Props]
}

object AnonDefault {
  @scala.inline
  def apply[Props](default: ComponentType[Props]): AnonDefault[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefault[Props]]
  }
}

