package typings.storybookAddonA11y.infoMod

import typings.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoProps extends js.Object {
  var item: Result
}

object InfoProps {
  @scala.inline
  def apply(item: Result): InfoProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoProps]
  }
}

