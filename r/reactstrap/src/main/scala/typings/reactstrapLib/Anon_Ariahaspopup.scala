package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariahaspopup extends js.Object {
  var `aria-haspopup`: js.UndefOr[scala.Boolean] = js.undefined
  var caret: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var `data-toggle`: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var nav: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
  var outline: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var split: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object Anon_Ariahaspopup {
  @scala.inline
  def apply(
    `aria-haspopup`: js.UndefOr[scala.Boolean] = js.undefined,
    caret: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    `data-toggle`: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    nav: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.MouseEventHandler[_] = null,
    outline: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    split: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
  ): Anon_Ariahaspopup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`aria-haspopup`)) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    if (!js.isUndefined(caret)) __obj.updateDynamic("caret")(caret)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (`data-toggle` != null) __obj.updateDynamic("data-toggle")(`data-toggle`)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ariahaspopup]
  }
}

