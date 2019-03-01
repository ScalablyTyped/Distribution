package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveClassNameCssModuleDisabled extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[reactLib.HTMLAnchorElement]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[_]] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object Anon_ActiveClassNameCssModuleDisabled {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    href: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.Ref[reactLib.HTMLAnchorElement] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[_] = null,
    tag: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): Anon_ActiveClassNameCssModuleDisabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveClassNameCssModuleDisabled]
  }
}

