package typings
package reactDashBootstrapLib.libListGroupItemMod.ListGroupItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libListGroupItemMod.ListGroupItem] {
  var active: js.UndefOr[js.Any] = js.undefined
  var bsSize: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.Sizes] = js.undefined
  var bsStyle: js.UndefOr[java.lang.String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var listItem: js.UndefOr[scala.Boolean] = js.undefined
}

object ListGroupItemProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libListGroupItemMod.ListGroupItem] = null,
    active: js.Any = null,
    bsSize: reactDashBootstrapLib.reactDashBootstrapMod.Sizes = null,
    bsStyle: java.lang.String = null,
    eventKey: js.Any = null,
    header: reactLib.reactMod.ReactNs.ReactNode = null,
    listItem: js.UndefOr[scala.Boolean] = js.undefined
  ): ListGroupItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (active != null) __obj.updateDynamic("active")(active)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem)
    __obj.asInstanceOf[ListGroupItemProps]
  }
}

