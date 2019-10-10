package typings.reactstrap.libPaginationMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var listClassName: js.UndefOr[String] = js.undefined
  var listTag: js.UndefOr[ReactType[_]] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    className: String = null,
    cssModule: CSSModule = null,
    listClassName: String = null,
    listTag: ReactType[_] = null,
    size: String = null,
    tag: String | ReactType[_] = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (listTag != null) __obj.updateDynamic("listTag")(listTag.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

