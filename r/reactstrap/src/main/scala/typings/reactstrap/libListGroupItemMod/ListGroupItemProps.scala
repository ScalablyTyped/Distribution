package typings.reactstrap.libListGroupItemMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var action: js.UndefOr[Boolean] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  @JSName("onClick")
  var onClick_ListGroupItemProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object ListGroupItemProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    action: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    onClick: MouseEventHandler[_] = null,
    tag: ReactType[_] = null
  ): ListGroupItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupItemProps]
  }
}

