package typings.rmcTabs

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rmc-tabs.rmc-tabs/lib/TabPane.PropsType & {  children ? :react.react.ReactNode} */
trait PropsTypechildrenReactNod extends js.Object {
  var active: Boolean
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fixX: js.UndefOr[Boolean] = js.undefined
  var fixY: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object PropsTypechildrenReactNod {
  @scala.inline
  def apply(
    active: Boolean,
    children: ReactNode = null,
    className: String = null,
    fixX: js.UndefOr[Boolean] = js.undefined,
    fixY: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    role: String = null
  ): PropsTypechildrenReactNod = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixX)) __obj.updateDynamic("fixX")(fixX.asInstanceOf[js.Any])
    if (!js.isUndefined(fixY)) __obj.updateDynamic("fixY")(fixY.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsTypechildrenReactNod]
  }
}

