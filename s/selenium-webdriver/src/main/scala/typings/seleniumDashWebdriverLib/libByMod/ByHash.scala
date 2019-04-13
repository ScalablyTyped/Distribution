package typings
package seleniumDashWebdriverLib.libByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByHash
  extends seleniumDashWebdriverLib.seleniumDashWebdriverMod._Locator {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var css: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[java.lang.String] = js.undefined
  var linkText: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var partialLinkText: js.UndefOr[java.lang.String] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
  var xpath: js.UndefOr[java.lang.String] = js.undefined
}

object ByHash {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    css: java.lang.String = null,
    id: java.lang.String = null,
    js_ : java.lang.String = null,
    linkText: java.lang.String = null,
    name: java.lang.String = null,
    partialLinkText: java.lang.String = null,
    tagName: java.lang.String = null,
    xpath: java.lang.String = null
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

