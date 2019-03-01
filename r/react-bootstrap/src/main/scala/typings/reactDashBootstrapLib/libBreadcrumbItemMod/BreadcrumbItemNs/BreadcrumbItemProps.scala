package typings
package reactDashBootstrapLib.libBreadcrumbItemMod.BreadcrumbItemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbItemProps
  extends reactLib.reactMod.ReactNs.Props[reactDashBootstrapLib.libBreadcrumbItemMod.BreadcrumbItem] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object BreadcrumbItemProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    href: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[reactDashBootstrapLib.libBreadcrumbItemMod.BreadcrumbItem] = null,
    target: java.lang.String = null,
    title: reactLib.reactMod.ReactNs.ReactNode = null
  ): BreadcrumbItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbItemProps]
  }
}

