package typings.reactstrap.libButtonGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactType
import typings.reactstrap.reactstrapMod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[String | ReactType[_]] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ButtonGroupProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    className: String = null,
    cssModule: CSSModule = null,
    role: String = null,
    size: String = null,
    tag: String | ReactType[_] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (role != null) __obj.updateDynamic("role")(role)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ButtonGroupProps]
  }
}

