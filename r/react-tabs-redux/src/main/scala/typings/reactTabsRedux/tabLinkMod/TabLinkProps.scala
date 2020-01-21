package typings.reactTabsRedux.tabLinkMod

import typings.react.mod.ReactNode
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabLinkProps extends js.Object {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var to: Double | String
}

object TabLinkProps {
  @scala.inline
  def apply(
    to: Double | String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    children: ReactNode = null,
    className: String = null,
    component: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Unit = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    onClick: /* event */ Event_ => Unit = null,
    style: js.Object = null
  ): TabLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2(handleSelect))
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabLinkProps]
  }
}

