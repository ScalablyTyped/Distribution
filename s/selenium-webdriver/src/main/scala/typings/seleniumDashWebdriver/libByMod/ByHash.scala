package typings.seleniumDashWebdriver.libByMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod._Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByHash extends _Locator {
  var className: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[String] = js.undefined
  var linkText: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var partialLinkText: js.UndefOr[String] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  var xpath: js.UndefOr[String] = js.undefined
}

object ByHash {
  @scala.inline
  def apply(
    className: String = null,
    css: String = null,
    id: String = null,
    js_ : String = null,
    linkText: String = null,
    name: String = null,
    partialLinkText: String = null,
    tagName: String = null,
    xpath: String = null
  ): ByHash = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (css != null) __obj.updateDynamic("css")(css)
    if (id != null) __obj.updateDynamic("id")(id)
    if (js_ != null) __obj.updateDynamic("js")(js_)
    if (linkText != null) __obj.updateDynamic("linkText")(linkText)
    if (name != null) __obj.updateDynamic("name")(name)
    if (partialLinkText != null) __obj.updateDynamic("partialLinkText")(partialLinkText)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    if (xpath != null) __obj.updateDynamic("xpath")(xpath)
    __obj.asInstanceOf[ByHash]
  }
}

