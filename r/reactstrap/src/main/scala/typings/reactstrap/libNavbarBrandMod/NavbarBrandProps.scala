package typings.reactstrap.libNavbarBrandMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarBrandProps
  extends AllHTMLAttributes[HTMLAnchorElement]
     with ClassAttributes[HTMLAnchorElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
}

object NavbarBrandProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLAnchorElement] = null,
    ClassAttributes: ClassAttributes[HTMLAnchorElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    cssModule: CSSModule = null,
    tag: String | ReactType[_] = null
  ): NavbarBrandProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarBrandProps]
  }
}

