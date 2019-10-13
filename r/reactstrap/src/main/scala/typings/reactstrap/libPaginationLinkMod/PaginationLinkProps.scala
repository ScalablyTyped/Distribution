package typings.reactstrap.libPaginationLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLinkProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var first: js.UndefOr[Boolean] = js.undefined
  var last: js.UndefOr[Boolean] = js.undefined
  var next: js.UndefOr[Boolean] = js.undefined
  var previous: js.UndefOr[Boolean] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object PaginationLinkProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    className: String = null,
    cssModule: CSSModule = null,
    first: js.UndefOr[Boolean] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    next: js.UndefOr[Boolean] = js.undefined,
    previous: js.UndefOr[Boolean] = js.undefined,
    tag: String | ReactType[_] = null
  ): PaginationLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(first)) __obj.updateDynamic("first")(first)
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (!js.isUndefined(next)) __obj.updateDynamic("next")(next)
    if (!js.isUndefined(previous)) __obj.updateDynamic("previous")(previous)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationLinkProps]
  }
}

