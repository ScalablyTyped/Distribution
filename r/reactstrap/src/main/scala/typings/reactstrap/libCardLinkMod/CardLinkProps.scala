package typings.reactstrap.libCardLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardLinkProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.undefined
  var tag: js.UndefOr[ReactType[_]] = js.undefined
}

object CardLinkProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    href: String = null,
    innerRef: Ref[HTMLAnchorElement] = null,
    tag: ReactType[_] = null
  ): CardLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (href != null) __obj.updateDynamic("href")(href)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardLinkProps]
  }
}

