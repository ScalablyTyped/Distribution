package typings.reactDashTabsDashRedux.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeLinkStyle: js.UndefOr[js.Object] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.undefined
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
  var selectedTab: js.UndefOr[String] = js.undefined
  var visibleTabStyle: js.UndefOr[js.Object] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    activeLinkStyle: js.Object = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Unit = null,
    name: String = null,
    onChange: (/* selectedTab */ String, /* name */ String) => Unit = null,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTab: String = null,
    visibleTabStyle: js.Object = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeLinkStyle != null) __obj.updateDynamic("activeLinkStyle")(activeLinkStyle)
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles)
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2(handleSelect))
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly)
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab)
    if (visibleTabStyle != null) __obj.updateDynamic("visibleTabStyle")(visibleTabStyle)
    __obj.asInstanceOf[TabsProps]
  }
}

