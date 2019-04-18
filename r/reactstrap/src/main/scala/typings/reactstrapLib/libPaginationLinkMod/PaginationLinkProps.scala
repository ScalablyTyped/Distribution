package typings
package reactstrapLib.libPaginationLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationLinkProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLAnchorElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var cssModule: js.UndefOr[reactstrapLib.reactstrapMod.CSSModule] = js.undefined
  var first: js.UndefOr[scala.Boolean] = js.undefined
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var next: js.UndefOr[scala.Boolean] = js.undefined
  var previous: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object PaginationLinkProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLAnchorElement] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `aria-label`: java.lang.String = null,
    className: java.lang.String = null,
    cssModule: reactstrapLib.reactstrapMod.CSSModule = null,
    first: js.UndefOr[scala.Boolean] = js.undefined,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    next: js.UndefOr[scala.Boolean] = js.undefined,
    previous: js.UndefOr[scala.Boolean] = js.undefined,
    tag: reactLib.reactMod.ReactType[_] = null
  ): PaginationLinkProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
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

