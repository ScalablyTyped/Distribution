package typings.reactstrap.libNavLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavLinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  @JSName("onClick")
  var onClick_NavLinkProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object NavLinkProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cssModule: CSSModule = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    innerRef: Ref[HTMLAnchorElement] = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    tag: String | ReactType[_] = null
  ): NavLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavLinkProps]
  }
}

