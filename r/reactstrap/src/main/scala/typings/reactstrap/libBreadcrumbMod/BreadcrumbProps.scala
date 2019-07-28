package typings.reactstrap.libBreadcrumbMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var listClassName: js.UndefOr[String] = js.undefined
  var listTag: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    listClassName: String = null,
    listTag: String = null,
    tag: String = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (listClassName != null) __obj.updateDynamic("listClassName")(listClassName)
    if (listTag != null) __obj.updateDynamic("listTag")(listTag)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

