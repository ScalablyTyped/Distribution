package typings.reactDashLoadable

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default[Props] extends js.Object {
  var default: ComponentType[Props]
}

object Anon_Default {
  @scala.inline
  def apply[Props](default: ComponentType[Props]): Anon_Default[Props] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Default[Props]]
  }
}

