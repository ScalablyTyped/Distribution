package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/menu/components/list/list.js
trait MenuListModifierProps extends js.Object {
  var title: js.UndefOr[String] = js.undefined
}

object MenuListModifierProps {
  @scala.inline
  def apply(title: String = null): MenuListModifierProps = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuListModifierProps]
  }
}

