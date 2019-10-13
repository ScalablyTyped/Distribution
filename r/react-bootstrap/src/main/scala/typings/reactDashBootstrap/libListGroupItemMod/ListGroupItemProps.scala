package typings.reactDashBootstrap.libListGroupItemMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactNode
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemProps
  extends AllHTMLAttributes[ListGroupItem]
     with ClassAttributes[ListGroupItem] {
  var active: js.UndefOr[js.Any] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[ReactNode] = js.undefined
  var listItem: js.UndefOr[Boolean] = js.undefined
}

object ListGroupItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ListGroupItem] = null,
    ClassAttributes: ClassAttributes[ListGroupItem] = null,
    active: js.Any = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    eventKey: js.Any = null,
    header: ReactNode = null,
    listItem: js.UndefOr[Boolean] = js.undefined
  ): ListGroupItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (active != null) __obj.updateDynamic("active")(active)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem)
    __obj.asInstanceOf[ListGroupItemProps]
  }
}

