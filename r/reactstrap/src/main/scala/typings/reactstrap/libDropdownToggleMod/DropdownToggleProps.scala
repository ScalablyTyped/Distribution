package typings.reactstrap.libDropdownToggleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  @JSName("aria-haspopup")
  var `aria-haspopup_DropdownToggleProps`: js.UndefOr[Boolean] = js.undefined
  var caret: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var `data-toggle`: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var nav: js.UndefOr[Boolean] = js.undefined
  @JSName("onClick")
  var onClick_DropdownToggleProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var outline: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var split: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object DropdownToggleProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `aria-haspopup`: js.UndefOr[Boolean] = js.undefined,
    caret: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    cssModule: CSSModule = null,
    `data-toggle`: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    outline: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    split: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(`aria-haspopup`)) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    if (!js.isUndefined(caret)) __obj.updateDynamic("caret")(caret)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (`data-toggle` != null) __obj.updateDynamic("data-toggle")(`data-toggle`)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (!js.isUndefined(outline)) __obj.updateDynamic("outline")(outline)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(split)) __obj.updateDynamic("split")(split)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

