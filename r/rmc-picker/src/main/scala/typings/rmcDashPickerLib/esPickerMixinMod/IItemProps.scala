package typings
package rmcDashPickerLib.esPickerMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var value: js.Any
}

object IItemProps {
  @scala.inline
  def apply(value: js.Any, children: reactLib.reactMod.ReactNode = null, className: java.lang.String = null): IItemProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IItemProps]
  }
}

