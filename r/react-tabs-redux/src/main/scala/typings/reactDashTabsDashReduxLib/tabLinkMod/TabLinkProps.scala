package typings
package reactDashTabsDashReduxLib.tabLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabLinkProps extends js.Object {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[scala.Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[scala.Boolean] = js.undefined
  var handleSelect: js.UndefOr[
    js.Function2[/* tab */ java.lang.String, /* name */ java.lang.String, scala.Unit]
  ] = js.undefined
  var isActive: js.UndefOr[scala.Boolean] = js.undefined
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var to: scala.Double | java.lang.String
}

object TabLinkProps {
  @scala.inline
  def apply(
    to: scala.Double | java.lang.String,
    activeClassName: java.lang.String = null,
    activeStyle: js.Object = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    component: java.lang.String = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[scala.Boolean] = js.undefined,
    handleSelect: (/* tab */ java.lang.String, /* name */ java.lang.String) => scala.Unit = null,
    isActive: js.UndefOr[scala.Boolean] = js.undefined,
    namespace: java.lang.String = null,
    onClick: /* event */ stdLib.Event => scala.Unit = null,
    style: js.Object = null
  ): TabLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles)
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2(handleSelect))
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive)
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabLinkProps]
  }
}

