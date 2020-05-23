package typings.reactLoadable.anon

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default[Props] extends js.Object {
  var default: ComponentType[Props]
}

object Default {
  @scala.inline
  def apply[Props](default: ComponentType[Props]): Default[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[Props]]
  }
}

